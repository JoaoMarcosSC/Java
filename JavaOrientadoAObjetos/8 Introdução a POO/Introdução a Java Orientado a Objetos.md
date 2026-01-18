>O objetivo principal deste capítulo é introduzir a **Programação Orientada a Objetos (POO)** como uma solução para organizar melhor o código, facilitar o reaproveitamento e delegar responsabilidades às entidades (classes), superando as limitações de se trabalhar apenas com variáveis soltas.

### **1. Resolvendo um problema sem orientação a objetos**

**Conceito:** Inicialmente, os problemas são resolvidos usando variáveis primitivas independentes para cada atributo de uma entidade. Isso gera código repetitivo e dificulta a manutenção, pois a lógica (como fórmulas matemáticas) precisa ser reescrita para cada nova instância dos dados.

**Sintaxe Java (Variáveis Primitivas):** `double xA, xB, xC, yA, yB, yC;`

**Exemplo Prático:** Ao calcular a área de dois triângulos (X e Y), o código repete a fórmula de Heron para cada um:

```java
double p = (xA + xB + xC) / 2.0;
double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

p = (yA + yB + yC) / 2.0;
double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
```

### **2. Criando uma classe com atributos**

**Conceito:** Uma **Classe** é um tipo estruturado que representa uma entidade do mundo real. Ela funciona como um "molde" que define quais dados (**Atributos**) e operações (**Métodos**) um objeto terá.

**Sintaxe Java:**

```java
public class NomeDaClasse {
    public tipo atributo1;
    public tipo atributo2;
}
```

**Exemplo Prático:** Criação da classe `Triangle` para representar um triângulo com três lados:

```java
package entities;
public class Triangle {
    public double a;
    public double b;
    public double c;
}
```

Para usar a classe, é necessário realizar a **instanciação** (alocação de memória): `Triangle x = new Triangle();`

**Observações:**

- O prefixo `public` indica que o atributo pode ser usado em outros arquivos.
- Objetos são instâncias da classe.

### **3. Criando um método para reaproveitamento e delegação**

**Conceito:** Um **Método** é uma função dentro da classe que executa uma operação sobre os seus atributos. Isso traz dois benefícios: **reaproveitamento**, pois elimina código repetido, e **delegação**, pois a própria classe torna-se responsável por sua lógica interna.

**Sintaxe Java:** `public tipoRetorno nomeMetodo(parametros) { corpo }`

**Exemplo Prático:** Adicionando o método `area()` à classe `Triangle`:

```java
public double area() {
    double p = (a + b + c) / 2.0;
    return Math.sqrt(p * (p - a) * (p - b) * (p - c));
}
```

Chamada do método no programa principal: `double areaX = x.area();`

### **4. Object e toString**

**Conceito:** Em Java, toda classe é uma subclasse da classe **Object**. A classe `Object` possui métodos padrão, como o `toString`, que converte um objeto para uma representação em texto (String). Ao sobrepor (customizar) este método, podemos controlar como o objeto é exibido ao ser impresso.

**Sintaxe Java:**

```java
public String toString() {
    return "Texto" + atributo;
}
```

**Exemplo Prático:** Na classe `Product`, o método `toString` formata os dados do produto para exibição:

```java
public String toString() {
    return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units";
}
```

Ao executar `System.out.println(product);`, o Java chama automaticamente o método `toString` customizado.

### **5. Membros Estáticos (static)**

**Conceito:** Também chamados de **membros de classe**, são atributos ou métodos que pertencem à classe em si e não a um objeto específico. Eles podem ser chamados diretamente pelo nome da classe, sem necessidade de instanciar um objeto (`new`). São comuns em classes utilitárias e para declaração de constantes.

**Sintaxe Java:** `public static final double PI = 3.14159;` (Constante) `public static tipo nomeMetodo() { ... }` (Método Estático)

**Exemplo Prático (Versão Final da Calculadora):**

```java
public class Calculator {
    public static final double PI = 3.14159;
    public static double circumference(double radius) {
        return 2.0 * PI * radius;
    }
}
```

Uso no programa principal: `double c = Calculator.circumference(radius);`

**Boas Práticas e Observações:**

- Nomes de constantes estáticas costumam ser escritos em **letras maiúsculas** com sublinhados.
- Dentro de um método estático, você **não pode** chamar membros de instância (que não sejam estáticos) da mesma classe.
- Uma classe que possui apenas membros estáticos geralmente não precisa ser instanciada.

### **6. Exercício de Fixação: CurrencyConverter**

**Conceito:** Aplicação prática de membros estáticos para criar uma classe de utilidade que realiza conversões financeiras.

**Exemplo Prático:** Classe para converter dólares em reais considerando o IOF de 6%:

```java
public class CurrencyConverter {
    public static double IOF = 0.06;
    public static double dollarToReal(double amount, double dollarPrice) {
        return amount * dollarPrice * (1.0 + IOF);
    }
}
```

Uso no `Program`: `double result = CurrencyConverter.dollarToReal(amount, dollarPrice);`