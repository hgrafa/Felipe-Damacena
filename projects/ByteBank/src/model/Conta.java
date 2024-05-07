package model;

public class Conta {

    private static double custoDeOperacao = 3.0;

    private String responsavel;
    private double saldo;

    public Conta() {
    }

    public Conta(String responsavel, double saldo) {
        this.responsavel = responsavel;
        this.saldo = saldo;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
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
        return "Responsavel: " + responsavel
                + ", Saldo: R$" + String.format("%.2f", saldo);
    }

}
