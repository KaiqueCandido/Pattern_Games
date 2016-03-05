/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pattern_games.entidades;

import br.com.caelum.stella.bean.validation.CPF;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

/**
 *
 * @author kaique
 */
@Entity
public class Cliente implements Serializable {

    @Id
    @GeneratedValue
    private Integer id;
    @NotNull
    private String nome;
    @CPF
    private String cpf;
    @NotNull
    private String email;
    @OneToMany(fetch = FetchType.EAGER)
    private List<Jogo> jogos;
    private Jogo jogoObservado;

    public Cliente() {
        this.jogos = new ArrayList<Jogo>();
    }

    public Cliente(Integer id, String nome, String cpf, String email, Jogo jogoObservado) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.jogos = new ArrayList<Jogo>();
        this.jogoObservado = jogoObservado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Jogo> getJogos() {
        return jogos;
    }

    public void setJogos(List<Jogo> jogos) {
        this.jogos = jogos;
    }

    public void addJogo(Jogo j) {
        this.jogos.add(j);
    }

    public void devolverJogo(Jogo j) {
        this.jogos.remove(j);
    }

    public Jogo getJogoObservado() {
        return jogoObservado;
    }

    public void setJogoObservado(Jogo jogoObservado) {
        this.jogoObservado = jogoObservado;
    }

    @Override
    public String toString() {
        return nome;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.id);
        hash = 59 * hash + Objects.hashCode(this.nome);
        hash = 59 * hash + Objects.hashCode(this.cpf);
        hash = 59 * hash + Objects.hashCode(this.email);
        hash = 59 * hash + Objects.hashCode(this.jogos);
        hash = 59 * hash + Objects.hashCode(this.jogoObservado);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.jogos, other.jogos)) {
            return false;
        }
        if (!Objects.equals(this.jogoObservado, other.jogoObservado)) {
            return false;
        }
        return true;
    }
    

}
