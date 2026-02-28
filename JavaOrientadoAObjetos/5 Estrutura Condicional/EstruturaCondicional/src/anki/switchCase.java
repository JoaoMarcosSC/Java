package anki;

public class switchCase {
    public static void main(String[] args) {
        int x = 2;
        String dia;
        switch (x) {
            case 1: dia = "domingo"; break;
            case 2: dia = "segunda"; break;
            case 3: dia = "terca"; break;
            default: dia = "invalido"; break;
        }
        System.out.println(dia);
    }
}
