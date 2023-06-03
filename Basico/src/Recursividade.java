public class Recursividade {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 3;

        int resultado = multiplicacaoRecursiva(num1, num2);
        System.out.println("Resultado: " + resultado);
    }

    public static int multiplicacaoRecursiva(int num1, int num2) {
        // Multiplicação  por 0 é igual a 0
        if (num1 == 0 || num2 == 0) {
            return 0;
        }
        // Caso base, onde a recursão para
        else if (num2 == 1) {
            return num1;
        }
        // Multiplicando através da soma com recursividade
        else {
            return num1 + multiplicacaoRecursiva(num1, num2 - 1);
        }
    }
}
