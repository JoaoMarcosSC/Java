
### **1. Boxing, Unboxing e Wrapper Classes**

**Conceito:**

- **Boxing:** Conversão de um tipo valor para um tipo referência compatível.
- **Unboxing:** Conversão de um tipo referência para um tipo valor.
- **Wrapper Classes:** São classes equivalentes aos tipos primitivos (ex: `Integer` para `int`, `Double` para `double`) que permitem o uso de `null` e recursos de orientação a objetos.

**Sintaxe Java:**

```java
int x = 20;
Object obj = x; // Boxing
int y = (int) obj; // Unboxing
Integer xObj = 10; // Uso de Wrapper Class
```

### **2. Laço "for each"**

**Conceito:** Sintaxe simplificada para percorrer coleções (vetores ou listas) sem a necessidade de gerenciar índices manualmente.

**Sintaxe Java:** `for (Tipo apelido : colecao) { ... }`

**Exemplo Prático:**

```java
String[] vect = new String[] {"Maria", "Bob", "Alex"};
for (String obj : vect) {
    System.out.println(obj); // "Para cada objeto 'obj' em vect..."
}
```

### **3. Listas**

**Conceito:** Diferente dos vetores, as listas têm tamanho variável e permitem inserções e deleções fáceis. A lista inicia vazia e os elementos são alocados sob demanda (nós).

**Sintaxe Java:** `List<Tipo> list = new ArrayList<>();`

**Exemplo Prático (Operações Comuns):**

```java
list.add("Maria"); // Adiciona
list.add(2, "Marco"); // Adiciona em posição específica
list.remove("Anna"); // Remove por dado
list.remove(1); // Remove por posição
list.removeIf(x -> x.charAt(0) == 'M'); // Remove por predicado (Lambda)
System.out.println(list.indexOf("Bob")); // Encontra posição
```

**Observação:** Listas não aceitam tipos primitivos diretamente, devendo-se usar Wrapper Classes (ex: `List<Integer>`).

### **4. Matrizes**

**Conceito:** São arranjos bidimensionais ("vetores de vetores"), homogêneos e ordenados, ideais para representar tabelas ou grades.

**Sintaxe Java:** `tipo[][] nome = new tipo[linhas][colunas];`

**Exemplo Prático (Diagonal Principal):**

```java
int n = sc.nextInt();
int[][] mat = new int[n][n];
for (int i=0; i<n; i++) {
    for (int j=0; j<n; j++) {
        mat[i][j] = sc.nextInt(); // Preenchimento
    }
}
// Para acessar a diagonal principal: mat[i][i]
```

**Observação:** `mat.length` retorna a quantidade de linhas, enquanto `mat[i].length` retorna a quantidade de colunas da linha `i`.