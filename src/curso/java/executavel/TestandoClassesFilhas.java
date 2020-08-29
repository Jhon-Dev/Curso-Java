package curso.java.executavel;

import curso.java.classes.Aluno;
import curso.java.classes.Diretor;
import curso.java.classes.Secretario;

public class TestandoClassesFilhas {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Jhonatan - Curso");
		System.out.println(aluno);
		aluno.setIdade(16);
		
		
		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("43s43s43s4d65d6");
		System.out.println(diretor);
		aluno.setIdade(50);

		
		Secretario secretario = new Secretario();
		secretario.setExperiencia("Developer");
		System.out.println(secretario);
		aluno.setIdade(23);


		System.out.println(aluno.pessoaMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());
		
		
	}
}
