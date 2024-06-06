package automoveis;

public class Carro extends Veiculo {
    private boolean sedan;

    public Carro() {
    }

    public Carro(String placa, String modelo, boolean sedan) {
        super(placa, modelo);
        this.sedan = sedan;
    }

    public boolean isSedan() {
        return sedan;
    }

    public void setSedan(boolean sedan) {
        this.sedan = sedan;
    }

    @Override
    public void ligar() {
        System.out.println("gira a chave");
    }
}
