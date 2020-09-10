package curso.java.thread;

import java.awt.Dimension;

import javax.swing.JDialog;

public class TelaTimeThread extends JDialog{

	public TelaTimeThread() { /*Executa oque tiver dentro no momento da abertura, ou execução*/

		setTitle("Minha tela de time com thread");
		setSize(new Dimension(240, 240));
		setLocationRelativeTo(null);
		setResizable(false);
		/*Primeira parte concluida*/
		
		
		
		
		/*Sempre será o ultimo comando*/
		setVisible(true); /*Torna a tela visivel para o usuário*/
	}
	
}
