package com.guilherme.estruturadados.pilha.labs;

import java.util.Scanner;
import java.util.Stack;

public class Exer07 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero = 1;
        int base;

        while (numero != 0) {
            System.out.println("Digite um numero decimal para converter em binário: [0] EXIT");
            numero = scan.nextInt();
            if (numero == 0) {
                System.out.println("Até mais.");
                break;
            }
            imprimeResultado(numero);
        }

        numero = 1;
        
        while (numero != 0) {
            System.out.println("Digite um numero decimal para converter em qualquer base: [0] EXIT");
            numero = scan.nextInt();            
            System.out.println("Digite uma base ");
            base = scan.nextInt();
            if (numero == 0) {
                System.out.println("Até mais.");
                break;
            }
            imprimeResultadoQualquerBase(numero, base);
        }

    }

    public static void imprimeResultado(int numero) {
        System.out.println(numero + " em binário é: " + decimalBinario(numero));
    }

    public static void imprimeResultadoQualquerBase(int numero, int base) {
        System.out.println(numero + " na base " + base
                + " em binário é: " + decimalQualquerBase(numero, base));
    }

    public static String decimalBinario(int numero) {

        Stack<Integer> pilha = new Stack<>();
        String numBinario = "";
        int resto;

        while (numero > 0) {
            resto = numero % 2;
            pilha.push(resto);
            numero /= 2;
        }

        while (!pilha.isEmpty()) {
            numBinario += pilha.pop();
        }

        return numBinario;
    }

    public static String decimalQualquerBase(int numero, int base) {

        Stack<Integer> pilha = new Stack<>();
        String numBase = "";
        int resto;
        String bases = "0123456789ABCDEF";

        while (numero > 0) {
            resto = numero % base;
            pilha.push(resto);
            numero /= base;
        }

        while (!pilha.isEmpty()) {
            numBase += bases.charAt(pilha.pop());
        }

        return numBase;
    }
}
