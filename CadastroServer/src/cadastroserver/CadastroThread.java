/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroserver;

public class CadastroThread extends Thread {
    @Override
    public void run() {
        // Implementação da lógica da thread aqui
        System.out.println("Thread está em execução...");
    }

    public static void main(String[] args) {
        CadastroThread thread = new CadastroThread();
        thread.start();
    }
}