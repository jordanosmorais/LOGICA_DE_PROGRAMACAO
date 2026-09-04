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

public class CONVERSAO_DE_TEMPERATURA {
    public static void main(String[] args) {
        
        double temperatura;
        
        Scanner entradaNumero = new Scanner (System.in);
        
        System.out.println("Quantos graus ta fazendo la fora?");
        temperatura = entradaNumero.nextDouble();
        
        System.out.println("A temperatura informada foi: "+temperatura+"ºC.");
    }
    
}
