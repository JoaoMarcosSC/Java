public class Fila {

    private int[] valores;  // Array para armazenar os valores da fila
    private int primeiro;   // Índice do primeiro elemento na fila
    private int ultimo;     // Índice do último elemento na fila
    private int total;      // Total de elementos na fila

    public Fila() {
        valores = new int[10];  // Inicializa o array com capacidade para 10 elementos
        primeiro = 0;           // Inicializa o índice do primeiro elemento como 0
        ultimo = 0;             // Inicializa o índice do último elemento como 0
        total = 0;              // Inicializa o total de elementos como 0
    }

    public void inserir(int elemento) {
        if (isFull()) {
            throw new RuntimeException("Fila cheia");
        } else {
            valores[ultimo] = elemento;                  // Insere o elemento no final da fila
            ultimo = (ultimo + 1) % valores.length;       // Atualiza o índice do último elemento considerando o tamanho do array
            total++;                                     // Incrementa o total de elementos na fila
        }
    }

    public int retirar() {
        if (isEmpty()) {
            throw new RuntimeException("Fila vazia");
        }
        int elemento = valores[primeiro];               // Obtém o elemento no início da fila
        primeiro = (primeiro + 1) % valores.length;     // Atualiza o índice do primeiro elemento considerando o tamanho do array
        total--;                                       // Decrementa o total de elementos na fila
        return elemento;
    }

    public boolean isEmpty() {
        return total == 0;  // Retorna verdadeiro se a fila estiver vazia, caso contrário, retorna falso
    }

    public boolean isFull() {
        return total == valores.length;  // Retorna verdadeiro se a fila estiver cheia, caso contrário, retorna falso
    }

}

class TestaFila {
    public static void main(String[] args) {
        Fila fila = new Fila();
        fila.inserir(1);
        fila.inserir(2);
        fila.inserir(3);

        while (!fila.isEmpty()) {
            int x = fila.retirar();
            System.out.println("Retirei o elemento " + x);
        }
    }
}
