import java.util.Scanner;

public class Main {

    public static int somaIntervalo(int inicio, int fim) {
        // a -> b : b - a + 1
        int quantidade = (fim - inicio + 1);

        return (quantidade * (inicio + fim)) / 2;
    }

    public static int proximoMultiploDeTreze(int numero) {
        int resto = numero % 13; // 9
        // ternary => ( condicao ) ? retornoTrue : retornoFalse
        int correcao = (resto == 0) ? 0 : (13 - resto); // 4

        return numero + correcao;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inicio = scanner.nextInt(); // 5
        int fim = scanner.nextInt(); // 7

        // trocando duas variaveis
        if( inicio > fim ) {
            int aux = inicio; // aux = 5
            inicio = fim; // i = 7, f = 7, aux = 5
            fim = aux; // i = 7, f = 5, aux = 5
        }

        int somaTotal = somaIntervalo(inicio, fim);
        inicio = proximoMultiploDeTreze(inicio);
        int somaDosMultiplosDeTreze = 0;

        for(int i = inicio; i <= fim; i+=13) {
            somaDosMultiplosDeTreze += i;
        }

        // quero = tudo = naoQuero
        System.out.println(somaTotal - somaDosMultiplosDeTreze);
    }
}

// 100, 200
// 100 % 13 => sobram 9 ou faltam 4
// 104 - 13 * 8
// 20 - 6 = 14 - 6 = 8 - 6 = 2
// 6