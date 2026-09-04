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

public class CADASTRO_COMPLETO {
    public static void main(String[] args) {
        
        
String nome;
int idade;
float altura;
 
Scanner entradaTexto = new Scanner (System.in);
Scanner entradaNumero = new Scanner (System.in);

       System.out.println("Digite seu nome:");
       nome = entradaTexto.nextLine();
       
       System.out.println("Digite sua idade:");
       idade = entradaNumero.nextInt();
       
       System.out.println("Digite sua altura:");
       altura = entradaNumero.nextFloat ();
             
       System.out.println("Bonacera "+nome+", soubemos que tens "+idade+" anos e mede "+altura+"m de altura! Slay queen! PERIOD!!!");
      
    }
}
