package model;

public class PagamentoApplication {

		    private double valorTotal;
		    private double valorPago;

		    public PagamentoApplication(double valorTotal, double valorPago) {
		        this.valorTotal = valorTotal;
		        this.valorPago = valorPago;
		    }

		    public void calcularTroco() {
		        if (valorPago >= valorTotal) {
		            double troco = valorPago - valorTotal;
		            System.out.println("Troco: R$ " + troco);
		        } else {
		            System.out.println("Valor insuficiente para o pagamento.");
		        }
		    }

		    public void verificarFormaPagamento(String formaPagamento) {
		        if (formaPagamento.equals("cartao")) {
		            System.out.println("Pagamento realizado com cartão.");
		        } else if (formaPagamento.equals("dinheiro")) {
		            System.out.println("Pagamento realizado em dinheiro.");
		        } else if (formaPagamento.equals("pix")) {
		            System.out.println("Pagamento realizado via Pix.");
		        } else {
		            System.out.println("Forma de pagamento inválida.");
		        }
		    }

		    public static void main(String[] args) {
		        PagamentoApplication pagamento1 = new Pagamento(50.0, 100.0);
		        pagamento1.calcularTroco();
		        pagamento1.verificarFormaPagamento("pix");
		    }
		}
		
	


