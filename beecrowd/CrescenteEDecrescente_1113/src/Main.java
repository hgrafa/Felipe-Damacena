import java.util.Scanner;

public class Main {
    public static void avaliaIntervalo(int a, int b) {
        if(a > b)
            System.out.println("Decrescente");
        else
            System.out.println("Crescente");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            if(x == y)
                break;

            avaliaIntervalo(x, y);
        }

    }
}