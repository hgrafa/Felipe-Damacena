package model;

public class Projeto {

    private double area;
    private double precoPorMetroQuadrado;

    public Projeto(double area, double precoPorMetroQuadrado) {
        this.area = area;
        this.precoPorMetroQuadrado = precoPorMetroQuadrado;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPrecoPorMetroQuadrado() {
        return precoPorMetroQuadrado;
    }

    public void setPrecoPorMetroQuadrado(double precoPorMetroQuadrado) {
        this.precoPorMetroQuadrado = precoPorMetroQuadrado;
    }

    public double getCustoTotal() {
        return area * precoPorMetroQuadrado;
    }
}
