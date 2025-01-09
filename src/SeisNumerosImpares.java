import java.util.Scanner;

public class SeisNumerosImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int X = scanner.nextInt();

        int contador = 0;

        for (int i = X; contador < 6; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
                contador++;
            }
        }

        scanner.close();
    }
}
