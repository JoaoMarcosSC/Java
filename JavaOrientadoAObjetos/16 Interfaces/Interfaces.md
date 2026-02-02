>A **Interface** é um tipo que define um conjunto de operações que uma classe é obrigada a implementar, estabelecendo um **contrato** entre o sistema e o fornecedor do serviço. Seu objetivo principal é criar sistemas com **baixo acoplamento** e alta flexibilidade, garantindo que a classe dependente não precise conhecer a implementação concreta de suas dependências.

### **1. Definição e Propósito**

**Conceito:** A interface define o "o que" um objeto deve fazer, mas não "como". Ela é utilizada para padronizar comportamentos e permitir que diferentes classes cumpram o mesmo papel no sistema.

**Sintaxe Java:**

```java
public interface NomeDaInterface {
    tipoRetorno nomeMetodo(parametros);
}
```

**Exemplo Prático:** Uma interface `Shape` que obriga qualquer forma geométrica a ter métodos para calcular área e perímetro:

```java
public interface Shape {
    double area();
    double perimeter();
}
```

### **2. Acoplamento e Injeção de Dependência**

**Conceito:**

- **Acoplamento Forte:** Ocorre quando uma classe conhece e instancia diretamente sua dependência concreta. Se a dependência mudar, a classe principal também deve ser alterada.
- **Acoplamento Fraco:** A classe conhece apenas a interface. Mudanças na implementação concreta não afetam a classe principal.
- **Inversão de Controle (IoC):** Padrão que retira da classe a responsabilidade de instanciar suas dependências.
- **Injeção de Dependência:** Forma de realizar IoC onde um componente externo instancia a dependência e a "injeta" no objeto pai, geralmente via construtor.

**Sintaxe Java (Injeção via Construtor):**

```java
public class RentalService {
    private TaxService taxService; // Interface

    public RentalService(TaxService taxService) {
        this.taxService = taxService;
    }
}
```

**Exemplo Prático:** No programa principal, injetamos a implementação específica desejada:

```java
RentalService rentalService = new RentalService(new BrazilTaxService());
```

### **3. Herdar vs. Cumprir Contrato**

**Conceito:** Embora interfaces e herança compartilhem aspectos como a relação "é-um", o uso de tipos genéricos e o polimorfismo, elas possuem focos diferentes. A **Herança** visa o reuso de estrutura e comportamento, enquanto a **Interface** visa garantir o cumprimento de um contrato de operações.

**Exemplo Prático:** Uma classe `AbstractShape` pode implementar a interface `Shape` para fornecer uma cor comum (reuso), enquanto as classes `Circle` e `Rectangle` herdam de `AbstractShape` para cumprir o contrato de área e perímetro de formas específicas.

### **4. Herança Múltipla e o Problema do Diamante**

**Conceito:** A herança múltipla de classes é proibida em Java para evitar a ambiguidade de métodos iguais vindos de superclasses diferentes (Problema do Diamante). No entanto, uma classe pode implementar **várias interfaces**. Isso não é herança múltipla, pois não há reuso de estado/estrutura, apenas o compromisso de implementar os métodos definidos em cada contrato.

**Exemplo Prático:** Um dispositivo `ComboDevice` que não herda de várias classes, mas implementa as interfaces `Scanner` e `Printer`:

```java
public class ComboDevice extends Device implements Scanner, Printer {
    @Override
    public void scan() { /* implementação */ }
    @Override
    public void print() { /* implementação */ }
}
```

### **5. Interface Comparable**

**Conceito:** É uma interface padrão do Java utilizada para permitir a ordenação de coleções de objetos. Ela define o método `compareTo`, que deve retornar um inteiro negativo, zero ou positivo se o objeto for menor, igual ou maior que o comparado.

**Sintaxe Java:**

```java
public interface Comparable<T> {
    int compareTo(T o);
}
```

**Exemplo Prático:** Ordenar uma lista de funcionários (`Employee`) por nome:

```java
public class Employee implements Comparable<Employee> {
    private String name;
    // ...
    @Override
    public int compareTo(Employee other) {
        return name.compareTo(other.getName());
    }
}
```

### **6. Default Methods (Defender Methods)**

**Conceito:** Introduzidos no Java 8, permitem que interfaces tenham métodos **concretos** (com implementação). O objetivo é prover uma implementação padrão para evitar repetição de código em todas as classes que implementam a interface e manter a retrocompatibilidade de sistemas existentes.

**Exemplo Prático:** Uma interface `InterestService` que define uma taxa de juros, mas já provê o cálculo padrão de juros compostos para qualquer serviço que a implemente:

```java
public interface InterestService {
    double getInterestRate();
    default double payment(double amount, int months) {
        return amount * Math.pow(1.0 + getInterestRate() / 100.0, months);
    }
}
```

**Observações Importantes:**

- Embora agora as interfaces permitam reuso via _default methods_, elas ainda diferem das classes abstratas por não poderem possuir atributos (estado) nem construtores.
- Caso uma classe implemente duas interfaces com assinaturas de _default methods_ idênticas, o compilador exigirá que o método seja sobrescrito na classe para resolver a ambiguidade.