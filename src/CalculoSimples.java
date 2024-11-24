import java.util.Scanner;

public class CalculoSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codigoPeca1 = sc.nextInt();
        int numeroPeca1 = sc.nextInt();
        double valorPeca1 = sc.nextDouble();

        int codigoPeca2 = sc.nextInt();
        int numeroPeca2 = sc.nextInt();
        double valorPeca2 = sc.nextDouble();

        double valorTotal = ((valorPeca1 * numeroPeca1) + (valorPeca2 * numeroPeca2));

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorTotal);

        sc.close();
    }
}
