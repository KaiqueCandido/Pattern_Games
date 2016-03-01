/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pattern_games.estado;

import com.mycompany.pattern_games.interfaces.Estado;
import java.io.Serializable;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author kaique
 */
public class Disponivel implements Estado, Serializable {

    Calendar c = Calendar.getInstance();

    @Override
    public Estado alugar() {
        JOptionPane.showMessageDialog(null, "O jogo foi alugado.");
        if (c.get(Calendar.DAY_OF_WEEK) == 1 || c.get(Calendar.DAY_OF_WEEK) == 7) {
            return new Alugado(true, c.get(Calendar.DAY_OF_YEAR));
        }
        return new Alugado(false, c.get(Calendar.DAY_OF_YEAR));
    }

    @Override
    public Estado devolver() {
        JOptionPane.showMessageDialog(null, "O jogo foi devolvido.");
        return this;
    }

    @Override
    public String toString() {
        return "Disponivel";
    }   

}
