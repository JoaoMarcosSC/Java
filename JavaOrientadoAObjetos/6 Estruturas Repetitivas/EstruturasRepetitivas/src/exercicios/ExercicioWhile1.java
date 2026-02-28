package exercicios;

import java.util.Scanner;

public class ExercicioWhile1 {
    public static void main(String[] args) {

        String x;
        String s = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Crie sua senha");
        x = sc.next();

        while (!x.equals(s)) {
            System.out.println("Digite sua senha");
            s = sc.next();

            if (!x.equals(s)) {
                System.out.println("Senha incorreta");
            }
        };

        System.out.println("Senha Correta");

    }
}