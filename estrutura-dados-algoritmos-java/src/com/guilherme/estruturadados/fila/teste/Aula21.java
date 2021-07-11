/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.estruturadados.fila.teste;

import com.guilherme.estruturadados.fila.Fila;

/**
 *
 * @author Gui e Di
 */
public class Aula21 {
    public static void main(String[] args) {

        Fila<Integer> fila = new Fila<>();
        
        fila.enfileira(1);
        fila.enfileira(2);
        fila.enfileira(3);
        
        System.out.println(fila.espiar());
        
    }
}
