import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int horasTrabalhadas = sc.nextInt();
        double valorPorHora = sc.nextDouble();

        double Salary = horasTrabalhadas * valorPorHora;

        System.out.println("NUMBER = " + number);
        System.out.printf("SALARY = U$ %.2f\n", Salary);

        sc.close();
    }
}
