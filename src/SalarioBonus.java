import java.util.Scanner;

public class SalarioBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome = sc.nextLine();
        double salario = sc.nextDouble();
        double totalVendas = sc.nextDouble();

        double total = salario + (totalVendas * 0.15);

        System.out.printf("TOTAL = R$ %.2f\n", total);

        sc.close();
    }
}
