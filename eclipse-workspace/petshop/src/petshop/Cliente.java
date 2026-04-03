package petshop;

public class Cliente extends Pessoa{
    
    public Cliente(String nome, String cpf, String genero){
        super(nome,cpf,genero);
    }
    @Override
    public void mostrarInformacoes(){
        System.out.println("Nome: " + getNome());
    }
    
}
