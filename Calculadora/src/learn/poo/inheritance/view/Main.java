package learn.poo.inheritance.view;

import java.util.Scanner;
import learn.poo.inheritance.model.*;

public class Main{
    public static void main(String[] args) {
        
        Calculadora calc = new Calculadora();
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite primeiro número: ");
        double a = entrada.nextDouble();
        // System.out.print("Operador [+] [-] [*] [/]: ");
        // String operador = entrada.next(); 
        System.out.print("O segundo número: ");
        double b = entrada.nextDouble();
        
        //Exibindo resultado através dos métodos em contrato com a interface
        System.out.println("Resultado da soma: "+ calc.somar(a, b));
        System.out.println("Resultado da subtração: "+ calc.subtrair(a, b));
        System.out.println("Resultado da multiplicação: "+ calc.multiplicar(a, b));
        System.out.println("Resultado da divisão: "+ calc.dividir(a, b));
        System.out.println();

        // Opcional: Uso do método calcular para chamar um dos métodos de acordo com caractere da operação
        // calc.calcular(a, operador, b);

        entrada.close();
    }
}
