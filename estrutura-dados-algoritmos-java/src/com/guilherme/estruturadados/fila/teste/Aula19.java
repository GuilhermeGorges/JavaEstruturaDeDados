/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.estruturadados.fila.teste;

import com.guilherme.estruturadados.fila.Fila;

/**
 *
 *  
 */
public class Aula19 {
    public static void main(String[] args) {
        
        Fila<Integer> fila = new Fila<>();
        
        System.out.println(fila.estaVazia());
        System.out.println(fila.tamanho());
    }
}
