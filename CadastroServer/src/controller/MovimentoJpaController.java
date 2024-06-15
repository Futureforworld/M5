/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import javax.persistence.EntityManager;
import model.Movimento;

public class MovimentoJpaController {

    private EntityManager em;

    public MovimentoJpaController(EntityManager em) {
        this.em = em;
    }

    public void create(Movimento movimento) {
        // Implemente aqui a lógica para persistir o movimento no banco de dados
        em.getTransaction().begin();
        em.persist(movimento);
        em.getTransaction().commit();
    }

    // Outros métodos para atualizar, buscar, deletar, etc.
}
