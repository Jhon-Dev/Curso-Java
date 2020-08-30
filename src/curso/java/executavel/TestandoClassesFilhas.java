package curso.java.executavel;

import curso.java.classes.Aluno;
import curso.java.classes.Diretor;
import curso.java.classes.Pessoa;
import curso.java.classes.Secretario;

public class TestandoClassesFilhas {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Jhonatan - Curso");
		aluno.setIdade(16);
		
		
		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("43s43s43s4d65d6");
		diretor.setNome("Egidio");
		aluno.setIdade(50);

		
		Secretario secretario = new Secretario();
		secretario.setExperiencia("Developer");
		secretario.setNumeroCpf("4sasa4sa4sas");
		System.out.println(secretario);
		aluno.setIdade(23);


		System.out.println(aluno.pessoaMaiorIdade()+ " - " + aluno.msgMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());
		
		System.out.println("Salário do Aluno " + aluno.salario());
		System.out.println("Salário do Professor " + diretor.salario());
		System.out.println("Salário do Secretario " + secretario.salario());
		
		teste(aluno);
		teste(diretor);
		teste(secretario);

	}
	
	public static void teste (Pessoa pessoa ) {
		
		System.out.println("Essa Pessoa é de mais = " + pessoa.getNome());
	}
}
