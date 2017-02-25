/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.jdelgadog.a07;

import java.util.Scanner;

/**
 *
 * @author GILDARDO
 */
public class SPPJDelgadoGA07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long[] numeros = new long[10];
        long telefono = 0;
        Scanner kb = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduzca el numero de telefono "+i);
            numeros[i] = kb.nextLong();
        }
        System.out.println("Introduzca la posición a solicitar ");
           int i = kb.nextInt(); 
        if( i<10){
            telefono=numeros[i];
            System.out.println("En la posición "+i+" del arreglo el numero es "+numeros[i]);
        }else{
            System.out.println("La posición solicitada esta fuera de rango");
        }
    }
}
