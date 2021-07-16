/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.estruturadados.fila.teste;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 *  
 */
public class Aula23 {
    public static void main(String[] args) {
        
        Queue<Integer> fila = new LinkedList<>();
        
        fila.add(1);
        fila.add(2);
        fila.add(3);
        
        System.out.println(fila);
        
        System.out.println(fila.peek());
        
        System.out.println(fila.remove());
        
        System.out.println(fila);
        
        
    }
}
