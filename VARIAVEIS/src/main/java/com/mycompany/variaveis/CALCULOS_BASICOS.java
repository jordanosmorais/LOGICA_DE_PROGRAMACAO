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

public class CALCULOS_BASICOS {
    public static void main(String[] args) {
        
        int numero1, numero2, resultadoresto;
        double resultadoSoma, resultadoSubtracao, resultadoMultiplicacao, resultadoDivisao;
      
        Scanner entradaNumero = new Scanner (System.in);
        
        System.out.println("Digite um valor inteiro:");
        numero1 = entradaNumero.nextInt();
        
        System.out.println("Digite outro valor inteiro:");
        numero2 = entradaNumero.nextInt();
        
        resultadoSoma = numero1 + numero2;
        
        System.out.println("A soma dos numeros e: "+resultadoSoma);
        
        resultadoSubtracao = numero1 - numero2;
        
        System.out.println("A subtracao dos numeros e: "+resultadoSubtracao);
        
        resultadoMultiplicacao = numero1 * numero2;
        
        System.out.println("A multiplicacao dos numeros e: "+resultadoMultiplicacao);
        
        resultadoDivisao = numero1 / numero2;
        
        System.out.println("A divisao dos numeros e: "+resultadoDivisao);
        
        resultadoresto = numero1 % numero2;
        
        System.out.println("O resto da divisao dos numeros e: "+resultadoresto);
        
      
        
        
        
    }
}
