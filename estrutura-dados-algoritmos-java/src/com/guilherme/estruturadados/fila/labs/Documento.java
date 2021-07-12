/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.estruturadados.fila.labs;

/**
 *
 * @author Gui e Di
 */
public class Documento {
    
    private String nome;
    private int numFolhas;

    public Documento(String nome, int numFolhas) {
        super();
        this.nome = nome;
        this.numFolhas = numFolhas;
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumFolhas() {
        return numFolhas;
    }

    public void setNumFolhas(int numFolhas) {
        this.numFolhas = numFolhas;
    }
}
