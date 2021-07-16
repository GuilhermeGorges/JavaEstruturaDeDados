/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.estruturadados.pilha.teste;

import com.guilherme.estruturadados.pilha.Pilha;

/**
 *
 *  
 */
public class Aula16 {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<Integer>();
        
        System.out.println(pilha.topo());
        pilha.empilha(1);
        pilha.empilha(2);
        pilha.empilha(3);
        
        System.out.println(pilha.topo());
        System.out.println(pilha);
        
    }
}
