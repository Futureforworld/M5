/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroserver;

import java.io.*;
import java.net.*;
import java.util.List;
import javax.persistence.*;
import controller.MovimentoJpaController;
import controller.ProdutoJpaController;
import model.Movimento;
import model.Produto;
import model.Usuario;

public class Servidor {

    private static EntityManagerFactory emf;
    private static EntityManager em;
    private static MovimentoJpaController ctrlMov;
    private static ProdutoJpaController ctrlProd;

    public static void main(String[] args) {
        emf = Persistence.createEntityManagerFactory("CadastroPU");
        em = emf.createEntityManager();
        ctrlMov = new MovimentoJpaController((EntityManager) emf);
        ctrlProd = new ProdutoJpaController(emf);

        try (ServerSocket serverSocket = new ServerSocket(12345)) {
            System.out.println("Servidor iniciado na porta 12345");

            while (true) {
                Socket socket = serverSocket.accept();
                new Thread(new ClientHandler(socket)).start();
            }
        } catch (IOException e) {
        } finally {
            em.close();
            emf.close();
        }
    }

    private static class ClientHandler implements Runnable {

        private final Socket socket;

        public ClientHandler(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
            try (BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream())); PrintWriter out = new PrintWriter(socket.getOutputStream(), true)) {

                String login = in.readLine();
                String senha = in.readLine();

                if (!validaCredenciais(login, senha)) {
                    try (socket) {
                        out.println("Credenciais inválidas");
                    }
                    return;
                }

                out.println("Credenciais válidas");

                String comando;
                while ((comando = in.readLine()) != null) {
                    if (comando.equalsIgnoreCase("L")) {
                        List<Produto> produtos = em.createQuery("SELECT p FROM Produto p", Produto.class).getResultList();
                        for (Produto produto : produtos) {
                            out.println(produto);
                        }
                    } else if (comando.equalsIgnoreCase("E") || comando.equalsIgnoreCase("S")) {
                        Movimento movimento = new Movimento();
                        movimento.setUsuario(login);
                        movimento.setTipo(comando);

                        movimento.setIdPessoa(Integer.parseInt(in.readLine()));
                        movimento.setIdProduto(Integer.parseInt(in.readLine()));
                        movimento.setQuantidade(Integer.parseInt(in.readLine()));
                        movimento.setValorUnitario(Double.parseDouble(in.readLine()));

                        ctrlMov.create(movimento);

                        Produto produto = ctrlProd.findProduto(movimento.getIdProduto());
                        if (comando.equalsIgnoreCase("E")) {
                            /*                            produto.setQuantidade(produto.getquantidade() + movimento.getQuantidade());
                            } else if (comando.equalsIgnoreCase("S")) {
                            produto.setQuantidade(produto.getQuantidade() - movimento.getQuantidade());*/
                        }
                        ctrlProd.update(produto);

                        out.println("Movimento registrado e quantidade de produto atualizada.");
                    }
                }
            } catch (IOException e) {
            }
        }

        private boolean validaCredenciais(String login, String senha) {
            Usuario usuario = em.find(Usuario.class, login);
            return usuario != null && usuario.getSenha().equals(senha);
        }
    }
}
