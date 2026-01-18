import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {

        int x1;
        int y1;
        int z;
        Scanner x = new Scanner(System.in);
        Scanner y = new Scanner(System.in);

        x1 = x.nextInt();
        y1 = y.nextInt();

        z = x1 + y1;

        System.out.println("Soma = " + z);

        x.close();
        y.close();
}
}
