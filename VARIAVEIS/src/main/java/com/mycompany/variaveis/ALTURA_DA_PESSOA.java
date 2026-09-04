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

public class ALTURA_DA_PESSOA {
    public static void main(String[] args) {
        
        float altura;
        
        Scanner entradaNumero = new Scanner (System.in);
        
        System.out.println("Digite sua altura:");
        altura = entradaNumero.nextFloat();
        
        System.out.println("Sua altura e "+altura+" metros");
        
    }
    
}
