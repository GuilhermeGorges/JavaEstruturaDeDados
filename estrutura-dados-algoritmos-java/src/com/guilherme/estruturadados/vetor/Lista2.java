/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.estruturadados.vetor;

import com.guilherme.estruturadados.base.EstruturaEstatica;

/**
 *
 * @author Gui e Di
 */
public class Lista2<T> extends EstruturaEstatica<T> {

    public Lista2() {
        super();

    }

    public Lista2(int capacidade) {
        super(capacidade);

    }

    public boolean adiciona(T elemento) {
        return super.adiciona(elemento);
    }
    
    public boolean adiciona(int posicao, T elemento) {
        return super.adiciona(posicao, elemento);
        
    }
}
