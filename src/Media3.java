import java.util.Scanner;

public class Media3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double N1 = sc.nextDouble();
        double N2 = sc.nextDouble();
        double N3 = sc.nextDouble();
        double N4 = sc.nextDouble();

        double media = ((N1 * 2) + (N2 * 3) + (N3 * 4) + (N4 * 1)) / 10;

        System.out.printf("Media: %.1f\n", Math.floor(media * 10) / 10);

        if (media >= 7) {
            System.out.println("Aluno aprovado.");
        }
        else if (media < 5) {
            System.out.println("Aluno reprovado.");
        }
        else {
            System.out.println("Aluno em exame.");

            double N5 = sc.nextDouble();

            System.out.printf("Nota do exame: %.1f\n", N5);

            double NovaMedia = (media + N5) / 2;

            if (NovaMedia >= 5) {
                System.out.println("Aluno aprovado.");
                System.out.printf("Media final: %.1f\n", NovaMedia);
            }
            else if (NovaMedia < 5) {
                System.out.println("Aluno reprovado.");
            }
        }
    }
}
