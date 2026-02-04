>O objetivo deste capítulo é introduzir o paradigma da **programação funcional** e o uso de **expressões lambda** para permitir o desenvolvimento de códigos mais concisos, expressivos e fáceis de manter, focando no "o quê" deve ser computado através de funções de primeira classe e processamento de dados em fluxos (Streams).

### **1. Uma Experiência com Comparator**

**Conceito:** Embora a interface `Comparable` permita comparar objetos, ela exige que a classe (ex: `Product`) seja alterada se o critério de comparação mudar, o que fere o princípio de código fechado para alteração. O uso do método `sort` da interface `List` com um objeto `Comparator` permite definir critérios de ordenação externos e flexíveis.

**Sintaxe Java:** `list.sort(Comparator<? super E> c);`

**Exemplo Prático:** Existem diversas formas de implementar o `Comparator`: como uma classe separada, classe anônima ou expressões lambda (com ou sem chaves, ou diretamente no argumento).

```java
// Comparator como expressão lambda no argumento
list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
```

### **2. Paradigmas de Programação**

**Conceito:** A programação funcional baseia-se no formalismo matemático do **Cálculo Lambda** (Church, 1930). Enquanto a programação imperativa foca em comandos ("como" descrever a computação), a funcional foca em expressões ("o que" deve ser computado).

**Comparativo:**

- **Imperativo:** Foca em comandos, possui fraca transparência referencial e objetos imutáveis são raros.
- **Funcional:** Foca em expressões, possui forte transparência referencial, objetos imutáveis são comuns e funções são objetos de primeira ordem.

### **3. Transparência Referencial**

**Conceito:** Uma função possui transparência referencial se seu resultado for sempre o mesmo para os mesmos dados de entrada, sem gerar efeitos colaterais. Isso traz simplicidade e previsibilidade ao código.

**Exemplo Prático (Função não transparente):** Uma função que depende de um valor global que pode ser alterado externamente não é referencialmente transparente.

```java
public static int globalValue = 3;
public static void changeOddValues(int[] numbers) {
    for (int i=0; i<numbers.length; i++) {
        if (numbers[i] % 2 != 0) numbers[i] += globalValue; // Depende de valor externo
    }
}
```

### **4. Funções como Objetos de Primeira Ordem**

**Conceito:** Significa que as funções podem ser passadas como parâmetros de métodos e retornadas como resultado de métodos. Em Java, utiliza-se o recurso de **Method References** para isso.

**Sintaxe Java (Method Reference):** `Classe::método`

**Exemplo Prático:**

```java
list.sort(Program::compareProducts); // Passando uma função como parâmetro
list.forEach(System.out::println); // Method reference para o println
```

### **5. Expressões Lambda**

**Conceito:** Em programação funcional, uma expressão lambda é uma **função anônima de primeira classe**. Elas permitem uma tipagem dinâmica com inferência de tipos e maior expressividade com código conciso.

**Sintaxe Java:** `(p1, p2) -> expressão;`

**Exemplo Prático:**

```java
// Comparação concisa de preços usando lambda
list.sort((p1, p2) -> p1.getPrice().compareTo(p2.getPrice()));
```

### **6. Interface Funcional**

**Conceito:** É uma interface que possui um **único método abstrato**. Suas implementações são tratadas como expressões lambda. Algumas interfaces funcionais comuns no Java incluem `Predicate`, `Consumer` e `Function`.

### **7. Predicate (Exemplo com removeIf)**

**Conceito:** Interface funcional cujo método `test` recebe um objeto e retorna um booleano. É muito utilizada para filtragem.

**Sintaxe Java:**

```java
public interface Predicate<T> {
    boolean test (T t);
}
```

**Exemplo Prático:** Remover produtos da lista cujo preço seja maior ou igual a 100:

```
list.removeIf(p -> p.getPrice() >= 100.0);
```

### **8. Consumer (Exemplo com forEach)**

**Conceito:** Interface funcional cujo método `accept` recebe um objeto e não retorna nada. Diferente de outras interfaces, o `Consumer` pode gerar efeitos colaterais (como alterar o estado de um objeto).

**Sintaxe Java:**

```java
public interface Consumer<T> {
    void accept (T t);
}
```

**Exemplo Prático:** Aumentar o preço de todos os produtos em 10%:

```java
list.forEach(p -> p.setPrice(p.getPrice() * 1.1));
```

### **9. Function (Exemplo com map)**

**Conceito:** Interface funcional cujo método `apply` recebe um objeto e retorna outro objeto (geralmente de tipo diferente). A função `map` utiliza esta interface para aplicar uma transformação a todos os elementos de uma stream.

**Sintaxe Java:**

```java
public interface Function<T, R> {
    R apply (T t);
}
```

**Exemplo Prático:** Gerar uma lista com os nomes dos produtos em caixa alta:

```java
List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
```

**Observação:** A função `map` opera em streams; para converter uma lista em stream usa-se `.stream()` e para converter de volta usa-se `.collect(Collectors.toList())`.

### **10. Criando Funções que Recebem Funções**

**Conceito:** É possível criar métodos próprios que aceitam interfaces funcionais como argumentos, permitindo que a lógica de filtragem ou cálculo seja injetada no momento da chamada.

**Exemplo Prático:** Somar os preços apenas dos produtos que atendem a um critério definido por um `Predicate`:

```java
public double filteredSum(List<Product> list, Predicate<Product> criteria) {
    double sum = 0.0;
    for (Product p : list) {
        if (criteria.test(p)) sum += p.getPrice();
    }
    return sum;
} // Chamada: service.filteredSum(list, p -> p.getName().charAt(0) == 'T');
```

### **11. Stream**

**Conceito:** É uma sequência de elementos de uma fonte de dados (coleção, array, E/S) que suporta operações agregadas.

- **Características:** É declarativa, adequada para processamento paralelo, sem efeitos colaterais, baseada em avaliação preguiçosa (_lazy evaluation_), acesso sequencial e uso único.

**Criação de Streams:** Pode ser criada via `stream()` em coleções, ou usando `Stream.of()`, `Stream.iterate()` e outros.

```java
Stream<Integer> st1 = list.stream();
Stream<String> st2 = Stream.of("Maria", "Alex", "Bob");
Stream<Integer> st3 = Stream.iterate(0, x -> x + 2); // Stream infinita limitada por limit()
```

### **12. Operações em Streams (Pipeline)**

**Conceito:** O processamento em streams ocorre em um **pipeline**, composto por zero ou mais operações intermediárias e uma operação terminal.

- **Operações Intermediárias:** Produzem novas streams e só executam quando uma terminal é invocada (ex: `filter`, `map`, `sorted`, `limit`, `distinct`).
- **Operações Terminais:** Produzem um objeto não-stream e encerram o processamento (ex: `forEach`, `toArray`, `reduce`, `collect`, `min`, `max`, `count`).

**Exemplo Prático de Pipeline:**

```java
int sum = list.stream()
              .filter(x -> x % 2 == 0) // Intermediária
              .map(x -> x * 10)        // Intermediária
              .reduce(0, (x, y) -> x + y); // Terminal
```

### **13. Exercício de Fixação: Manipulação de Dados**

**Conceito:** O uso prático de streams e lambdas permite ler dados de arquivos (ex: CSV), calcular médias, filtrar e ordenar resultados com poucas linhas de código.

**Exemplo Prático:** Mostrar o email dos funcionários com salário superior a um valor e a soma dos salários daqueles que começam com 'M':

```java
// Filtragem e ordenação de emails
List<String> emails = list.stream()
    .filter(p -> p.getSalary() > limit)
    .map(p -> p.getEmail())
    .sorted()
    .collect(Collectors.toList());

// Soma filtrada
double sum = list.stream()
    .filter(p -> p.getName().charAt(0) == 'M')
    .map(p -> p.getSalary())
    .reduce(0.0, (x, y) -> x + y);
```