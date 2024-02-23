package model;

public class Car {
    // atributos - tem
    public String cor = null;
    public String modelo;
    public String chassi;
    public int velocidade = 0;
    public double gasolina = 0.0;
    public boolean motorLigado = false;
    public boolean painelLigado = false;

    // metodos - comportamentos - funcoes
    public void ligar() {
        motorLigado = true;
        painelLigado = true;
    }

    public void desligar() {
        motorLigado = false;
        painelLigado = false;
        velocidade = 0;
    }

    public void acelerar(int quantia) {
        if(!motorLigado && !painelLigado)
            return;

        if(gasolina == 0.0)
            return;

        velocidade += quantia;
    }
}
