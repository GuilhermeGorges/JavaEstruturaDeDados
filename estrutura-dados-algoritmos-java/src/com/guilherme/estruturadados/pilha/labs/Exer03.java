/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.estruturadados.pilha.labs;

import com.guilherme.estruturadados.pilha.Pilha;

/**
 *
 * @author Gui e Di
 */
public class Exer03 {

    public static void main(String[] args) {
        Pilha<Livro> pilha = new Pilha<>(20);

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

        System.out.println("Pìlha de livros criada, pilha de livros vazia? " + pilha.estaVazia());

        System.out.println("Empilhando livros na pilha:");

        pilha.empilha(livro1);
        pilha.empilha(livro2);
        pilha.empilha(livro3);
        pilha.empilha(livro4);

        System.out.println(pilha.tamanho() + " livros foram empilhados:");
        System.out.println(pilha);
        
        System.out.println("Espiando o topo da pilha: "+ pilha.topo());

        System.out.println("Pìlha de livros criada, pilha de livros vazia? " + pilha.estaVazia());
        
        System.out.println("Desempilhando livros da pilha:");
        
        while(!pilha.estaVazia()){
            System.out.println("Desempilhando livro "+ pilha.desempilha());
        }
        
        System.out.println("Todos os livros foram desempilhados, pilha vazia: " + pilha.estaVazia());
    }
}
