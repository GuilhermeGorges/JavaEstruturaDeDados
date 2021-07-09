/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.estruturadados.pilha.teste;

import com.guilherme.estruturadados.pilha.Pilha;

/**
 *
 * @author Gui e Di
 */
public class Aula14 {
    
    public static void main(String[] args) {
        
        Pilha<Integer> pilha = new Pilha<Integer>();
        
        for (int i = 1; i <= 10; i++){
            pilha.empilha(i);
        }
        
        System.out.println(pilha);
        System.out.println(pilha.tamanho());
    }
}
