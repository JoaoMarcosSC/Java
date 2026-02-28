package exercicios;

import java.util.Scanner;

public class exercicio03 {

    public static void main(String[] args) {

        int A;
        int B;
        int C;
        int D;

        int x;

        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        x = A * B - C * D;

        System.out.println("Diferença = " + x);

        sc.close();
    }
}