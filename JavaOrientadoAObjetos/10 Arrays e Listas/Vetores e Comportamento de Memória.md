
>O objetivo deste capítulo é compreender como o Java gerencia a memória para diferentes tipos de dados (**Stack vs. Heap**), como utilizar estruturas de dados homogêneas fixas (**Vetores e Matrizes**) e dinâmicas (**Listas**)


### **1. Tipos Referência vs. Tipos Valor**

**Conceito:**

- **Classes são tipos referência:** Variáveis de classes são "ponteiros" (tentáculos) que apontam para um endereço na memória **Heap** onde o objeto realmente reside. Aceitam o valor `null`.
- **Tipos primitivos são tipos valor:** São "caixas" que armazenam o dado diretamente na memória **Stack**. Não aceitam `null`.

**Sintaxe Java:**

- **Referência:** `Product p1 = new Product("TV", 900.00);`
- **Valor:** `double x = 10.5;`

**Exemplo Prático:** Se `p2 = p1`, `p2` passa a apontar para o mesmo objeto que `p1`. Se `y = x`, `y` recebe apenas uma **cópia** do valor de `x`.

**Observações (Valores Padrão):** Ao alocar um tipo estruturado (classe ou array), seus elementos recebem valores padrão: números (0), boolean (false), char (código 0) e objetos (null).

### **2. Desalocação de Memória: Garbage Collector e Escopo**

**Conceito:**

- **Garbage Collector:** Monitora objetos alocados dinamicamente no **Heap** e desaloca automaticamente aqueles que não possuem mais referências apontando para eles.
- **Desalocação por Escopo:** Variáveis locais (tipos valor) são desalocadas imediatamente assim que o seu escopo de execução (como um método ou bloco `if`) é finalizado.

### **3. Vetores (Arrays) - Parte 1: Tipos Valor**

**Conceito:** Um vetor é uma estrutura de dados homogênea, ordenada e de tamanho fixo, alocada em um bloco contíguo de memória.

**Sintaxe Java:** `tipo[] nomeVetor = new tipo[tamanho];`

**Exemplo Prático (Média de Alturas):**

```java
int n = sc.nextInt();
double[] vect = new double[n]; // Instanciação do vetor
for (int i=0; i<n; i++) {
    vect[i] = sc.nextDouble(); // Acesso por posição
}
```

### **4. Vetores (Arrays) - Parte 2: Tipos Referência**

**Conceito:** Quando criamos um vetor de objetos, cada posição do vetor é um ponteiro que precisa ser instanciado individualmente para apontar para um objeto no Heap.

**Sintaxe Java:** `Classe[] vect = new Classe[n];`

**Exemplo Prático (Preço Médio de Produtos):**

```java
Product[] vect = new Product[n];
for (int i=0; i<vect.length; i++) {
    String name = sc.nextLine();
    double price = sc.nextDouble();
    vect[i] = new Product(name, price); // Instanciação de cada objeto do vetor
}
```

**Boa Prática:** Utilize a propriedade `vect.length` em vez de uma variável externa para percorrer o array.