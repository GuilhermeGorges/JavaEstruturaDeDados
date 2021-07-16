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
public class Exer02 {

    public static void main(String[] args) {
        Pilha<Integer> par = new Pilha<>();
        Pilha<Integer> impar = new Pilha<>();

        Scanner scan = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.println("Entre com um numero: ");

            int num = scan.nextInt();

            if (num == 0) {

                Integer desempilhado = par.desempilha();

                if (desempilhado == null) {
                    System.out.println("Pilha par vazia.");
                } else {
                    System.out.println("Desempilhado da pilha par: " + desempilhado);
                }

                desempilhado = impar.desempilha();

                if (desempilhado == null) {
                    System.out.println("Pilha par vazia.");
                } else {
                    System.out.println("Desempilhado da pilha impar: " + desempilhado);
                }

            } else if (num % 2 == 0) {
                System.out.println("Numero par, empilhando na pilha par: " + num);
                par.empilha(num);

            } else {
                System.out.println("Numero impar, empilhando na pilha impar: " + num);
                impar.empilha(num);
            }

        }
        
        System.out.println("Desempilhando todos os números da pilha par");
        
        while(!par.estaVazia()){
            System.out.println("Desempilhando da pilha par: "+par.desempilha());
        }
        
        System.out.println("Desempilhando todos os números da pilha impar");
        
        while(!impar.estaVazia()){
            System.out.println("Desempilhando da pilha impar: "+impar.desempilha());
        }
        
        
        

    }
}
