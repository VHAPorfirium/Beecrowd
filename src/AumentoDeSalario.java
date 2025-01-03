import java.util.Scanner;

public class AumentoDeSalario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salario = sc.nextDouble();

        double novoSalario = 0;
        int percentual = 0;

        if (salario <= 400.00) {
            novoSalario = salario * 1.15;
            percentual = 15;
        }
        else if(salario <= 800.00 ){
            novoSalario = salario * 1.12;
            percentual = 12;
        }
        else if(salario <= 1200.00 ){
            novoSalario = salario * 1.10;
            percentual = 10;
        }
        else if(salario <= 2000.00 ){
            novoSalario = salario * 1.07;
            percentual = 7;
        }
        else {
            novoSalario = salario * 1.04;
            percentual = 4;
        }

        double reajuste = novoSalario - salario;

        System.out.printf("Novo salario: %.2f%n", novoSalario);
        System.out.printf("Reajuste ganho: %.2f%n", reajuste);
        System.out.println("Em percentual: " + percentual + " %");

        sc.close();
    }
}
