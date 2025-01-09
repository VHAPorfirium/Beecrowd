import java.util.Scanner;

public class SomaDeImparesConsecutivos1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        int somaImpares = 0;

        if (x > y) {
            int temp = x;
            x = y;
            y = temp;
        }

        for (int i = x + 1; i < y; i++) {
            if (i % 2 != 0) {
                somaImpares += i;
            }
        }

        System.out.println(somaImpares);

        sc.close();
    }
}

