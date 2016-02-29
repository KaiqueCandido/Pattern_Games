/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pattern_games.estado;

import com.mycompany.pattern_games.interfaces.Estado;
import java.io.Serializable;

/**
 *
 * @author kaique
 */
public class Alugado implements Estado, Serializable {

    private boolean especial;

    public Alugado() {
    }

    public Alugado(boolean especial) {
        this.especial = especial;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    @Override
    public Estado alugar() {
        System.out.println("O jogo está alugado.");
        return this;
    }

    @Override
    public Estado devolver() {
        System.out.println("O jogo foi devolvido.");
        return new Disponivel();
    }

    @Override
    public String toString() {
        if (this.especial) {
            return "Alugado " + "Tipo Especial";
        } else {
            return "Alugado " + "Tipo Normal";
        }
    }

}
