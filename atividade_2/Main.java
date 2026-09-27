package atividade_2;
import java.util.Scanner;
public class Main {
    public static void main (String[]args) {
        Scanner scanner = new Scanner(System.in);
        double saldo= 500;
        int opcao = 0;
        while( opcao != 4) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Sair");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    System.out.printf("Saldo atual: R$ %.2f%n", saldo);
                    break;
                case 2:
                    System.out.println("Digite o valor a ser depositado:");
                    double deposito = scanner.nextDouble();
                    if (deposito <= 0) {
                        System.out.println("Valor inválido para depósito!");
                        break;
                    }
                    else{
                    saldo += deposito;
                    System.out.printf("Depósito realizado com sucesso! Saldo atual: R$ %.2f%n", saldo);
                    break;
                }
                case 3:
                    System.out.println("Digite o valor a ser sacado:");
                    double saque = scanner.nextDouble();
                    if (saque <= 0 ) {
                        System.out.println("Valor inválido para saque!");
                    } else if (saque > saldo) {
                        System.out.println("Saldo insuficiente!");
                    } else {
                        saldo -= saque;
                        System.out.printf("Saque realizado com sucesso! Saldo atual: R$ %.2f%n", saldo);
                    }
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        scanner.close();
    }
}