/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.estruturadados.vetor.teste.labs;

import com.guilherme.estruturadados.vetor.Lista;
import java.util.ArrayList;

/**
 *
 * @author Gui e Di
 */
public class Exer02 {
    public static void main(String[] args) {
    //Lista<String> lista = new Lista<String>(5);
    ArrayList<String> arrayList = new ArrayList<String>(5);
    arrayList.add("A");
    arrayList.add("B");
    arrayList.add("A");
    
    System.out.println(arrayList.lastIndexOf("A"));
    
    Lista<String> lista = new Lista<String>(5);
    lista.adiciona("A");
    lista.adiciona("B");
    lista.adiciona("A");
    lista.adiciona("A");
    
    System.out.println(lista.ultimoIndice("A"));
    
    
    }
}
