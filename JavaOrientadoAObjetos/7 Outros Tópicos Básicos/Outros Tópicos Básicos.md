>O objetivo deste capítulo é complementar a base de conhecimento do desenvolvedor Java com ferramentas e padrões essenciais que garantem a **organização**, **legibilidade** e **eficiência** do código, introduzindo manipulação avançada de texto, operações em nível de bits e a estruturação de funções modulares.

### **1. Restrições e Convenções para Nomes**

**Conceito:** Java possui regras obrigatórias (restrições) e padrões sugeridos (convenções) para nomear identificadores (variáveis, métodos, classes). Nomes significativos são recomendados para facilitar a manutenção.

- **Restrições:** Nomes não podem começar com dígitos, não devem conter espaços em branco nem usar acentos ou tils.
- **Convenções:**
    - **Camel Case:** (`minhaVariavel`) Usado para pacotes, atributos, métodos, variáveis e parâmetros.
    - **Pascal Case:** (`MinhaClasse`) Usado estritamente para nomes de classes.

**Exemplo Prático:**

- **Correto:** `int _5minutes;`, `int salario;`, `int salarioDoFuncionario;`.
- **Errado:** `int 5minutes;`, `int salário;`, `int salario do funcionario;`.

### **2. Operadores Bitwise**

**Conceito:** São operadores que realizam cálculos **bit a bit** em valores inteiros. São úteis para programação de baixo nível ou quando se precisa testar bits específicos (flags).

- `&` (Operação "E" bit a bit).
- `|` (Operação "OU" bit a bit).
- `^` (Operação "OU-exclusivo" bit a bit).

**Exemplo Prático (Verificação de Bit):** Uma aplicação comum é o uso de uma **máscara** para verificar se um bit específico (ex: o 6º bit) de um número é verdadeiro.

```java
int mask = 0b100000; // Máscara para o 6º bit (32 em decimal)
int n = sc.nextInt();
if ((n & mask) != 0) {
    System.out.println("O 6º bit é verdadeiro!");
} else {
    System.out.println("O 6º bit é falso");
}
```

### **3. Funções Interessantes para String**

**Conceito:** A classe `String` oferece métodos para formatar, recortar, substituir e buscar partes de um texto.

**Sintaxe Java (Principais métodos):**

- **Formatar:** `toLowerCase()`, `toUpperCase()`, `trim()` (remove espaços nas extremidades).
- **Recortar:** `substring(inicio)`, `substring(inicio, fim)`.
- **Substituir:** `replace(char, char)`, `replace(string, string)`.
- **Buscar:** `indexOf`, `lastIndexOf`.
- **Dividir:** `split(" ")` (gera um vetor com base no separador).

**Exemplo Prático:**

```java
String original = "abcde FGHIJ ABC abc DEFG   ";
String s04 = original.substring(2); // "cde FGHIJ ABC abc DEFG   "
String s07 = original.replace("abc", "xy"); // "xyde FGHIJ ABC xy DEFG   "
String s = "potato apple lemon";
String[] vect = s.split(" "); // vect = "potato", vect = "apple"...
```

### **4. Comentários em Java**

**Conceito:** Notas explicativas ignoradas pelo compilador, usadas para documentar o código ou explicar lógicas complexas.

**Sintaxe Java:**

- **Comentário de linha:** Começa com `//`.
- **Comentário de bloco:** Delimitado por `/*` e `*/`.

**Exemplo Prático:**

```java
/* Este programa calcula as raízes de uma equação
   Os valores devem ser digitados um por linha */
delta = b * b - 4 * a * c; // cálculo do valor de delta
```

### **5. Funções (Sintaxe e Conceito)**

**Conceito:** Representam um processamento com significado próprio. Em Orientação a Objetos, funções dentro de classes são chamadas de **métodos**. Elas permitem a **modularização** (dividir o problema), **delegação** de responsabilidades e **reaproveitamento** de código.

**Sintaxe Java:**

```java
public static tipoRetorno nome(parametros) {
    // corpo da função
    return valor; // se não for void
}
```

**Exemplo Prático (Encontrar o maior de três números):** Em vez de usar vários `if-else` repetidamente no programa principal, criamos a função `max`.

```java
public static void main(String[] args) {
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int higher = max(a, b, c); // Chamada da função
    showResult(higher);
}

public static int max(int x, int y, int z) {
    int aux;
    if (x > y && x > z) { aux = x; }
    else if (y > z) { aux = y; }
    else { aux = z; }
    return aux; // Retorna o maior valor encontrado
}
```

**Observação:** Funções que não retornam valor (apenas executam uma ação, como imprimir na tela) devem usar o tipo de retorno `void`.