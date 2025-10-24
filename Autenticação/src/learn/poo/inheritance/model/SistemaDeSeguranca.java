package learn.poo.inheritance.model;

public class SistemaDeSeguranca implements IAutenticavel {

    private String usuario;
    private String senha;
    private boolean autenticado;

    public SistemaDeSeguranca() {
        this.usuario = "admin";
        this.senha = "1234";
        this.autenticado = false;
    }

    public String login(String usuario, String senha) {
        if (!this.autenticar()) {
            if (usuario.equals(this.usuario) && senha.equals(this.senha)) {
                this.autenticado = true;
                return "\nUsuário Logado.";
            }else{
                return "\nDados de login inválidos!\nTente novamente\n";              
            }
        }
        return "Status do login: "+ this.autenticado;
    }

    public String logout(String opcao) {
     if (this.autenticar()) {
            if(this.autenticado == true && opcao.equals("s")){
                this.autenticado = false;
                return "Usuário foi deslogado.";
            }
            else if (this.autenticado == true && opcao.equals("n")) {
                return "Usuário permanece logado!";
            }
            else{
                return "Usuário já estava deslogado!";
            }
        }
        return "Status do logout: "+ this.autenticado;
    }
    
    public boolean autenticar() {
        return autenticado;
    }
}
