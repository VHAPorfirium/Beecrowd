import java.util.Scanner;

public class PositivosEMedias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] X = new double[6];
        double media = 0, valoresPositivos = 0;
        int contadorPositivos = 0;

        for (int i = 0; i < 6; i++) {
            X[i] = sc.nextDouble();
        }

        for (int i = 0; i < 6; i++) {

            if (X[i] > 0) {
                valoresPositivos = valoresPositivos + X[i];
            }

            if (X[i] > 0) {
                contadorPositivos++;
                media = valoresPositivos / contadorPositivos;
            }

        }

        System.out.println(contadorPositivos + " valores positivos");
        System.out.printf("%.1f%n",media);

        sc.close();
    }
}
