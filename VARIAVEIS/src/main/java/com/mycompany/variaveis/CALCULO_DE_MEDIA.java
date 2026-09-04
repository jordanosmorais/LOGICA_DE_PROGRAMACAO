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

public class CALCULO_DE_MEDIA {
    public static void main(String[] args) {
       
        Scanner entradaNumero = new Scanner (System.in);
       
        System.out.println("Digite a primeira nota:");
        double nota1 = entradaNumero.nextDouble ();
        
        System.out.println("Digite a segunda nota:");
        double nota2 = entradaNumero.nextDouble ();
        
        double media = (nota1 + nota2) / 2;
           
        System.out.println("A media e: "+media);
                
        
    }
}