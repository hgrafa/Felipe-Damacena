package model;

import java.time.Duration;

public class ResponsavelAdministrativo {
    private String nome;
    private Duration cargaHoraria;

    public ResponsavelAdministrativo() {
    }

    public ResponsavelAdministrativo(String nome, Duration cargaHoraria) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Duration getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Duration cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
}
