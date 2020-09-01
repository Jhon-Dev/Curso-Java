package curso.java.excecoes;

public class ExcessaoProcessarNota extends Exception {

	public ExcessaoProcessarNota(String erro) {
		super ("Vixxx erro no processamento do arquivo" + erro);
	}
	
}
