>O objetivo central deste capítulo é o domínio da Herança, que permite o reuso de atributos e métodos entre classes relacionadas, e do Polimorfismo, que permite que objetos de tipos diferentes sejam tratados de forma uniforme através de uma superclasse comum, executando comportamentos específicos em tempo de execução.

### **1. Herança**

**Conceito:** É uma associação que permite que uma classe (subclasse) herde todos os dados e comportamentos de outra (superclasse). Ela representa uma relação do tipo **"é-um"** e permite a **generalização** (superclasse) e a **especialização** (subclasse). A herança é uma associação entre classes, não entre objetos.

**Sintaxe Java:**

```java
class Subclasse extends Superclasse {
    // novos atributos e métodos
}
```

**Exemplo Prático:** Uma conta para empresas (`BusinessAccount`) possui todos os membros de uma conta comum (`Account`), mais um limite de empréstimo e uma operação específica para realizar esse empréstimo.

### **2. Modificador de acesso protected**

**Conceito:** O modificador **protected** torna um atributo ou método acessível dentro do mesmo pacote e também por subclasses, mesmo que estas estejam em pacotes diferentes.

**Exemplo Prático:** Para que o método `loan` da classe `BusinessAccount` possa alterar o saldo (`balance`) diretamente na lógica de empréstimo, o atributo `balance` na superclasse `Account` deve ser marcado como `protected`.

### **3. Upcasting e Downcasting**

**Conceito:**

- **Upcasting:** É o casting da subclasse para a superclasse, usado comumente para polimorfismo.
- **Downcasting:** É o casting da superclasse para a subclasse, necessário para acessar métodos específicos da classe filha. Recomenda-se o uso do operador **instanceof** para verificar o tipo antes de realizar a conversão e evitar erros.

**Sintaxe Java:**

```java
// Upcasting
Account acc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

// Downcasting
if (acc instanceof BusinessAccount) {
    BusinessAccount acc4 = (BusinessAccount)acc;
    acc4.loan(100.0);
}
```

### **4. Sobreposição, palavra super e @Override**

**Conceito:** A **sobreposição** (ou sobrescrita) consiste em implementar na subclasse um método que já existe na superclasse para alterar seu comportamento. A anotação **@Override** informa ao compilador que se trata de uma sobrescrita, facilitando a leitura. A palavra **super** permite chamar a implementação original da superclasse dentro do método sobreposto ou em construtores.

**Exemplo Prático:** Na classe `Account`, o método `withdraw` cobra uma taxa de 5.0. Na `SavingsAccount` (conta poupança), o método é sobreposto para não cobrar taxa. Na `BusinessAccount`, utiliza-se `super.withdraw(amount)` e desconta-se uma taxa adicional de 2.0.

### **5. Classes e métodos final**

**Conceito:** A palavra-chave **final** evita que uma classe seja herdada ou que um método seja sobreposto. Isso é usado por razões de **segurança** (garantir regras de negócio imutáveis) ou **performance** (objetos final são analisados mais rápido em tempo de execução).

**Sintaxe Java:**

```java
public final class SavingsAccount { ... } // Classe não pode ter filhas
public final void withdraw(double amount) { ... } // Método não pode ser sobreposto
```

### **6. Polimorfismo**

**Conceito:** Recurso que permite que variáveis de um tipo genérico (superclasse) apontem para objetos de tipos específicos diferentes, apresentando comportamentos distintos conforme o objeto real. A associação do tipo específico ocorre em tempo de execução através do **upcasting**.

**Exemplo Prático:** Ao criar duas variáveis do tipo `Account`, onde uma aponta para `Account` comum e outra para `SavingsAccount`, ao chamar `withdraw(50.0)` em ambas, o Java executará a lógica de desconto de taxa na primeira e a lógica sem taxa na segunda, dependendo da instância.

### **7. Classes Abstratas**

**Conceito:** São classes que **não podem ser instanciadas**, servindo apenas como base para herança. Elas garantem que apenas as especializações (subclasses) existam como objetos no sistema. Em UML, o nome da classe aparece em itálico.

**Sintaxe Java:**

```java
public abstract class Account { ... }
```

**Observação:** Mesmo não podendo ser instanciadas, classes abstratas permitem o reuso de código e o uso de polimorfismo ao tratar coleções de forma uniforme.

### **8. Métodos Abstratos**

**Conceito:** São métodos que não possuem implementação na classe pai, pois a classe é genérica demais para definir aquela lógica. Se uma classe possui pelo menos um método abstrato, a própria classe **deve** ser abstrata.

**Sintaxe Java:**

```java
public abstract double area();
```

**Exemplo Prático:** Uma classe `Shape` (Forma) possui o método abstrato `area()`. As subclasses `Rectangle` e `Circle` são obrigadas a implementar suas próprias fórmulas de cálculo de área.