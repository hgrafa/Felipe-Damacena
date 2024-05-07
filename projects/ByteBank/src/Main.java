import model.Conta;

public class Main {
    public static void testEquals(String scenario, double expected, double given) {
        boolean hasPassed = expected == given;
        String testMessage = (hasPassed) ? "PASSED" : "FAILED";

        if(hasPassed) {
            System.out.println("--------------------------------");
            System.out.println("STATUS: " + testMessage + " | " + scenario);
            System.out.println("--------------------------------");
        } else {
            System.err.println("--------------------------------");
            System.err.println("STATUS: " + testMessage + " | " + scenario);
            System.err.println("--------------------------------");
        }

    }

    public static void main(String[] args) {
        Conta acc1 = new Conta("Joao Pedro", 200);

        acc1.depositar(200);
        testEquals(
            "SHOULD fazer um deposito AND aumentar o saldo em 200",
             acc1.getSaldo(),
            390
        );

        acc1.sacar(150);
        testEquals(
            "SHOULD fazer um saque AND diminir o saldo em 150",
            acc1.getSaldo(),
            244
        );


    }
}