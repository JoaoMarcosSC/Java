public class ExemploO1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        int resultado = a + b;

        System.out.println("Resultado: " + resultado);
    }
}
//Independentemente do valor de a e b, a adição será executada em tempo constante.
//Isso ocorre porque a adição é uma operação básica de processamento que pode ser executada em um único passo pelo processador,
//independentemente do tamanho dos números.
//Dessa forma, a complexidade do código como um todo é constante, pois não há loops ou iterações que dependam do tamanho
//dos dados de entrada. Portanto, podemos afirmar que esse trecho de código possui uma lógica Big O(1).
