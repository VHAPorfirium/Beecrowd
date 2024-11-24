import java.util.Scanner;

public class NotasMoedas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valor = scanner.nextDouble();

        int totalCentavos = (int) Math.round(valor * 100);

        int notas100 = totalCentavos / 10000;
        totalCentavos %= 10000;

        int notas50 = totalCentavos / 5000;
        totalCentavos %= 5000;

        int notas20 = totalCentavos / 2000;
        totalCentavos %= 2000;

        int notas10 = totalCentavos / 1000;
        totalCentavos %= 1000;

        int notas5 = totalCentavos / 500;
        totalCentavos %= 500;

        int notas2 = totalCentavos / 200;
        totalCentavos %= 200;

        int moedas1 = totalCentavos / 100;
        totalCentavos %= 100;

        int moedas50 = totalCentavos / 50;
        totalCentavos %= 50;

        int moedas25 = totalCentavos / 25;
        totalCentavos %= 25;

        int moedas10 = totalCentavos / 10;
        totalCentavos %= 10;

        int moedas5 = totalCentavos / 5;
        totalCentavos %= 5;

        int moedas1cent = totalCentavos;

        System.out.println("NOTAS:");
        System.out.printf("%d nota(s) de R$ 100.00\n", notas100);
        System.out.printf("%d nota(s) de R$ 50.00\n", notas50);
        System.out.printf("%d nota(s) de R$ 20.00\n", notas20);
        System.out.printf("%d nota(s) de R$ 10.00\n", notas10);
        System.out.printf("%d nota(s) de R$ 5.00\n", notas5);
        System.out.printf("%d nota(s) de R$ 2.00\n", notas2);

        System.out.println("MOEDAS:");
        System.out.printf("%d moeda(s) de R$ 1.00\n", moedas1);
        System.out.printf("%d moeda(s) de R$ 0.50\n", moedas50);
        System.out.printf("%d moeda(s) de R$ 0.25\n", moedas25);
        System.out.printf("%d moeda(s) de R$ 0.10\n", moedas10);
        System.out.printf("%d moeda(s) de R$ 0.05\n", moedas5);
        System.out.printf("%d moeda(s) de R$ 0.01\n", moedas1cent);

        scanner.close();
    }
}
