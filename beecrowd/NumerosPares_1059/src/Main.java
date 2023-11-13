import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int multiplo = scanner.nextInt();

        for(int numero = multiplo; numero <= 100; numero += multiplo) {
            System.out.println(numero);
        }

    }
}