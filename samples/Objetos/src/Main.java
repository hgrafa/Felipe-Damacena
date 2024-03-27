import model.NumeroComplexo;
import model.Pessoa;

public class Main {
    public static void main(String[] args) {

        Pessoa joao = new Pessoa();
        Pessoa maria = new Pessoa();
        NumeroComplexo z = new NumeroComplexo();

        joao.nome = "Joao da Silva";
        maria.nome = "Maria da Silva";
        joao.idade = 10;

        joao.darBoasVindas("Pedro");
        maria.darBoasVindas("Beatriz");
        joao.fazerAniversario();

        System.out.println(joao.idade);

    }
}