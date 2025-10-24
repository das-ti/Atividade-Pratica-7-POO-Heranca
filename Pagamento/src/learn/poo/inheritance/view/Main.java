package learn.poo.inheritance.view;

import java.util.Scanner;
import learn.poo.inheritance.model.*;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.printf("Digite o valor total da compra: R$ ");
        double total = in.nextDouble();
        System.out.println();
        PagamentoCartao pc = new PagamentoCartao(total);
        System.out.println("R$ "+pc.emitirRecibo());

        PagamentoDinheiro pd = new PagamentoDinheiro(total);
        System.out.println("R$ "+pd.emitirRecibo());
        
        in.close();
    }
}
