import java.util.Scanner;

public class GastoDeCombustivel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tempo = sc.nextInt();
        int velocidadeMedia = sc.nextInt();

        double distancia = tempo * velocidadeMedia;

        double litros = distancia / 12;

        System.out.printf("%.3f\n", litros);

        sc.close();
    }
}
