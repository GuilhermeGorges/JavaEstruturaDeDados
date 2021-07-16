/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.estruturadados.fila.labs;

import com.guilherme.estruturadados.fila.FilaComPrioridade;

/**
 *
 *  
 */
public class PSAtendimento implements Runnable {

    private FilaComPrioridade<Pessoa> fila;

    public PSAtendimento(FilaComPrioridade<Pessoa> fila) {
        super();
        this.fila = fila;
    }

    @Override
    public void run() {

        while (!fila.estaVazia()) {
            try {
                System.out.println(fila.desenfileira() + " atendida.");
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Atendimento concluído.");
    }

}
