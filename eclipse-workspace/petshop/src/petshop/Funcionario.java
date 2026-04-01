package petshop;

public class Funcionario extends Pessoa {
    
    private String cargo;

    public Funcionario(String nome, String cpf, String genero, String cargo) {
        super(nome, cpf, genero); 
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override 
    public void mostrarInformacoes() {
    System.out.println("Nome: " + getNome());
    System.out.println("Cpf: " + getCpf());
    System.out.println("Gênero: " + getGenero());
    System.out.println("Cargo: " + this.cargo);
    }
}