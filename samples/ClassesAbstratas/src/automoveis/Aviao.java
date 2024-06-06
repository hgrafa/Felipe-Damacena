package automoveis;

public class Aviao extends Veiculo {
    private int capacidadePassageiros;

    public Aviao() {
    }

    public Aviao(String placa, String modelo, int capacidadePassageiros) {
        super(placa, modelo);
        this.capacidadePassageiros = capacidadePassageiros;
    }

    public int getCapacidadePassageiros() {
        return capacidadePassageiros;
    }

    public void setCapacidadePassageiros(int capacidadePassageiros) {
        this.capacidadePassageiros = capacidadePassageiros;
    }

    @Override
    public void ligar() {
        System.out.println("decolar");
    }

    @Override
    public String toString() {
        return "Aviao{" +
                "capacidadePassageiros=" + capacidadePassageiros +
                '}';
    }
}
