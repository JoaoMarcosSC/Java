>O objetivo deste capítulo é capacitar o desenvolvedor a utilizar estruturas de controle que permitem a **repetição de blocos de comandos** com base em condições lógicas ou intervalos definidos, além de ensinar o uso do **Debug** para monitorar a execução do código passo a passo.

### **1. Estrutura repetitiva "enquanto" (while)**

**Conceito:** É uma estrutura de controle que repete um bloco de comandos **enquanto uma condição for verdadeira**. É recomendada quando **não se sabe previamente** a quantidade de repetições que será realizada.

**Sintaxe Java:**

```java
while ( condição ) {
    comando 1
    comando 2
}
```

_Regra:_ Se a condição for **Verdadeira (V)**, executa o bloco e volta para testar novamente; se for **Falsa (F)**, o programa pula para fora da estrutura.

**Exemplo Prático:** Programa que lê números inteiros e os soma até que o valor zero seja digitado:

```java
int x = sc.nextInt();
int soma = 0;
while (x != 0) {
    soma = soma + x;
    x = sc.nextInt();
}
System.out.println(soma);
```

**Observação:** Se a condição for falsa logo na primeira verificação, o bloco de comandos nunca será executado.

### **2. Estrutura repetitiva "para" (for)**

**Conceito:** É uma estrutura que repete um bloco para um **certo intervalo de valores**. É ideal para situações onde se sabe previamente a quantidade de repetições necessária ou para realizar contagens.

**Sintaxe Java:**

```java
for ( início ; condição ; incremento ) {
    comando 1
    comando 2
}
```

- **Início:** Executado apenas na primeira vez.
- **Condição:** Testada antes de cada execução (V: continua; F: sai).
- **Incremento:** Executado toda vez após o bloco de comandos, antes de voltar ao teste da condição.

**Exemplo Prático (Contagem Progressiva):**

```java
for (int i=0; i<5; i++) {
    System.out.println("Valor de i: " + i);
}
// Resultado: 0, 1, 2, 3, 4
```

**Exemplo Prático (Contagem Regressiva):**

```java
for (int i=4; i>=0; i--) {
    System.out.println("Valor de i: " + i);
}
// Resultado: 4, 3, 2, 1, 0
```


### **3. Estrutura repetitiva "faça-enquanto" (do-while)**

**Conceito:** Menos utilizada que as anteriores, mas útil quando se deseja que o bloco de comandos seja executado **pelo menos uma vez**. Isso ocorre porque a condição é verificada apenas no **final** do bloco.

**Sintaxe Java:**

```java
do {
    comando 1
    comando 2
} while ( condição );
```

_Regra:_ O bloco executa primeiro, a condição é testada no final. Se for **Verdadeira (V)**, volta ao início do bloco; se for **Falsa (F)**, encerra a repetição.

**Exemplo Prático (Conversão de Temperatura):** Programa que converte Celsius para Fahrenheit e pergunta se o usuário deseja repetir a operação.

```java
char resp;
do {
    System.out.print("Digite a temperatura em Celsius: ");
    double C = sc.nextDouble();
    double F = 9.0 * C / 5.0 + 32.0;
    System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
    System.out.print("Deseja repetir (s/n)? ");
    resp = sc.next().charAt(0);
} while (resp != 'n');
```

**Boa Prática:** É ideal para menus ou situações onde a interação do usuário define a continuação do processo, garantindo que o usuário veja as opções ao menos uma vez.