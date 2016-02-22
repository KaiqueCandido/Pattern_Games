/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pattern_games.entidades;

import com.mycompany.pattern_games.estado.Disponivel;
import com.mycompany.pattern_games.interfaces.Estado;
import java.io.Serializable;
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
    private String plataforma;
    @NotNull
    private Estado estado;

    public Jogo() {
        this.estado = new Disponivel();
    }

    public Jogo(Integer id, String titulo, String plataforma) {
        this.id = id;
        this.titulo = titulo;
        this.plataforma = plataforma;
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

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
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
        return titulo + " / " + plataforma + " / " + estado;
    }

}
