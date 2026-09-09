/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.condicional;

import java.util.Scanner;

/**
 *
 * @author JordanaLeite
 */
public class EXEMPLO2 {
    public static void main(String[] args) {
        
        int quantidadeMiojo, quantidadeSalada;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("A quanto tempo voce nao come miojo?");
        quantidadeMiojo = entrada.nextInt();
        System.out.println("A quanto tempo voce nao come salada?");
        quantidadeSalada = entrada.nextInt();
        
        if (quantidadeMiojo <2 || quantidadeSalada >7) {
            System.out.println("Pouco saudavel.");
        }if (quantidadeMiojo >= 2 || quantidadeSalada <7){
            System.out.println("Saudavel.");
        }
        
        
    }
}
