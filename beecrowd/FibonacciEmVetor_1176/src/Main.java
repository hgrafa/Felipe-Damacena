import java.util.Scanner;

public class Main {

    public static long fib(int n) {
        // fib(4)
        // 0 1 1 2 3
        // fib[2] = fib[1] + fib[0]
        // fib[i] = fib[i-1] + fib[i-2]

        long[] fib = new long[n+1];

        if(n == 0)
            return 0;

        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }

        return fib[n];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidadeTestes = scanner.nextInt();

        for (int i = 0; i < quantidadeTestes; i++) {
            int n = scanner.nextInt();

            System.out.println("Fib(" + n + ") = " + fib(n));
        }


    }
}