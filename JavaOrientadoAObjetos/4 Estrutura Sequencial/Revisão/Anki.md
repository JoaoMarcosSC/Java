
TARGET DECK: 4 - Estrutura Sequencial

Qual será o resultado da execução do seguinte código em Java?
int a = 3;
int b = 2;
int c = 4;
int resultado = (a + b) * c;
System.out.println(resultado);
A. 11 B. 14 C. 20 D. 9 #flashcard
Correct answer: C
Justificativa: Seguindo as regras de precedência aritmética, os parênteses têm prioridade. Assim, 3 + 2 é calculado primeiro (5), e o resultado é multiplicado por 4, resultando em 20.
<!--ID: 1768651263461-->


Sobre a declaração de variáveis em Java, quais dos seguintes identificadores são válidos de acordo com as regras de nomenclatura da linguagem? (Selecione duas) 
A. int 1_salario; 
B. double _ altura; 
C. String nome do usuario; 
D. char sexo; 
E. int valor#; #flashcard
Correct answer: B, D
Justificativa: Identificadores não podem começar com dígitos (A), não podem conter espaços em branco (C) e não podem conter caracteres especiais como # (E). Eles podem começar com letras ou sublinhado (_).
<!--ID: 1768651263467-->


Considere o código abaixo. Qual será o valor impresso na tela?
int a = 14;
int b = 3;
System.out.println(a % b);
A. 4 
B. 2 
C. 4.66 
D. 0 #flashcard
Correct answer: B
Justificativa: O operador % (mod) resulta no resto da divisão inteira. 14 dividido por 3 é igual a 4, com resto 2.
<!--ID: 1768651263472-->


Qual é o tamanho em bits e o intervalo de valores aproximado do tipo primitivo byte em Java? 
A. 8 bits, -128 a 127 
B. 16 bits, -32768 a 32767 
C. 8 bits, 0 a 255 
D. 32 bits, -2147483648 a 2147483647 #flashcard
Correct answer: A
Justificativa: O tipo byte é um tipo numérico inteiro de 8 bits que armazena valores de -128 a 127.
<!--ID: 1768651263476-->


O que acontece ao tentar compilar e executar o código abaixo?
double a = 5.0;
int b = a;
System.out.println(b);
A. Imprime 5 
B. Imprime 5.0 
C. Erro de compilação 
D. Erro em tempo de execução (Exception) #flashcard
Correct answer: C
Justificativa: Java não permite a atribuição direta de um tipo double para um int sem um casting explícito, pois há risco de perda de dados. O compilador emitirá um erro.
<!--ID: 1768651263481-->


Analise o código abaixo e selecione a alternativa que representa o valor de resultado após a execução:
int a = 5;
int b = 2;
double resultado = a / b;
A. 2.5 
B. 2.0 
C. 3.0 
D. 2 #flashcard
Correct answer: B
Justificativa: Como a e b são inteiros, a divisão realizada é inteira (truncada), resultando em 2. Esse valor é então atribuído à variável double, tornando-se 2.0. Para obter 2.5, seria necessário fazer o casting de um dos operandos.
<!--ID: 1768651263486-->


No método printf, quais marcadores de formato são usados para representar, respectivamente, um número inteiro, um ponto flutuante e uma String? 
A. %d, %f, %s 
B. %i, %d, %s 
C. %f, %d, %n 
D. %s, %f, %d #flashcard
Correct answer: A
Justificativa: De acordo com os padrões do Java, %d é usado para inteiros, %f para ponto flutuante e %s para textos (String).
<!--ID: 1768651263491-->


Ao utilizar a classe Scanner para ler um número inteiro e, logo em seguida, tentar ler uma linha completa com nextLine(), qual problema o desenvolvedor pode enfrentar? 
A. O programa trava (Deadlock). 
B. O nextLine() lê corretamente o texto digitado. 
C. O nextLine() consome uma quebra de linha pendente e não permite a digitação do texto. 
D. O compilador gera um erro de sintaxe #flashcard
Correct answer: C
Justificativa: Comandos como nextInt() ou nextDouble() deixam uma quebra de linha (\n) pendente no buffer. O nextLine() seguinte absorve essa quebra de linha e termina imediatamente.
<!--ID: 1768651263496-->


Qual o comando correto para garantir que o separador decimal utilizado pelo Scanner seja o ponto (.), independente da configuração regional do sistema? 
A. Scanner.setSeparator('.'); 
B. System.setLocale(Locale.US); 
C. Locale.setDefault(Locale.US); 
D. Scanner sc = new Scanner(System.in).useDot(); #flashcard
Correct answer: C
Justificativa: Para considerar o ponto como separador, deve-se definir a localidade padrão como Locale.US antes de instanciar o Scanner.
<!--ID: 1768651263500-->


Qual função da classe Math deve ser utilizada para calcular a raiz quadrada de um número e qual o tipo de retorno dessa função? 
A. Math.sqrt(x), retorna int 
B. Math.root(x), retorna double 
C. Math.sqrt(x), retorna double 
D. Math.pow(x, 0.5), retorna float #flashcard
Correct answer: C
Justificativa: A função Math.sqrt(x) é a responsável pela raiz quadrada e, como a maioria das funções matemáticas da classe Math, retorna um valor do tipo double.
<!--ID: 1768651263505-->


Analise as afirmações sobre o tipo char em Java e selecione a correta: 
A. O tipo char ocupa 8 bits. 
B. O tipo char armazena um único caractere Unicode de 16 bits. 
C. Pode-se atribuir uma String de um caractere a um char: char c = "A";. 
D. O valor padrão de um char é '0' #flashcard
Correct answer: B
Justificativa: O char em Java utiliza 16 bits para suportar o padrão Unicode. A opção C está incorreta pois Strings usam aspas duplas, enquanto literais char usam aspas simples.
<!--ID: 1768651263512-->


Qual será a saída do código abaixo?
double x = 10.35784;
System.out.printf("%.2f%n", x);
A. 10.35 
B. 10.36 
C. 10.357 
D. 10,36 (ou 10.36 dependendo do locale) #flashcard
Correct answer: D
Justificativa: O formatador %.2f arredonda o valor para duas casas decimais. A saída usará vírgula ou ponto dependendo da localidade configurada no sistema.
<!--ID: 1768651263517-->


Sobre a operação de Casting, qual das seguintes expressões realiza a conversão correta para que o resultado da divisão seja 2.5?
int a = 5;
int b = 2;
A. double resultado = a / b; 
B. double resultado = (double) a / b; 
C. double resultado = (double) (a / b); 
D. double resultado = a / (int) b; #flashcard
Correct answer: B
Justificativa: O casting deve ser aplicado a um dos operandos antes da operação. Em C, o casting ocorre após a divisão inteira (que já resultou em 2), portanto o resultado seria 2.0.
<!--ID: 1768651263521-->


Qual é o resultado da expressão 3 + 2 * 4 em Java? 
A. 20 
B. 11 
C. 14 
D. 9 #flashcard
Correct answer: B
Justificativa: De acordo com a precedência dos operadores aritméticos, a multiplicação (*) é executada antes da adição (+).
<!--ID: 1768651263526-->


Ao trabalhar com números do tipo float em Java, qual é a boa prática recomendada para literais, conforme as fontes? 
A. Adicionar o sufixo d ao número. 
B. Usar apenas números inteiros. 
C. Adicionar o sufixo f ao número (ex: 5f). 
D. Colocar o número entre aspas simples #flashcard
Correct answer: C
Justificativa: Para expressões de ponto flutuante do tipo float, é uma boa prática (e muitas vezes necessário para o compilador) indicar o tipo usando o sufixo f.
<!--ID: 1768651263531-->


Faça um programa em Java que leia dois valores inteiros, calcule a soma entre eles e mostre o resultado no formato SOMA = resultado conforme os exemplos fornecidos. #flashcard
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
int soma = a + b;
System.out.println("SOMA = " + soma);
sc.close();
<!--ID: 1768651263535-->



Faça um programa em Java que leia o valor do raio de um círculo, calcule a área usando a fórmula area = π * raio², considerando π = 3.14159, e exiba o resultado com quatro casas decimais. #flashcard
Scanner sc = new Scanner(System.in);
double raio = sc.nextDouble();
double pi = 3.14159;
double area = pi * raio * raio;
System.out.printf("A=%.4f%n", area);
sc.close();
<!--ID: 1768651263541-->


Faça um programa em Java que leia quatro valores inteiros A, B, C e D e calcule a diferença entre o produto de A e B e o produto de C e D usando a fórmula DIFERENCA = (A * B - C * D). #flashcard
Scanner sc = new Scanner(System.in);
int A = sc.nextInt();
int B = sc.nextInt();
int C = sc.nextInt();
int D = sc.nextInt();
int diferenca = A * B - C * D;
System.out.println("DIFERENCA = " + diferenca);
sc.close();
<!--ID: 1768651263546-->


Faça um programa em Java que leia o número de um funcionário, a quantidade de horas trabalhadas e o valor recebido por hora, calcule o salário e exiba o número do funcionário e o salário com duas casas decimais. #flashcard
Scanner sc = new Scanner(System.in);
int numero = sc.nextInt();
int horas = sc.nextInt();
double valorHora = sc.nextDouble();
double salario = horas * valorHora;
System.out.println("NUMBER = " + numero);
System.out.printf("SALARY = U$ %.2f%n", salario);
sc.close();
<!--ID: 1768651263550-->



Faça um programa em Java que leia os dados de duas peças (código, quantidade e valor unitário de cada uma) e calcule o valor total a ser pago. #flashcard
Scanner sc = new Scanner(System.in);
int cod1 = sc.nextInt();
int qtd1 = sc.nextInt();
double val1 = sc.nextDouble();
int cod2 = sc.nextInt();
int qtd2 = sc.nextInt();
double val2 = sc.nextDouble();
double total = qtd1 * val1 + qtd2 * val2;
System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
sc.close();
<!--ID: 1768651263555-->


Faça um programa em Java que leia três valores reais A, B e C e calcule as áreas do triângulo, círculo, trapézio, quadrado e retângulo conforme as fórmulas especificadas no enunciado. #flashcard
Scanner sc = new Scanner(System.in);
double A = sc.nextDouble();
double B = sc.nextDouble();
double C = sc.nextDouble();
double pi = 3.14159;
System.out.printf("TRIANGULO: %.3f%n", (A * C) / 2);
System.out.printf("CIRCULO: %.3f%n", pi * C * C);
System.out.printf("TRAPEZIO: %.3f%n", (A + B) * C / 2);
System.out.printf("QUADRADO: %.3f%n", B * B);
System.out.printf("RETANGULO: %.3f%n", A * B);
sc.close();
<!--ID: 1768651263560-->

