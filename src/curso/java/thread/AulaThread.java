package curso.java.thread;

public class AulaThread {

	public static void main(String[] args) throws InterruptedException {

		for (int pos = 0; pos < 10; pos++) {

			/* Quero executar esse envio com um tempo de parada, ou com tempo determinado */
			System.out.println("Executando algo na rotina, por exemplo envio de e-mail");
			Thread.sleep(1000); /*Dá um intervalo de tempo*/
		}
		
		System.out.println("CHEGOU AO FIM DO CÓDIGO DE TESTE THREAD");
	}
}