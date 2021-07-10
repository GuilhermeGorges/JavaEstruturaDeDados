/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.estruturadados.pilha.labs;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Gui e Di
 */
public class Exer06 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite uma expressão: ");
        String expressao = scan.nextLine();
        
        imprimeResultado(expressao);

    }
    
    public static void imprimeResultado(String expressao){
        
        System.out.println(expressao + " está balanceada? " + verificaSimbolosBalanceador(expressao));
    }
    
    final static String ABRE = "({[";
    final static String FECHA = ")}]";
    
    

    public static boolean verificaSimbolosBalanceador(String expressao) {

        Stack<Character> pilha = new Stack<>();
        int index = 0;
        char simbolo, topo;
        
        
        while (index < expressao.length()){
            simbolo = expressao.charAt(index);
            
            if (ABRE.indexOf(simbolo) > -1){
                pilha.push(simbolo);
            } else if (FECHA.indexOf(simbolo) > -1){
                
                if (pilha.isEmpty()){
                    return false;
                } else {
                    topo = pilha.pop();
                    
                    if(ABRE.indexOf(topo) != FECHA.indexOf(simbolo)){
                        return false;
                    }
                }
            }     
            index++;
        }
        return true;
    }
}
