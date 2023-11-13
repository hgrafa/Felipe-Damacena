import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidade = scanner.nextInt();
        double soma = 0;

        for (int i = 0; i < quantidade; i++) {
           int numero = scanner.nextInt();
           soma += numero;
        }

        System.out.println(soma);
    }
}