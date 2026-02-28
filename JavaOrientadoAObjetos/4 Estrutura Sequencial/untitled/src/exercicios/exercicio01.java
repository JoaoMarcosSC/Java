package exercicios;

import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z;

        z = x + y;

        System.out.println("SOMA = " + z);

        sc.close();

    }
}