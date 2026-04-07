package petshop;
import java.time.LocalDateTime;


public class Agendamento {

    private ClientePet cadastro;
    private Funcionario funcionario;
    private Servico servico;
    private LocalDateTime dataHora;

    public enum StatusAgendamento {
        CONFIRMADO, CONCLUIDO, CANCELADO
    }

    private StatusAgendamento status;

    public Agendamento(ClientePet cadastro, Funcionario funcionario, Servico servico, LocalDateTime dataHora) {

        this.cadastro = cadastro;
        this.funcionario = funcionario;
        this.servico = servico;
        this.dataHora = dataHora;
        this.status = StatusAgendamento.CONFIRMADO;
    }

    public void mostrarInformacoes() {
        System.out.println("\n=== AGENDAMENTO ===");
        System.out.println("Cliente: " + cadastro.getNome());
        System.out.println("Pet: " + cadastro.getNomeP());
        System.out.println("Funcionário: " + funcionario.getNomeF());
        System.out.println("Serviço: " + servico.getNome());
        System.out.println("Preço: " + servico.getPreco());
        System.out.println("Data/Hora: " + dataHora);
        System.out.println("Status: " + status);
    }
}