package curso.java.executavel;

import javax.swing.JOptionPane;

import curso.java.classes.Aluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {

  
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
		String idade = JOptionPane.showInputDialog("Qual a idade?");
		String dataNascumento = JOptionPane.showInputDialog("Qual a data de nascimento?");
		String registroGeral = JOptionPane.showInputDialog("Registro Geral?");
		String cpf = JOptionPane.showInputDialog("Qual � o cpf?");
		String NomeMae = JOptionPane.showInputDialog("Qual � o nome da m�e?");
		String NomePai = JOptionPane.showInputDialog("Qual � o nome do Pai?");
		String DataMatricula = JOptionPane.showInputDialog("Qual � a matricula?");
		String NomeMatricula = JOptionPane.showInputDialog("Qual � o nome da Matricula?");
		String SerieMatriculado = JOptionPane.showInputDialog("Qual a serie matriculada?");
		String NomeEscola = JOptionPane.showInputDialog("Qual � o nome da escola?");
		String Nota1 = JOptionPane.showInputDialog("Qual � a nota 1?");
		String Nota2 = JOptionPane.showInputDialog("Qual � a nota 2?");
		String Nota3 = JOptionPane.showInputDialog("Qual � a nota 3?");
		String Nota4 = JOptionPane.showInputDialog("Qual � a nota 4?");

		Aluno aluno1 = new Aluno();	
		
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascumento);
		aluno1.setRegistroGeral(registroGeral);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(NomeMae);
		aluno1.setNomePai(NomePai);
		aluno1.setDataMatricula(DataMatricula);
		aluno1.setNomeMatricula(NomeMatricula);
		aluno1.setSerieMatriculado(SerieMatriculado);
        aluno1.setNomeEscola(NomeEscola);
        aluno1.setNota1(Double.parseDouble(Nota1));
        aluno1.setNota2(Double.parseDouble(Nota2));
        aluno1.setNota3(Double.parseDouble(Nota3));
        aluno1.setNota4(Double.parseDouble(Nota4));

        
		System.out.println("Nome � = " + aluno1.getNome());
		System.out.println("Idade � = " + aluno1.getIdade());
		System.out.println("Nascimento � = " + aluno1.getDataNascimento());
		System.out.println("M�dia da nota �: " + aluno1.getMediaNota());
		System.out.println("Resultado = " + (aluno1.getAlunoAprovado() ?  "Aprovado" : "Reprovado"));
		System.out.println("resultado 2 = " + aluno1.getAlunoAprovado2());
		
		
		

	}

}
