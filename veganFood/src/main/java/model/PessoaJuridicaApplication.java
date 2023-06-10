package model;


	import org.springframework.boot.SpringApplication;
	import org.springframework.boot.autoconfigure.SpringBootApplication;

	@SpringBootApplication
	public class PessoaJuridicaApplication extends ClienteApplication{

		public static void main(String[] args) {
			SpringApplication.run(PessoaJuridicaApplication.class, args);
		}
		 private String cnpj;
	     private String insc_estadual;
	     private String nome_fantasia;
	     private int cd_cliente;




	     public PessoaJuridicaApplication(String cnpj, String insc_estadual, String nome_fantasia, int cd_cliente) {
	         this.cnpj = cnpj;
	         this.insc_estadual = insc_estadual;
	         this.nome_fantasia = nome_fantasia;
	         this.cd_cliente = cd_cliente;

	     }
	     public String getcnpj(){
	         return cnpj;
	     }

	     public String getinsc_estadual(){
	         return insc_estadual;
	     }
	     public String getnome_fantasia(){
	         return nome_fantasia;
	     }
	     public int getcd_cliente(){
	         return cd_cliente;
	     }

	     public void setcnpj(String cnpj){
	         this.cnpj = cnpj;
	     }

	     public void setinsc_estadual (String insc_estadual){
	         this.insc_estadual= insc_estadual;
	     }
	     public void setnome_fantasia (String nome_fantasia){
	         this.nome_fantasia = nome_fantasia;
	     }
	     public void setcd_cliente (int cd_cliente){
	         this.cd_cliente = cd_cliente;
	     }


	 }

	

