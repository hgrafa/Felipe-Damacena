import model.Conta;
import model.ContaPessoaFisica;
import model.ContaPessoaJuridica;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Conta conta = new Conta("Joao", 500);

        for (int opcao = 0; opcao != 4;) {
            System.out.println("\nMENU:");
            System.out.println("1 - Verificar saldo");
            System.out.println("2 - Sacar");
            System.out.println("3 - Depositar");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.println("Saldo atual: R$" + conta.getSaldo());
            } else if (opcao == 2) {
                System.out.print("Digite o valor a sacar: ");
                double valorSaque = scanner.nextDouble();
                conta.sacar(valorSaque);
                System.out.println("Saque realizado com sucesso.");
            } else if (opcao == 3) {
                System.out.print("Digite o valor a depositar: ");
                double valorDeposito = scanner.nextDouble();
            } else if (opcao == 4) {
                System.out.println("Saindo...");
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}
