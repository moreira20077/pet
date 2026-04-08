package petshop;

public class Funcionario extends Pessoa {
    
    private String nomeF;
    private String cargo;
    private String genero;

    public Funcionario(String nomeF, String genero, String cargo) {
        super(nomeF, genero, cargo); 
        this.nomeF = nomeF;

        this.cargo = cargo;
    }
     public String getNomeF() {
        return nomeF;
    }

    public void setNomeF(String nomeF) {
        this.nomeF = nomeF;
    }
    
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override 
    public void mostrarInformacoes() {
    System.out.println("Nome: " + this.nomeF);
    System.out.println("Cargo: " + this.cargo);
    }
}