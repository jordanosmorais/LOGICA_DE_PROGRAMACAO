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

public class VERIFICACAO_DE_MAIORIDADE {
    public static void main(String[] args) {
        
        int idade;
        boolean maiorDeIdade;
     
        Scanner entradaNumero = new Scanner (System.in);
        
        System.out.println("Digite sua idade:");
        idade = entradaNumero.nextInt();
        
        maiorDeIdade = idade >= 18;
        
        System.out.println("Maior de idade: "+maiorDeIdade);
        
        
    }
    
}
