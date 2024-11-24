import java.util.Scanner;

public class Esfera {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int raio = sc.nextInt();
        double pi = 3.14159;

        double volume = (4.0 / 3.0) * pi * Math.pow(raio, 3);

        System.out.printf("VOLUME = %.3f\n", volume);

        sc.close();

    }
}
