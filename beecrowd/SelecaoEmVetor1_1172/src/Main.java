import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] sequencia = new int[10];

        for(int i = 0; i < 10; i++) {
            sequencia[i] = scanner.nextInt();
        }

        for(int i = 0; i < 10; i++) {
            if( sequencia[i] <= 0 ) {
                sequencia[i] = 1;
            }

            System.out.println("X[" + i + "] = " + sequencia[i]);
        }

    }
}