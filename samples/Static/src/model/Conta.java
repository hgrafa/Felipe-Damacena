package model;

public class Conta {

    private static double PORCENTAGEM_RENDIMENTO = 0.06;

    public static double estimarGanhos(double valorInvestido) {
        return (1 + PORCENTAGEM_RENDIMENTO) * valorInvestido;
    }
}
