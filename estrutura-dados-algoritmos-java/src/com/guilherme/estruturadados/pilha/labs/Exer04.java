/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.estruturadados.pilha.labs;

import java.util.Stack;

/**
 *
 *  
 */
public class Exer04 {

    public static void main(String[] args) {
        
        Stack<Livro> pilha = new Stack<>();

        Livro livro1 = new Livro();
        livro1.setNome("O senhor dos aneis 1 ");
        livro1.setAutor("Tolkien");
        livro1.setAnoLancamento(1960);
        livro1.setIsbn("123456");

        Livro livro2 = new Livro();
        livro2.setNome("O senhor dos aneis 2");
        livro2.setAutor("Tolkien");
        livro2.setAnoLancamento(1961);
        livro2.setIsbn("234567");

        Livro livro3 = new Livro();
        livro3.setNome("O senhor dos aneis 3 ");
        livro3.setAutor("Tolkien");
        livro3.setAnoLancamento(1962);
        livro3.setIsbn("345678");

        Livro livro4 = new Livro();
        livro4.setNome("O hobbit");
        livro4.setAutor("Tolkien");
        livro4.setAnoLancamento(1959);
        livro4.setIsbn("456789");

        System.out.println("Pìlha de livros criada, pilha de livros vazia? " + pilha.isEmpty());

        System.out.println("Empilhando livros na pilha:");

        pilha.push(livro1);
        pilha.push(livro2);
        pilha.push(livro3);
        pilha.push(livro4);

        System.out.println(pilha.size()+ " livros foram empilhados:");
        System.out.println(pilha);
        
        System.out.println("Pìlha de livros criada, pilha de livros vazia? " + pilha.isEmpty());

        System.out.println("Espiando o topo da pilha: "+ pilha.peek());
        
        System.out.println("Desempilhando livros da pilha:");
        
        while(!pilha.isEmpty()){
            System.out.println("Desempilhando livro "+ pilha.pop());
        }
        
        System.out.println("Todos os livros foram desempilhados, pilha vazia: " + pilha.isEmpty());
    }
}
