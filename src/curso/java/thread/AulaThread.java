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

		/* Código do sistema do usuário continua o fluxo de trabalho */
		System.out.println("CHEGOU AO FIM DO CÓDIGO DE TESTE THREAD");
		/*
		 * Fluxo do sistema,cadastro de venda, uma emissão de nota fical, algo do tipo
		 */
		JOptionPane.showMessageDialog(null, "Sistema continua executando para usuário");
	}

	private static Runnable thread2 = new Runnable() {

		@Override
		public void run() {
			/* Código da rotina */

			/* Código da rotina que eu quero executar em paralelo */
			for (int pos = 0; pos < 10; pos++) {

				/* Quero executar esse envio com um tempo de parada, ou com tempo determinado */
				System.out.println("Executando algo na rotina, por exemplo envio de nota fiscal");

				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					e.printStackTrace();

				} /* Dá um intervalo de tempo */
			}
			/* Fim do codigo pararelo */

		}
	};

	private static Runnable thread1 = new Runnable() {

		@Override
		public void run() {

			/* Código da rotina */

			/* Código da rotina que eu quero executar em paralelo */
			for (int pos = 0; pos < 10; pos++) {

				/* Quero executar esse envio com um tempo de parada, ou com tempo determinado */
				System.out.println("Executando algo na rotina, por exemplo envio de e-mail");

				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();

				} /* Dá um intervalo de tempo */
			}
			/* Fim do codigo pararelo */

		}
	};
}