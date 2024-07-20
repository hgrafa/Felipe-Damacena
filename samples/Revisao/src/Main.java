import model.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
requisitos funcionais
 - ter um menu
 - criar livro
 - ler livros
 - buscar titulo
 - deletar livro
requisitos nao funcionais
 - ser rapida
regras de negocio
 - nao aceitar livro com mesmo titulo do mesmo autor
*/

public class Main {
    public static Book insertBook(Scanner scanner) {
        System.out.print("Titulo do Livro: ");
        String title = scanner.nextLine();

        System.out.print("Autor do Livro: ");
        String author = scanner.nextLine();

        System.out.print("Num. de paginas: ");
        int numberOfPages = scanner.nextInt();
        scanner.nextLine();

        return new Book(title, author, numberOfPages);
    }

    public static void showMenu() {
        System.out.println("1 - para criar um novo livro");
        System.out.println("2 - para exibir todos os livros");
        System.out.println("3 - para buscar livros por titulo");
        System.out.println("4 - para deletar um livro");
        System.out.println("0 - para sair");
        System.out.print("Digite sua opcao: ");
    }

    public static void main(String[] args) {
        // crud = create read update delete
        Scanner scanner = new Scanner(System.in);
        List<Book> books = new ArrayList<>();

        showMenu();
        int option = scanner.nextInt();
        scanner.nextLine();

        while (option != 0) {
            switch (option) {
                case 1 -> {
                    Book bookToAdd = insertBook(scanner);
                    books.add(bookToAdd);
                }
                case 2 -> {
                    for (int i = 0; i < books.size(); i++) {
                        System.out.println(books.get(i));
                    }
                }
            }

            showMenu();
            option = scanner.nextInt();
            scanner.nextLine();
        }



    }
}

// classe -> molde / tipo
// objeto -> fruto do molde / variavel