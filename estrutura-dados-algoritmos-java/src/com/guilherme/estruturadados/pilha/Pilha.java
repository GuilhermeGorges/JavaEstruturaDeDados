/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.estruturadados.pilha;

import com.guilherme.estruturadados.base.EstruturaEstatica;

/**
 *
 * @author Gui e Di
 * @param <T>
 */
public class Pilha<T> extends EstruturaEstatica<T> {
    
    public Pilha(){        
        super();
    }
    
    public Pilha(int capacidade){
        super(capacidade);
    }
}
