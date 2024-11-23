import java.util.Scanner;

public class AreaDoCirculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double raio, area;
        final double n = 3.14159;

        raio = sc.nextDouble();

        area = n * Math.pow(raio, 2);

        System.out.printf("A=%.4f%n", area);

        sc.close();
    }
}

