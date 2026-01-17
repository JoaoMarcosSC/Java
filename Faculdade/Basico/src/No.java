public class No {
    public static void main(String[] args) {
        // Criação de dois objetos Node
        Node no1 = new Node(5);
        Node no2 = new Node(9);

        // Atribuição do segundo nó como próximo do primeiro nó
        no1.next = no2;

        // Impressão dos valores dos nós e do próximo nó do no1
        System.out.println("no1: " + no1.data + ", no2 = " + no2.data);
        System.out.println(no1.next.data);
    }

    public static class Node {
        int data; // Armazena o valor do nó
        Node next; // Referência para o próximo nó

        public Node(int data) {
            this.data = data;
            this.next = null; // Inicialmente, não há próximo nó
        }
    }
}
