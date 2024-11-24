import java.util.Scanner;

public class ConversaoTempo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int segundos = n / 3600;
        int minutos = n % 3600 / 60;
        int horas = n % 60;
        System.out.println(segundos + ":" + minutos + ":" + horas);

        sc.close();
    }
}
