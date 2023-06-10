package model;


	import org.springframework.boot.SpringApplication;
	import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl;

	@SpringBootApplication
	public class PixApplication {

		public static void main(String[] args) {
			SpringApplication.run(PixApplication.class, args);
		}

	        private String chave_pix;  
	        private int cpf;
		    private String email;
		    private String telefone;
		    private String chave_aleatoria;
		    private Impl qrcode;
		    private int id_pagamento;
		    
		    
		    public PixApplication(String chave_pix, int cpf, String email, String telefone, String chave_aleatoria, Impl qrcode, int id_pagamento) {
		    
		    	this.cpf = cpf;
		    	this.chave_pix = chave_pix;
		    	this.email = email;
		    	this.telefone = telefone;
		    	this.chave_aleatoria = chave_aleatoria;
		    	this.qrcode = qrcode;
		    	this.id_pagamento = id_pagamento;	
		    }

	        public String getchave_pix() {
		    	return chave_pix;
		    }
		    
		    public void setchave_pix(String chave_pix) {
		    	this.chave_pix = chave_pix;	
		    }
		    
		    public int getcpf() {
		        return cpf;
		    }

		    public void setcpf(int cpf) {
		        this.cpf = cpf;
		    }
		    
		    public String getemail() {
		    	return email;
		    }
		    
		    public void setemail(String email) {
		    	this.email = email;
		    }
		
		    public String gettelefone() {
		        return telefone;
		    }

		    public void settelefone(String telefone) {
		        this.telefone = telefone;
		    }
		    
		    public String getchave_aleatoria() {
		        return chave_aleatoria;
		    }

		    public void setchave_aleatoria(String chave_aleatoria) {
		        this.chave_aleatoria = chave_aleatoria;    
		    }
		    
		    public Impl getqrcode() {
		        return qrcode;
		    }

		    public void setqrcode(Impl qrcode) {
		        this.qrcode = qrcode;
		    }
		    
		    public double getid_pagamento() {
		        return id_pagamento;
		    }

		    public void setid_pagamento(int id_pagamento) {
		        this.id_pagamento = id_pagamento;
		    }
	}



