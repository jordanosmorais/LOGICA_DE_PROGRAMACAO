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

public class SITUACAO_DA_MATRICULA {
    public static void main(String[] args) {
        
        boolean matriculado;

        Scanner entradaTexto = new Scanner(System.in);

        System.out.println("Voce esta matriculado? Digite true ou false:");
        matriculado = entradaTexto.nextBoolean();

        System.out.println("Aluno matriculado: " + matriculado);
    }
}
