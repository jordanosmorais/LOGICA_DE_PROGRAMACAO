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

public class MINI_CADASTRO_DE_FUNCIONARIO {
    public static void main(String[] args) {
        
        String nome;
        int idade;
        double salario;
        boolean carteiraAssinada;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o nome do funcionario:");
        nome = entrada.nextLine();

        System.out.println("Digite a idade:");
        idade = entrada.nextInt();

        System.out.println("Digite o salario:");
        salario = entrada.nextDouble();

        System.out.println("Possui carteira assinada? Digite true ou false:");
        carteiraAssinada = entrada.nextBoolean();

        System.out.println("---CADASTRO DE FUNCIONARIO---");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salario: " + salario);
        System.out.println("Carteira assinada: " + carteiraAssinada);  
      
    }
    
}
