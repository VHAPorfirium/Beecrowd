import java.util.Scanner;

public class TempoDeJogoComMinutos  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horaInicial = sc.nextInt();
        int minutoInicial = sc.nextInt();
        int horaFinal = sc.nextInt();
        int minutoFinal = sc.nextInt();

        int inicioTotalMinutos = horaInicial * 60 + minutoInicial;
        int fimTotalMinutos = horaFinal * 60 + minutoFinal;

        int duracaoTotalMinutos;

        if (fimTotalMinutos > inicioTotalMinutos) {
            duracaoTotalMinutos = fimTotalMinutos - inicioTotalMinutos;
        } else {
            duracaoTotalMinutos = (24 * 60 - inicioTotalMinutos) + fimTotalMinutos;
        }

        int duracaoHoras = duracaoTotalMinutos / 60;
        int duracaoMinutos = duracaoTotalMinutos % 60;

        System.out.println("O JOGO DUROU " + duracaoHoras + " HORA(S) E " + duracaoMinutos + " MINUTO(S)");

        sc.close();
    }
}
