package curso.java.executavel;

import curso.java.classes.Aluno;

public class PrimeiraClasseJava {

	/*Main é um metodo auto execultavel em Java*/
	public static void main(String[] args) {

        /*new Aluno () é uma instância  (Criação de Objeto)*/
		/*aluno1 é uma referencia  para o objeto*/
		Aluno aluno1 = new Aluno();	/*Aqui será o João */
		
		aluno1.nome = "João";
		aluno1.idade = 35;
		
		System.out.println("O nome do Aluno 1 é = " + aluno1.nome);
		
		System.out.println("A indade do aluno 1 é = " + aluno1.idade);

		
		Aluno aluno2 = new Aluno(); /*Aqui será Pedro*/
		
		Aluno aluno3 = new Aluno(); /*Aqui será o Alex*/

		Aluno aluno4 = new Aluno("Maria"); 
		
		Aluno aluno5 = new Aluno ("José", 35);
	}

}
