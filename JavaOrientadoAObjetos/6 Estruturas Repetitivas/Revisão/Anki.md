
TARGET DECK: 6 - Estruturas Repetitivas

Durante uma sessão de depuração no Eclipse, qual tecla de atalho é utilizada para executar o programa linha a linha (passo a passo)? 
A. F5 
B. F8 
C. F6 
D. F11 #flashcard
Correct answer: C
Justificativa: De acordo com as fontes, na seção de Debug no Eclipse, a tecla F6 é a responsável por executar uma linha por vez.
<!--ID: 1768759373479-->


Qual das seguintes afirmações descreve corretamente o funcionamento da estrutura repetitiva while em Java? 
A. Ela executa o bloco de comandos pelo menos uma vez, independentemente da condição. 
B. Ela repete um bloco de comandos enquanto a condição testada for verdadeira. 
C. Ela é a estrutura mais recomendada quando se conhece exatamente o número de repetições. 
D. A condição é verificada apenas após a execução do primeiro comando do bloco. #flashcard
Correct answer: B
Justificativa: O while é uma estrutura de controle que repete um bloco enquanto a condição for verdadeira. Se a condição for falsa na primeira verificação, o bloco não é executado.
<!--ID: 1768759373483-->


Analise o seguinte código Java e determine o que será impresso na tela:
int x = 2;
while (x < 60) {
    System.out.println(x);
    x = x * 2;
}
A. 2, 4, 8, 16, 32, 64 
B. 2, 4, 8, 16, 32 
C. 4, 8, 16, 32, 64 
D. O loop entrará em estado de erro  infinito. #flashcard
Correct answer: B
Justificativa: O loop imprime o valor atual de x e depois o dobra. Os valores impressos são 2, 4, 8, 16 e 32. Quando x passa a ser 64, a condição x < 60 torna-se falsa e o loop encerra.
<!--ID: 1768759373487-->


Sobre a estrutura for (início; condição; incremento), qual parte é executada apenas uma única vez, no momento em que o loop é iniciado? 
A. Condição 
B. Incremento 
C. Comando 1 
D. Início #flashcard
Correct answer: D
Justificativa: Conforme as regras da sintaxe do for, a parte do "início" executa somente na primeira vez que a estrutura é acessada.
<!--ID: 1768759373491-->


Qual será o resultado da execução do seguinte código de contagem regressiva?
for (int i=4; i>=0; i--) {
System.out.print(i + " ");
}
A. 4 3 2 1 
B. 0 1 2 3 4 
C. 4 3 2 1 0 
D. 3 2 1 0 #flashcard
Correct answer: C
Justificativa: O loop começa em 4 e continua enquanto i for maior ou igual a 0, decrementando 1 a cada volta. Portanto, imprime 4, 3, 2, 1 e 0.
<!--ID: 1768759373496-->


Qual é a principal diferença técnica da estrutura do-while em relação às estruturas while e for? 
A. Ela não permite o uso de variáveis do tipo double. 
B. A condição é verificada no final, garantindo que o bloco seja executado pelo menos uma vez. 
C. Ela é executada apenas se a condição for falsa na primeira vez. 
D. Ela encerra automaticamente após a terceira repetição. #flashcard
Correct answer: B
Justificativa: Nas fontes, destaca-se que o bloco de comandos do do-while executa pelo menos uma vez, pois a verificação da condição ocorre apenas ao final do bloco.
<!--ID: 1768759373500-->


Considere o código abaixo. Quantas vezes a palavra "olha" será impressa?
int x = 100;
int y = 100;
while (x != y) {
    System.out.print("olha");
    x = (int) Math.sqrt(y);
}
A. Nenhuma vez. 
B. Uma vez. 
C. Infinitas vezes. 
D. O código não compila. #flashcard
Correct answer: A
Justificativa: Como x e y já são iguais (100) no início, a condição x != y é falsa desde o primeiro teste. Seguindo a regra do while, o programa pula fora da estrutura sem executar nada.
<!--ID: 1768759373504-->


Qual o valor final da variável y após a execução deste trecho?
int x = 4;
int y = 0;
for (int i=0; i<x; i++) {
y = y + i;
}
A. 10 
B. 4 
C. 6 
D. 3 #flashcard
Correct answer: C
Justificativa: O loop executa para i=0, 1, 2, 3. As somas em y são: 0+0=0, 0+1=1, 1+2=3, 3+3=6. Quando i chega a 4, a condição i< x falha.
<!--ID: 1768759373508-->


Analise a estrutura do-while abaixo. O que acontece se o usuário digitar 'n' logo na primeira pergunta?
char resp;
do {
    // comandos de cálculo
    resp = sc.next().charAt(0);
} while (resp != 'n');
A. O loop é ignorado e nada é executado. B. O programa entra em loop infinito. C. O bloco de comandos é executado uma vez e o loop termina. D. O compilador gera um erro de lógica. #flashcard
Correct answer: C
Justificativa: No do-while, o bloco sempre executa a primeira vez antes da condição ser testada. Se o usuário digitar 'n', a condição resp != 'n' torna-se falsa e o loop encerra após essa primeira execução.
<!--ID: 1768759373512-->


Qual será a saída do seguinte teste de mesa?
int x = 0;
while (x < 5) {
    int y = x * 3;
    System.out.print(y);
    x = x + 1;
}
System.out.print("Fim");
A. 036912Fim 
B. 3691215Fim 
C. 0369Fim 
D. 012345 Fim #flashcard
Correct answer: A
Justificativa: O loop gera múltiplos de 3 para x de 0 a 4: 0*3=0, 1*3=3, 2*3=6, 3*3=9, 4*3=12. Ao final, imprime "Fim".
<!--ID: 1768759373517-->


Em um loop for, o que acontece imediatamente após a execução do bloco de comandos e antes de testar a condição novamente? 
A. A variável de início é reinicializada. 
B. O programa sai da estrutura. 
C. A expressão de incremento é executada. 
D. O debug é interrompido. #flashcard
Correct answer: C
Justificativa: Segundo a regra do for, a parte do incremento executa toda vez depois de voltar da execução do bloco de comandos, preparando o valor para o novo teste de condição.
<!--ID: 1768759373521-->


No exemplo de conversão de temperatura (Celsius para Fahrenheit), por que o do-while foi preferido em relação ao while? 
A. Porque o do-while é mais rápido que o while. 
B. Porque permitiu executar o cálculo da temperatura pelo menos uma vez antes de perguntar se o usuário queria repetir. 
C. Porque o while não aceita leitura de caracteres (char). 
D. Porque o do-while não precisa de um objeto  Scanner. #flashcard
Correct answer: B
Justificativa: O do-while é útil quando se deseja que o bloco de comandos seja executado ao menos uma vez antes da verificação da condição de repetição.
<!--ID: 1768759373525-->


Qual será a saída impressa por este código?
for (int i=1; i<5; i++) {
    System.out.print(i);
}
A. 12345 
B. 01234 
C. 1234 
D. 1 2 3 4 5 #flashcard
Correct answer: C
Justificativa: O loop começa em 1 e para quando i não for mais menor que 5 (ou seja, quando i for 5). Os valores impressos são 1, 2, 3 e 4.
<!--ID: 1768759373529-->


Analise o código e identifique os valores impressos na tela:
int x = 8;
int y = 3;
for (int i=0; y < x; i++) {
    x = x - 2;
    y = y + 1;
    System.out.print(i + " ");
}
A. 0 1 2 
B. 0 1 
C. 8 6 4 
D. 0 1 2 3 #flashcard
Correct answer: B
Justificativa: 1ª volta: i=0, 3 < 8 (V). x torna-se 6, y torna-se 4. Imprime 0. 2ª volta: i=1, 4 < 6 (V). x torna-se 4, y torna-se 5. Imprime 1. 3ª volta: i=2, 5 < 4 (F). O loop encerra. Saída: 0 1.
<!--ID: 1768759373533-->

Faça um programa em Java que leia números inteiros até que seja digitado o valor 0, e ao final mostre a soma de todos os números lidos. #flashcard
Scanner sc = new Scanner(System.in);
int x = sc.nextInt();
int soma = 0;
while (x != 0) {
 soma += x;
 x = sc.nextInt();
}
System.out.println(soma);
sc.close();
<!--ID: 1768759565528-->


Faça um programa em Java que utilize a estrutura while para imprimir os valores de x enquanto x > 2, decrementando x a cada repetição. #flashcard
int x = 5;
int y = 0;
while (x > 2) {
 System.out.print(x);
 y = y + x;
 x = x - 1;
}
<!--ID: 1768759565533-->


Faça um programa em Java que utilize while para imprimir valores começando em 2, dobrando o valor a cada iteração, enquanto o valor for menor que 60. #flashcard
int x = 2;
int y = 0;
while (x < 60) {
 System.out.println(x);
 x = x * 2;
 y = y + 10;
}
<!--ID: 1768759565537-->


Faça um programa em Java que utilize a estrutura for para ler um número inteiro N e, em seguida, ler N números inteiros e mostrar a soma deles. #flashcard
Scanner sc = new Scanner(System.in);
int N = sc.nextInt();
int soma = 0;
for (int i = 0; i < N; i++) {
 int x = sc.nextInt();
 soma += x;
}
System.out.println(soma);
sc.close();
<!--ID: 1768759565541-->


Faça um programa em Java que utilize um for para imprimir uma contagem progressiva de 0 até 4. #flashcard
for (int i = 0; i < 5; i++) {
 System.out.println("Valor de i: " + i);
}
<!--ID: 1768759565545-->


Faça um programa em Java que utilize um for para imprimir uma contagem regressiva de 4 até 0. #flashcard
for (int i = 4; i >= 0; i--) {
 System.out.println("Valor de i: " + i);
}
<!--ID: 1768759565549-->


Faça um programa em Java que utilize for para acumular valores em uma variável y enquanto i varia de 0 até x - 1. #flashcard
int x = 4;
int y = 0;
for (int i = 0; i < x; i++) {
 y = y + i;
}
System.out.println(y);
<!--ID: 1768759565553-->


Faça um programa em Java que utilize for para executar um laço enquanto uma variável y for menor que x, atualizando ambas a cada iteração. #flashcard
int x = 8;
int y = 3;
for (int i = 0; y < x; i++) {
 x = x - 2;
 y = y + 1;
 System.out.println(i);
}
<!--ID: 1768759565557-->


Faça um programa em Java que utilize a estrutura do-while para converter temperaturas de Celsius para Fahrenheit e repetir a execução enquanto o usuário digitar 's'. #flashcard
Scanner sc = new Scanner(System.in);
char resp;
do {
 double C = sc.nextDouble();
 double F = 9.0 * C / 5.0 + 32.0;
 System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
 resp = sc.next().charAt(0);
} while (resp != 'n');
sc.close();
<!--ID: 1768759565561-->


Faça um programa em Java que demonstre que a estrutura do-while executa o bloco ao menos uma vez, independentemente da condição. #flashcard
int x = 100;
do {
 System.out.println(x);
} while (x < 0);
<!--ID: 1768759565565-->
