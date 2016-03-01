/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pattern_games.dao;

import com.mycompany.pattern_games.entidades.Cliente;
import com.mycompany.pattern_games.entidades.Jogo;
import com.mycompany.pattern_games.estado.Alugado;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author kaique
 */
public class JogoDAO {

    EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistence");
    EntityManager em = factory.createEntityManager();

    public void addJogo(Jogo j) {
        em.getTransaction().begin();
        em.persist(j);
        em.getTransaction().commit();
        em.close();
    }

    public List<Jogo> listJogo() {
        Query query = em.createQuery("select j from Jogo j");
        return query.getResultList();
    }

    public boolean updateJogo(Jogo j) {
        em.getTransaction().begin();
        em.merge(j);
        em.getTransaction().commit();
        em.close();
        return true;
    }

    public void locateJogo(Cliente c, Jogo j) {
        em.getTransaction().begin();
        c.addJogo(j);
        j.alugar();        
        em.merge(c);
        em.merge(j);
        em.getTransaction().commit();
        em.close();
    }

    public void devolverJogo(Cliente c, Jogo j) {
        em.getTransaction().begin();
        c.devolverJogo(j);
        j.devolver();
        em.merge(c);
        em.merge(j);
        em.getTransaction().commit();
        em.close();
    }
}
