package model;

public class Paciente {
    private String nome;
    private String telefone;
    private String alergias;

    public Paciente() {
    }

    public Paciente(String nome, String telefone, String alergias) {
        this.nome = nome;
        this.telefone = telefone;
        this.alergias = alergias;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }
}
