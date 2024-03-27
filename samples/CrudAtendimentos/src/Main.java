import entity.Atendimento;

public class Main {
    public static void main(String[] args) {

        Atendimento at1 = new Atendimento(
                1,
                "Joao",
                "Pedro",
                "...",
                true
        );

        Atendimento[] atendimentos = new Atendimento[10];

        atendimentos[0] = new Atendimento();
        atendimentos[1] = new Atendimento();
        atendimentos[2] = new Atendimento();
        atendimentos[3] = new Atendimento();
    }
}