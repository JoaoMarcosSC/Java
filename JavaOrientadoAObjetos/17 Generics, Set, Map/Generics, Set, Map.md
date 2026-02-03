>O objetivo deste capítulo é permitir que classes, interfaces e métodos sejam parametrizados por tipo através de **Generics**, garantindo reuso e segurança (type safety), além de introduzir coleções especializadas como **Set** (conjuntos sem repetições) e **Map** (pares chave/valor) para manipulação eficiente de dados,,.

### **1. Introdução aos Generics**

**Conceito:** Generics permitem que o tipo de dado seja passado como um parâmetro para classes ou métodos. Isso evita a necessidade de casting excessivo e previne erros de tipo em tempo de execução, oferecendo benefícios de **reuso, type safety e performance**,.

**Sintaxe Java:**

```java
List<String> list = new ArrayList<>();
public class PrintService<T> { ... }
```

**Exemplo Prático:** Um serviço de impressão que pode aceitar qualquer tipo (Integer, String, etc.) sem perder a segurança de tipos,:

```java
PrintService<Integer> ps = new PrintService<>();
ps.addValue(10);
Integer x = ps.first(); // Não precisa de casting
```

### **2. Generics Delimitados (Bounded Generics)**

**Conceito:** São utilizados quando queremos restringir os tipos que podem ser passados para um generic. Um uso comum é garantir que o tipo `T` implemente uma interface específica, como `Comparable`, para permitir comparações entre os elementos.

**Sintaxe Java:** `public static <T extends Comparable<T>> T max(List<T> list)`

**Exemplo Prático:** Um método para encontrar o maior elemento (o mais caro) em uma lista de produtos,:

```java
public static <T extends Comparable<? super T>> T max(List<T> list) {
    T max = list.get(0);
    for (T item : list) {
        if (item.compareTo(max) > 0) { max = item; }
    }
    return max;
}
```

### **3. Tipos Curinga (Wildcards)**

**Conceito:** Em Java, `List<Object>` não é o supertipo de `List<Integer>`. Para criar um supertipo genérico para qualquer lista, utiliza-se o tipo curinga `List<?>`. Métodos que usam curingas podem aceitar listas de qualquer tipo, mas possuem restrições de escrita,.

**Sintaxe Java:** `public static void printList(List<?> list)`

**Observações e Erros Comuns:**

- **Não é possível adicionar dados** a uma coleção de tipo curinga (ex: `list.add(3);` gera erro de compilação), pois o compilador não sabe qual é o tipo específico da lista instanciada,.


### **4. Curingas Delimitados (Princípio Get/Put)**

**Conceito:** Permitem restringir o curinga com limites superiores (`extends`) ou inferiores (`super`),.

- **Covariância (`extends`):** Permite leitura (get), mas proíbe escrita (put).
- **Contravariância (`super`):** Permite escrita (put), mas a leitura (get) retorna apenas `Object`.

**Exemplo Prático (Método Copy):** Copia elementos de uma lista de subtipos numéricos para uma lista mais genérica:

```java
public static void copy(List<? extends Number> source, List<? super Number> destiny) {
    for(Number number : source) {
        destiny.add(number); // Put permitido em 'super'
    }
}
```

### **5. hashCode e equals**

**Conceito:** São métodos da classe `Object` usados para comparar objetos.

- **equals:** Lento, mas 100% preciso na comparação de conteúdo.
- **hashCode:** Rápido, retorna um número inteiro; se os códigos forem diferentes, os objetos são garantidamente diferentes, mas códigos iguais podem indicar colisão (objetos diferentes com mesmo hash),.

**Boas Práticas:**

- Classes personalizadas devem sobrepor esses métodos para que coleções como `HashSet` e `HashMap` funcionem corretamente,.

### **6. Set**

**Conceito:** Representa um conjunto de elementos que **não admite repetições** e onde os elementos não possuem posição definida. Oferece operações rápidas de busca e remoção.

- **Implementações:**
    - **HashSet:** Mais rápido, mas não ordenado.
    - **TreeSet:** Mais lento, mas mantém os elementos ordenados (exige `Comparable`),.
    - **LinkedHashSet:** Velocidade intermediária, mantém a ordem de inserção.

**Exemplo Prático (Operações de Conjunto):**

```java
Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4));
Set<Integer> b = new TreeSet<>(Arrays.asList(4,5,6));
a.addAll(b);      // União:
a.retainAll(b);   // Interseção:
a.removeAll(b);   // Diferença:
```

### **7. Map<K, V>**

**Conceito:** É uma coleção de pares **chave/valor**, onde as chaves não podem se repetir. É ideal para modelos indexados por um identificador (como cookies ou estoque).

- **Implementações:** `HashMap` (rápido), `TreeMap` (ordenado pela chave) e `LinkedHashMap` (ordem de inserção),.

**Sintaxe e Métodos:**

```java
Map<String, String> cookies = new HashMap<>();
cookies.put("user", "maria"); // Adiciona ou sobrescreve
cookies.get("user");          // Recupera valor
cookies.containsKey("user");  // Verifica existência
```

**Exemplo Prático:** Contagem de votos onde o nome do candidato é a chave e a quantidade acumulada de votos é o valor,.