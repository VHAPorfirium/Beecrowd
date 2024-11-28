import java.io.*;
import java.util.*;

public class Estiagem {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder();
        int numeroCidade = 1;

        while (true) {
            int n = Integer.parseInt(br.readLine().trim());
            if (n == 0) break;

            int[][] consumos = new int[n][2];
            int totalMoradores = 0;
            int totalConsumo = 0;

            for (int i = 0; i < n; i++) {
                String[] entrada = br.readLine().split(" ");
                int moradores = Integer.parseInt(entrada[0]);
                int consumo = Integer.parseInt(entrada[1]);

                totalMoradores += moradores;
                totalConsumo += consumo;

                consumos[i][0] = moradores;
                consumos[i][1] = consumo / moradores;
            }

            Arrays.sort(consumos, (a, b) -> {
                if (a[1] != b[1]) return Integer.compare(a[1], b[1]);
                return Integer.compare(a[0], b[0]);
            });

            output.append("Cidade# ").append(numeroCidade).append(":\n");

            for (int i = 0; i < n; i++) {
                if (i > 0) output.append(" ");
                output.append(consumos[i][0]).append("-").append(consumos[i][1]);
            }
            output.append("\n");

            double consumoMedio = (double) totalConsumo / totalMoradores;
            output.append(String.format("Consumo medio: %.2f m3.%n", consumoMedio));

            numeroCidade++;

            if (br.ready() && Integer.parseInt(br.readLine().trim()) != 0) {
                output.append("\n");
            } else {
                break;
            }
        }

        System.out.print(output.toString());
    }
}
