package model;

public class ContaPessoaFisica extends Conta {

    private String cpf;

    public ContaPessoaFisica() {
    }

    public ContaPessoaFisica(String titular, double saldo, String cpf) {
        super(titular, saldo);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
