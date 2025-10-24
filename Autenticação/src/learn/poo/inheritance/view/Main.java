package learn.poo.inheritance.view;

import java.util.Scanner;
import learn.poo.inheritance.model.SistemaDeSeguranca;

public class Main {
    public static void main(String[] args){
    SistemaDeSeguranca sgc = new SistemaDeSeguranca();

    Scanner in = new Scanner(System.in);
    System.out.println(" Login ");
    System.out.print("Usuário: ");
    String usuario = in.next();
    System.out.print("Senha: ");
    String senha = in.next();
    System.out.println(sgc.login(usuario, senha));
    
    System.out.println("\nFazer logout? [s] Sim, [n] Não");
    String opcao = in.next();
    System.out.println(sgc.logout(opcao));
    }
}
