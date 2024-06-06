package geometria;

public abstract class FormaGeometrica implements Mensuravel {
    private Cor cor;

    public FormaGeometrica() {
    }

    public FormaGeometrica(Cor cor) {
        this.cor = cor;
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }
}
