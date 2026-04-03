package petshop;
import java.util.Scanner;
public class Pet {
    
    private String nome;
    private String especie;
    private String raca;
    private int idade;
    private double peso;
    
    private Pessoa cliente;
    
    public Pet(String nome, String especie, String raca, int idade, double peso, Pessoa cliente){
        this.nome = nome;
        this.especie = especie;
        this.raca = raca;
        this.idade = idade;
        this.peso = peso;
        this.cliente = cliente;
    }
    
    public String getNome(){
        return this.nome;
    }
    public String getEspecie(){
        return this.especie;
    }
    public String geRaca(){
        return this.raca;
    }
    public int getIdade(){
        return this.idade;
    }
    public double getPeso(){
        return this.peso;
    }
    public Pessoa getCliente(){
        return this.cliente;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setEspecie(String especie){
        this.especie = especie;
    }
    public void setRaca(String raca){
        this.raca = raca;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }
    public void setCliente(Pessoa cliente){
        this.cliente = cliente;
    }
    public void MostrarInformacoes(){
        
         System.out.println("\n=== Cadastro ===");
        System.out.println("Nome: " + this.nome);
        System.out.println("Espécie: " + this.especie);
        System.out.println("Raça: " + this.raca);
        System.out.println("Idade: " + this.idade + " anos");
        System.out.println("Peso: " + this.peso + " kg");

        if(cliente != null){
            System.out.println("Cliente: " + cliente.getNome());
        }
    }
           public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        
        System.out.println("=== Cliente ===");
        System.out.println("Nome do cliente: ");
        String nomeCliente = sc.nextLine();
        
        System.out.println("Informe seu cpf: ");
        String cpf = sc.nextLine();
        
        System.out.println("Digite o genero");
        String genero = sc.nextLine();
        
        Pessoa cliente1 = new Cliente(nomeCliente,cpf,genero);
        
        System.out.println("\n=== Pet ===");
        System.out.println("Nome do pet: ");
        String nomePet = sc.nextLine();
        
        System.out.println("Informe a especie: ");
        String especie = sc.nextLine();
        
        System.out.println("Informe a raca: ");
        String raca = sc.nextLine();
        
        System.out.println("Informe a idade: ");
        int idade = sc.nextInt();
        
        System.out.println("Informe o peso: ");
        double peso = sc.nextDouble();

        Pet pet1 = new Pet(nomePet, especie, raca, idade, peso, cliente1);

        pet1.MostrarInformacoes();
        
        sc.close();
   }
    }

        
    


