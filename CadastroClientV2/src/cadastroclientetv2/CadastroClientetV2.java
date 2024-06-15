/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cadastroclientetv2;

import javax.swing.*;

public class CadastroClientetV2 {

    // Classe interna SaidaFrame
    public static class SaidaFrame extends JFrame {

        public SaidaFrame() {
            super("SaidaFrame"); // Define o título da janela
            setSize(400, 300); // Define o tamanho inicial da janela
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Define a ação padrão ao fechar a janela
        }

        // Implementação do método setVisible
        @Override
        public void setVisible(boolean visible) {
            super.setVisible(visible); // Chama o método setVisible da superclasse JFrame
            // Outras lógicas podem ser adicionadas aqui, se necessário
        }
    }

    // Método main para iniciar o aplicativo
    public static void main(String[] args) {
        // Criar uma instância de SaidaFrame
        SaidaFrame frame = new SaidaFrame();
        
        // Configurar o frame conforme necessário
        
        // Tornar o frame visível
        frame.setVisible(true);
    }
}

