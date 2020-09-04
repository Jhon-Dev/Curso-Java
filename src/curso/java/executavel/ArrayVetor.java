package curso.java.executavel;

import javax.swing.JOptionPane;

public class ArrayVetor {

	public static void main(String[] args) {


		String valores [] = new String [4];
		
		valores [0] = "jhonatan";
		valores [1] = "90";
		valores [2] = "Curso de Java";
		valores [3] = "contato@jncenter.com.br";


		
		for (int pos = 0;  pos < valores.length; pos++) {
			System.out.println("Valor na posição  " + pos + " é = " + valores[pos]);
		}
		
		
		
		
		
		
		
		/* Array pode ser de todos os tipos de dados e objetos também */

		String posicoes = JOptionPane.showInputDialog("Quantas posições o Array deve ter?");

		/* Array sempre deve ter a quantidade de posições definidas */
		double notas[] = new double[Integer.valueOf(posicoes)];

		for (int pos = 0; pos < notas.length; pos++) {
			String valor = JOptionPane.showInputDialog("Qual o valor da posição = " + pos);
			notas[pos] = Double.valueOf(valor);
		}

		for (int pos = 0;  pos < notas.length; pos++) {
			System.out.println("Nota " + (pos + 1) + " é = " + notas[pos]);
		}

	}

}
