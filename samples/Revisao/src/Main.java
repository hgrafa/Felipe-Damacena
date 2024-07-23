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

    public static void createBook(Scanner scanner, List<Book> books) {
        System.out.print("Titulo do Livro: ");
        String title = scanner.nextLine();

        System.out.print("Autor do Livro: ");
        String author = scanner.nextLine();

        System.out.print("Num. de paginas: ");
        int numberOfPages = scanner.nextInt();
        scanner.nextLine();

        Book bookToAdd = new Book(title, author, numberOfPages);
        books.add(bookToAdd);
    }

    public static void readBooks(List<Book> books) {
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i));
        }
    }

    public static void searchBooksByTitle(Scanner scanner, List<Book> books) {
        System.out.print("Digite o titulo que deseja buscar: ");
        String query = scanner.nextLine();

        boolean anyBookFounded = false;

        for (int i = 0; i < books.size(); i++) {
            Book bookSelected = books.get(i);
            if(bookSelected.getTitle().contains(query)) {
                anyBookFounded = true;
                System.out.println(bookSelected);
            }
        }

        if(!anyBookFounded) {
            System.out.println("nenhum livro encontrado.");
        }

    }

    public static void deleteWithSearchByTitle(Scanner scanner, List<Book> books) {
        System.out.print("Digite o titulo que deseja remover: ");
        String query = scanner.nextLine();

        List<Book> booksFounded = new ArrayList<>();

        for (int i = 0; i < books.size(); i++) {
            Book bookSelected = books.get(i);
            if(bookSelected.getTitle().contains(query)) {
                booksFounded.add(bookSelected);
            }
        }

        if(booksFounded.isEmpty()) {
            System.out.println("nenhum livro encontrado.");
            return;
        }

        for (int i = 0; i < booksFounded.size(); i++) {
            System.out.println("#" + i + " - " + booksFounded.get(i));
        }

        System.out.print("Qual id do livro que deseja deletar? ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Book bookToDelete = booksFounded.get(id);
        books.remove(bookToDelete);
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

        // while -> verifica - faz - verifica - faz - ...
        // do...while -> faz - verifica - faz - verifica - ...

        int option;

        do {
            showMenu();
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1 -> createBook(scanner, books);
                case 2 -> readBooks(books);
                case 3 -> searchBooksByTitle(scanner, books);
                case 4 -> deleteWithSearchByTitle(scanner, books);
                case 0 -> System.out.println("Obrigado por utilizar!");
                default -> System.out.println("Digite uma opcao valida");
            }

        } while(option != 0);


    }
}

// classe -> molde / tipo
// objeto -> fruto do molde / variavel