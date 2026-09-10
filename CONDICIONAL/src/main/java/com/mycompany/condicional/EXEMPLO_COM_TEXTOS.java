/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.condicional;

/**
 *
 * @author JordanaLeite
 */

import java.util.Scanner;

public class EXEMPLO_COM_TEXTOS {
    public static void main(String[] args) {
        
        String nome;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Bonacera, seu nome ta na lista?");
        nome = entrada.nextLine();
        
        if (nome.equals("Enzo")){
            System.out.println("Se manca, sai fora.");
        }else if (nome.equals("Antonio")){
            System.out.println("VA DE RETRO!");
        }else if (nome.equals ("Jordana")){
            System.out.println("EH A PATROA!");
        }else if (!nome.equals("Enzo") && !nome.equals ("Antonio") && !nome.equals("Jordana") && !nome.equals ("Maria")){
            System.out.println("Pode entrar maezinha!");
        }
        
        
        
    }
    
}
