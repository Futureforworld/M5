/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cadastroserver;

import model.Movimento;
import controller.MovimentoJpaController;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CadastroServer {
    public static void main(String[] args) {
        try {
            // Verificando se o persistence.xml está sendo encontrado
            System.out.println("Tentando criar EntityManagerFactory...");
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("CadastroServerPU");
            if (emf != null) {
                System.out.println("EntityManagerFactory criado com sucesso!");
            }

            // Exemplo simplificado de recebimento de dados e criação do movimento
            String usuario = "op1"; // Exemplo de usuário, você precisa implementar a lógica de login
            String tipo = "E"; // Exemplo de tipo, "E" para entrada
            int idPessoa = 1; // Exemplo de id de pessoa, você precisa receber do cliente
            int idProduto = 1; // Exemplo de id de produto, você precisa receber do cliente
            int quantidade = 10; // Exemplo de quantidade, você precisa receber do cliente
            double valorUnitario = 50.0; // Exemplo de valor unitário, você precisa receber do cliente

            // Criando o objeto Movimento
            Movimento movimento = new Movimento();
            movimento.setUsuario(usuario);
            movimento.setTipo(tipo);
            movimento.setIdPessoa(idPessoa);
            movimento.setIdProduto(idProduto);
            movimento.setQuantidade(quantidade);
            movimento.setValorUnitario(valorUnitario);

            // Persistindo o movimento no banco de dados
            MovimentoJpaController ctrlMov = new MovimentoJpaController((EntityManager) emf);
            ctrlMov.create(movimento);

            System.out.println("Movimento registrado com sucesso: " + movimento);
        } catch (Exception e) {
        }
    }
}
