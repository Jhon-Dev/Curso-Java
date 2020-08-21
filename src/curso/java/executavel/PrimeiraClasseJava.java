package curso.java.executavel;

import curso.java.classes.Aluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {


		Aluno aluno1 = new Aluno();	
		
		aluno1.setNome("Jhonatan");
		aluno1.setIdade(23);
		aluno1.setDataNascimento("08/05/1997");
		aluno1.setRegistroGeral("200870");
		aluno1.setNumeroCpf("167.870.267-65");
		aluno1.setNomeMae("Elizangela");
		aluno1.setNomePai("Dehon");
		aluno1.setDataMatricula("20");
		aluno1.setNomeMatricula("");
		aluno1.setSerieMatriculado("3");
        aluno1.setNomeEscola("Escola Jdev");
        aluno1.setNota1(90);
        aluno1.setNota2(80.8);
        aluno1.setNota3(70.9);
        aluno1.setNota4(90.7);


		
		System.out.println("Nome é = " + aluno1.getNome());
		System.out.println("Idade é = " + aluno1.getIdade());
		System.out.println("Nascimento é = " + aluno1.getDataNascimento());
		System.out.println("Média da nota é: " + aluno1.getMediaNota());
		System.out.println("Resultado = " + (aluno1.getAlunoAprovado() ?  "Aprovado" : "Reprovado"));
		System.out.println("resultado 2 = " + aluno1.getAlunoAprovado2());

		
		
		
		/*===============================================================*/
        System.out.println("----------------------------------------");
        
		Aluno aluno2 = new Aluno();
		aluno2.setNome("João");
		aluno2.setIdade(23);
		aluno2.setDataNascimento("18/06/2000");

		System.out.println("Aluno 2 Nome é = " + aluno2.getNome());
		System.out.println("Aluno 2 Idade é = " + aluno2.getIdade());
		System.out.println("Aluno 2 Nascimento é = " + aluno2.getDataNascimento());

	
		
		Aluno aluno3 = new Aluno();

		Aluno aluno4 = new Aluno(); 
		
		Aluno aluno5 = new Aluno ();
	}

}
