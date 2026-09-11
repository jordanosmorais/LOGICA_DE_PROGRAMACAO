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

public class DESAFIO_SWITCH_CASE {
    public static void main(String[] args) {
        
        String nome, nomeProduto;
        int numeroProduto, quantidade;
        double preco = 0.0, valorTotal = 0.0;
        
        Scanner entrada = new Scanner(System.in);
        
        // Apresentação do Menu
        
        System.out.println("=== MENU DA LANCHONETE ===");
        System.out.println("1 - Hamburguer (R$ 15,00");
        System.out.println("2 - Pizza (R$ 25,00)");
        System.out.println("3 - Cachorro-Quente (R$ 12,00)");
        System.out.println("4 - Refrigerante (R$ 6,00)");
        System.out.println("5 - Suco (R$ 8,00)");
        System.out.println("==========================");
        
        // Solicitação dos dados ao usuário
        
        System.out.println("Para iniciar o atendimento, por favor nos informe seu nome:");
        nome = entrada.nextLine();
        
        System.out.println("\nBem-vinda(o) " + nome + "! Digite o numero do produto desejado (1 a 5):");
        numeroProduto = entrada.nextInt();
        
        System.out.println("Digite a quantidade desejada:");
        quantidade = entrada.nextInt();
      
        // Identificação do produto e preço usando switch
        
       switch (numeroProduto) {
            case 1:
                nomeProduto = "Hamburguer";
                preco = 15.00;
                break;
            case 2:
                nomeProduto = "Pizza";
                preco = 25.00;
                break;
            case 3: // Corrigido: era 23
                nomeProduto = "Cachorro-Quente";
                preco = 12.00;
                break;
            case 4:
                nomeProduto = "Refrigerante";
                preco = 6.00;
                break;    
            case 5:
                nomeProduto = "Suco";
                preco = 8.00;
                break;    
            default:
                System.out.println("\nA opcao escolhida eh invalida, sinto muito.");
                entrada.close();
                return; // Encerra o programa sem calcular valor inválido
        }
        // Cálculo do valor total
        valorTotal = preco * quantidade;
        
        // Exibição do resumo final do pedido
        System.out.println("\n=== RESUMO DO PEDIDO ===");
        System.out.println("Cliente: " + nome);
        System.out.println("Produto: " + nomeProduto);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor Total: R$ " + valorTotal);
        System.out.println("========================");
        
        entrada.close();
    }
}
    
    

