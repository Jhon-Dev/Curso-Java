package curso.java.classes;

public class Aluno {


		String nome;
		int idade;
		String dataNascimento;
		String registroGeral;
		String numeroCpf;
		String nomeMae;
		String nomePai;
		String dataMatricula;
		String nomeMatricula;
		String nomeEscola;
		String serieMatriculado;
		
		public Aluno() {   /*Cria os dados na memoria*/
						
		}
 
		public Aluno (String nomePadrao) {
			
			nome = nomePadrao;
		}
		
		public Aluno (String nomePadrao, int idadePadrao ) {
			
			nome = nomePadrao;
			idade = idadePadrao;			
		}
		
		/*Veremos os metodos SETTERS e GETTERS do objeto*/
		/*SET é para adicionar ou receber dados para os atributos*/
		/*GET é para resgatar ou obter o valor do atributo*/
		
		
		public void setNome (String nome) {
			
			this.nome = nome;
		}
		
		public String getNome ( ) {
			return nome;
		}

		public int getIdade() {
			return idade;
		}

		public void setIdade(int idade) {
			this.idade = idade;
		}

		public String getDataNascimento() {
			return dataNascimento;
		}

		public void setDataNascimento(String dataNascimento) {
			this.dataNascimento = dataNascimento;
		}

		public String getRegistroGeral() {
			return registroGeral;
		}

		public void setRegistroGeral(String registroGeral) {
			this.registroGeral = registroGeral;
		}

		public String getNumeroCpf() {
			return numeroCpf;
		}

		public void setNumeroCpf(String numeroCpf) {
			this.numeroCpf = numeroCpf;
		}

		public String getNomeMae() {
			return nomeMae;
		}

		public void setNomeMae(String nomeMae) {
			this.nomeMae = nomeMae;
		}

		public String getNomePai() {
			return nomePai;
		}

		public void setNomePai(String nomePai) {
			this.nomePai = nomePai;
		}

		public String getDataMatricula() {
			return dataMatricula;
		}

		public void setDataMatricula(String dataMatricula) {
			this.dataMatricula = dataMatricula;
		}

		public String getNomeMatricula() {
			return nomeMatricula;
		}

		public void setNomeMatricula(String nomeMatricula) {
			this.nomeMatricula = nomeMatricula;
		}

		public String getNomeEscola() {
			return nomeEscola;
		}

		public void setNomeEscola(String nomeEscola) {
			this.nomeEscola = nomeEscola;
		}

		public String getSerieMatriculado() {
			return serieMatriculado;
		}

		public void setSerieMatriculado(String serieMatriculado) {
			this.serieMatriculado = serieMatriculado;
		}
		
		
}
