package anki;

import java.util.ArrayList;
import java.util.List;

public class ListOrElse {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        Integer resultado = list.stream() /*stream() transforma uma coleção (List, Set, etc.) em um fluxo de processamento de dados.*/
                            .filter(x -> x > 4) /* Para cada elemento x, retorne se ele é maior que 4. */
                            .findFirst() /* Acha somente o primeiro maior que 4 */
                            .orElse(null);

        System.out.println(resultado);

    }
}
