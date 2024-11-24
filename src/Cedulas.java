import java.util.Scanner;

public class Cedulas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(n);

        int notas100 = n / 100;
        n %= 100;

        int notas50 = n / 50;
        n %= 50;

        int notas20 = n / 20;
        n %= 20;

        int notas10 = n / 10;
        n %= 10;

        int notas5 = n / 5;
        n %= 5;

        int notas2 = n / 2;
        n %= 2;

        int notas1 = n;

        System.out.printf("%d nota(s) de R$ 100,00\n", notas100);
        System.out.printf("%d nota(s) de R$ 50,00\n", notas50);
        System.out.printf("%d nota(s) de R$ 20,00\n", notas20);
        System.out.printf("%d nota(s) de R$ 10,00\n", notas10);
        System.out.printf("%d nota(s) de R$ 5,00\n", notas5);
        System.out.printf("%d nota(s) de R$ 2,00\n", notas2);
        System.out.printf("%d nota(s) de R$ 1,00\n", notas1);

        sc.close();
    }
}
