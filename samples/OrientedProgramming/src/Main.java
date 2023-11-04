public class Main {

    public static void main(String[] args) {

        // conjunto com 1000 strings
        // sempre indexado em zero
        // "tamanho fixo"
        // homogeneo

        int quantidade = 1000;
        String[] names = new String[quantidade];
        String[] ras = new String[quantidade];
        String[] emails = new String[quantidade];
        int[] ages = new int[quantidade];
        double[] grades = new double[quantidade];

        String auxNome = names[0];
        names[0] = names[4];
        names[4] = auxNome;

        // operador reflexivo
        // i++; // i += 1;  // i = i + 1
        // i *= 2; // i = 2 * i
        // i -= 5; // i = i - 5

//        for (int i = 0; i < 5; i++) {
//            names[i] = "Nome #" + i;
//            System.out.println(names[i]);
//        }


        int a = 2, b = 3; // a = 2, b = 3

        int aux = a; // a = 3, b = 3, aux = 2
        a = b; // a = 3, b = 3, aux = 2
        b = aux; // a = 3, b = 2, aux = 2

        System.out.println("A = " + a + " B = " + b);

    }
}