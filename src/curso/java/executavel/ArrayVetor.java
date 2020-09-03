package curso.java.executavel;

public class ArrayVetor {

	public static void main(String[] args) {

		/*Array pode ser de todos os tipos de dados e objetos também*/

		/*Array sempre deve ter a quantidade de posições definidas*/
		double notas [] = new double [4];
		
		notas[0] = 7.8;
		notas[1] = 8.7; 
		notas [2] = 9.7;
		notas [3] = 9.9;
				

		System.out.println("Nota 1 = " + notas[0]);
		System.out.println("Nota 2 = " + notas[1]);
		System.out.println("Nota 3 = " + notas[2]);
		System.out.println("Nota 4 = " + notas[3]);
		
		for (int n = 0; n < 4; n++) {
			System.out.println("Nota " + (n+1) + " é = " + notas[n]);
		}

	}

}
