
TARGET DECK: 7 - Outros Tópicos Básicos

De acordo com as restrições de nomes de variáveis em Java apresentadas no material, qual das seguintes declarações é válida? 
A. int 5minutes; 
B. int salario do funcionario; 
C. int  _ 5minutes; 
D. int salário; #flashcard
Resposta Correta: C Justificativa: Segundo as fontes, uma variável não pode começar com um dígito, não pode conter espaços em branco e não deve utilizar acentos ou til. A alternativa C é a única que segue a regra de começar com uma letra ou sublinhado (_ ) e não possui caracteres inválidos.
<!--ID: 1771182894933-->


Na convenção de nomenclatura da linguagem Java, o padrão "Pascal Case" (ex: ProductService) deve ser aplicado preferencialmente a quais elementos? 
A. Pacotes e atributos. 
B. Métodos e variáveis. 
C. Somente a parâmetros de funções. 
D. Classes. #flashcard
Resposta Correta: D Justificativa: As fontes indicam expressamente que o padrão Pascal Case é a convenção utilizada para a nomeação de classes. Outros elementos como pacotes, atributos, métodos e variáveis utilizam o padrão Camel Case.
<!--ID: 1771182894939-->


Considere o seguinte código Java: int n1 = 89; int n2 = 60; System.out.println(n1 & n2);. Qual será o resultado impresso no console? 
A. 125 
B. 24 
C. 101 
D. 0 #flashcard
Resposta Correta: B Justificativa: O operador & realiza a operação "E" bit a bit. Comparando os bits de 89 (0101 1001) e 60 (0011 1100), o resultado binário é 0001 1000, que corresponde ao valor decimal 24.
<!--ID: 1771182894944-->


Qual operador bitwise é utilizado para realizar a operação "OU-exclusivo" (XOR) bit a bit em Java? A. & 
B. | 
C. ^ 
D. && #flashcard
Resposta Correta: C Justificativa: De acordo com a tabela de operadores bitwise, o símbolo ^ representa a operação "OU-exclusivo" bit a bit.
<!--ID: 1771182894949-->


Observe o fragmento de código: String original = "abcde FGHIJ ABC abc DEFG   "; String s = original.substring(2, 9);. Qual será o conteúdo da variável s? 
A. "bcde FG" 
B. "cde FGH" 
C. "cde FGHI" 
D. "abcde FG" #flashcard
Resposta Correta: B Justificativa: A função substring(inicio, fim) recorta a string começando no índice de inicio (inclusivo) e indo até o índice de fim (exclusivo). No exemplo, os caracteres nos índices 2 a 8 da string original resultam em "cde FGH".
<!--ID: 1771182894954-->


Se um desenvolvedor deseja remover os espaços em branco extras apenas no início e no final de uma String em Java, qual função ele deve utilizar? 
A. toLowerCase() 
B. split() 
C. trim() 
D. replace() #flashcard
Resposta Correta: C Justificativa: A função trim() é especificamente utilizada para formatar a string, removendo espaços em branco nas extremidades.
<!--ID: 1771182894959-->


Analise o código abaixo sobre a operação split:String s = "potato apple lemon"; String[] vect = s.split(" ");Qual valor estará armazenado em vect? 
A. "potato" 
B. "apple" 
C. "lemon" 
D. " " #flashcard
Resposta Correta: B Justificativa: A função split(" ") divide a string em partes com base no separador fornecido (espaço, neste caso) e armazena o resultado em um vetor. O índice 0 recebe "potato", o índice 1 recebe "apple" e o índice 2 recebe "lemon".
<!--ID: 1771182894964-->


Qual é a finalidade técnica comum da aplicação de operadores bitwise, conforme demonstrado no exemplo prático do material? 
A. Substituir caracteres em uma String. 
B. Realizar cálculos de ponto flutuante com precisão. 
C. Verificar o estado de um bit específico (ex: verificar se o 6º bit é verdadeiro). 
D. Formatar a saída de números decimais para binário. #flashcard
Resposta Correta: C Justificativa: Uma aplicação comum dos operadores bitwise, demonstrada no código exemplo, é a utilização de uma máscara binária para verificar o estado (verdadeiro ou falso) de bits individuais dentro de um número.
<!--ID: 1771182894969-->


Sobre as funções de substituição na classe String, quais das seguintes assinaturas são válidas de acordo com as fontes? (Selecione todas as corretas) 
A. replace(char, char) 
B. replace(string, string) 
C. replaceAll(index, string) 
D. substring(char, char) #flashcard
Resposta Correta: A, B Justificativa: As fontes listam duas formas da função replace: uma que substitui um caractere (char) por outro e outra que substitui uma subcadeia de caracteres (string) por outra.
<!--ID: 1771182894973-->


Em Java, para comentários que abrangem múltiplas linhas, qual sintaxe deve ser utilizada? 
A. // 
B. /* ... * / 
C. # 
D. -- #flashcard
Resposta Correta: B Justificativa: O material exemplifica o uso de comentários de múltiplas linhas utilizando a sintaxe /* ... */, como visto no programa que calcula as raízes de uma equação. O símbolo // é usado para comentários de linha única.
<!--ID: 1771182894977-->


Quais são as principais vantagens de utilizar funções (ou métodos) em um programa Java? (Selecione todas as corretas) 
A. Modularização. 
B. Aumento obrigatório da velocidade de execução. 
C. Delegação de responsabilidades. 
D. Reaproveitamento de código. #flashcard
Resposta Correta: A, C, D Justificativa: De acordo com as fontes, as principais vantagens das funções são a modularização, a delegação e o reaproveitamento. O aumento de velocidade não é mencionado como uma vantagem intrínseca da sintaxe de funções.
<!--ID: 1771182894982-->


Considere a assinatura de método: public static int max(int x, int y, int z). O que o termo void significaria se substituísse o termo int nesta assinatura? 
A. O método retornaria obrigatoriamente um valor zero. 
B. O método não retornaria nenhum valor de saída. 
C. O método só aceitaria parâmetros do tipo String. 
D. O método seria visível apenas dentro da própria classe. #flashcard
Resposta Correta: B Justificativa: Funções podem ou não retornar uma saída. Quando um método não retorna nenhum valor, utiliza-se a palavra-chave void, como no exemplo da função showResult(int value).
<!--ID: 1771182894987-->


No fragmento de código String original = "abcde FGHIJ ABC abc DEFG   "; int i = original.indexOf("bc");, qual será o valor da variável i? 
A. 0 
B. 1 
C. 2 
D. -1 #flashcard
Resposta Correta: B Justificativa: A função indexOf busca a primeira ocorrência da subcadeia informada. Na string "abcde...", a sequência "bc" começa na segunda posição, que corresponde ao índice 1 (já que a contagem inicia em zero).
<!--ID: 1771182894992-->


Qual será o resultado da operação bitwise 89 | 60? 
A. 24 
B. 101 
C. 125 
D. 149 #flashcard
Resposta Correta: C Justificativa: O operador | realiza a operação "OU" bit a bit. A comparação bit a bit entre 89 (0101 1001) e 60 (0011 1100) resulta em 0111 1101, que é 125 em decimal.
<!--ID: 1771182894997-->


Ao definir um método para encontrar o maior entre três números, como o exemplo max(a, b, c), qual estrutura de controle foi utilizada internamente para a lógica de comparação? 
A. switch-case 
B. while loop 
C. if-else encadeado 
D. for loop #flashcard
Resposta Correta: C Justificativa: O exemplo prático implementa a lógica da função max utilizando uma estrutura de if-else para comparar as variáveis x, y e z e determinar qual é o maior valor.
<!--ID: 1771182895001-->

Refatore o programa que encontra o maior entre três números utilizando métodos max e showResult. #flashcard 
public static int max(int x, int y, int z) {
    int aux;
    if (x > y && x > z) {
        aux = x;
    } else if (y > z) {
        aux = y;
    } else {
        aux = z;
    }
    return aux;
}
public static void showResult(int value) {
    System.out.println("Higher = " + value);
}
<!--ID: 1771183130574-->


