/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pattern_games.gerenciadores;

import com.mycompany.pattern_games.dao.JogoDAO;
import com.mycompany.pattern_games.entidades.Cliente;
import com.mycompany.pattern_games.entidades.Jogo;
import java.util.List;

/**
 *
 * @author kaique
 */
public class GerenciadorDeJogo {

    public void addJogo(Jogo j) {
        new JogoDAO().addJogo(j);
    }

    public List<Jogo> listJogo() {
        return new JogoDAO().listJogo();
    }

    public boolean updateJogo(Jogo j) {
        return new JogoDAO().updateJogo(j);
    }

    public void locateJogo(Cliente c, Jogo j) {
        new JogoDAO().locateJogo(c, j);
    }

    public void devolverJogo(Cliente c, Jogo j) {
        new JogoDAO().devolverJogo(c, j);
    }

}
