package learn.poo.inheritance.model;

public class Calculadora implements iOperacaoMatematica {

    public double somar(double a, double b) {
        return a + b;
    }

    public double subtrair(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b) {
        return a / b;
    }

    // public void calcular(double a, String o, double b) {
    //     String operador = o;
    //     switch (operador) {
    //         case "+":
    //             System.out.println(a + (o) + b + " = " + somar(a, b));
    //             break;
    //         case "-":
    //             System.out.println(a + (o) + b + " = " + subtrair(a, b));
    //             break;
    //         case "*":
    //             System.out.println(a + (o) + b + " = " + multiplicar(a, b));
    //             break;
    //         case "/":
    //             System.out.println(a + (o) + b + " = " + dividir(a, b));
    //             break;
    //         default:
    //             System.out.println("Opção inválida!");
    //     }
    // }
}
