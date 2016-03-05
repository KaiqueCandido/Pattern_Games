/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pattern_games.gerenciadores;

import com.mycompany.pattern_games.dao.ClienteDAO;
import com.mycompany.pattern_games.dao.JogoDAO;
import com.mycompany.pattern_games.entidades.Cliente;
import com.mycompany.pattern_games.entidades.Jogo;
import com.mycompany.pattern_games.estado.Alugado;
import com.mycompany.pattern_games.javamail.JavaMailApp;
import java.util.List;
import javax.swing.JOptionPane;

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
        if (j.getEstado() instanceof Alugado) {
            int showConfirmDialog = JOptionPane.showConfirmDialog(null,
                    "Este jogo se encontra alugado no momento."
                    + "\nGostaria de saber quando o jogo estara disponivel ? ");
            if (showConfirmDialog == 0) {
                c.setJogoObservado(j);
                JOptionPane.showMessageDialog(null,
                        "Obrigado!\nVocê recebera um e-mail assim que o jogo "
                        + j.getTitulo() + " estiver disponivel.");
                new JogoDAO().observaJogo(c, j);
            }
        } else {
            new JogoDAO().locateJogo(c, j);
        }

    }

    public void devolverJogo(Cliente c, Jogo j) {        
        List<Cliente> clientes = new ClienteDAO().listCliente();        
        for (Cliente cliente : clientes) {            
            if (cliente.getJogoObservado() != null) {               
                if (cliente.getJogoObservado().getId() == j.getId()) {

                    System.out.println("Entrou");

                    new JavaMailApp().mandaEmail(cliente);
                }
            }
        }        
        new JogoDAO().devolverJogo(c, j);
    }

}
