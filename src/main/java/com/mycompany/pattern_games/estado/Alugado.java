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

public class Alugado implements Estado, Serializable {

    private boolean especial;
    private int diaQueFoiAlugado;
    private Calendar calendar = Calendar.getInstance();

    public Alugado() {
    }

    public Alugado(boolean especial, int diaQueFoiAlugado) {
        this.especial = especial;
        this.diaQueFoiAlugado = diaQueFoiAlugado;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public int getDiaQueFoiAlugado() {
        return diaQueFoiAlugado;
    }

    public void setDiaQueFoiAlugado(int diaQueFoiAlugado) {
        this.diaQueFoiAlugado = diaQueFoiAlugado;
    }

    @Override
    public Estado alugar() {
        JOptionPane.showMessageDialog(null, "O jogo está alugado.");
        return this;
    }

    @Override
    public Estado devolver() {
        JOptionPane.showMessageDialog(null, "Valor total da locação:\n R$: " + this.totalAluguel());
        JOptionPane.showMessageDialog(null, "O jogo foi devolvido.");
        return new Disponivel();
    }

    public float totalAluguel() {
        int hoje = this.calendar.get(Calendar.DAY_OF_YEAR);
        int total = hoje - this.diaQueFoiAlugado;
        if (!this.especial) {

            if (total <= 1) {
                return 3;
            } else if (total > 1 || total < 3) {
                return 3 + 1;
            } else if (total > 3) {
                return (3 + 1) + (3 * (total - 3));
            }
        } else {
            if (total <= 2) {
                return 5;
            } else if (total > 2 || total < 4) {
                return 5 + 3;
            } else if (total > 4) {
                return (5 + 3) + (3 * (total - 4));
            }
        }
        return 0;
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
