import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] array = new int[n];

        // 2 3 1 4 5
        int posMenor = 0;

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();

            // se meu array na pos atual for menor que pos do menor => absurdo => troco
            if(array[i] < array[posMenor]) {
                posMenor = i;
            }
        }

        System.out.println(posMenor);
        System.out.println(array[posMenor]);

    }
}