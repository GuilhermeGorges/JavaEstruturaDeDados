/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.estruturadados.vetor.teste;

import com.guilherme.estruturadados.vetor.VetorObjetos;

/**
 *
 * @author Gui e Di
 */
public class Aula10 {
    public static void main(String[] args) {
        
        //generalizar os tipos de vetor aula 10 
        
        VetorObjetos vetor = new VetorObjetos(3);
        
        Contato c1 = new Contato("Contato 1", "1234-5678", "contato1@email.com");
        Contato c2 = new Contato("Contato 2", "1234-5678", "contato2@email.com");
        Contato c3 = new Contato("Contato 3", "1234-5678", "contato3@email.com");
        Contato c4 = new Contato("Contato 3", "1234-5678", "contato3@email.com");
        
        vetor.adiciona(c1);
        vetor.adiciona(c2);
        vetor.adiciona(c3);
        
        System.out.println("Tamanho = " + vetor.tamanho());
        
        int pos = vetor.busca(c4);
        
        if(pos>-1){
            System.out.println("Elemento existe no vetor");
        }else {
            System.out.println("Elemento não existe no vetor");
        }
        //System.out.println(vetor);
    }
    
}
