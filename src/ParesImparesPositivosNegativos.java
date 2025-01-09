import java.util.Scanner;

public class ParesImparesPositivosNegativos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] x = new int[5];
        int contadorPares = 0, contadorImpares = 0, contadorPositivos = 0, contadorNegativos = 0;

        for (int i = 0; i < 5; i++) {
            x[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {

            if (x[i] % 2 == 0) {
                contadorPares++;
            }
            else {
                contadorImpares++;
            }

            if (x[i] > 0) {
                contadorPositivos++;
            }
            else if (x[i] < 0) {
                contadorNegativos++;
            }
        }

        System.out.println(contadorPares + " valor(es) par(es)");
        System.out.println(contadorImpares + " valor(es) impar(es)");
        System.out.println(contadorPositivos + " valor(es) positivo(s)");
        System.out.println(contadorNegativos + " valor(es) negativo(s)");

        sc.close();
    }
}
