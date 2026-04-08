package petshop;

public class ClientePet {
    
    private String nomeP;
    private String especie;
    private String raca;
    private int idade;
    private double peso;
    private String nome;
    private String cpf;
    private String generoP;  
    
    public ClientePet(String nome,String cpf,String generoP,String nomeP, String especie, String raca, int idade, double peso){
        this.nome = nome;
        this.cpf = cpf;
        this.generoP = generoP;
    	this.nomeP = nomeP;
        this.especie = especie;
        this.raca = raca;
        this.idade = idade;
        this.peso = peso;
    }    
        
    public String getNome() {
    	return this.nome;
    }
    public String getCpf() {
    	return this.cpf;
    }
    public String getGenero() {
    	return this.generoP; 
    }
    
    public String getNomeP(){
        return this.nomeP;
    }
    public String getEspecie(){
        return this.especie;
    }
    public String getRaca(){
        return this.raca;
    }
    public int getIdade(){
        return this.idade;
    }
    public double getPeso(){
        return this.peso;
    }
    public void setNomeP(String nomeP){
        this.nomeP = nomeP;
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
    public void setNome(String nome) {
    	this.nome = nome;
    }
    public void setCpf(String cpf) {
    	this.cpf = cpf;
    }
    public void setGenero(String generoP) {
    	this.generoP = generoP;
    }
    public void MostrarInformacoes(){
        
        System.out.println("\n=== Cadastro ===");
        System.out.println("Cliente: " + this.nome); 
        System.out.println("CPF: " + this.cpf);
        System.out.println("Gênero do pet: " + this.generoP);
        System.out.println("Nome: " + this.nomeP);
        System.out.println("Espécie: " + this.especie);
        System.out.println("Raça: " + this.raca);
        System.out.println("Idade: " + this.idade + " anos");
        System.out.println("Peso: " + this.peso + " kg");
    }
        
}