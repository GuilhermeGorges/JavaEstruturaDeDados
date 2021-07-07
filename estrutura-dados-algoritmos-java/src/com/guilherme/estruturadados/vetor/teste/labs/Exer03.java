/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.estruturadados.vetor.teste.labs;

import com.guilherme.estruturadados.vetor.Lista;

/**
 *
 * @author Gui e Di
 */
public class Exer03 {
    public static void main(String[] args) {
        Lista<String> lista = new Lista<String>(5);
        
        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");
        lista.adiciona("D");
        lista.adiciona("E");
        
        System.out.println(lista);
        
        lista.remove("A");
        
        System.out.println(lista);
        
        lista.remove("E");
        System.out.println(lista);
        
        lista.remove("C");
        System.out.println(lista);
        
    }
}
