package curso.java.classes;

public class Aluno {


		private String nome;
		private int idade;
		private String dataNascimento;
		private String registroGeral;
		private String numeroCpf;
		private String nomeMae;
		private String nomePai;
		private String dataMatricula;
		private String nomeMatricula;
		private String nomeEscola;
		private String serieMatriculado;
		private double nota1;
		private String disciplina1;
		private double nota2;
		private String disciplina2;
		private double nota3;
		private String disciplina3;
		private double nota4;
		private String disciplina4;
	
		
		
		
		public String getDisciplina1() {
			return disciplina1;
		}

		public void setDisciplina1(String disciplina1) {
			this.disciplina1 = disciplina1;
		}

		public String getDisciplina2() {
			return disciplina2;
		}

		public void setDisciplina2(String disciplina2) {
			this.disciplina2 = disciplina2;
		}

		public String getDisciplina3() {
			return disciplina3;
		}

		public void setDisciplina3(String disciplina3) {
			this.disciplina3 = disciplina3;
		}

		public String getDisciplina4() {
			return disciplina4;
		}

		public void setDisciplina4(String disciplina4) {
			this.disciplina4 = disciplina4;
		}

		public double getNota1() {
			return nota1;
		}

		public void setNota1(double nota1) {
			this.nota1 = nota1;
		}

		public double getNota2() {
			return nota2;
		}

		public void setNota2(double nota2) {
			this.nota2 = nota2;
		}

		public double getNota3() {
			return nota3;
		}

		public void setNota3(double nota3) {
			this.nota3 = nota3;
		}

		public double getNota4() {
			return nota4;
		}

		public void setNota4(double nota4) {
			this.nota4 = nota4;
		}
	
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

		/*Metodo que retorna a média do aluno*/
		public double getMediaNota () {
			return (nota1 + nota2 + nota3 + nota4) / 4;
		}
		
		/*Método que retorna true ou false*/
		public boolean getAlunoAprovado () {
		 double media = this.getMediaNota();
		 if (media >= 70) {
			 return true;
		 } else {
			return false;
		 }
	}
		/*Método que retorna uma String ALuno está Aprovado ou Reprovado*/
		public String getAlunoAprovado2 () {
			 double media = this.getMediaNota();
			 if (media >= 70) {
				 return "Aluno está aprovado";
			 } else {
				return "Aluno está Reprovado";
			 }
			}

	

		@Override
		public String toString() {
			return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento
					+ ", registroGeral=" + registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae
					+ ", nomePai=" + nomePai + ", dataMatricula=" + dataMatricula + ", nomeMatricula=" + nomeMatricula
					+ ", nomeEscola=" + nomeEscola + ", serieMatriculado=" + serieMatriculado + ", nota1=" + nota1
					+ ", disciplina1=" + disciplina1 + ", nota2=" + nota2 + ", disciplina2=" + disciplina2 + ", nota3="
					+ nota3 + ", disciplina3=" + disciplina3 + ", nota4=" + nota4 + ", disciplina4=" + disciplina4
					+ "]";
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((nome == null) ? 0 : nome.hashCode());
			result = prime * result + ((numeroCpf == null) ? 0 : numeroCpf.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Aluno other = (Aluno) obj;
			if (nome == null) {
				if (other.nome != null)
					return false;
			} else if (!nome.equals(other.nome))
				return false;
			if (numeroCpf == null) {
				if (other.numeroCpf != null)
					return false;
			} else if (!numeroCpf.equals(other.numeroCpf))
				return false;
			return true;
		}


		
		
		
		
		
}
