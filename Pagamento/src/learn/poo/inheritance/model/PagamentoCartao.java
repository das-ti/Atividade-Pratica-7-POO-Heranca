package learn.poo.inheritance.model;

public class PagamentoCartao implements iPagamento {

    private double valor;

    public PagamentoCartao(double total) {
        this.valor = total;
    }

    public double calcularPagamento() {
        return this.valor * 1.05;
    }

    public String emitirRecibo() {
        return "Total a pagar pela compra: R$ " + this.valor
                + "\nTotal c/ taxa de 5% (cartão) R$ " + calcularPagamento()+"\n";
    }

}
