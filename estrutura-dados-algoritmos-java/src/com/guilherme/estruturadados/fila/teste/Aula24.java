/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.estruturadados.fila.teste;

import com.guilherme.estruturadados.fila.FilaComPrioridade;

/**
 *
 *  
 */
public class Aula24 {
    public static void main(String[] args) {
        
        FilaComPrioridade<Integer> fila = new FilaComPrioridade<>();
        
        fila.enfileira(3);
        fila.enfileira(2);
        fila.enfileira(1);
        
        System.out.println(fila);
        
    }
}
