import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListasOrdenadas {
    public static void main(String[] args) {
        // Criar uma lista vazia
        List<Integer> numeros = new ArrayList<>();

        // Adicionar elementos à lista
        numeros.add(5);
        numeros.add(2);
        numeros.add(8);
        numeros.add(1);

        // Ordenar a lista em ordem crescente
        Collections.sort(numeros);

        // Imprimir os elementos da lista
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}
