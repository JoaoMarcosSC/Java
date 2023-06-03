public class Pilha {
    public static void main(String[] args) {
        Stack s = new Stack();
        int i = 1; // Inicializa a variável i com o valor desejado

        // Loop para imprimir valores da pilha até o topo atingir 10
        for (s.push(i); s.top() != 10; i++) {
            int elemento = s.top();
            System.out.println(elemento); // Imprime o elemento do topo
            s.pop(); // Remove o elemento do topo da pilha
            s.push(elemento + 1); // Adiciona o próximo elemento à pilha
        }
    }
}

class Stack {
    int elementos[];
    int topo;

    public Stack() {
        elementos = new int[10]; // Inicializa o array de elementos com tamanho 10
        topo = -1; // Define o topo da pilha como -1, indicando que está vazia
    }

    public void push(int e) {
        if (isFull()) {
            throw new RuntimeException("Stack Overflow"); // Lança exceção se a pilha estiver cheia
        }
        topo++; // Incrementa o topo
        elementos[topo] = e; // Adiciona o elemento no topo da pilha
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Empty Stack"); // Lança exceção se a pilha estiver vazia
        }
        int e = elementos[topo]; // Armazena o elemento do topo em uma variável
        topo--; // Decrementa o topo
        return e; // Retorna o elemento removido
    }

    public boolean isEmpty() {
        return (topo == -1); // Verifica se o topo está igual a -1, indicando que a pilha está vazia
    }

    public boolean isFull() {
        return (topo == 9); // Verifica se o topo está igual a 9, indicando que a pilha está cheia
    }

    public int top() {
        if (isEmpty()) {
            throw new RuntimeException("Empty Stack"); // Lança exceção se a pilha estiver vazia
        }
        return elementos[topo]; // Retorna o elemento do topo da pilha
    }
}
