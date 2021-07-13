/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.estruturadados.fila.labs;

import com.guilherme.estruturadados.fila.FilaComPrioridade;

/**
 *
 * @author Gui e Di
 */
public class Exer03 {
    
    public static final int VERDE = 2;
    public static final int AMARELO = 1;
    public static final int VERMELHO = 0;
    
    public static void main(String[] args) {
        
        FilaComPrioridade<Pessoa> fila = new FilaComPrioridade<>();
        fila.enfileira(new Pessoa("1", VERDE));
        fila.enfileira(new Pessoa("2", VERMELHO));
        fila.enfileira(new Pessoa("3", AMARELO));
        fila.enfileira(new Pessoa("4", VERMELHO));
        fila.enfileira(new Pessoa("5", AMARELO));
        fila.enfileira(new Pessoa("6", VERDE));
        
        PSAtendimento atendimento = new PSAtendimento(fila);
        PSNovosPacientes paciente = new PSNovosPacientes(fila);
        
        Thread t1 = new Thread(atendimento);
        Thread t2 = new Thread(paciente);
        
        t1.start();
        t2.start();
        
        
    }
}
