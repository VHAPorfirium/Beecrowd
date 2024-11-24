import java.util.Scanner;

public class Consumo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        double Y = sc.nextDouble();

        double media = X / Y;

        System.out.printf("%.3f km/l\n", media);

        sc.close();
    }
}
