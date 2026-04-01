package petshop;
		public abstract class Pessoa {
			private String nome;
			private String cpf;
			private String genero;

 
		public Pessoa(String nome, String cpf, String genero) {
			this.nome = nome;      
			this.cpf = cpf;         
			this.genero = genero;  
		
		
		}


		public String getNome() {
			return this.nome;     
		
		
		}

		
		public void setNome(String nome) {
			this.nome = nome;      
		
		}

		
		public String getCpf() {
			return this.cpf;      
		
		}

		
		public void setCpf(String cpf) {
			this.cpf = cpf;         
		
		}

		
		public String getGenero() {
			return this.genero;     
		
		}

		
		public void setGenero(String genero) {
			this.genero = genero;   
		
		}

 
		public abstract void mostrarInformacoes();
}


