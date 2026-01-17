>A estrutura condicional é uma ferramenta de controle que permite ao programador definir que um determinado bloco de comandos seja executado apenas se uma condição específica for atendida (ou seja, se a condição for verdadeira).

### **1. Expressões Comparativas**

**Conceito:** São expressões que utilizam operadores para comparar dois valores, resultando sempre em um valor verdade (Verdadeiro ou Falso).

- **Operadores:** `>` (maior), `<` (menor), `>=` (maior ou igual), `<=` (menor ou igual), `==` (igual) e `!=` (diferente).

**Exemplo Prático:** Se supormos que `x` vale 5:

- `x > 0` → Verdadeiro.
- `x == 3` → Falso.

### **2. Expressões Lógicas**

**Conceito:** Permitem combinar múltiplas condições em uma única expressão usando operadores lógicos.

- **Operador "E" (`&&`):** Todas as condições devem ser verdadeiras para o resultado ser verdadeiro.
- **Operador "OU" (`||`):** Pelo menos uma condição deve ser verdadeira.
- **Operador "NÃO" (`!`):** Inverte o valor verdade da condição (o que é verdadeiro torna-se falso e vice-versa).

**Exemplo Prático:** Se supormos que `x` vale 5:

- `x > 0 && x != 3` → Verdadeiro (V e V = V).
- `x == 10 || x <= 20` → Verdadeiro (F ou V = V).
- `!(x == 10)` → Verdadeiro (Inverte o Falso da comparação).

### **3. Estrutura Condicional Simples**

**Conceito:** O bloco de comandos dentro do `if` só é executado se a condição for verdadeira. Se for falsa, o programa pula o bloco.

**Sintaxe Java:**

```java
if ( <condição> ) {
    <comando 1>
    <comando 2>
}
```

**Observação:** É fundamental manter a **endentação** correta para facilitar a leitura do código.

### **4. Estrutura Condicional Composta**

**Conceito:** Permite escolher entre dois caminhos. Se a condição for verdadeira, executa o bloco do `if`; se for falsa, executa obrigatoriamente o bloco do `else`.

**Sintaxe Java:**

```java
if ( <condição> ) {
    <bloco if>
} else {
    <bloco else>
}
```

**Exemplo Prático:**

```java
if (horas < 12) {
    System.out.println("Bom dia!");
} else {
    System.out.println("Boa tarde ou Boa noite!");
}
```

### **5. Encadeamento de Estruturas Condicionais**

**Conceito:** Utilizado quando existem mais de duas possibilidades de fluxo, permitindo testar várias condições em sequência.

**Sintaxe Java:**

```java
if ( condição 1 ) {
    // comandos
} else if ( condição 2 ) {
    // comandos
} else {
    // comandos caso nenhuma anterior seja verdadeira
}
```

**Exemplo Prático:**

```java
if (horas < 12) {
    System.out.println("Bom dia!");
} else if (horas < 18) {
    System.out.println("Boa tarde!");
} else {
    System.out.println("Boa noite!");
}
```

### **6. Operadores de Atribuição Cumulativa**

**Conceito:** São formas abreviadas de escrever operações onde uma variável recebe o valor dela mesma somado, subtraído ou multiplicado por outro valor.

- `a += b;` equivale a `a = a + b;`
- `a -= b;` equivale a `a = a - b;`
- `a *= b;` equivale a `a = a * b;`

**Exemplo Prático (Cálculo de conta telefônica):**

```java
double conta = 50.0;
if (minutos > 100) {
    conta += (minutos - 100) * 2.0; // Adiciona o excedente à conta
}
```

### **7. Estrutura Switch-Case**

**Conceito:** Uma alternativa mais limpa ao `if-else` encadeado quando se deseja realizar diferentes ações com base no valor de uma única variável.

**Sintaxe Java:**

```java
switch ( expressão ) {
    case valor1:
        // comandos
        break;
    case valor2:
        // comandos
        break;
    default:
        // comandos caso nenhum valor coincida
        break;
}
```

**Exemplo Prático (Dia da semana):**

```java
switch (x) {
    case 1:
        dia = "domingo";
        break;
    case 2:
        dia = "segunda";
        break;
    default:
        dia = "valor invalido";
        break;
}
```

### **8. Expressão Condicional Ternária**

**Conceito:** Uma forma compacta de decidir um **valor** com base em uma condição, substituindo o `if-else` em atribuições simples.

**Sintaxe Java:** `( condição ) ? valor_se_verdadeiro : valor_se_falso`

**Exemplo Prático:**

```java
double preco = 34.5;
double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
```

### **9. Escopo e Inicialização**

**Conceito:**

- **Escopo de uma variável:** É a região do programa onde a variável é válida e pode ser referenciada.
- **Inicialização:** Uma variável **não pode** ser utilizada se não for iniciada com um valor prévio.

**Exemplo de Erro Comum (Problema de Escopo):** Se uma variável for declarada dentro de um bloco `if`, ela não existirá fora dele.

```java
if (price > 100.0) {
    double discount = price * 0.1; // 'discount' só existe aqui dentro
}
System.out.println(discount); // Erro de compilação: variável não encontrada.
```