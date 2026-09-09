/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.condicional;

/**
 *
 * @author JordanaLeite
 */
import java.util.Scanner;

public class CONDICIONAL {

    public static void main(String[] args) {
     /* condicional é o codigo utilizado para avalisar dados;
        se for verdadeiro realiza uma açao; se for falso realiza outra açao:
        se = if
        senao = else 
        TABELA LOGICA:
        > MAIOR QUE
        < MENOR QUE
        >= MAIOR OU IGUAL
        <=MENOR OU IGUAL
        == IGUAL
        =! DIFERENTE
        */

    int idade;
    
    Scanner entradaNumero = new Scanner (System.in);
    
        System.out.println("Digite sua idade:");
        idade = entradaNumero.nextInt ();
        
        if (idade >= 18) {
            System.out.println("Voce eh maior de idade.");
        } else {
            System.out.println("Voce eh menor de idade.");
        }

    }
}
