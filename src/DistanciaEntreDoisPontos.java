import java.util.Scanner;

public class DistanciaEntreDoisPontos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double X1, X2, Y1, Y2;

        X1 = sc.nextDouble();
        Y1 = sc.nextDouble();
        X2 = sc.nextDouble();
        Y2 = sc.nextDouble();

        double distancia = Math.sqrt(Math.pow(X2 - X1, 2) + Math.pow(Y2 - Y1, 2));

        System.out.printf("%.4f\n", distancia);

        sc.close();
    }
}
