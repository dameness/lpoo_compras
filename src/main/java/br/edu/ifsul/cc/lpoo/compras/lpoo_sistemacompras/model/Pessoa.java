/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.compras.lpoo_sistemacompras.model;

import java.util.Collection;

/**
 *
 * @author damen
 */
public class Pessoa {
    
    private Integer id;
    
    private String nome;
    
    private Collection<Compra> compras;
    
    public Pessoa() {
    }

    public Collection<Compra> getCompras() {
        return compras;
    }
    
    public void setCompras(Collection<Compra> compras) {
        this.compras = compras;
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
    
    
}
