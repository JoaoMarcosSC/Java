
TARGET DECK: 5 - Estrutura Condicional

Considere que uma variável inteira X possui o valor 5. Qual das seguintes expressões comparativas resultará no valor verdade ? 
A. X > 0 
B. X != 2 
C. X == 3 
D. 10 <= 30 #flashcard
Correct answer: C
Justificativa: Conforme as fontes, se X é 5, a comparação X == 3 é falsa. As demais são verdadeiras (5 > 0, 5 != 2 e 10 <= 30).
<!--ID: 1768657779446-->


Sobre o operador lógico "E" (&&) em Java, qual das afirmações abaixo é verdadeira? 
A. O resultado é verdadeiro se pelo menos uma das condições for verdadeira. 
B. O resultado é verdadeiro somente se todas as condições envolvidas forem verdadeiras. 
C. Ele inverte o valor lógico da expressão comparativa. 
D. É um operador de atribuição cumulativa. #flashcard 
Correct answer: B
Justificativa: O operador && exige que todas as condições sejam verdadeiras para que o resultado final da expressão seja verdadeiro.
<!--ID: 1768657801991-->



Analise o código abaixo e determine o resultado da expressão lógica, considerando x = 5: !(x == 10 || x <= 20) 
A. Verdadeiro (true) 
B. Falso (false) 
C. Erro de compilação 
D. Erro de tempo de execução. #flashcard 
Correct answer: B
Justificativa: Primeiro resolve-se o parênteses: (5 == 10) é Falso; (5 <= 20) é Verdadeiro. No operador ||, Falso || Verdadeiro resulta em Verdadeiro. O operador ! (NÃO) inverte o resultado para Falso.
<!--ID: 1768657779451-->


Qual é a regra fundamental de execução de uma estrutura condicional simples (if) em Java? A. O bloco de comandos é executado independentemente da condição. B. O bloco de comandos é executado apenas se a condição for falsa. C. Se a condição for verdadeira, o programa pula o bloco de comandos. D. Se a condição for verdadeira, o bloco de comandos é executado; se for falsa, o bloco é pulado. #flashcard 
Correct answer: D
Justificativa: Na estrutura simples, o bloco só é processado se a condição resultar em um valor verdade verdadeiro.
<!--ID: 1768657779455-->


Observe o trecho de código abaixo. Qual será a saída impressa se a variável horas for igual a 14?
if (horas < 12) {
    System.out.println("Bom dia!");
} else if (horas < 18) {
    System.out.println("Boa tarde!");
} else {
    System.out.println("Boa noite!");
}
A. Bom dia! B. Boa tarde! C. Boa noite! D. Nenhuma saída será impressa. #flashcard 
Correct answer: B
Justificativa: Como 14 não é menor que 12, o programa passa para o próximo teste. Como 14 é menor que 18, ele executa o bloco correspondente ao "Boa tarde!".
<!--ID: 1768657779459-->


No contexto de operadores de atribuição cumulativa, a expressão a += b; é estritamente equivalente a qual das opções abaixo? 
A. a = b; 
B. b = b + a; 
C. a = a + b; 
D. a = a * b; #flashcard
Correct answer: C
Justificativa: O operador += soma o valor da direita à variável da esquerda e atribui o resultado a essa mesma variável.
<!--ID: 1768657779464-->


Analise o seguinte problema: Um plano básico custa R50.00 por 100 minutos. Cadaminuto excedente custa R 2.00. Se um usuário consumir 103 minutos, qual trecho de código calcula corretamente o valor total (conta)? 
A. if (minutos > 100) { conta = minutos * 2.0; } 
B. if (minutos > 100) { conta += (minutos - 100) * 2.0; } 
C. if (minutos < 100) { conta += 2.0; } 
D. conta = (minutos > 100) ? 50.0 : 50.0 + 6.0; #flashcard 
Correct answer: B
Justificativa: O valor base (50.0) deve ser somado ao cálculo do excedente (minutos - 100) multiplicado pela taxa de R$ 2.00.
<!--ID: 1768657779468-->


Qual a função da palavra-chave break dentro de uma estrutura switch-case? 
A. Interromper a execução do programa inteiro. 
B. Forçar a execução do bloco default. 
C. Impedir que o programa execute os comandos dos casos seguintes após encontrar um caso correspondente. 
D. Repetir o teste da expressão condicional. #flashcard
Correct answer: C
Justificativa: Sem o break, o Java continuaria executando os comandos dos casos subsequentes ("fall-through"), mesmo que eles não correspondam ao valor da variável.
<!--ID: 1768657779472-->


Sobre a expressão condicional ternária, selecione a sintaxe correta: 
A. condição : valor1 ? valor2 
B. ( condição ) ? valor_se_verdadeiro : valor_se_falso 
C. if ( condição ) ? valor1 : valor2 
D. valor_se_verdadeiro : ( condição ) ? valor_se_falso #flashcard 
Correct answer: B
Justificativa: A estrutura ternária segue o padrão: uma condição entre parênteses, seguida por ?, o valor para verdadeiro, : e o valor para falso.
<!--ID: 1768657779476-->


Qual será o valor da variável desconto após a execução do código abaixo? double preco = 34.5; double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05; 
A. 3.45 
B. 1.725 
C. 0.0 
D. Erro de compilação. #flashcard 
Correct answer: B
Justificativa: Como preco (34.5) não é menor que 20.0, a condição é falsa. Portanto, aplica-se o segundo valor: 34.5 * 0.05, que resulta em 1.725.
<!--ID: 1768657779480-->


O que acontece se uma variável for declarada dentro de um bloco if e o programador tentar acessá-la fora desse bloco? 
A. O programa compila, mas retorna valor null. 
B. O programa funciona normalmente, pois o escopo em Java é global. 
C. Ocorre um erro de compilação, pois a variável não existe fora do escopo do bloco onde foi declarada. 
D. O programa entra em loop infinito. #flashcard 
Correct answer: C
Justificativa: O escopo de uma variável é limitado à região onde ela foi declarada. Se declarada dentro de um if, ela não é válida fora dele.
<!--ID: 1768657779485-->


Em Java, é permitido utilizar uma variável que foi declarada, mas não foi inicializada? 
A. Sim, ela assume o valor zero automaticamente. 
B. Não, o compilador gera um erro informando que a variável pode não ter sido inicializada. 
C. Somente se for uma variável do tipo double. 
D. Sim, mas apenas dentro de uma estrutura switch-case. #flashcard 
Correct answer: B
Justificativa: De acordo com as regras de escopo e inicialização das fontes, uma variável não pode ser usada se não for iniciada.
<!--ID: 1768657779489-->


Considere um switch-case sem a cláusula default. O que acontece se o valor da expressão não coincidir com nenhum dos case definidos? 
A. O programa gera uma exceção de erro. 
B. O programa executa o primeiro case por padrão. 
C. O programa simplesmente não executa nenhum bloco dentro do switch e continua a execução após a estrutura. 
D. O código falha na compilação. #flashcard 
Correct answer: C
Justificativa: A cláusula default é opcional. Se não houver coincidência e não houver default, a estrutura é apenas ignorada pelo fluxo de execução.
<!--ID: 1768657779493-->


Qual será o resultado impresso pelo seguinte código?
int x = 2;
String dia;
switch (x) {
    case 1: dia = "domingo"; break;
    case 2: dia = "segunda";
    case 3: dia = "terca"; break;
    default: dia = "invalido"; break;
}
System.out.println(dia);
A. segunda 
B. terca 
C. domingo 
D. invalido #flashcard 
Correct answer: B
Justificativa: Este é um erro comum de "fall-through". O case 2 não possui um break. Portanto, após atribuir "segunda" a dia, o código continua para o case 3, atribui "terca" e só para ao encontrar o break do caso 3.
<!--ID: 1768657779497-->


Qual operador lógico deve ser usado quando se deseja que uma ação ocorra se  de várias condições for atendida? 
A. && 
B. ! 
C. == 
D. || #flashcard
Correct answer: D
Justificativa: O operador "OU" (||) resulta em verdadeiro se pelo menos uma das condições for verdadeira.
<!--ID: 1768657779501-->

Faça um programa em Java que leia um número inteiro e informe se ele é NEGATIVO ou NAO NEGATIVO conforme os exemplos fornecidos. #flashcard
Scanner sc = new Scanner(System.in);
int x = sc.nextInt();
if (x < 0) {
 System.out.println("NEGATIVO");
} else {
 System.out.println("NAO NEGATIVO");
}
sc.close();
<!--ID: 1768658202465-->


Faça um programa em Java que leia um número inteiro e informe se ele é PAR ou IMPAR. #flashcard
Scanner sc = new Scanner(System.in);
int x = sc.nextInt();
if (x % 2 == 0) {
 System.out.println("PAR");
} else {
 System.out.println("IMPAR");
}
sc.close();
<!--ID: 1768658202472-->


Faça um programa em Java que leia dois números inteiros A e B e informe se eles são Sao Multiplos ou Nao sao Multiplos, independentemente da ordem de entrada. #flashcard
Scanner sc = new Scanner(System.in);
int A = sc.nextInt();
int B = sc.nextInt();
if (A % B == 0 || B % A == 0) {
 System.out.println("Sao Multiplos");
} else {
 System.out.println("Nao sao Multiplos");
}
sc.close();
<!--ID: 1768658202476-->


Faça um programa em Java que leia a hora inicial e a hora final de um jogo e calcule sua duração, considerando que o jogo pode atravessar a meia-noite. #flashcard
Scanner sc = new Scanner(System.in);
int inicio = sc.nextInt();
int fim = sc.nextInt();
int duracao;
if (inicio < fim) {
 duracao = fim - inicio;
} else {
 duracao = 24 - inicio + fim;
}
System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
sc.close();
<!--ID: 1768658202480-->


Faça um programa em Java que leia o código de um item e a quantidade comprada e calcule o valor total a pagar, com base na tabela de preços fornecida. #flashcard
Scanner sc = new Scanner(System.in);
int codigo = sc.nextInt();
int quantidade = sc.nextInt();
double total;
if (codigo == 1) total = quantidade * 4.00;
else if (codigo == 2) total = quantidade * 4.50;
else if (codigo == 3) total = quantidade * 5.00;
else if (codigo == 4) total = quantidade * 2.00;
else total = quantidade * 1.50;
System.out.printf("Total: R$ %.2f%n", total);
sc.close();
<!--ID: 1768658202484-->


Faça um programa em Java que leia um valor real e informe em qual intervalo ele se encontra: [0,25], (25,50], (50,75], (75,100] ou Fora de intervalo. #flashcard
Scanner sc = new Scanner(System.in);
double x = sc.nextDouble();
if (x >= 0 && x <= 25)
 System.out.println("Intervalo [0,25]");
else if (x > 25 && x <= 50)
 System.out.println("Intervalo (25,50]");
else if (x > 50 && x <= 75)
 System.out.println("Intervalo (50,75]");
else if (x > 75 && x <= 100)
 System.out.println("Intervalo (75,100]");
else
 System.out.println("Fora de intervalo");
sc.close();
<!--ID: 1768658202488-->


Faça um programa em Java que leia duas coordenadas (x, y) e determine se o ponto está na Origem, em um dos Eixos, ou em qual Quadrante ele se encontra. #flashcard
Scanner sc = new Scanner(System.in);
double x = sc.nextDouble();
double y = sc.nextDouble();
if (x == 0 && y == 0)
 System.out.println("Origem");
else if (x == 0)
 System.out.println("Eixo Y");
else if (y == 0)
 System.out.println("Eixo X");
else if (x > 0 && y > 0)
 System.out.println("Q1");
else if (x < 0 && y > 0)
 System.out.println("Q2");
else if (x < 0 && y < 0)
 System.out.println("Q3");
else
 System.out.println("Q4");
sc.close();


Faça um programa em Java que leia o salário de uma pessoa e calcule o Imposto de Renda conforme a tabela progressiva, exibindo Isento quando não houver imposto. #flashcard
Scanner sc = new Scanner(System.in);
double salario = sc.nextDouble();
double imposto = 0.0;
if (salario > 4500.00) {
 imposto += (salario - 4500.00) * 0.28;
 salario = 4500.00;
}
if (salario > 3000.00) {
 imposto += (salario - 3000.00) * 0.18;
 salario = 3000.00;
}
if (salario > 2000.00) {
 imposto += (salario - 2000.00) * 0.08;
}
if (imposto == 0.0)
 System.out.println("Isento");
else
 System.out.printf("R$ %.2f%n", imposto);
sc.close();


