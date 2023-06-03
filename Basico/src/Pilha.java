public class Pilha {
    public static void main(String[] args) {
        Stack s = new Stack();
        int i = 1; // Inicializa a variável i com o valor desejado

        for (s.push(i); s.top() != 10; i++) {
            int elemento = s.top();
            System.out.println(elemento);
            s.pop();
            s.push(elemento + 1);
        }
    }
}

class Stack {
    int elementos[];
    int topo;

    public Stack() {
        elementos = new int[10];
        topo = -1;
    }

    public void push(int e) {
        if (isFull()) {
            throw new RuntimeException("Stack Overflow");
        }
        topo++;
        elementos[topo] = e;
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Empty Stack");
        }
        int e = elementos[topo];
        topo--;
        return e;
    }

    public boolean isEmpty() {
        return (topo == -1);
    }

    public boolean isFull() {
        return (topo == 9);
    }

    public int top() {
        if (isEmpty()) {
            throw new RuntimeException("Empty Stack");
        }
        return elementos[topo];
    }
}
