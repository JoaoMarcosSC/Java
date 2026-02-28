package anki;

public class formatoPrintf {
    public static void main(String[] args) {
        int id = 10;
        String nome = "João";
        double salario = 3500.756;

        System.out.printf("ID: %d | Nome: %s | Salario: R$ %.2f%n", id, nome, salario);
    }
}
