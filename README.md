# ATIVIDADE PRÁTICA 7 - POO - HERANÇA

## Utilizando Interface

### Interface Operacão Matemática
1. Crie uma interface chamada "OperacaoMatematica".

2. Crie também 4 métodos das operações básicas:
    - soma, subtração, multiplicação e divisão;
    - implemente na classe Calculadora.

3. Implementar alguns dos métodos criados.

### Interface Pagamento
1. Crie uma interface chamada Pagamento com os seguintes métodos:
    - calcularPagamento(): Sem parâmetros, deve ser implementado para calcular o valor do pagamento.
    - emitirRecibo(): Retorna um recibo detalhado da transação.
2. Implemente essa interface em duas classes: PagamentoCartao e PagamentoDinheiro.
    - A classe PagamentoCartao deve incluir uma taxa de 5% sobre o valor do pagamento.
    - A classe PagamentoDinheiro deve aplicar um desconto de 10% sobre o valor do pagamento.
3. Crie uma classe de teste que simule o pagamento de R$100,00 com as duas formas de pagamento, calculando o valor final e emitindo um recibo.

### Interface Autenticável
1. Crie uma interface chamada Autenticavel com os seguintes métodos:
    - login(String usuario, String senha): Verifica se o login e a senha estão corretos.
    - logout(): Faz o logout do usuário.
2. Implemente essa interface na classe SistemaDeSeguranca. Nessa classe:
    - Defina os valores de um login e senha corretos, como "admin" e "1234".
3. No método login(), implemente a lógica para verificar se o usuário e senha inseridos correspondem aos valores corretos.
4. Se o login for bem-sucedido, armazene um valor booleano que indica se o usuário está autenticado ou não.

**Tarefa**: Crie uma classe de teste que peça ao usuário para inserir o nome de usuário e senha. Se o login estiver correto, o sistema deverá exibir uma mensagem de boas-vindas. Caso contrário, deverá pedir para tentar novamente até acertar. O sistema também deve permitir fazer o logout.