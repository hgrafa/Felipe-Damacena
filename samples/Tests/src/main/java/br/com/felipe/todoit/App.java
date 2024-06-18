package br.com.felipe.todoit;

public class App {
    public static double sum(double a, double b) {
        return a + b;
    }

    public static double calcularMediaEntreDuasNotas(double nota1, double nota2) {
        return (nota1 + nota2) / 2.0;
    }

    public static String comprimentar(String welcomeMessage) {
        if(welcomeMessage.equals("Hello")){
            return "Hi";
        }

        return "Hello";
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

}
