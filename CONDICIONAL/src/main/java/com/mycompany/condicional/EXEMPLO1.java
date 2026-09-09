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
public class EXEMPLO1 {
    public static void main(String[] args) {
        
      double altura, peso, imc;
      String nome;
      
      Scanner entrada = new Scanner(System.in);
      
        System.out.println("Digite seu nome:");
        nome = entrada.nextLine();
        System.out.println("Digite sua altura:");
        altura = entrada.nextDouble();
        System.out.println("Digite sua peso:");
        peso = entrada.nextDouble();
        
        imc = peso / (altura*altura);
        
        if (imc <= 16.9) {
            System.out.println("Muito abaixo do peso.");
        }if (imc >= 17 && imc <= 18.4) {
            System.out.println("Abaixo do peso.");
        }if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Peso normal.");
        }if (imc >= 25 && imc <= 29.9){
            System.out.println("Acima do peso.");
        }if (imc >= 30 && imc <= 34.9){
            System.out.println("Obesidade grau I.");
        }if (imc >= 35 && imc <= 40){
            System.out.println("Obesidade grau II"); 
        }if (imc >= 40.1 && imc <= 45){
            System.out.println("Obesidade grau III");
        }
        
        System.out.println("Bem vinda(a) "+nome+"! Medes "+altura+" de altura e pesas "+peso+", isso significa que seu IMC eh:"+imc);
    }
}
