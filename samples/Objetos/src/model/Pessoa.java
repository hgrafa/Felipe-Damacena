package model;

public class Pessoa {

    // atributos - tem
    public String nome;
    public int idade;
    public double altura;
    public boolean ehHabilitado;

    // metodos - faz
    public void darBoasVindas(String nomeConvidado) {
        System.out.println("Boas Vindas, " + nomeConvidado +", me chamo " + nome);
    }

    public void fazerAniversario() {
        idade++;
    }

    public double somar(double a, double b) {
        return a + b;
    }
}
