/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.estruturadados.vetor;

public class Vetor {
    
    private String[] elementos; 
    private int tamanho;
    
    public Vetor(int capacidade){
        this.elementos = new String[capacidade];
        this.tamanho = 0;
        
    }
    
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
    public boolean adiciona(String elemento) {
        if (this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;    
            this.tamanho++;
            return true;
        } else {
            return true;
        }
    }  
    
    
}
