import automoveis.Aviao;
import automoveis.Carro;
import automoveis.Veiculo;
import especies.CapacidadeDeLocomocao;
import geometria.Circulo;
import geometria.Cor;
import geometria.FormaGeometrica;
import geometria.Retangulo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Veiculo> veiculos = new ArrayList<>();

        veiculos.add(new Carro("123abc", "corolla", true));
        veiculos.add(new Aviao("123bca", "airbus 320", 200));

        veiculos.forEach(veiculo -> veiculo.ligar());

        List<FormaGeometrica> formas = new ArrayList<>();
        List<FormaGeometrica> formas2 = new LinkedList<>();

        formas2.add()

        formas.add(new Circulo(Cor.AMARELO, 3.0));
        formas.add(new Circulo(Cor.VERMELHO, 5.0));
        formas.add(new Retangulo(Cor.ROXO, 3.0, 2.0));
        formas.add(new Retangulo(Cor.VERDE, 4.0, 6.0));


        formas.forEach(forma -> {
            System.out.println(forma.perimetro());
            System.out.println(forma.area());
        });


    }
}