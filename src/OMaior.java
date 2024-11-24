import java.util.Scanner;
import static java.lang.Math.abs;

public class OMaior {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int resultado = ((A + B + abs(A - B))) / 2;

        System.out.println(Math.max(resultado, C) + " eh o maior");

        sc.close();
    }
}
