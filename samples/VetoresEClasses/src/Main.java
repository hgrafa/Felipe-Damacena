import model.User;

import java.util.Scanner;

public class Main {

    public static void exibeUser(User user) {
        System.out.println("Name: " + user.name);
        System.out.println("Email: " + user.email);
        System.out.println("Password: " + user.password);
    }

    public static void apresentarMenu() {
        System.out.println("1 - para listar os usuarios");
        System.out.println("2 - para cadastrar um usuario");
        System.out.println("0 - para sair");
        System.out.print("Digite sua opcao: ");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        User[] users = new User[1000];
        int posLivre = 0;

        apresentarMenu();
        int option = scanner.nextInt();
        scanner.nextLine(); // TODO explicar depois

        while (option != 0) {
            if (option == 1) {
                for(int i = 0; i < posLivre; i++) {
                    exibeUser(users[i]);
                }
            } else if (option == 2) {
                System.out.print("Digite o nome: ");
                String name = scanner.nextLine();
                System.out.print("Digite o email: ");
                String email = scanner.nextLine();
                System.out.print("Digite a password: ");
                String password = scanner.nextLine();

                users[posLivre] = new User();
                users[posLivre].name = name;
                users[posLivre].email = email;
                users[posLivre].password = password;
                posLivre++;
            } else {
                System.out.println("digite uma opcao valida!");
            }

            apresentarMenu();
            option = scanner.nextInt();
        }
    }
}