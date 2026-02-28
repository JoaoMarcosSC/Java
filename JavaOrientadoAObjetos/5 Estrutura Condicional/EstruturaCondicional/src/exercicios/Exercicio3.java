package exercicios;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        int x;
        int y;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();

        if (x % y == 0 || y % x == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }

    }
}
