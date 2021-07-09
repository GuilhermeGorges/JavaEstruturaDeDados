/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.estruturadados.pilha.teste;

import com.guilherme.estruturadados.pilha.Pilha;
import java.util.Stack;

/**
 *
 * @author Gui e Di
 */
public class Aula18 {
    public static void main(String[] args) {
        
        Pilha<Integer> pilha = new Pilha<Integer>();
        
        Stack<Integer> stack = new Stack<Integer>();
        
        System.out.println(stack.isEmpty());
        
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());
        System.out.println(stack);
        
        System.out.println(stack.peek());
        
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        
    }
}
