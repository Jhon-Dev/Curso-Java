package curso.java.executavel;

import curso.java.classes.Aluno;
import curso.java.classes.Disciplina;

public class ArrayVetor {

	public static void main(String[] args) {

		double[] notas = { 8.8, 9.7, 7.6, 6.8 };
		double[] notasLogica = { 8.8, 9.7, 7.6, 6.8 };

		/* Cria��o do aluno */
		Aluno aluno = new Aluno();
		aluno.setNome("Jhonatan Nuss");
		aluno.setNomeEscola("Jdev");

		/* Cria��o da disciplina */
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Curso de JAva");
		disciplina.setNota(notas);

		aluno.getDisciplinas().add(disciplina);

		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Kotlin");
		disciplina2.setNota(notasLogica);

		aluno.getDisciplinas().add(disciplina2);

		System.out.println("Nome do aluno = " + aluno.getNome() + " Inscrito no curso " + aluno.getNomeEscola());

		System.out.println(" ''----------------Disciplina do aluno-------------'' ");

		for (Disciplina d : aluno.getDisciplinas()) {

			System.out.println("Disciplina : " + d.getDisciplina());
			System.out.println("As notas da disciplina s�o : ");

			double notaMax = 0.0;

			for (int pos = 0; pos < d.getNota().length; pos++) {
				System.out.println("Nota " + pos + " � igual = " + d.getNota()[pos]);

				if (pos == 0) {
					notaMax = d.getNota()[pos];
				} else {
					if (d.getNota()[pos] > notaMax) {
						notaMax = d.getNota()[pos];
					}
				}
			}
			System.out.println("A maior nota da disciplina = " + d.getDisciplina() + " e de valor " + notaMax );
		}
	}
}
