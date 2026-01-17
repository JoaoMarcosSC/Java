public class ExemploON {
    public static void main(String[] args) {
        // Declaração e inicialização de uma variável para a contagem
        int count = 0;

        // Loop que executa N vezes, onde N é o valor da variável 'n'
        int n = 10;
        for (int i = 0; i < n; i++) {
            // Operação de tempo constante (impressão)
            System.out.println("Contagem: " + count);

            // Incremento da contagem
            count++;
        }
    }
}

//Em um algoritmo com complexidade O(N), a quantidade de operações executadas é diretamente proporcional ao valor de N.
// Por exemplo, se tivermos um loop que percorre um array de N elementos, o número de iterações do loop será igual a N.
// Portanto, o tempo de execução será proporcional a N.
