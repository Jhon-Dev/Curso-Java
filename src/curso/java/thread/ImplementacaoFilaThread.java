package curso.java.thread;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplementacaoFilaThread extends Thread {

	private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_filha = new ConcurrentLinkedQueue<ObjetoFilaThread>();

	public static void add(ObjetoFilaThread objetoFilaThread) {
		pilha_filha.add(objetoFilaThread);
	}
	
	@Override
	public void run() {
	
		Iterator interacao = pilha_filha.iterator();
		
		synchronized ( interacao) { /*Bloquear o acesso a esta lista por outros processos*/
			
			while (interacao.hasNext()) { /*Enquando conter dados na lista ira processar*/
				
				ObjetoFilaThread processar = (ObjetoFilaThread) interacao.next(); /*Pega o objeto atual*/
				
				/*Processar 10 mill notas fiscais*/
				/*Gerar ima lista enorme de PDF*/
				/*Gerar um envio em massa de email*/
				
				System.out.println("-------------------------------------");
				System.out.println(processar.getNome());
				System.out.println(processar.getEmail());

				interacao.remove();
				try {
					Thread.sleep(100); /*Da um tempo pra descarga de memoria*/
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		

		try {
			Thread.sleep(1000); /*Da um tempo para, Limpeza de memoria*/
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
	}
}
