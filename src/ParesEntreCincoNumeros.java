import java.util.Scanner;

public class ParesEntreCincoNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];
        int contadorPares = 0;

        for (int i = 0; i < 5; i++) {
            numeros[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            if (numeros[i] % 2 == 0) {
                contadorPares++;
            }
        }

        System.out.println(contadorPares + " valores pares");

        sc.close();
    }
}
