import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        if (a == 0) {
            System.out.println("Impossivel calcular");
            return;
        }

        double delta = b*b - 4*a*c;

        if(delta < 0) {
            System.out.println("Impossivel calcular");
            return;
        }

        double deltaSqrt = Math.sqrt(delta);
        double x1 = (-b + deltaSqrt) / (2 * a);
        double x2 = (-b - deltaSqrt) / (2 * a);

        System.out.printf("R1 = %.5f\n", x1);
        System.out.printf("R2 = %.5f\n", x2);
    }
}