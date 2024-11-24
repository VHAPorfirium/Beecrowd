import java.util.Scanner;

public class IdadeEmDias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();

        int ano = i / 365;
        int restoAno = i % 365;
        int mes = restoAno / 30;
        int dia = restoAno % 30;

        System.out.println(ano + " ano(s)");
        System.out.println(mes + " mes(es)");
        System.out.println(dia + " dia(s)");

        sc.close();
    }
}
