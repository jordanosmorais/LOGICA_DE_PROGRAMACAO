/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.variaveis;

/**
 *
 * @author JordanaLeite
 */

import java.util.Scanner;

public class SOMA_DE_DOIS_NUMEROS {
    public static void main(String[] args) {
        
        Scanner entradaNumero = new Scanner (System.in);
       
        System.out.println("Digite o primeiro valor:");
        int valor1 = entradaNumero.nextInt ();
        
        System.out.println("Digite o segundo valor:");
        int valor2 = entradaNumero.nextInt ();
        
        int soma = valor1 + valor2;
           
        System.out.println("A soma e: "+soma);
    }
    
}
