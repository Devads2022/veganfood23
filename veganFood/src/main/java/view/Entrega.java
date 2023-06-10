package view;

import model.ClienteApplication;
import model.EntregadorApplication;
import model.PessoaFisicaApplication;

public class Entrega {

	ClienteApplication cliente = new PessoaFisicaApplication();
	EntregadorApplication entregador = new EntregadorApplication();

	public void registrarEntrega(){
		((PessoaFisicaApplication) cliente).setCpf("232313123");
		cliente.setNome("NOme aqui");

	}

}
