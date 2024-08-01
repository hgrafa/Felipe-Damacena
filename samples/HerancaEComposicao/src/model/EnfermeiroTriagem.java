package model;

import java.time.Duration;

public class EnfermeiroTriagem extends ResponsavelAdministrativo {
    private String cursos;

    public EnfermeiroTriagem() {
    }

    public EnfermeiroTriagem(String nome, Duration cargaHoraria, String cursos) {
        super(nome, cargaHoraria);
        this.cursos = cursos;
    }

    public String getCursos() {
        return cursos;
    }

    public void setCursos(String cursos) {
        this.cursos = cursos;
    }
}
