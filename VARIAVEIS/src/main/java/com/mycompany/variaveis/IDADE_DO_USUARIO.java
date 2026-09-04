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
        
public class IDADE_DO_USUARIO {
    public static void main(String[] args) {
        
        int idade;
        
        Scanner entradaNumero = new Scanner (System.in);
        
        System.out.println("Digite sua idade:");
        idade = entradaNumero.nextInt ();
        
        System.out.println("Voce tem "+idade+" anos.");
    }
    
}
