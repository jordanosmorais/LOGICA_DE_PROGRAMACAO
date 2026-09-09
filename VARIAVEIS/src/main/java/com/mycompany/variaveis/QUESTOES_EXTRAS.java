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

public class QUESTOES_EXTRAS {
    // QUESTÃO 11
    public static void main(String args) {
        
       Scanner entradaNumero = new Scanner(System.in);
       
            System.out.print("Digite o primeiro numero decimal");
            double numero1 = entradaNumero.nextDouble();
            
            System.out.print("Digite o segundo numero decimal");
            double numero2 = entradaNumero.nextDouble();
            
            System.out.print("Digite o terceiro numero decimal");
            double numero3 = entradaNumero.nextDouble();
            
            double soma = numero1 + numero2 + numero3;
            double multiplicacao = numero1 * numero3;
            double divisao = numero1 / numero3;
            
        System.out.println("A soma dos valores e: "+soma);
        System.out.println("A multiplicacao do primeiro com o ultimo e: "+ multiplicacao);
        System.out.println("A divisao do primeiro com o ultimo e: "+divisao);
    }
    
    // QUESTÃO 12
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite o primeiro numero decimal: ");
        double numero1 = entrada.nextDouble();

        System.out.print("Digite o segundo numero decimal: ");
        double numero2 = entrada.nextDouble();

        double subtracao = numero1 - numero2;

        System.out.println("Ola " + nome + ", a subtracao dos valores e: " + subtracao);
    }
}
