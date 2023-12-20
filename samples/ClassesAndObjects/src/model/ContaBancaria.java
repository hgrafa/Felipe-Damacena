package model;

public class ContaBancaria {
    public String nome;
    public double saldo;

    public void depositar(double valor) {
        saldo += valor;
    }
}
