package model;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CartaoApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		class CartaoCreditoDebito {
		    private String numero;
		    private String titular;
		    private String dataValidade;
		    private int codigoSeguranca;

		    public CartaoCreditoDebito(String numero, String titular, String dataValidade, int codigoSeguranca) {
		        this.numero = numero;
		        this.titular = titular;
		        this.dataValidade = dataValidade;
		        this.codigoSeguranca = codigoSeguranca;
		    }

		    public String getNumero() {
		        return numero;
		    }

		    public String getTitular() {
		        return titular;
		    }

		    public String getDataValidade() {
		        return dataValidade;
		    }

		    public int getCodigoSeguranca() {
		        return codigoSeguranca;
		    }

		    public void setNumero(String numero) {
		        this.numero = numero;
		    }

		    public void setTitular(String titular) {
		        this.titular = titular;
		    }

		    public void setDataValidade(String dataValidade) {
		        this.dataValidade = dataValidade;
		    }

		    public void setCodigoSeguranca(int codigoSeguranca) {
		        this.codigoSeguranca = codigoSeguranca;
		    }

		    public boolean validarCartao() {
		        if (!validarNumeroCartao()) {
		            return false;
		        }

		        // Logica para validar a data de validade e codigo de seguranca

		        return true;
		    }

		    private boolean validarNumeroCartao() {
		        String numeroSemEspacos = numero.replaceAll("\\s+", "");
		        String numeroSemTracos = numeroSemEspacos.replaceAll("-", "");

		        // Verificar se o número do cartao possui apenas digitos
		        if (!numeroSemTracos.matches("\\d+")) {
		            return false;
		        }

		        // Verificar se o numero do cartão tem pelo menos 13 dígitos e no maximo 19 digitos
		        int tamanho = numeroSemTracos.length();
		        if (tamanho < 13 || tamanho > 19) {
		            return false;
		        }

		        // Verificar se o número do cartao e valido usando o algoritmo de Luhn
		        int soma = 0;
		        boolean dobrarDigito = false;
		        for (int i = tamanho - 1; i >= 0; i--) {
		            int digito = Integer.parseInt(numeroSemTracos.substring(i, i + 1));
		            if (dobrarDigito) {
		                digito *= 2;
		                if (digito > 9) {
		                    digito = digito % 10 + 1;
		                }
		            }
		            soma += digito;
		            dobrarDigito = !dobrarDigito;
		        }

		        return soma % 10 == 0;
		    }

		    public boolean efetuarPagamento(double valor) {
		        if (validarCartao()) {
		            // Lógica para efetuar o pagamento
		            // Implemente aqui a lógica para processar o pagamento com o valor especificado

		            return true;
		        }
		        return false;
		    }
		}

	}

}
