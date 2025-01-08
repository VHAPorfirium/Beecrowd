import java.util.Scanner;

public class BuscaNaInternet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int terceiroAClicar = sc.nextInt();

        int segundoAClicar = 2 * terceiroAClicar;

        int primeiroAClicar = 2 * segundoAClicar;

        System.out.println(primeiroAClicar);

        sc.close();
    }
}
