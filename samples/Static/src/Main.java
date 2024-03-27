import model.Circulo;
import model.Conta;

public class Main {
    public static void oi(String nome) {
        System.out.println("Oi, " + nome);
    }

    public static void main(String[] args) {

        Circulo c1 = new Circulo(3.0, "Azul");
        Circulo c2 = new Circulo(10.0, "Rosa");

        double teste = Circulo.PI;


        System.out.println("esperando proximo a 27: " + c1.area());
        System.out.println("esperando proximo a 314: " + c2.area());


        System.out.println("esperando 1060: " + Conta.estimarGanhos(1000));
    }
}
