/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroclientes;

/**
 *
 * @author zamor
 */
import java.io.*;
import java.net.*;

public class ClienteSincrono {

    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 12345);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader console = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.print("Login: ");
            String login = console.readLine();
            System.out.print("Senha: ");
            String senha = console.readLine();

            out.println(login);
            out.println(senha);

            String resposta = in.readLine();
            System.out.println(resposta);

            if (resposta.equals("Credenciais válidas")) {
                out.println("L");
                String linha;
                while ((linha = in.readLine()) != null) {
                    System.out.println(linha);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
