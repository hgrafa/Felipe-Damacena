package model;

public class Circulo {

    public static final double PI = 3.14159265;
    private double raio;
    private String cor;

    public Circulo() {
    }

    public Circulo(double raio, String cor) {
        this.raio = raio;
        this.cor = cor;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double area() {
        return PI * raio * raio;
    }

    public double perimetro() {
        return 2 * PI * raio;
    }
}
