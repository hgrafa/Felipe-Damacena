package util;

import model.Pessoa;

public class Menu {

    public static void showOptions() {
        System.out.println("1 - ...");
        System.out.println("2 - ...");
        System.out.println("3 - ...");
        System.out.println("4 - ...");
        System.out.println("0 - to exit");
    }

    public static void showElements(Pessoa[] pessoas) {
        System.out.println("---------");
        for(Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }
        System.out.println("---------");
    }
}
