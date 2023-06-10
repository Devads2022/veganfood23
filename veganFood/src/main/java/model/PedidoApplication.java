package model;


	import java.sql.Date;
	import java.sql.Time;

	import org.springframework.boot.SpringApplication;
	import org.springframework.boot.autoconfigure.SpringBootApplication;

	@SpringBootApplication
	public class PedidoApplication {

		public static void main(String[] args) {
			SpringApplication.run(PedidoApplication.class, args);
		
		}

		    private int nr_pedido;
		    private Date data_pedido;
		    private Time hora_pedido;
		    private int quantidade;
		    private double valor;
		    
		    
		    public PedidoApplication(int nr_pedido, Date data_pedido, Time hora_pedido, int quantidade, double valor) {
		    
		    	this.nr_pedido = nr_pedido;
		    	this.data_pedido = data_pedido;
		    	this.hora_pedido = hora_pedido;
		    	this.quantidade = quantidade;
		    	this.valor = valor;	
		    }
		    
		    public int getnr_pedido() {
		        return nr_pedido;
		    }

		    public void setnr_pedido(int nr_pedido) {
		        this.nr_pedido = nr_pedido;
		    }
		    
		    public Date getdata_pedido() {
		        return data_pedido;
		    }

		    public void setdata_pedido(Date data_pedido) {
		        this.data_pedido = data_pedido;
		    }
		    
		    public Time gethora_pedido() {
		        return hora_pedido;
		    }

		    public void sethora_pedido(Time hora_pedido) {
		        this.hora_pedido = hora_pedido;
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



