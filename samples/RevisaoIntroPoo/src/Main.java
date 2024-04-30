import model.Circle;
import model.Pessoa;
import model.Projeto;
import util.CircleUtils;
import util.Menu;

public class Main {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Joao", "111.222.333-44", 23);
        Pessoa p2 = new Pessoa("Maria", "111.222.333-45");
        Pessoa p3 = new Pessoa();
        Pessoa[] pessoas = {p1, p2, p3};

        Circle c1 = new Circle(3.0, "azul");
        System.out.println(c1.area());

        double raioDoTerreno = 3.0;
        double areaDoTerreno = CircleUtils.calculateArea(3.0);
        Projeto torreCircular = new Projeto(areaDoTerreno, 5.0);
        System.out.println(torreCircular.getCustoTotal());

        Menu.showOptions();
        Menu.showElements(pessoas);
    }
}
