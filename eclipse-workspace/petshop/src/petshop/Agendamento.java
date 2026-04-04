package petshop;
import java.time.LocalDateTime;


public class Agendamento {

    private Cliente cliente;
    private Pet pet;
    private Funcionario funcionario;
    private Servico servico;
    private LocalDateTime dataHora;

    public enum StatusAgendamento {
        CONFIRMADO, CONCLUIDO, CANCELADO
    }

    private StatusAgendamento status;

    public Agendamento(Cliente cliente, Pet pet, Funcionario funcionario, Servico servico, LocalDateTime dataHora) {

        this.cliente = cliente;
        this.pet = pet;
        this.funcionario = funcionario;
        this.servico = servico;
        this.dataHora = dataHora;
        this.status = StatusAgendamento.CONFIRMADO;
    }

    public void mostrarInformacoes() {
        System.out.println("\n=== AGENDAMENTO ===");
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Pet: " + pet.getNome());
        System.out.println("Funcionário: " + funcionario.getNome());
        System.out.println("Serviço: " + servico.getNome());
        System.out.println("Data/Hora: " + dataHora);
        System.out.println("Status: " + status);
    }
}