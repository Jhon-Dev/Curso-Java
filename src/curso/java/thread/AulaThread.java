package curso.java.thread;

import javax.swing.JOptionPane;

public class AulaThread {

	public static void main(String[] args) throws InterruptedException {

		/* Thread processando em paralelo do envio do email */
		Thread thremail = new Thread(thread1);
		thremail.start();

		/* Thread processando em paralelo do envio de nota fical */
		Thread threadNFCE = new Thread(thread2);
		threadNFCE.start();

		/* C�digo do sistema do usu�rio continua o fluxo de trabalho */
		System.out.println("CHEGOU AO FIM DO C�DIGO DE TESTE THREAD");
		/*
		 * Fluxo do sistema,cadastro de venda, uma emiss�o de nota fical, algo do tipo
		 */
		JOptionPane.showMessageDialog(null, "Sistema continua executando para usu�rio");
	}

	private static Runnable thread2 = new Runnable() {

		@Override
		public void run() {
			/* C�digo da rotina */

			/* C�digo da rotina que eu quero executar em paralelo */
			for (int pos = 0; pos < 10; pos++) {

				/* Quero executar esse envio com um tempo de parada, ou com tempo determinado */
				System.out.println("Executando algo na rotina, por exemplo envio de nota fiscal");

				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					e.printStackTrace();

				} /* D� um intervalo de tempo */
			}
			/* Fim do codigo pararelo */

		}
	};

	private static Runnable thread1 = new Runnable() {

		@Override
		public void run() {

			/* C�digo da rotina */

			/* C�digo da rotina que eu quero executar em paralelo */
			for (int pos = 0; pos < 10; pos++) {

				/* Quero executar esse envio com um tempo de parada, ou com tempo determinado */
				System.out.println("Executando algo na rotina, por exemplo envio de e-mail");

				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();

				} /* D� um intervalo de tempo */
			}
			/* Fim do codigo pararelo */

		}
	};
}