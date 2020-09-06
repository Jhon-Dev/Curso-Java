package curso.java.executavel;

import curso.java.classes.Aluno;
import curso.java.classes.Disciplina;

public class ArrayVetor {

	public static void main(String[] args) {

		double[] notas = { 8.8, 9.7, 7.6, 6.8 };
		double[] notasLogica = { 8.8, 9.7, 7.6, 6.8 };

		/* Criação do aluno */
		Aluno aluno = new Aluno();
		aluno.setNome("Jhonatan Nuss");
		aluno.setNomeEscola("Jdev");

		/* Criação da disciplina */
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Curso de JAva");
		disciplina.setNota(notas);

		aluno.getDisciplinas().add(disciplina);

		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Kotlin");
		disciplina2.setNota(notasLogica);

		aluno.getDisciplinas().add(disciplina2);

		/* Criação do aluno */
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Jhonatan Nuss 2");
		aluno2.setNomeEscola("Jdev");

		/* Criação da disciplina */
		Disciplina disciplina3 = new Disciplina();
		disciplina3.setDisciplina("Curso de JAva 2");
		disciplina3.setNota(notas);

		aluno2.getDisciplinas().add(disciplina3);

		Disciplina disciplina4 = new Disciplina();
		disciplina4.setDisciplina("Kotlin");
		disciplina4.setNota(notasLogica);

		aluno2.getDisciplinas().add(disciplina4);

		/*-------------------------------------------------*/

		Aluno[] arrayAlunos = new Aluno[2];

		arrayAlunos[0] = aluno;
		arrayAlunos[1] = aluno;

		for (int pos = 0; pos < arrayAlunos.length; pos++) {

			System.out.println("Nome do aluno é :" + arrayAlunos[pos].getNome());

			for (Disciplina d : arrayAlunos[pos].getDisciplinas()) {
				System.out.println("Nome da Disciplina é : " + d.getDisciplina());

				for (int posnota = 0; posnota < d.getNota().length; posnota++) {
					System.out.println("A nota numero  : " + posnota + " é igual " + d.getNota()[posnota]);
				}
			}
		}

	}
}
