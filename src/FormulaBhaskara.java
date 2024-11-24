import java.util.Scanner;

public class FormulaBhaskara {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if (a == 0) {
            System.out.println("Impossivel calcular");
        } else {
            double delta = Math.pow(b, 2) - 4 * a * c;

            if (delta < 0) {
                System.out.println("Impossivel calcular");
            } else {

                double r1 = (-b + Math.sqrt(delta)) / (2 * a);
                double r2 = (-b - Math.sqrt(delta)) / (2 * a);

                System.out.printf("R1 = %.5f\n", r1);
                System.out.printf("R2 = %.5f\n", r2);
            }
        }

        sc.close();
    }
}
