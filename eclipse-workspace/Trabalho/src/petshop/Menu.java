package petshop;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in); 
	int opcao;
        ClientePet cadastro = null;
        Servico servico = null;
        Funcionario funcionario = new Funcionario("Alicia","Feminino","Auxiliar de banho e tosa");
			
	do {
		System.out.println("\n=========== PET-SHOP UVA =============\n");
		System.out.print("1 - Cadastro.\n");
		System.out.print("2 - Servicos.\n");
		System.out.print("3 - Agendamento.\n");
		System.out.print("4 - Sair do sistema.\n");
		System.out.print("\nEscolha sua opcao: ");
		opcao = sc.nextInt();
		
		sc.nextLine();
		
		if (opcao == 1) {
                    
                        System.out.println("=========== CADASTRO =============");
                    
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			
			System.out.print("CPF: ");
			String cpf = sc.nextLine();
			
			System.out.print("Genero: ");
			String genero = sc.nextLine();
			
			System.out.print("Nome do pet: ");
			String nomeP = sc.nextLine();
			
			System.out.print("Especie: ");
			String especie = sc.nextLine();
			
			System.out.print("Raca: ");
			String raca = sc.nextLine();
			
			System.out.print("Idade do pet: ");
			int idade = sc.nextInt();
			
			System.out.print("Peso (kg): ");
			double peso = sc.nextDouble();
			
			sc.nextLine();
			
			cadastro = new ClientePet(nome,cpf,genero,nomeP,especie,raca,idade,peso);
			
                        System.out.println("CADASTRO REALIZADO COM SUCESSO!!!!!");
			
		} else if(opcao == 2)  {
                    
                    System.out.println("\n================ SERVICO ================\n");
                    
                    System.out.println("1 - Banho");
                    System.out.println("2 - Tosa");
                    System.out.println("3 - Serviço completo");
                    System.out.println("\nSelecione um servico: ");
                    
                    int escolha = sc.nextInt();
                    sc.nextLine();
                    
                    if(escolha == 1){
                        servico = new Servico("Banho", 50);
                        
                    }else if (escolha == 2){
                        servico = new Servico("Tosa", 70);
                        
                    }else if(escolha == 3){
                        servico = new Servico("Servico completo(Banho + Tosa)", 120);
                    }
                    
                    System.out.println("SERVICO ESCOLHIDO COM SUCESSO!!!!");
                    
		}else if (opcao == 3){
                    
                    if(cadastro == null){
                    System.out.println("\n== CADASTRO NAO REALIZADO ==\n");
                    
                    }else if(servico == null)
                        System.out.println("\n== SERVICO NAO SELECIONADO ==\n");
                    
                } else {
                    LocalDateTime dataHora = LocalDateTime.now();
                    Agendamento ag = new Agendamento(cadastro, funcionario, servico, dataHora);
                    
                    ag.mostrarInformacoes();
                    }
		}while (opcao != 4);
        
                sc.close();
		}
	}
		