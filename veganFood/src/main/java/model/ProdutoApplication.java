package model;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProdutoApplication {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;

//		@Column(length = 50, nullable = false)
		private String descProduto;

//		@Column(nullable = false)
		private double valor;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getDescProduto() {
			return descProduto;
		}

		public void setDescProduto(String descProduto) {
			this.descProduto = descProduto;
		}

		public double getValor() {
			return valor;
		}

		public void setValor(double valor) {
			this.valor = valor;
		}

		public void visualizar() {
			System.out.println("ID: " + id);
			System.out.println("Descrição do Produto: " + descProduto);
			System.out.println("Valor: " + valor);
		}

		public void excluir() {
			// Lógica para excluir o produto
		}

		public void incluir() {
			// Lógica para incluir o produto
		}

		public void alterar() {
			// Lógica para alterar o produto
		}

}



		