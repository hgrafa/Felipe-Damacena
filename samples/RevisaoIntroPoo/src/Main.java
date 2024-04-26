import model.Pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Joao", "111.222.333-44", 23);
        Pessoa p2 = new Pessoa("Maria", "111.222.333-45");
        Pessoa p3 = new Pessoa();


        System.out.println(p1);
    }
}