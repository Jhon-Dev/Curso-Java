package curso.java.executavel;

import curso.java.classes.Aluno;

public class PrimeiraClasseJava {

	/*Main � um metodo auto execultavel em Java*/
	public static void main(String[] args) {

        /*new Aluno () � uma inst�ncia  (Cria��o de Objeto)*/
		/*aluno1 � uma referencia  para o objeto*/
		Aluno aluno1 = new Aluno();	/*Aqui ser� o Jo�o */
		
		aluno1.nome = "Jo�o";
		aluno1.idade = 35;
		
		System.out.println("O nome do Aluno 1 � = " + aluno1.nome);
		
		System.out.println("A indade do aluno 1 � = " + aluno1.idade);

		
		Aluno aluno2 = new Aluno(); /*Aqui ser� Pedro*/
		
		Aluno aluno3 = new Aluno(); /*Aqui ser� o Alex*/

		Aluno aluno4 = new Aluno("Maria"); 
		
		Aluno aluno5 = new Aluno ("Jos�", 35);
	}

}
