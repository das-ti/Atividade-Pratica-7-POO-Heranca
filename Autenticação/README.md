### Interface Pagamento
1. Crie uma interface chamada Pagamento com os seguintes métodos:
    - calcularPagamento(): Sem parâmetros, deve ser implementado para calcular o valor do pagamento.
    - emitirRecibo(): Retorna um recibo detalhado da transação.
2. Implemente essa interface em duas classes: PagamentoCartao e PagamentoDinheiro.
    - A classe PagamentoCartao deve incluir uma taxa de 5% sobre o valor do pagamento.
    - A classe PagamentoDinheiro deve aplicar um desconto de 10% sobre o valor do pagamento.
3. Crie uma classe de teste que simule o pagamento de R$100,00 com as duas formas de pagamento, calculando o valor final e emitindo um recibo.