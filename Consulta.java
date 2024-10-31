import java.time.LocalDate;

public class Consulta {
    private Paciente paciente;
    private Medico medico;
    private LocalDate dataConsulta;
    private Enfermeiro enfermeiro;

    public Consulta(Paciente paciente, Medico medico, LocalDate dataConsulta, Enfermeiro enfermeiro) {
        this.paciente = paciente;
        this.medico = medico;
        this.dataConsulta = dataConsulta;
        this.enfermeiro = enfermeiro;
    }

    public void exibirConsulta() {
        System.out.println("Consulta: " + dataConsulta);
        System.out.println("Médico: " + medico);
        System.out.println("Paciente: " + paciente);
        System.out.println("Atendimento de enfermaria");
        System.out.println(enfermeiro);
        System.out.println("Paciente: " + paciente);
    }
}

