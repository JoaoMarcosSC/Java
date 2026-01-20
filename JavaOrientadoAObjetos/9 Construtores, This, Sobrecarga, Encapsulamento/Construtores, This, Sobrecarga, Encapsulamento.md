>O objetivo deste capítulo é aprofundar o controle sobre a **instanciação e integridade dos objetos**, permitindo que o desenvolvedor obrigue a iniciação de valores, ofereça múltiplas formas de criar um objeto e proteja os dados internos contra acessos indevidos por meio do encapsulamento.


### **1. Construtores**

**Conceito:** O construtor é uma **operação especial** da classe executada no exato momento da instanciação de um objeto (usando o comando `new`). Ele é utilizado principalmente para iniciar os valores dos atributos e permitir ou obrigar que o objeto receba dados essenciais já no início (injeção de dependência). Se um construtor customizado não for criado, o Java disponibiliza automaticamente um **construtor padrão** sem parâmetros.

**Sintaxe Java:**

```java
public NomeDaClasse(tipo parametro1, tipo parametro2) {
    this.atributo1 = parametro1;
    this.atributo2 = parametro2;
}
```

**Exemplo Prático:** Para evitar que existam produtos sem nome ou preço na memória, cria-se um construtor que obriga esses dados:

```java
public class Product {
    public String name;
    public double price;
    public int quantity;

    // Construtor customizado
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
}

// Na classe principal:
Product product = new Product(name, price, quantity);
```

**Observações:** O uso de construtores evita que o objeto fique em um estado "vazio" ou inconsistente, como um produto sem nome ou com preço nulo na memória RAM.

### **2. Palavra this**

**Conceito:** É uma **referência para o próprio objeto**. Seus usos mais comuns incluem diferenciar atributos de variáveis locais (quando possuem o mesmo nome) e passar o próprio objeto como argumento na chamada de outro método ou construtor.

**Sintaxe Java:** `this.atributo = variavelLocal;`

**Exemplo Prático:**

```java
public Product(String name, double price) {
    this.name = name;  // "this.name" é o atributo, "name" é o parâmetro
    this.price = price;
}
```

Também pode ser usado para passar a instância atual para outra classe: `placeNewPiece('e', 1, new King(board, Color.WHITE, this));`

### **3. Sobrecarga**

**Conceito:** É um recurso que permite que uma classe ofereça **mais de uma operação com o mesmo nome**, desde que as listas de parâmetros sejam diferentes. Isso permite criar diferentes formas de inicializar um objeto.

**Sintaxe Java:** Definição de múltiplos construtores ou métodos com assinaturas distintas na mesma classe.

**Exemplo Prático:** Criação de um construtor opcional onde a quantidade em estoque começa como zero por padrão:

```java
public class Product {
    // Construtor padrão (opcional)
    public Product() { }

    // Construtor completo
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Sobrecarga: Construtor que recebe apenas nome e preço
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        // quantity recebe 0 por padrão
    }
}
```

### **4. Encapsulamento**

**Conceito:** É o princípio de **esconder detalhes de implementação** de uma classe, expondo apenas operações seguras. A "regra de ouro" é que a própria classe deve garantir que o objeto esteja sempre em um estado consistente, não permitindo que atributos sejam alterados livremente de fora.

**Sintaxe Java:** Uso do modificador `private` nos atributos e criação de métodos `get` (para leitura) e `set` (para alteração).

**Exemplo Prático:**

```java
public class Product {
    private String name; // Atributo privado
    private double price;

    public String getName() { // Getter
        return name;
    }

    public void setName(String name) { // Setter
        this.name = name;
    }
}
```

**Boas Práticas:**

- Siga o **Padrão JavaBeans**, que dita como getters e setters devem ser nomeados.
- Atributos como "quantidade" ou "saldo" muitas vezes não devem ter um método `set` direto para evitar alterações inconsistentes; o valor deve mudar apenas através de métodos de negócio como `addProducts` ou `deposit`.
- No Eclipse, é possível gerar esses métodos automaticamente via `Source -> Generate Getters and Setters`.

### **5. Modificadores de Acesso**

**Conceito:** Definem o nível de visibilidade de um membro (atributo ou método) para outras classes.

**Tipos de Modificadores:**

- **private:** O membro só pode ser acessado na **própria classe**.
- **(nada/package):** O membro só é acessível por classes do **mesmo pacote**.
- **protected:** Acessível no mesmo pacote e também por **subclasses** de pacotes diferentes.
- **public:** Acessível por **todas as classes**, a menos que o pacote não seja exportado em um sistema de módulos.