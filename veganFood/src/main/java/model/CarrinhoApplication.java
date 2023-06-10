package model;


	import org.springframework.boot.SpringApplication;
	import org.springframework.boot.autoconfigure.SpringBootApplication;

	@SpringBootApplication
	public class CarrinhoApplication {

		public static void main(String[] args) {
			SpringApplication.run(CarrinhoApplication.class, args);
		
		}

		    private int cod_produto;
		    private String desc_produto;
		    private int quantidade;
		    private double valor;
		    
		    
		    public CarrinhoApplication(int cod_produto, String desc_produto, int quantidade, double valor) {
		    
		    	this.cod_produto = cod_produto;
		    	this.desc_produto = desc_produto;
		    	this.quantidade = quantidade;
		    	this.valor = valor;
		    	
		    }
		    
		    public int getcod_produto() {
		        return cod_produto;
		    }

		    public void setcod_produto(int cod_produto) {
		        this.cod_produto = cod_produto;
		    }
		    
		    public String getdesc_produto() {
		    	return desc_produto;
		    }
		    
		    public void setdesc_produto(String desc_produto) {
		    	this.desc_produto = desc_produto;
		    	
		    }
		    
		    public int getquantidade() {
		    	return quantidade;
		    }
		    
		    public void setquantidade(int quantidade) {
		    	this.quantidade = quantidade;
		    }
		    
		    public double getvalor() {
		        return valor;
		    }

		    public void setcpf(double valor) {
		        this.valor = valor;
		    }
	}


