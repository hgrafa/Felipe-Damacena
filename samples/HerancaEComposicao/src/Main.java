import enums.Especialidade;
import model.Consulta;
import model.Medico;
import model.Paciente;

import java.time.Duration;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Medico m1 = new Medico("Pedro", Duration.ofHours(172), "111.222-33", Especialidade.NEUROLOGIA);
        Paciente p1 = new Paciente("Maria", "99999-8888", "iodo");
        LocalDateTime hoje = LocalDateTime.now();

        Consulta c1 = new Consulta(hoje, "-", m1, p1);

    }
}