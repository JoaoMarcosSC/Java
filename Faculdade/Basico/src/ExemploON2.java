public class ExemploON2 {
    public static void main(String[] args) {
        // Declaração e inicialização de um array com N elementos
        int[] array = {5, 2, 8, 3, 1};

        // Loop aninhado para comparar cada elemento do array com os outros elementos
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                // Operação de tempo constante (impressão)
                System.out.println(array[i] + " " + array[j]);
            }
        }
    }
}
//A complexidade desse código é O(N^2), o que significa que o tempo de execução aumenta quadraticamente em relação ao tamanho do problema.
// A cada iteração do primeiro loop, o segundo loop é executado N vezes, resultando em um total de N * N = N^2 iterações