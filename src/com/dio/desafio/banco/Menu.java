package com.dio.desafio.banco;

import javax.swing.*;
import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);

    Cliente cliente = new Cliente();
    Conta contaCorrente = new ContaCorrente(cliente);
    Conta contaPoupanca = new ContaPoupanca(cliente);

    public void menu() {
        double valor;
        String titular;

        System.out.println("-------------------------------------------------------");
        System.out.println("---------Selecione a opção que deseja realizar---------");
        System.out.println("-------------------------------------------------------");
        System.out.println("      |     Opção 1 - Depositar     |");
        System.out.println("      |     Opção 2 - Sacar         |");
        System.out.println("      |     Opção 3 - Transferir    |");
        System.out.println("      |     Opção 4 - Listar        |");
        System.out.println("      |     Opção 0 - Sair          |");
        System.out.println("      |    Qual opção desejada?     |");
        int opcao = sc.nextInt();

        do {
            switch (opcao) {
                case 1 -> {
                    System.out.println("Digite o nome do títular da conta: ");
                    cliente.setNome(titular = sc.next().toUpperCase());
                    sc.nextLine();
                    System.out.print("Quanto Você deseja depositar? ");
                    System.out.print("R$ ");
                    valor = sc.nextDouble();
                    contaCorrente.depositar(valor);
                    menu();
                }
                case 2 -> {
                    System.out.println("Valor para saque: ");
                    System.out.println("R$ ");
                    valor = sc.nextDouble();
                    contaCorrente.sacar(valor);
                    menu();
                }
                case 3 -> {
                    System.out.print("Qual valor deseja trasnferir para Conta Poupança? ");
                    System.out.print("R$ ");
                    valor = sc.nextDouble();
                    contaCorrente.transferir(valor, contaPoupanca);
                    menu();
                }
                case 4 -> {
                    contaCorrente.imprimirExtrato();
                    contaPoupanca.imprimirExtrato();
                    menu();
                }
                case 0 -> System.out.println("Obrigada e até mais !");
                default -> System.out.println("Opção Inválida! ");
            }
        } while (opcao != 0);
    }
}
