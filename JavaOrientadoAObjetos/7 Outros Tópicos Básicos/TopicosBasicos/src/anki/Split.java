package anki;

import java.util.Arrays;

public class Split {
    public static void main(String[] args) {

        String s = "potato apple lemon";
        String[] vect = s.split(" ");

        System.out.println(Arrays.toString(vect));

    }
}
