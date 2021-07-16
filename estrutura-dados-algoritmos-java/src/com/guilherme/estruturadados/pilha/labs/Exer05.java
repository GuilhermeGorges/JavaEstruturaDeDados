/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.estruturadados.pilha.labs;

import com.guilherme.estruturadados.pilha.Pilha;
import java.util.Scanner;

/**
 *
 *  
 */
public class Exer05 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um palindromo: ");
        String palavra = scan.nextLine();
        
        imprimeResultado(palavra);
         
    }
    
    public static void imprimeResultado(String palavra){
        if(testaPalindromo(palavra)){
            System.out.println(palavra + " é um palindromo");
        } else {            
            System.out.println(palavra + " não é um palindromo");
        }  
    }
    
    public static boolean testaPalindromo(String palavra){
        
        Pilha<Character> pilha = new Pilha<>();
        
        for (int i = 0; i < palavra.length(); i++){
            pilha.empilha(palavra.charAt(i));
        }
        
        String palavraInversa = "";
        
        while(!pilha.estaVazia()){
            palavraInversa += pilha.desempilha();
            
        }
        
        if (palavraInversa.equalsIgnoreCase(palavra)){
            return true;
        }   
        
        return false;
    }
}
