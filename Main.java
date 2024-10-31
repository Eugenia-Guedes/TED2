import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Paciente paciente = new Paciente("João", 60, "Hipertensão");
        Medico medico = new Medico("Carlos", 45, "CARDIOLOGISTA");
        Enfermeiro enfermeiro = new Enfermeiro("Ana", 30, "Enfermeira");

        System.out.print("Digite a data da consulta (formato AAAA-MM-DD): ");
        String data = scanner.next();
        LocalDate dataConsulta = LocalDate.parse(data);

        Consulta consulta = new Consulta(paciente, medico, dataConsulta, enfermeiro);
        consulta.exibirConsulta();

        scanner.close();
    }
}
