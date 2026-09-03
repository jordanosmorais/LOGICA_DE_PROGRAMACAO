/*  
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.variaveis;

/**
 *
 * @author JordanaLeite
 */
//importando as bibliotecas do scanner
import java.util.Scanner;

public class ENTRADA_SAIDA {
   public static void main (String [] args){
// codigo pra cadastrar o pet
String nome;
String raca;
int idade;
double peso;
boolean FoiVacinado; 
//criando as variaveis de captura de dados
Scanner entradaTexto = new Scanner (System.in);
Scanner entradaNumero = new Scanner (System.in);
Scanner entradaLogica = new Scanner (System.in);

       System.out.println("Nome do seu Pet:");
       nome = entradaTexto.nextLine();
       
       System.out.println("Raca do seu Pet:");
       raca = entradaTexto.nextLine();
       
       System.out.println("Idade do seu Pet:");
       idade = entradaNumero.nextInt ();
       
       System.out.println("Peso do seu Pet:");
       peso = entradaNumero.nextDouble();
       
       System.out.println("Seu Pet e vacinado:");
       System.out.println("digite 1 para sim, "+ "ou 0 para nao");
       FoiVacinado = entradaLogica.hasNextInt ();
      
       
       System.out.println("Bem vindo (a) "+nome);
       System.out.println("Voce e da raca "+raca+" e tem "+idade+" anos.");
       System.out.println("Seu dono informou que seu peso e "+peso+"Kg, e que seu status de vacina e "+FoiVacinado);
       
       
       
       
       
       
   }

   
   
   
   
   
 
}