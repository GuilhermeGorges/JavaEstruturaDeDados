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
public class Aula08 {
    public static void main(String[] args) {
        
        Vetor vetor = new Vetor(3);
        
        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("E");
        vetor.adiciona("F");
        vetor.adiciona("G");
        
        System.out.println(vetor);
        
    }
    
}
