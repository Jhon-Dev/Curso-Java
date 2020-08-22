package curso.java.executavel;

import javax.swing.JOptionPane;

import curso.java.classes.Aluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {

  
		/*String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
		String idade = JOptionPane.showInputDialog("Qual a idade?");
		String dataNascumento = JOptionPane.showInputDialog("Qual a data de nascimento?");
		String registroGeral = JOptionPane.showInputDialog("Registro Geral?");
		String cpf = JOptionPane.showInputDialog("Qual é o cpf?");
		String NomeMae = JOptionPane.showInputDialog("Qual é o nome da mãe?");
		String NomePai = JOptionPane.showInputDialog("Qual é o nome do Pai?");
		String DataMatricula = JOptionPane.showInputDialog("Qual é a matricula?");
		String NomeMatricula = JOptionPane.showInputDialog("Qual é o nome da Matricula?");
		String SerieMatriculado = JOptionPane.showInputDialog("Qual a serie matriculada?");
		String NomeEscola = JOptionPane.showInputDialog("Qual é o nome da escola?");
		String Nota1 = JOptionPane.showInputDialog("Qual é a nota 1?");
		String Nota2 = JOptionPane.showInputDialog("Qual é a nota 2?");
		String Nota3 = JOptionPane.showInputDialog("Qual é a nota 3?");
		String Nota4 = JOptionPane.showInputDialog("Qual é a nota 4?");

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
        aluno1.setNota4(Double.parseDouble(Nota4)); */

	
    	/*System.out.println(aluno1.toString());   /*Descrição do objeto na memoria*/
		/*System.out.println("Média do aluno = " + aluno1.getMediaNota());
		System.out.println("Resultado = " + aluno1.getAlunoAprovado2());*/

		/*Equals e hashcode (Diferenciar objetos)*/
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Jhonatan");
		aluno1.setNumeroCpf("123");

		Aluno aluno2 = new Aluno();
		aluno2.setNome("Jhonatan");
		aluno2.setNumeroCpf("123");

		
		if (aluno1.equals(aluno2)) {
			System.out.println("Alunos são iguais");						
		}else {
			System.out.println("Alunos não são iguais");						

		}

	}

}
