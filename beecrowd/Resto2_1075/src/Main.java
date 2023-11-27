import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        // 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18

        // resto => o que nao da pra agrupar
        // 0, 1, 2, 3, ..., n-1

        // pulando de n em n vou pegar numeros que dao sempre o mesmo resto

        for (int i = 2; i <= 10000; i += n) {
            System.out.println(i);
        }
    }
}