package curso.java.classesauxiloares;

import curso.java.interfaces.PermitirAcesso;

/*Realmente e somente receber alguem que tenha o contrato da interface de PermitirAcesso, e chamar o autenticar*/
public class FuncaoAutenticao {

	private PermitirAcesso permitirAcesso;

	public boolean autenticar() {
		return permitirAcesso.autenticar();
	}

	public FuncaoAutenticao(PermitirAcesso acesso) {

		this.permitirAcesso = acesso;
	}

}
