>O objetivo deste capítulo é introduzir os fundamentos da programação em Java, focando na manipulação de dados através de **variáveis**, na realização de cálculos com **expressões aritméticas** e na execução das três operações básicas de um programa: **entrada, processamento e saída de dados**.

### **1. Expressões Aritméticas**

**Conceito:** São expressões matemáticas que utilizam operadores para resultar em um valor numérico.

- **Operadores e Precedência:**
    - `*` (multiplicação), `/` (divisão), `%` (resto da divisão ou "mod") têm maior precedência.
    - `+` (adição) e `-` (subtração) são executados em seguida.
    - O uso de parênteses `()` pode ser empregado para alterar a ordem de execução.

**Sintaxe Java:** Os operadores são utilizados diretamente entre os valores ou variáveis.

**Exemplo Prático:**

- `2 * 6 / 3` resulta em `4`.
- `(3 + 2) * 4` resulta em `20`.
- `14 % 3` resulta em `2` (o resto da divisão de 14 por 3).


### **2. Variáveis e Tipos Primitivos**

**Conceito:** Uma variável é uma porção de memória RAM usada para armazenar dados durante a execução. Ela possui nome (identificador), tipo, valor e endereço.

- **Tipos Primitivos Principais:**
    - **Inteiros:** `byte`, `short`, `int`, `long`.
    - **Ponto Flutuante:** `float`, `double`.
    - **Caractere:** `char` (um único caractere Unicode).
    - **Lógico:** `boolean` (verdadeiro ou falso).
- **Cadeia de Caracteres:** `String` (para palavras e textos).

**Sintaxe Java:** 
```Java
<tipo> <nome> = <valor inicial (opcional)>;
```

**Exemplo Prático:**

```Java
int idade = 25;
double altura = 1.68;
char sexo = 'F';
String nome = "Maria";
```

**Observações e Boas Práticas:**

- **Nomes de variáveis:** Devem seguir o padrão **camelCase** (ex: `salarioDoFuncionario`), não podem começar com dígitos e não devem conter espaços ou acentos.

### **3. As Três Operações Básicas**

**Conceito:** Um programa realiza essencialmente:

1. **Entrada de dados:** Leitura de informações do usuário.
2. **Processamento de dados:** Cálculos e manipulações (atribuição).
3. **Saída de dados:** Escrita dos resultados para o usuário.

### **4. Saída de Dados em Java**

**Conceito:** Ato de enviar dados do programa para um dispositivo de saída (como a tela).

**Sintaxe Java:**

- `System.out.print("Texto");` – Sem quebra de linha.
- `System.out.println("Texto");` – Com quebra de linha ao final.
- `System.out.printf("Formato", variavel);` – Saída formatada.

**Exemplo Prático (Saída Formatada e Concatenação):**

```Java
double x = 10.35784;
String nome = "Maria";
int idade = 31;
System.out.printf("%.2f%n", x); // Saída com 2 casas decimais: 10,36
System.out.printf("%s tem %d anos%n", nome, idade); // Maria tem 31 anos
```

**Observações e Boas Práticas:**

- Para usar o ponto como separador decimal em vez da vírgula regional, use `Locale.setDefault(Locale.US);` antes de declarar o Scanner.
- **Marcadores do printf:** `%f` (ponto flutuante), `%d` (inteiro), `%s` (texto), `%n` (quebra de linha).


### **5. Processamento de Dados e Casting**

**Conceito:** O processamento ocorre via comando de **atribuição**. O **Casting** é a conversão explícita de um tipo de dado para outro, necessária quando o compilador não consegue prever a conversão automática.

**Sintaxe Java:** 
```Java
<variável> = <expressão>;` `resultado = (tipo) expressão;
```
(Casting)

**Exemplo Prático (Casting e Boa Prática):**

```Java
int a = 5, b = 2;
double resultado;
resultado = (double) a / b; // Casting para garantir que o resultado seja 2.5 e não 2.0
```

**Observações e Boas Práticas:**

- Sempre indique o tipo do número em expressões de ponto flutuante: use `.0` para `double` e `f` para `float` (ex: `double b = 6.0;` ou `float b = 6f;`).

### **6. Entrada de Dados (Scanner)**

**Conceito:** Permite que o programa leia dados digitados pelo usuário.

**Sintaxe Java:**

1. Importar: `import java.util.Scanner;`
2. Criar objeto: `Scanner sc = new Scanner(System.in);`
3. Fechar ao final: `sc.close();`

**Exemplo Prático de Métodos de Leitura:**

```Java
String x = sc.next();      // Lê uma palavra
int y = sc.nextInt();       // Lê um inteiro
double z = sc.nextDouble(); // Lê um ponto flutuante
char c = sc.next().charAt(0); // Lê um caractere
String s = sc.nextLine();   // Lê o texto até a quebra de linha
```

**Observações e Erros Comuns:**

- **Quebra de linha pendente:** Ao usar `nextInt()` ou `nextDouble()` e em seguida um `nextLine()`, a quebra de linha do comando anterior fica "pendente" e é absorvida pelo `nextLine()`, resultando em uma leitura vazia. **Solução:** Faça um `sc.nextLine()` extra para limpar o buffer.


### **7. Funções Matemáticas em Java**

**Conceito:** Java fornece a classe `Math` para operações matemáticas complexas.

**Sintaxe e Exemplos das Funções Principais:**

- `Math.sqrt(x)`: Raiz quadrada. Ex: `A = Math.sqrt(25.0);` (A recebe 5.0).
- `Math.pow(x, y)`: Potenciação (x elevado a y). Ex: `A = Math.pow(5.0, 2.0);` (A recebe 25.0).
- `Math.abs(x)`: Valor absoluto (remove o sinal negativo). Ex: `A = Math.abs(-5.0);` (A recebe 5.0).

**Exemplo Prático (Fórmula de Bhaskara):**

```Java
delta = Math.pow(b, 2.0) - 4 * a * c;
x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
```