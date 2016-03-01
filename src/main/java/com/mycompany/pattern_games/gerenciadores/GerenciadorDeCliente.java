/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pattern_games.gerenciadores;

import com.mycompany.pattern_games.dao.ClienteDAO;
import com.mycompany.pattern_games.entidades.Cliente;
import java.util.List;

/**
 *
 * @author kaique
 */
public class GerenciadorDeCliente {

    public void addCliente(Cliente c) {
        new ClienteDAO().addCliente(c);
    }

    public List<Cliente> listCliente() {
        return new ClienteDAO().listCliente();
    }

    public boolean updateCliente(Cliente c) {
        return new ClienteDAO().updateCliente(c);
    }
}
