import java.util.Random;

public class ArvoreBinaria {
    public static void main(String[] args) {
        // Cria um objeto Random para gerar valores aleatórios
        Random rand = new Random();
        // Cria uma instância da classe Arvore
        Arvore arvore = new Arvore();

        // Insere 10 valores aleatórios na árvore
        for (int i = 0; i < 10; i++) {
            // Gera um valor aleatório entre 0 e 99 e insere na árvore
            arvore.insert(rand.nextInt(100), arvore.root);
        }

        // Imprime a árvore em três ordens diferentes: pré-ordem, em ordem e pós-ordem
        System.out.println("\nPre-Order");
        arvore.preOrder(arvore.root);

        System.out.println("\nIn-Order");
        arvore.inOrder(arvore.root);

        System.out.println("\nPos-Order");
        arvore.posOrder(arvore.root);
    }
}

class Node {
    int info;         // Valor armazenado no nó
    Node left;        // Referência para o nó à esquerda
    Node right;       // Referência para o nó à direita

    Node(int info) {  // Construtor que recebe o valor do nó
        this.info = info;
        this.left = null;
        this.right = null;
    }
}


class Arvore {
    Node root = null;

    // Método para inserir um valor na árvore
    void insert(int info, Node place) {
        if (place == null) {
            // Se o lugar estiver vazio, cria um novo nó com o valor informado e o define como raiz
            System.out.print(" " + info);
            root = new Node(info);
        } else if (info < place.info) {
            // Se o valor for menor que o valor do lugar atual, verifica se o lugar à esquerda está vazio
            if (place.left == null) {
                // Se estiver vazio, cria um novo nó com o valor informado e o define como filho esquerdo do lugar atual
                System.out.print(" " + info);
                place.left = new Node(info);
            } else {
                // Se não estiver vazio, chama recursivamente o método insert para o lugar à esquerda
                insert(info, place.left);
            }
        } else if (info > place.info) {
            // Se o valor for maior que o valor do lugar atual, verifica se o lugar à direita está vazio
            if (place.right == null) {
                // Se estiver vazio, cria um novo nó com o valor informado e o define como filho direito do lugar atual
                System.out.print(" " + info);
                place.right = new Node(info);
            } else {
                // Se não estiver vazio, chama recursivamente o método insert para o lugar à direita
                insert(info, place.right);
            }
        }
    }

    // Método para percorrer a árvore em pré-ordem
    void preOrder(Node place) {
        System.out.print(" " + place.info);  // Imprime o valor do lugar atual
        if (place.left != null) {
            // Se houver um filho esquerdo, chama recursivamente o método preOrder para o filho esquerdo
            preOrder(place.left);
        }
        if (place.right != null) {
            // Se houver um filho direito, chama recursivamente o método preOrder para o filho direito
            preOrder(place.right);
        }
    }

    // Método para percorrer a árvore em ordem
    void inOrder(Node place) {
        System.out.print(" " + place.info);  // Imprime o valor do lugar atual
        if (place.right != null) {
            // Se houver um filho direito, chama recursivamente o método inOrder para o filho direito
            inOrder(place.right);
        }
    }

    // Método para percorrer a árvore em pós-ordem
    void posOrder(Node place) {
        if (place.left != null) {
            // Se houver um filho esquerdo, chama recursivamente o método posOrder para o filho esquerdo
            posOrder(place.left);
        }
        if (place.right != null) {
            // Se houver um filho direito, chama recursivamente o método posOrder para o filho direito
            posOrder(place.right);
        }
        System.out.print(" " + place.info);  // Imprime o valor do lugar atual
    }
}

