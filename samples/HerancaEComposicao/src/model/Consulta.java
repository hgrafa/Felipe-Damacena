package model;

import java.time.LocalDateTime;

public class Consulta {

    private LocalDateTime horario;
    private String observacoes;
    private String nomeHospital;

    private ResponsavelAdministrativo responsavel;
    private Paciente paciente;

    public Consulta(LocalDateTime horario, String observacoes, Medico medico, Paciente paciente) {
        this.horario = horario;
        this.observacoes = observacoes;
        this.medico = medico;
        this.paciente = paciente;
    }

    public LocalDateTime getHorario() {
        return horario;
    }

    public void setHorario(LocalDateTime horario) {
        this.horario = horario;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public String getNomeHospital() {
        return nomeHospital;
    }

    public void setNomeHospital(String nomeHospital) {
        this.nomeHospital = nomeHospital;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
}

// tem um ou tem varios
// consulta tem uma string para observacoes
// consulta tem um Medico
