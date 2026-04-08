package petshop;

public class Servico {
   

    private String nome;
    private double preco;

    public Servico(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }

    public void mostrarServico() {
        System.out.println("=== Serviço ===");
        System.out.println("Descrição: " + nome);
        System.out.println("Preço: R$ " + preco);
    }
}