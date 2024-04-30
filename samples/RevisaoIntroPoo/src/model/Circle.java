package model;

public class Circle {

    // atributos
    // static = significa compartilhado
    // final = significa que esta em ser valor final
    public static final double PI = 3.14159265;

    private double radius;
    private String cor;

    // construtores
    public Circle() {

    }

    public Circle(double radius, String cor) {
        this.radius = radius;
        this.cor = cor;
    }

    // metodos

    // getter and setters
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }


    // metodos personalizados
    public double area() {
        return PI * radius * radius;
    }

    public double perimiter() {
        return 2 * PI * radius;
    }

    // toString


}
