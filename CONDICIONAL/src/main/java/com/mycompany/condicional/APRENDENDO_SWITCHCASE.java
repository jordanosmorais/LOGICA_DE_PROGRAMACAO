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

public class APRENDENDO_SWITCHCASE {
    public static void main(String[] args) {
        
        // Sistema de Agendamento de Serviços de Pet Shop
        
        String nome, raca;
        int idade, servico;
        
        Scanner entrada = new Scanner (System.in);
        
        // Solicitação dos dados
        
        System.out.println("Bom dia! Para comecarmos, digite o nome do pet:");
        nome = entrada.nextLine();
        
        System.out.println("Estamos quase, "+nome+"! Qual sua raca?");
        raca = entrada.nextLine();
        
        System.out.println("Muito bem "+nome+", agora que sabemos que voce eh um "+raca+" incrivel, nos diga quantos aninhos voce tem?");
        idade = entrada.nextInt();
        
        System.out.println("Para finalizar seu atendimento "+nome+", escolha um dos nossos servicos:");
        System.out.println("1-Tosa\n2-Banho\n3-Banho e Tosa\n4-Veterinario.");
        servico = entrada.nextInt();
        
        // Analisando o serviço com Switch Case
        
        switch (servico){
            case 1:
                System.out.println("Certo "+nome+", voce escolheu nosso servico Tosa, o que eh otimo para um "+raca+" de "+idade+" aninhos!"); 
                break;
            case 2:
                System.out.println("Certo "+nome+", voce escolheu nosso servico Banho, o que eh otimo para um "+raca+" de "+idade+" aninhos!");
                break;
            case 3:
                System.out.println("Certo "+nome+", voce escolheu nosso servico Banho e Tosa, o que eh otimo para um "+raca+" de "+idade+" aninhos!");
                break;
            case 4:
                System.out.println("Certo "+nome+", voce escolheu nosso servico Veterinario, o que eh otimo para um "+raca+" de "+idade+" aninhos!");
                break;
            default:
                System.out.println("A opcao escolhida eh invalida "+nome+". Por favor tente novamente.");
                break;
        }
    }
}
