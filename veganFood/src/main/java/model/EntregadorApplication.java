package model;

import java.sql.Date;
import java.sql.Time;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EntregadorApplication {

	public static void main(String[] args) {
		SpringApplication.run(EntregadorApplication.class, args);
	}
		
		    private String cpf;
		    private String nome_entregador;
		    private int placa;
		    private Date data_entrega;
		    private Time hora_saida;
		    private String cep;
		    private double valor;
		    
		    
		    public EntregadorApplication(String cpf, String nome_entregador, int placa, Date data_entrega, Time hora_saida, String cep, double valor) {
		    
		    	this.cpf = cpf;
		    	this.nome_entregador = nome_entregador;
		    	this.placa = placa;
		    	this.data_entrega = data_entrega;
		    	this.hora_saida = hora_saida;
		    	this.cep = cep;
		    	this.valor = valor;
		    	
		    }

			public EntregadorApplication(){

			}
		    
		    public  String  getcpf() {
					return cpf;
		    }
		      

		    public void setcpf(String cpf) {
		        this.cpf = cpf;
		    }
		    
		    public String getnome_entregador() {
		    	return nome_entregador;
		    }
		    
		    public void setnome_entregador(String nome_entregador) {
		    	this.nome_entregador = nome_entregador;
		    	
		    }
		    
		    public int getplaca() {
		    	return placa;
		    }
		    
		    public void setplaca(int placa) {
		    	this.placa = placa;
		    }
		
		    public Date getdata_entrega() {
		        return data_entrega;
		    }

		    public void setdata_entrega(Date data_entrega) {
		        this.data_entrega = data_entrega;
		    }
		    
		    public Time gethora_saida() {
		        return hora_saida;
		    }

		    public void setcpf(Time hora_saida) {
		        this.hora_saida = hora_saida;
		        
		    }
		    
		    public String getcep() {
		        return cep;
		    }

		    public void setcep(String cep) {
		        this.cep = cep;
		    }
		    
		    public double getvalor() {
		        return valor;
		    }

		    public void setcpf(double valor) {
		        this.valor = valor;
		    }
	

	

}
