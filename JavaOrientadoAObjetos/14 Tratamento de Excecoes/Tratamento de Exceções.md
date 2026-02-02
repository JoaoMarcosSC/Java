>O objetivo do tratamento de exceções é permitir que erros e comportamentos inesperados sejam tratados de forma consistente, flexível e organizada. O modelo visa delegar a lógica do erro para a classe responsável pelas regras de negócio, evitando que o programa seja encerrado abruptamente e permitindo que a execução seja interrompida e desviada para um bloco de tratamento específico.

### **1. O que são Exceções**

**Conceito:** Uma exceção é qualquer condição de erro ou comportamento inesperado encontrado por um programa em execução. Em Java, exceções são objetos que, quando lançados, são propagados na pilha de chamadas de métodos até serem capturados ou causarem o encerramento do programa.

- **java.lang.Exception:** O compilador exige que sejam tratadas ou propagadas (checked).
- **java.lang.RuntimeException:** O compilador não obriga o tratamento (unchecked).

### **2. Hierarquia de Exceções**

**Conceito:** Todas as exceções herdam da classe `Throwable`. A hierarquia divide-se principalmente em:

- **Error:** Problemas sérios da máquina virtual que o programador não deve tentar tratar (ex: `OutOfMemoryError`).
- **Exception:** Erros que a aplicação deve tratar, incluindo `IOException` e `RuntimeException` (como `NullPointerException`).

**Vantagens do Modelo:** Permite tratar erros de forma hierárquica, delegar a lógica do erro e carregar dados adicionais dentro do objeto da exceção.

### **3. Estrutura try-catch**

**Conceito:** É o bloco básico de tratamento. O `try` contém o código da execução normal que pode gerar um erro, enquanto o `catch` define o código que será executado caso a exceção ocorra.

**Sintaxe Java:**

```java
try {
    // Código normal
} catch (TipoDeExcecao e) {
    // Código de tratamento
}
```

**Exemplo Prático:**

```java
try {
    String[] vect = sc.nextLine().split(" ");
    int position = sc.nextInt();
    System.out.println(vect[position]);
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("Invalid position!"); // Posição inexistente no vetor
} catch (InputMismatchException e) {
    System.out.println("Input error"); // Entrada de dados inválida
}
```

### **4. Pilha de Chamadas de Métodos (Call Stack)**

**Conceito:** Quando ocorre uma exceção, o Java percorre a pilha de métodos que foram chamados até encontrar um bloco `catch` adequado. Se `method2` gera um erro e não o trata, o erro "sobe" para o `method1` e assim por diante.

**Exemplo Prático (Rastreamento):** O uso de `e.printStackTrace();` dentro de um catch permite visualizar toda a jornada do erro através dos métodos executados.

### **5. Bloco finally**

**Conceito:** É um bloco cujo código é executado independentemente de ter ocorrido uma exceção ou não. É utilizado para garantir o fechamento de recursos, como arquivos ou conexões de banco de dados.

**Sintaxe Java:**

```java
try {
    // código
} catch (Exception e) {
    // tratamento
} finally {
    // código executado sempre
}
```

**Exemplo Prático:**

```java
try {
    sc = new Scanner(file);
    // leitura do arquivo
} catch (IOException e) {
    System.out.println("Error opening file: " + e.getMessage());
} finally {
    if (sc != null) {
        sc.close(); // Garante o fechamento do scanner
    }
}
```

### **6. Criando Exceções Personalizadas**

**Conceito:** Para manter a boa arquitetura (como as camadas _entities_, _services_ e _exceptions_), deve-se criar classes de exceção específicas para o negócio. Isso evita o aninhamento excessivo de condicionais `if-else` e delega a validação para o modelo.

**Sintaxe Java:**

- **Cláusula `throws`:** Na assinatura do método, propaga a exceção.
- **Cláusula `throw`:** Lança (dispara) a exceção, interrompendo o método.

**Exemplo Prático (Reserva de Hotel):** Uma classe `Reservation` pode lançar uma exceção personalizada caso a data de saída seja anterior à de entrada.

```java
if (!checkout.after(checkin)) {
    throw new DomainException("Check-out date must be after check-in date"); // Lógica delegada
}
```