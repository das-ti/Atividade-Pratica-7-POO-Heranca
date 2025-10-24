### Interface Autenticável
1. Crie uma interface chamada Autenticavel com os seguintes métodos:
    - login(String usuario, String senha): Verifica se o login e a senha estão corretos.
    - logout(): Faz o logout do usuário.
2. Implemente essa interface na classe SistemaDeSeguranca. Nessa classe:
    - Defina os valores de um login e senha corretos, como "admin" e "1234".
3. No método login(), implemente a lógica para verificar se o usuário e senha inseridos correspondem aos valores corretos.
4. Se o login for bem-sucedido, armazene um valor booleano que indica se o usuário está autenticado ou não.

**Tarefa**: Crie uma classe de teste que peça ao usuário para inserir o nome de usuário e senha. Se o login estiver correto, o sistema deverá exibir uma mensagem de boas-vindas. Caso contrário, deverá pedir para tentar novamente até acertar. O sistema também deve permitir fazer o logout.