package curso.java.thread;

import javax.swing.JOptionPane;

public class AulaThread {

	public static void main(String[] args) throws InterruptedException {

		/*Thread processando em paralelo do envio do email*/
		new Thread() {
			
			public void run() { /*Executa oque n�s queremos*/
				/*C�digo da rotina*/		
				
				/*C�digo da rotina que eu quero executar em paralelo*/
				for (int pos = 0; pos < 10; pos++) {

					/* Quero executar esse envio com um tempo de parada, ou com tempo determinado */
					System.out.println("Executando algo na rotina, por exemplo envio de e-mail");
					
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
						
					} /*D� um intervalo de tempo*/
				}
				/*Fim do codigo pararelo*/
				
				
			};
			
		}.start();  /* Liga a Thread que fica processando palelamente por tr�s*/
		
	/*==========================DIVIS�O DAS THREADS*/
		
		/*Thread processando em paralelo do envio de nota fical*/
		new Thread() {
			
			public void run() { /*Executa oque n�s queremos*/
				/*C�digo da rotina*/		
				
				/*C�digo da rotina que eu quero executar em paralelo*/
				for (int pos = 0; pos < 10; pos++) {

					/* Quero executar esse envio com um tempo de parada, ou com tempo determinado */
					System.out.println("Executando algo na rotina, por exemplo envio de nota fiscal");
					
					try {
						Thread.sleep(4000);
					} catch (InterruptedException e) {
						e.printStackTrace();
						
					} /*D� um intervalo de tempo*/
				}
				/*Fim do codigo pararelo*/
				
				
			};
			
		}.start();  /* Liga a Thread que fica processando palelamente por tr�s*/

		
		/*C�digo do sistema do usu�rio continua o fluxo de trabalho*/
		System.out.println("CHEGOU AO FIM DO C�DIGO DE TESTE THREAD");		
		/*Fluxo do sistema,cadastro de venda, uma emiss�o de nota fical, algo do tipo*/
		JOptionPane.showMessageDialog(null, "Sistema continua executando para usu�rio");
	}
}