package petshop;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in); 
	int opcao;
        ClientePet cadastro = null;
        Servico servico = null;
        Funcionario funcionario = new Funcionario("Alícia","feminino", "Auxiliar de banho e tosa");
			
	do {
		System.out.println("\n=========== PET-SHOP UVA =============\n");
		System.out.print("1 - Cadastro.\n");
		System.out.print("2 - Serviços.\n");
		System.out.print("3 - Agendamento.\n");
		System.out.print("4 - Sair.\n");
		System.out.print("\nEscolha sua opção: ");
		opcao = sc.nextInt();
		
		sc.nextLine();
		
		if (opcao == 1) {
                    
                        System.out.println("\n=========== CADASTRO =============\n");
                    
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			
			System.out.print("CPF: ");
			String cpf = sc.nextLine();
			
			System.out.print("Gênero do pet: ");
			String generoP = sc.nextLine();
			
			System.out.print("Nome do pet: ");
			String nomeP = sc.nextLine();
			
			System.out.print("Espécie: ");
			String especie = sc.nextLine();
			
			System.out.print("Raça: ");
			String raca = sc.nextLine();
			
			System.out.print("Idade do pet: ");
			int idade = sc.nextInt();
			
			System.out.print("Peso (kg): ");
			double peso = sc.nextDouble();
			
			sc.nextLine();
			
			cadastro = new ClientePet(nome,cpf,generoP,nomeP,especie,raca,idade,peso);
			
                        System.out.println("\n CADASTRO REALIZADO COM SUCESSO!!!!! \n");
			
		} else if(opcao == 2)  {
                    
                    System.out.println("\n================ SERVIÇO ================\n");
                    
                    System.out.println("1 - Banho - R$50,00");
                    System.out.println("2 - Tosa - R$70,00");
                    System.out.println("3 - Serviço completo - R$120,00");
                    System.out.println("\nSelecione um serviço: ");
                    
                    int escolha = sc.nextInt();
                    sc.nextLine();
                    
                    if(escolha == 1){
                        servico = new Servico("Banho", 50);
                        
                    }else if (escolha == 2){
                        servico = new Servico("Tosa", 70);
                        
                    }else if(escolha == 3){
                        servico = new Servico("Serviço completo(Banho + Tosa)", 120);
                    }
                    if(servico != null){
                        servico.mostrarServico();
                         System.out.println("\n SERVIÇO CONCLUIDO COM SUCESSO!!!!! \n");
                    }
                    
		}else if (opcao == 3){
                    
                    if(cadastro == null){
                    System.out.println("\n== CADASTRO NÃO REALIZADO ==\n");
                    
                    }else if(servico == null){
                        System.out.println("\n== SERVIÇO NÃO SELECIONADO ==\n");
                    
                } else {
                    LocalDateTime dataHora = LocalDateTime.now();
                    Agendamento ag = new Agendamento(cadastro, funcionario, servico, dataHora);
                    
                    System.out.println("\n AGENDAMENTO CONCLUIDO COM SUCESSO!!!!! \n"); 
                    ag.mostrarInformacoes();
                    }
                }
		}while (opcao != 4);

			System.out.println("\nSISTEMA ENCERRADO");
        
                sc.close();

		}
	}
		