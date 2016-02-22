/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pattern_games.main;

import com.mycompany.pattern_games.entidades.Cliente;
import com.mycompany.pattern_games.entidades.Jogo;
import com.mycompany.pattern_games.gerenciadores.GerenciadorDeJogo;
import com.mycompany.pattern_games.gerenciadores.GerenciadorDeCliente;
import java.util.List;

/**
 *
 * @author kaique
 */
public class Main {

    public static void main(String[] args) {
        Jogo jogo = new Jogo(1, "GTA", "PS2");
        Cliente c = new Cliente(1, "Kaique Candido", "097.507.454-77", "kaique25_ci@hotmail.com");

        GerenciadorDeJogo gj = new GerenciadorDeJogo();
        GerenciadorDeCliente gu = new GerenciadorDeCliente();

        List<Cliente> list = gu.listCliente();
        for (Cliente list1 : list) {
            System.out.println(list1);
        }

    }
}
