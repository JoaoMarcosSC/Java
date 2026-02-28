package anki;

import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char resp;
        do {
            resp = sc.next().charAt(0);
        } while (resp != 'n');

        sc.close();
    }
}
