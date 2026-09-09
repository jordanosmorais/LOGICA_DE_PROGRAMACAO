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
public class EXEMPLO3 {
    public static void main(String[] args) {
        
        int idadeP1, idadeP2, idadeP3;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite a idade da primeira pessoa:");
        idadeP1 = entrada.nextInt();
        
        System.out.println("Digite a idade da segunda pessoa:");
        idadeP2 = entrada.nextInt();
        
        System.out.println("Digite a idade da terceira pessoa:");
        idadeP3 = entrada.nextInt();
        
        if (idadeP1 > idadeP2 || idadeP1 < idadeP3){
            System.out.println("Primeira pessoa ganhou um brinde!");
        }if (idadeP2 > idadeP3 && idadeP2 > idadeP1){
            System.out.println("Segunda pessoa ganhou um brinde!");
        }if (idadeP3 < idadeP1 || idadeP3 < idadeP2 && idadeP2 > idadeP1){
            System.out.println("Terceira pessoa ganhou um brinde!");
        }
        
    }
    
}