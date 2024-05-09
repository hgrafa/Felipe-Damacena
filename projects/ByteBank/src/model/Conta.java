package model;

public class Conta {

    private static double custoDeOperacao = 3.0;

    private String titular;
    private double saldo;

    public Conta() {
    }

    public Conta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double quantiaBruta) {
        double quantiaLiquida = quantiaBruta - custoDeOperacao;
        saldo += quantiaLiquida;
    }

    public void sacar(double quantiaBruta) {
        double quantiaLiquida = quantiaBruta + custoDeOperacao;

        if(saldo < quantiaLiquida)
            return;

        saldo -= quantiaLiquida;
    }

    @Override
    public String toString() {
        return "Responsavel: " + titular
                + ", Saldo: R$" + String.format("%.2f", saldo);
    }

}
