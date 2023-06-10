package model;

import java.sql.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;

@Entity
	public class PessoaFisicaApplication extends ClienteApplication{

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int cdCliente;
		private String cpf;
		@DateTimeFormat(pattern = "dd/MM/yyyy")
		@Temporal(TemporalType.DATE)
		private Date dataNasc;
		private String sexo;

		public PessoaFisicaApplication(String cpf, Date data_nasc, String sexo, int cd_cliente) {
			this.cpf = cpf;
			this.dataNasc = data_nasc;
			this.sexo = sexo;
			this.cdCliente = cd_cliente;
		}

		public PessoaFisicaApplication(){

		}

		public String getCpf(){
			return cpf;
		}

		public Date getdataNasc(){
			return dataNasc;
		}

		public String getsexo(){
			return sexo;
		}

		public int getcdCliente(){
			return cdCliente;
		}

		public void setCpf(String cpf){
			this.cpf = cpf;
		}

		public void setData_nasc (Date dataNasc){
			this.dataNasc= dataNasc;
		}

		public void setSexo (String sexo){
			this.sexo = sexo;
		}

		public void setCdCliente (int cdCliente){
		this.cdCliente = cdCliente;
	}
		
}

	
	


