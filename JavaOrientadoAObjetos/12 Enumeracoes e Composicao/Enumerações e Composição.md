>O objetivo deste capítulo é introduzir o uso de enumerações para representar conjuntos de constantes de forma legível e a composição como um padrão de design para construir relações "tem-um" ou "tem-vários" entre objetos, promovendo a organização e o reuso de código.

### **1. Enumerações**

**Conceito:** É um tipo especial de dado que permite especificar, de forma literal, um conjunto de constantes relacionadas. Elas garantem melhor semântica ao código, tornando-o mais legível e permitindo que o compilador auxilie na verificação dos valores.

**Sintaxe Java:**

```java
public enum NomeDaEnum {
    VALOR1,
    VALOR2,
    VALOR3;
}
```

**Exemplo Prático:** Definição dos estados de um pedido em um sistema:

```java
public enum OrderStatus {
    PENDING_PAYMENT,
    PROCESSING,
    SHIPPED,
    DELIVERED;
}
```

Uso em uma classe:

```java
public class Order {
    private OrderStatus status; // Atributo do tipo enum
}
```

**Observações e Boas Práticas:**

- **Conversão de String para Enum:** É possível converter um texto no valor correspondente da enumeração usando `valueOf`.
    - Sintaxe: `OrderStatus os = OrderStatus.valueOf("DELIVERED");`.
- Na notação UML, as enumerações são identificadas pela tag `<<enum>>`.


### **2. Design e Categorias de Classes**

**Conceito:** Em sistemas orientados a objetos, as classes são organizadas em categorias para melhorar a flexibilidade e a delegação de responsabilidades.

- **Entities:** Objetos que representam dados do negócio (ex: Pedido, Cliente).
- **Services:** Classes que processam lógicas e regras de negócio.
- **Repositories:** Classes responsáveis pelo acesso a dados (banco de dados).
- **Views e Controllers:** Camadas de interface com o usuário e controle do fluxo.

### **3. Composição**

**Conceito:** É um tipo de associação entre classes onde um objeto contém um ou mais objetos de outros tipos. Representa uma relação do tipo **"tem-um"** ou **"tem-vários"**. Suas principais vantagens são a coesão (cada classe foca em uma parte do problema) e a facilidade de manutenção.

**Sintaxe Java:** A composição é implementada declarando objetos de outras classes como atributos.

```java
public class ClassePrincipal {
    private OutraClasse objetoUnico; // Tem-um
    private List<OutraClasse> listaDeObjetos = new ArrayList<>(); // Tem-vários
}
```

**Exemplo Prático (Trabalhador e Contratos):** Um trabalhador tem um departamento (relação 1 para 1) e possui vários contratos de hora (relação 1 para N).

```java
public class Worker {
    private String name;
    private Department department; // Composição "tem-um"
    private List<HourContract> contracts = new ArrayList<>(); // Composição "tem-vários"

    public void addContract(HourContract contract) {
        contracts.add(contract); // Método para gerenciar a composição
    }
}
```

**Observações:** Embora o símbolo UML estrito para composição seja o diamante preto, o termo é usado de forma geral para qualquer associação onde uma classe utiliza outra como parte de sua estrutura.

### **4. Demonstração de StringBuilder**

**Conceito:** Em situações de composição onde um objeto precisa gerar uma representação textual complexa (como um post com vários comentários), o uso do **StringBuilder** é recomendado por ser muito mais performático do que a concatenação comum de Strings.

**Sintaxe Java:**

```java
StringBuilder sb = new StringBuilder();
sb.append("Texto");
sb.append(variavel);
return sb.toString();
```

**Exemplo Prático (Post e Comentários):**

```java
public class Post {
    private List<Comment> comments = new ArrayList<>();

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(title + "\n");
        for (Comment c : comments) {
            sb.append(c.getText() + "\n");
        }
        return sb.toString(); // Converte o buffer para String final
    }
}
```