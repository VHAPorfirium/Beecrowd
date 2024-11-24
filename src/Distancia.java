import java.util.Scanner;

public class Distancia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int distanciaRelativa = 2 * n;

        System.out.println(distanciaRelativa + " minutos");

        sc.close();
    }
}
