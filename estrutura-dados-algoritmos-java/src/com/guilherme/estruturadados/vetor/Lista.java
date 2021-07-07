/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.estruturadados.vetor;

/**
 *
 * @author Gui e Di
 */
public class Lista<T> {

    //generalizar os tipos de vetor aula 11
    // definição aula 1
    private T[] elementos;
    private int tamanho;

    public Lista(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;

    }

    /*
    public Lista(int capacidade, Class<T> tipoClasse){
        this.elementos = (T[] Array.newInstance(tipoClasse, capacidade));
        this.tamanho = 0;
        
    }
     */

    // aula 02 adicionar elemento final vetor
    public boolean adiciona(T elemento) {
        this.aumentaCapacidade();
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }

        return false;

    }
    // aula07 adicionar elemento em qualquer posição

    public void adiciona(int posicao, T elemento) {

        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }

        this.aumentaCapacidade();

        // mover todos elementos
        for (int i = this.tamanho - 1; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }

        this.elementos[posicao] = elemento;
        this.tamanho++;

    }

    // aula 08 aumentar capacidade vetor
    private void aumentaCapacidade() {
        if (this.tamanho == this.elementos.length) {
            T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
            for (int i = 0; i < this.elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }
    
    // exercicio 04
    
    public T obtem(int posicao){
        return this.busca(posicao);
    }

    // aula05 obter elemento de uma posição
    public T busca(int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }

        return this.elementos[posicao];
    }

    // aula06 verificar se elemento existe no vetor
    public int busca(T elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }
    
    //exercicio 02

    public int ultimoIndice(T elemento) {
        
        int ultimaPos = -1;
        for (int i = this.tamanho-1; i >= 0; i--) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }

        return -1;
    }
    
    // exercicio 01

    public boolean contem(T elemento) {
        /*
        int pos = busca(elemento);
        if(pos>-1){
        return true;
        }
        return false;       
         */

        return busca(elemento) > -1;
    }

    // aula09 remover elemento do vetor
    public void remove(int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        for (int i = posicao; i < this.tamanho - 1; i++) {
            this.elementos[i] = this.elementos[i + 1];
        }
        this.tamanho--;

    }
    
    // exercicio 03
    
    public void remove(T elemento){
        int pos = this.busca(elemento);
        if(pos>-1){
            this.remove(pos);
        }
    }
    
    // exercicio 05
    
    public void limpar(){
        
        //opção 1
        //this.elementos = (T[]) new Object[this.elementos.length];
        
        //opção 2
        //this.tamanho = 0;
        
        //opção 3
        for (int i=0; i<this.tamanho; i++){
            this.elementos[i] = null;
        }        
        this.tamanho = 0;  
    }

    // aula03 verificar quuantidade vetor
    public int tamanho() {
        return this.tamanho;
    }

    // aula 04 imprimir elementos do vetor
    @Override
    public String toString() {

        StringBuilder s = new StringBuilder();

        s.append("[");

        for (int i = 0; i < this.tamanho - 1; i++) {
            s.append(this.elementos[i]);
            s.append(", ");
        }

        if (this.tamanho >= 0) {
            s.append(this.elementos[this.tamanho - 1]);
        }

        s.append("]");

        return s.toString();
    }

}
