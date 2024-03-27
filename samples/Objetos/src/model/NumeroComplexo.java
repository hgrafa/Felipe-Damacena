package model;

public class NumeroComplexo {
    public double parteReal;
    public double parteImaginaria;

    public double modulo() {
        return Math.sqrt(parteReal*parteReal + parteImaginaria*parteImaginaria);
    }

    public String verNumeroFormatado() {
        return "(" + parteReal + ") + (" + parteImaginaria + ")i";
    }
}
