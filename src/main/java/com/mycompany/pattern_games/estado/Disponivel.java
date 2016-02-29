/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pattern_games.estado;

import com.mycompany.pattern_games.interfaces.Estado;
import java.io.Serializable;
import java.util.Calendar;

/**
 *
 * @author kaique
 */
public class Disponivel implements Estado, Serializable {
    
    @Override
    public Estado alugar() {
        System.out.println("O jogo foi emprestado.");
        if (Calendar.DAY_OF_WEEK == 1 || Calendar.DAY_OF_WEEK == 7) {
            return new Alugado(true);
        }
        return new Alugado(false);
    }
    
    @Override
    public Estado devolver() {
        System.out.println("O jogo foi devolvido.");
        return this;
    }
    
    @Override
    public String toString() {
        return "Disponivel";
    }
    
}
