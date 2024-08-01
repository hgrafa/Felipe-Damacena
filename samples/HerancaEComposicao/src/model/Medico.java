package model;

import enums.Especialidade;

import java.time.Duration;

public class Medico extends ResponsavelAdministrativo {
    private String crm;
    private Especialidade especialidade;

    public Medico() {
    }

    public Medico(String nome, Duration cargaHoraria, String crm, Especialidade especialidade) {
        super(nome, cargaHoraria);
        this.crm = crm;
        this.especialidade = especialidade;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public Especialidade getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }
}
