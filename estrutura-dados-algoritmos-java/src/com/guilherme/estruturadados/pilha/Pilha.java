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
    
    public void empilha(T elemento){
        super.adiciona(elemento);
    }
    
    public T topo(){
        if(this.estaVazia()){
            return null;
        }
        return this.elementos[tamanho-1];
        
    }
    
    public T desempilha(){
        
        if(this.estaVazia()){
            return null;
        }
        
        return this.elementos[--tamanho];
        
    }
    
    
    
    

}
