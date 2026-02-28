package exercicios;

import java.util.Scanner;

public class exercicio02 {

    public static void main(String[] args) {

        float x1;
        float pi = 3.14159F;
        float z;

        Scanner sc = new Scanner(System.in);
        x1 = sc.nextFloat();

        z = (float) (pi * Math.pow(x1, 2));

        System.out.println("Area = " + z);

        sc.close();
    }
}
