import java.util.Scanner;

public class TDARacional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < N; i++) {

            int N1 = sc.nextInt();
            sc.next();
            int D1 = sc.nextInt();
            String operador = sc.next();
            int N2 = sc.nextInt();
            sc.next();
            int D2 = sc.nextInt();

            int resultadoNumerador = 0;
            int resultadoDenominador = 0;

            switch (operador) {
                case "+":
                    resultadoNumerador = N1 * D2 + N2 * D1;
                    resultadoDenominador = D1 * D2;
                    break;

                case "-":
                    resultadoNumerador = N1 * D2 - N2 * D1;
                    resultadoDenominador = D1 * D2;
                    break;

                case "*":
                    resultadoNumerador = N1 * N2;
                    resultadoDenominador = D1 * D2;
                    break;

                case "/":
                    resultadoNumerador = N1 * D2;
                    resultadoDenominador = N2 * D1;
                    break;

                default:
                    System.out.println("Operador inválido!");
                    return;
            }

            int a = Math.abs(resultadoNumerador);
            int b = Math.abs(resultadoDenominador);
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            int mdc = a;

            resultadoNumerador /= mdc;
            resultadoDenominador /= mdc;

            if (resultadoDenominador < 0) {
                resultadoNumerador = -resultadoNumerador;
                resultadoDenominador = -resultadoDenominador;
            }

            String resultadoOriginal = (resultadoNumerador * mdc) + "/" + (resultadoDenominador * mdc);

            String resultadoSimplificado = resultadoNumerador + "/" + resultadoDenominador;

            System.out.println(resultadoOriginal + " = " + resultadoSimplificado);
        }

        sc.close();
    }
}
