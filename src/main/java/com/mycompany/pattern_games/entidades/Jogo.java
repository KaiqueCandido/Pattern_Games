/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pattern_games.entidades;

import com.mycompany.pattern_games.estado.Disponivel;
import com.mycompany.pattern_games.interfaces.Estado;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 *
 * @author kaique
 */
@Entity
public class Jogo implements Serializable {

    @Id
    @GeneratedValue
    private Integer id;
    @NotNull
    private String titulo;
    @NotNull
    private String genero;
    @NotNull
    private Estado estado;

    public Jogo() {
        this.estado = new Disponivel();
    }

    public Jogo(Integer id, String titulo, String genero) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.estado = new Disponivel();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void alugar() {
        this.estado = estado.alugar();
    }

    public void devolver() {
        this.estado = estado.devolver();
    }

    @Override
    public String toString() {
        return titulo + " / " + estado;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.id);
        hash = 29 * hash + Objects.hashCode(this.titulo);
        hash = 29 * hash + Objects.hashCode(this.genero);
        hash = 29 * hash + Objects.hashCode(this.estado);
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
        final Jogo other = (Jogo) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        if (!Objects.equals(this.genero, other.genero)) {
            return false;
        }
        if (!Objects.equals(this.estado, other.estado)) {
            return false;
        }
        return true;
    }

}
