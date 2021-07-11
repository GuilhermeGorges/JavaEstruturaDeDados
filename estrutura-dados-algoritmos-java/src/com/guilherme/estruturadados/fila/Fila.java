/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.estruturadados.fila;

import com.guilherme.estruturadados.base.EstruturaEstatica;

/**
 *
 * @author Gui e Di
 */
public class Fila<T> extends EstruturaEstatica<T>{
    
    public Fila(){
        super();
    }
    
    public Fila(int capacidade){
        super(capacidade);
    }
    
    public void enfileira(T elemento){
        //this.elementos[this.tamanho++] = elemento;
        
        this.adiciona(elemento);
    }
    
    public T espiar(){
        return this.elementos[0];
    }
        
    public T desenfileira(){
        
        final int POS = 0;
        
        
        if (this.estaVazia()){
            return null;
        }
        
        T elementoASerRemovido = this.elementos[POS];
        
        this.remove(POS);
               
        return elementoASerRemovido;
    }
}
