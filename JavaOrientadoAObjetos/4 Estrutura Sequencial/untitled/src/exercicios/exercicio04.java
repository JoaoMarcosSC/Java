package exercicios;

import java.util.Scanner;

public class exercicio04 {

    public static void main(String[] args) {

        int number;
        int horas;
        float vph;

        float x;

        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        horas = sc.nextInt();
        vph = sc.nextFloat();

        x = horas * vph;

        System.out.println("Number = " + number);
        System.out.printf("Salary = U$ %.2f%n", x);

        sc.close();
    }
}