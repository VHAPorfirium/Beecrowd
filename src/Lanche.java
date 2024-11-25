import java.util.Scanner;

public class Lanche {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();

        if (codigo == 1) {
            double preco = 4.0;
            double total = preco * quantidade;
            System.out.printf("Total: R$ %.2f\n", total);
        }
        else if (codigo == 2) {
            double preco = 4.50;
            double total = preco * quantidade;
            System.out.printf("Total: R$ %.2f\n", total);
        }
        else if (codigo == 3) {
            double preco = 5.0;
            double total = preco * quantidade;
            System.out.printf("Total: R$ %.2f\n", total);
        }
        else if (codigo == 4) {
            double preco = 2.0;
            double total = preco * quantidade;
            System.out.printf("Total: R$ %.2f\n", total);
        }
        else if (codigo == 5) {
            double preco = 1.50;
            double total = preco * quantidade;
            System.out.printf("Total: R$ %.2f\n", total);
        }
    }
}
