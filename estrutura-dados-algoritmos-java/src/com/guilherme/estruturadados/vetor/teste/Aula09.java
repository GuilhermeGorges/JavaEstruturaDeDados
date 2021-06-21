/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.estruturadados.vetor.teste;

import com.guilherme.estruturadados.vetor.Vetor;

/**
 *
 * @author Gui e Di
 */
public class Aula09 {
    public static void main(String[] args) {
                
        Vetor vetor = new Vetor(3);
        
        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("E");
        vetor.adiciona("F");
        
        System.out.println(vetor);
        
        vetor.remove(1);
        
        System.out.println(vetor);
        
        
        int pos = vetor.busca("E");
        
        System.out.println("Remover o elemento E");
        if(pos>-1){
            vetor.remove(pos);
        } else {
            System.out.println("Elemento não existe no vetor.");
        }
        
                
        
        System.out.println(vetor);
    }
    
}
