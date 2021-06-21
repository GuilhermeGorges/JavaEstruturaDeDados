/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.estruturadados.vetor;

import java.util.Arrays;

public class Vetor {
    
    // definição aula 1
    
    private String[] elementos; 
    private int tamanho;
    
    public Vetor(int capacidade){
        this.elementos = new String[capacidade];
        this.tamanho = 0;
        
    }
    
    // aula02 adicionar elemento final vetor 
    
    /*public void adiciona(String elemento){
        
         for (int i=0; i<this.elementos.length; i++){
            if (this.elementos[i] == null){
                this.elementos[i] = elemento;
                break;
                
            }
         }
    } 
    
    public void adiciona(String elemento) throws Exception{
        if (this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;    
            this.tamanho++;
        } else {
            throw new Exception("Vetor já está cheio!");
        }
    }  
    */
    // aula 02 adicionar elemento final vetor
    
    public boolean adiciona(String elemento) {
        this.aumentaCapacidade();
        if (this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;    
            this.tamanho++;
            return true;
        }

        return false;

    }  
    // aula07 adicionar elemento em qualquer posição
    
    public void adiciona(int posicao, String elemento) {
        
        if (!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        }                
        
        this.aumentaCapacidade();
        
        // mover todos elementos
        for (int i=this.tamanho-1; i >= posicao; i--){
            this.elementos[i+1] = this.elementos[i];            
        }
        
        this.elementos[posicao] = elemento;        
        this.tamanho++;    
        
    }
    
    // aula 08 aumentar capacidade vetor
    
    private void aumentaCapacidade(){
        if (this.tamanho == this.elementos.length){
            String[] elementosNovos = new String[this.elementos.length * 2];
            for (int i = 0; i < this.elementos.length; i++){
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }
    
    
    // aula05 obter elemento de uma posição
    
    public String busca(int posicao){
        if (!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        }
        
        return this.elementos[posicao];
    }
    
    // aula06 verificar se elemento existe no vetor
    
    public int busca(String elemento){
        for (int i=0; i<this.tamanho; i++){
            if(this.elementos[i].equalsIgnoreCase(elemento)){
                return i;
            }
        }
                return -1;
    }
    
    // aula09 remover elemento do vetor
    
    public void remove(int posicao){
        if (!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        }
        for (int i = posicao; i<this.tamanho-1; i++){
            this.elementos[i] = this.elementos[i+1];
        }
        this.tamanho--;       
        
    }
    
    
    // aula03 verificar quuantidade vetor
    
    public int tamanho(){
        return this.tamanho;    
    }
    
    
    // aula 04 imprimir elementos do vetor

    @Override
    public String toString() {
        
        StringBuilder s = new StringBuilder();
        
        s.append("[");
        
        
        for(int i=0; i<this.tamanho-1; i++){
            s.append(this.elementos[i]);
            s.append(", ");
        }
        
        if (this.tamanho >= 0){
            s.append(this.elementos[this.tamanho-1]);
        }
        
        s.append("]");
        
        return s.toString();
    }   
    
    
    
}
