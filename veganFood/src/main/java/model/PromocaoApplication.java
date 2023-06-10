package model;

	import java.sql.Date;

	import org.springframework.boot.SpringApplication;
	import org.springframework.boot.autoconfigure.SpringBootApplication;

	@SpringBootApplication
	public class PromocaoApplication {

		public static void main(String[] args) {
			SpringApplication.run(PromocaoApplication.class, args);
			
		}
		
			public int cd_promocao;
			protected Date data_inicio_promo;
			public String desc_produto;
			protected int desconto_porcent;
			protected Date data_final_promo;
			protected int valor_inicial;
			protected int valor_final;
			
			
			public PromocaoApplication(int cd_promocao, Date data_inicio_promo, String desc_produto, int desconto_porcent, Date data_final_promo, int valor_inicial, int valor_final) {
				this.cd_promocao = cd_promocao;
				this.data_inicio_promo = data_inicio_promo;
				this.desc_produto = desc_produto;
				this.desconto_porcent = desconto_porcent;
				this.data_final_promo = data_final_promo;
				this.valor_inicial = valor_inicial;
				this.valor_final = valor_final;
				
			}
			
			public int getcd_promocao() {
				return cd_promocao;
			}
			
			public void setcd_promocao() {
				this.cd_promocao = cd_promocao;
			}
			
			public Date getdata_inicio_promo() {
				return data_inicio_promo;
			}
			
			protected void setdata_inicio_promo() {
				this.data_inicio_promo = data_inicio_promo;
			}
			
			public String getdesc_produto() {
				return desc_produto;
			}
			
			public void setdesc_produto() {
				this.desc_produto = desc_produto;
			}
			
			public int getdesconto_porcent() {
				return desconto_porcent;
			}
			
			protected void setdesconto_porcent() {
				this.desconto_porcent = desconto_porcent;
			}
			
			public Date getdata_final_promo() {
				return data_final_promo;
			}
			
			protected void setdata_final_promo() {
				this.data_final_promo = data_final_promo;
			}
			
			public int getvalor_inicial() {
				return valor_inicial;
			}
			
			protected void setvalor_inicial() {
				this.valor_inicial = valor_inicial;
			}
			
			public int getvalor_final() {
				return valor_final;
			}
			
			protected void setvalor_final() {
				this.valor_final = valor_final;
			}
	}




