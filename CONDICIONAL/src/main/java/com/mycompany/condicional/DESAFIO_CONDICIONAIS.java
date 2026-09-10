/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.condicional;

/**
 *
 * @author JordanaLeite
 */

import java.util.Locale;
import java.util.Scanner;

public class DESAFIO_CONDICIONAIS {
    public static void main(String[] args) {
        
        String nome, ingresso;
        int idade;
        boolean autorizacao = false; 
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite seu nome:");
        nome = entrada.nextLine();
        
        System.out.println("Digite sua idade:");
        idade = entrada.nextInt();
        
        entrada.nextLine();
        
        System.out.println("Digite seu tipo de ingresso:");
        ingresso = entrada.nextLine().toUpperCase();
        
        System.out.println("Bem vinda(a) "+nome+"! Voce ja tem "+idade+"!");
        
        if(idade >= 16 && idade <= 17){
           System.out.println("Voce tem autorizacao? (true/false):");
           autorizacao = entrada.nextBoolean();
        }
        
        System.out.println("--- RESULTADO DO CONTROLE ---");
        
        if (ingresso.equals("PROFESSOR") || ingresso.equals("FUNCIONARIO")){
            System.out.println("Acesso especial liberado!");
        }else if (idade >= 18 && ingresso.equals("VIP")){
            System.out.println("Acesso VIP liberado!");
        }else if (idade >=18 && ingresso.equals("COMUM")){
            System.out.println("Acesso COMUM liberado!");
        }else if ((idade >=16 && idade <= 17) && autorizacao){
            System.out.println("Acesso liberado com autorizacao!");
        }else {
            System.out.println("Acesso negado!");
        }
        
        entrada.close();
        
        
    }
    
}
