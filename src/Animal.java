import java.util.Scanner;

public class Animal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String tipo1 = sc.nextLine();
        String tipo2 = sc.nextLine();
        String tipo3 = sc.nextLine();

        String animal = "";

        if (tipo1.equals("vertebrado")) {
            if (tipo2.equals("ave")) {
                if (tipo3.equals("carnivoro")) {
                    animal = "aguia";
                }
                if (tipo3.equals("onivoro")) {
                    animal = "pomba";
                }
            }
            if (tipo2.equals("mamifero")) {
                if (tipo3.equals("onivoro")) {
                    animal = "homem";
                }
                if (tipo3.equals("herbivoro")) {
                    animal = "vaca";
                }
            }
        }
        else if (tipo1.equals("invertebrado")) {
            if (tipo2.equals("inseto")) {
                if (tipo3.equals("hematofago")) {
                    animal = "pulga";
                }
                if (tipo3.equals("herbivoro")) {
                    animal = "lagarta";
                }
            }
            if (tipo2.equals("anelideo")) {
                if (tipo3.equals("hematofago")) {
                    animal = "sanguessuga";
                }
                if (tipo3.equals("onivoro")) {
                    animal = "minhoca";
                }
            }
        }

        System.out.println(animal);
    }
}
