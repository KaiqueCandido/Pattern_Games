/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pattern_games.dao;

import br.com.caelum.stella.ValidationMessage;
import br.com.caelum.stella.validation.CPFValidator;
import com.mycompany.pattern_games.entidades.Cliente;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author kaique
 */
public class ClienteDAO {

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
