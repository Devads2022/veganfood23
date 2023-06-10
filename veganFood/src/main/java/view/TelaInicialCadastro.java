package view;

import javax.swing.JOptionPane;

import repository.CadastrarEntrega;


public class TelaInicialCadastro {
	


	public static void main(String[]args)throws Exception {
		
    Entrega e = new Entrega();
    
    
	String cpf,nome_Entregador,cep = null;
	String placa;
	String data_Entrega;
	String hora_entrega;
	String valor;
    
 
    //CADASTROENTREGADOR
//	cpf = JOptionPane.showInputDialog("Digite seu cpf");
//	e.setCpf(cpf);
//	nome_Entregador = JOptionPane.showInputDialog("Digite seu nome");
//	e.setnome_Entregador(nome_Entregador);
//	placa = JOptionPane.showInputDialog("Digite sua placa");
//	e.setPlaca(placa);
//	cep = JOptionPane.showInputDialog("Digite o cep");
//	e.setCep(cep);
//	hora_entrega = JOptionPane.showInputDialog("Digite horário  da entrega");
//	e.setHora_entrega(hora_entrega);
//	data_Entrega = JOptionPane.showInputDialog("Digite a data da entrega");
//	e.setData_entrega (data_Entrega);
//	valor = JOptionPane.showInputDialog("Digite o valor");
//	e.setValor(valor);
   
	try {
		CadastrarEntrega.salvarEntrega(e);
		JOptionPane.showInternalMessageDialog(null, "Registro gravado com sucesso");
		
	}catch(Exception E) {
		
		JOptionPane.showInternalMessageDialog(null,E.getMessage() );
		
		
	}

	
		
	}

}
