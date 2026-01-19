package exercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Rectangle r = new Rectangle();

        r.width = sc.nextInt();
        r.height = sc.nextInt();

        System.out.println("AREA = " + r.Area());
        System.out.println("PERIMETER = " + r.Perimeter());
        System.out.println("DIAGONAL = " + r.Diagonal());

    }
}
