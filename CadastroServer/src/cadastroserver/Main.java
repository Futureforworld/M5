/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package cadastroserver;

import controller.UsuarioJpaController;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        // Configurar o EntityManagerFactory com a unidade de persistência definida no persistence.xml
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("seu_persistence_unit_name");

        // Criar instância do controlador JPA
        UsuarioJpaController usuarioController = new UsuarioJpaController(emf);

        // Exemplo de uso do método findUsuario
        String login = "exemploLogin"; // Substitua pelo login que você deseja procurar
        String senha = "exemploSenha"; // Substitua pela senha correspondente

        model.Usuario usuario = usuarioController.findUsuario(login, senha);

        if (usuario != null) {
            System.out.println("Usuário encontrado: " + usuario.getNome());
        } else {
            System.out.println("Usuário não encontrado.");
        }

        // Fechar o EntityManagerFactory
        emf.close();
    }
}