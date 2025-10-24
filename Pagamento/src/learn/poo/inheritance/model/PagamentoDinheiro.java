package learn.poo.inheritance.model;

public class PagamentoDinheiro implements iPagamento{
    private double valor;

    public PagamentoDinheiro(double total) {
        this.valor = total;
    }

    public double calcularPagamento() {
        return this.valor * 0.90;
    }

    public String emitirRecibo() {
        return "Total a pagar pela compra: R$ " + this.valor
                + "\nTotal c/ Desconto de 10% (dinheiro) R$ " + calcularPagamento()+ "\n";
    }

}
