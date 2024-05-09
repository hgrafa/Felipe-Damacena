package model;

public class ContaPessoaJuridica extends Conta{

    private String nomeEmpresaConta;
    private String cnpj;

    public ContaPessoaJuridica() {
    }

    public ContaPessoaJuridica(String titular, double saldo, String nomeEmpresaConta, String cnpj) {
        super(titular, saldo);
        this.nomeEmpresaConta = nomeEmpresaConta;
        this.cnpj = cnpj;
    }

    public String getNomeEmpresaConta() {
        return nomeEmpresaConta;
    }

    public void setNomeEmpresaConta(String nomeEmpresaConta) {
        this.nomeEmpresaConta = nomeEmpresaConta;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
