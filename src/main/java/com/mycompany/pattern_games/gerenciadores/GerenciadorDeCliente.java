/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pattern_games.gerenciadores;

import br.com.caelum.stella.ValidationMessage;
import br.com.caelum.stella.validation.CPFValidator;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.mycompany.pattern_games.entidades.Cliente;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author kaique
 */
public class GerenciadorDeCliente {

    EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistence");
    EntityManager em = factory.createEntityManager();

    public void addCliente(Cliente c) {
        em.getTransaction().begin();
        em.persist(c);
        em.getTransaction().commit();
        em.close();
    }

    public List<Cliente> listCliente() {
        Query query = em.createQuery("select c from Cliente c");
        return query.getResultList();
        
//        Query query = em.createQuery("select c from Cliente c");
//
//        List<Cliente> clientes = query.getResultList();
//        for (Cliente cliente : clientes) {
//
//            System.out.println(cliente);
//
//            Query query2 = em.createQuery("select j.id , j.titulo, j.plataforma, j.estado from jogo j where id = ( select cj.jogos_id from Cliente_jogo cj where cliente_id = " + cliente.getId());
//            List<Jogo> jogos = query2.getResultList();
//            for (Jogo jogo : jogos) {
//
//                System.out.println(jogo);
//
//                cliente.addJogo(jogo);
//            }
//        }
//
//        return clientes;
    }

    public boolean updateCliente(Cliente c) {
        CPFValidator validator = new CPFValidator();
        em.getTransaction().begin();
        List<ValidationMessage> invalidMessagesFor = validator.invalidMessagesFor(c.getCpf());
        if (invalidMessagesFor.size() > 0) {
            return false;
        }
        em.merge(c);
        em.getTransaction().commit();
        em.close();
        return true;
    }        
}
