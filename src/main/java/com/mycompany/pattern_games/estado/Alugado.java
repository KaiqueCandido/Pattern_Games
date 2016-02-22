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
public class Alugado implements Estado, Serializable{
    
    @Override
    public Estado alugar(){
        System.out.println("O jogo está alugado.");
        return this;
    }
    
    @Override
    public Estado devolver(){
        System.out.println("O jogo foi devolvido.");
        return new Disponivel();
    }
    
}
