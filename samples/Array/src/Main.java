import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        // array de 7 elementos
//        int[] conjunto = {10, 23, 34, 45, 51, 67, 72};
//
//        // indexado em zero
//        // vetor de tamanho n vai de zero ate n-1
//        System.out.println(conjunto[0]); // 10
//        System.out.println(conjunto[4]); // 51
//
//        System.out.println("imprimindo todos os valores:" );
//
//        // imprimindo todos os valores
//        for (int i = 0; i < conjunto.length; i++) {
//            System.out.print(conjunto[i] + " ");
//        }
//
//        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tamanho do array: ");
        int tamanho = scanner.nextInt();

        String[] nomes = new String[tamanho];

        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = scanner.next();
        }

        System.out.println("exibindo nomes digitados");

        for (int i = 0; i < nomes.length; i++) {
            System.out.println( "#" + (i+1) + " - " + nomes[i]);
        }
    }
}