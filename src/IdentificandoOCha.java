import java.util.Scanner;

public class IdentificandoOCha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contadorDeRespostasCorretas = 0;

        int t = sc.nextInt();

        int r1 = sc.nextInt();
        int r2 = sc.nextInt();
        int r3 = sc.nextInt();
        int r4 = sc.nextInt();
        int r5 = sc.nextInt();

        if (r1 == t) {
            contadorDeRespostasCorretas++;
        }
        if (r2 == t) {
            contadorDeRespostasCorretas++;
        }
        if (r3 == t) {
            contadorDeRespostasCorretas++;
        }
        if (r4 == t) {
            contadorDeRespostasCorretas++;
        }
        if (r5 == t) {
            contadorDeRespostasCorretas++;
        }

        System.out.println(contadorDeRespostasCorretas);

        sc.close();
    }
}
