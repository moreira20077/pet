package petshop;


public class Funcionario extends Pessoa {
    
    private String cargo;
    private String nomeF;

    public Funcionario(String nomeF, String genero, String cargo) {
        super(nomeF, genero, cargo);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public String getNomeF() {
        return nomeF;
    }

    public void setNomeF(String nomeF) {
        this.nomeF = nomeF;
    }
   

    @Override 
    public void mostrarInformacoes() {
    System.out.println("Nome: " + getNomeF());
    System.out.println("Gênero: " + getGenero());
    System.out.println("Cargo: " + this.cargo);
    }
}