package curso.java.executavel;

import curso.java.classes.Aluno;
import curso.java.classes.Disciplina;

public class ArrayVetor {

	public static void main(String[] args) {

		double[] notas = { 8.8, 9.7, 7.6, 6.8 };
		double[] notasLogica = { 8.8, 9.7, 7.6, 6.8 };

		/*Criação do aluno*/
		Aluno aluno = new Aluno();
		aluno.setNome("Jhonatan Nuss");
		aluno.setNomeEscola("Lions");

		
		/*Criação da disciplina*/
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Curso de JAva");
		disciplina.setNota(notas);
		
		aluno.getDisciplinas().add(disciplina);
		
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Kotlin");
		disciplina.setNota(notasLogica);
		
		aluno.getDisciplinas().add(disciplina2);
	}
}
