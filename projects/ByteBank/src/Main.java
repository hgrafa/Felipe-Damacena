import model.Conta;
import model.ContaPessoaFisica;
import model.ContaPessoaJuridica;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void testEquals(String scenario, double expected, double given) {
        boolean hasPassed = expected == given;
        String testMessage = (hasPassed) ? "PASSED" : "FAILED";

        if(hasPassed) {
            System.out.println("--------------------------------");
            System.out.println("STATUS: " + testMessage + " | " + scenario);
            System.out.println("--------------------------------");
        } else {
            System.err.println("--------------------------------");
            System.err.println("STATUS: " + testMessage + " | " + scenario);
            System.err.println("--------------------------------");
        }

    }

    public static void imprimeConta(Conta conta) {
        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Saldo: R$" + conta.getSaldo());
    }

    public static void main(String[] args) {
        Conta acc1 = new Conta("Joao Pedro", 200);

        acc1.depositar(200);
        testEquals(
            "SHOULD fazer um deposito AND aumentar o saldo em 200",
             acc1.getSaldo(),
            390
        );

        acc1.sacar(150);
        testEquals(
            "SHOULD fazer um saque AND diminir o saldo em 150",
            acc1.getSaldo(),
            244
        );

        List<Conta> contas = new ArrayList<>();

        String titular = "Alice";
        ContaPessoaFisica pf1 = new ContaPessoaFisica(titular, 300, "111.222.333-44");
        ContaPessoaJuridica pj1 = new ContaPessoaJuridica(titular, 500, "Acme Inc.", "333.222.11-44");

        int a = 1;
        int b = 2;
        double result = (double)a / b;

        // upcasting - vai do especifico para o abrangente
        // menciona a classe filha como sua classe mae
        Conta acc2 = new ContaPessoaFisica("Pedro", 500, "555.666.777-00");

        // downcasting - NAO EH SEGURO - vai do abrangente para o especifico
        // menciona a classe mae como sua classe filha
        // instanceof ajudda a checar se eh do tipo

        if (acc2 instanceof ContaPessoaFisica pf2) {
            System.out.println("cpf por downcasting: " + pf2.getCpf());
        }

        // Conta conta = pf1
        imprimeConta(pf1);

        // Conta conta = pj1
        imprimeConta(pj1);

        contas.add(pf1);
        contas.add(pj1);

    }
}