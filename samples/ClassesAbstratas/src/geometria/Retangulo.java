package geometria;

public class Retangulo extends FormaGeometrica {

    private double altura;
    private double comprimento;

    public Retangulo() {
    }

    public Retangulo(Cor cor, double altura, double comprimento) {
        super(cor);
        this.altura = altura;
        this.comprimento = comprimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    @Override
    public double area() {
        return altura*comprimento;
    }

    @Override
    public double perimetro() {
        return 2*altura + 2*comprimento;
    }
}
