import java.util.Scanner;

public class ExercicioFor1 {
    public static void main(String[] args) {

        int x;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();

        for (int i=0; i<x; i++){
            if(i%2 != 0){
                System.out.println(i);
            }
        }

    }
}
