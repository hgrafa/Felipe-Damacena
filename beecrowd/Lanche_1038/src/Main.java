import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int codigo = scanner.nextInt();
        int quantidade = scanner.nextInt();
        double preco;

        if(codigo == 1) preco = 4.0;
        else if(codigo == 2) preco = 4.5;
        else if(codigo == 3) preco = 5.0;
        else if(codigo == 4) preco = 2.0;
        else preco = 1.5;

        System.out.printf("Total: R$ %.2f\n", preco*quantidade);

    }
}