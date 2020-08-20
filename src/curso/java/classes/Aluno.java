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
}
