package geometria;

public class Circulo extends FormaGeometrica {
    private final static double PI = 3.14159265;
    private double raio;

    public Circulo() {
    }

    public Circulo(Cor cor, double raio) {
        super(cor);
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double area() {
        return PI*raio*raio;
    }

    @Override
    public double perimetro() {
        return 2*PI*raio;
    }
}
