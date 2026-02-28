
TARGET DECK: 10 - Arrays e Listas

Considere o seguinte código Java: Product p1 = new Product("TV", 900.00); Product p2 = p1;. O que acontece na memória após a execução dessas linhas?
A. Um novo objeto "Product" é criado no Heap e os dados de p1 são copiados para uma nova área de memória para p2. 
B. p2 passa a ser um ponteiro (referência) para o mesmo objeto no Heap que p1 está apontando. 
C. O Java gera um erro de compilação, pois não é possível atribuir uma classe a outra diretamente. 
D. p1 e p2 tornam-se tipos valor e são armazenados exclusivamente no #flashcard
Resposta Correta: B
Justificativa: Em Java, classes são tipos referência. Quando fazemos p2 = p1, a variável p2 passa a apontar para o mesmo endereço de memória no Heap para o qual p1 aponta.
<!--ID: 1771252689325-->


Qual é a principal diferença de comportamento entre tipos primitivos (como int, double) e tipos referência (classes) em relação à atribuição e valores nulos?
A. Tipos primitivos podem receber o valor null, enquanto tipos referência não podem. 
B. Na atribuição y = x, tipos referência recebem uma cópia do valor, enquanto tipos primitivos passam a apontar para o mesmo endereço. ****
C. Tipos referência aceitam o valor null e variáveis são ponteiros; tipos primitivos não aceitam null e variáveis são "caixas" que guardam o valor. 
D. Tipos primitivos são instanciados no Heap usando a palavra-chave #flashcard
Resposta Correta: C
Justificativa: De acordo com as fontes, tipos referência (classes) aceitam null e funcionam como ponteiros, enquanto tipos primitivos são tipos valor ("caixas") e não aceitam null.
<!--ID: 1771252689330-->


Analise o código: int p; System.out.println(p);. Qual será o resultado da compilação/execução?
A. Imprime 0. 
B. Imprime null. 
C. Erro de compilação: a variável p não foi iniciada. 
D. Erro de execução: NullPointerException #flashcard
Resposta Correta: C
Justificativa: Variáveis locais de tipos primitivos em Java não recebem valores padrão automaticamente e devem ser inicializadas antes de serem usadas. O compilador gera um erro se houver tentativa de leitura sem inicialização.
<!--ID: 1771252689334-->


Quando um objeto alocado no Heap torna-se elegível para o Garbage Collector?
A. Assim que o programa termina sua execução completa. 
B. Imediatamente após a palavra-chave new ser executada. 
C. Quando o objeto não possui mais nenhuma referência apontando para ele. 
D. Apenas quando o programador chama manualmente a função de #flashcard
Resposta Correta: C
Justificativa: O Garbage Collector monitora objetos no heap e desaloca aqueles que não possuem mais referências ativas (não estão mais sendo utilizados pelo programa).
<!--ID: 1771252689338-->


Sobre vetores (arrays) em Java, quais das seguintes afirmações são verdadeiras? (Selecione todas as corretas)
A. São estruturas de dados homogêneas e ordenadas. 
B. O tamanho de um array em Java é dinâmico e pode ser alterado após a instanciação. 
C. Os elementos de um array são alocados em um bloco contíguo de memória. 
D. O acesso aos elementos de um array é imediato por meio de sua #flashcard
Resposta Correta: A, C, D
Justificativa: Vetores são homogêneos, ordenados e alocados em blocos contíguos de memória, permitindo acesso imediato pela posição. Sua principal desvantagem é possuir tamanho fixo, ao contrário das listas.
<!--ID: 1771252689342-->


Considere a declaração: Product[] vect = new Product;. Quais serão os valores iniciais de vect, vect e vect?
A. Objetos vazios da classe Product. 
B. null. 
C. 0. 
D. Erro de compilação por falta de #flashcard
Resposta Correta: B
Justificativa: Quando alocamos um tipo estruturado (como um array de objetos), os elementos são iniciados com valores padrão. Para tipos referência (objetos), o valor padrão é null.
<!--ID: 1771252689346-->


O que caracteriza os processos de "Boxing" e "Unboxing" em Java?
A. Boxing é a conversão de um objeto tipo referência para um tipo valor; Unboxing é o inverso. 
B. Boxing é converter um tipo primitivo (valor) para um objeto tipo referência compatível; Unboxing é recuperar o valor primitivo do objeto. 
C. São processos exclusivos para a manipulação de Strings e caracteres. 
D. É a técnica de agrupar vários arrays em uma única #flashcard
Resposta Correta: B
Justificativa: Conforme o material, Boxing é a conversão de um tipo valor para um tipo referência compatível (ex: int para Object ou Integer), e Unboxing é o processo inverso.
<!--ID: 1771252689350-->


Por que é comum o uso de Wrapper Classes (como Integer, Double) em vez de tipos primitivos em campos de entidades de sistemas de informação?
A. Porque Wrapper Classes ocupam menos espaço na memória Stack. 
B. Porque Wrapper Classes aceitam valor null, o que é útil para representar a ausência de dados em bancos de dados. 
C. Porque tipos primitivos não funcionam dentro de loops for. 
D. Porque Wrapper Classes impedem o uso do Garbage #flashcard
Resposta Correta: B
Justificativa: O uso de Wrapper Classes é importante em sistemas pois, sendo tipos referência, elas aceitam null e usufruem dos recursos de Orientação a Objetos.
<!--ID: 1771252689354-->


Qual é a sintaxe correta para percorrer um array String[] nomes usando o laço "for each"?
A. for (nomes : String s) { ... } 
B. for (String s = nomes) { ... } 
C. for (String s : nomes) { ... } 
D. for (int i : nomes.length) { ... } #flashcard
Resposta Correta: C
Justificativa: A sintaxe do for-each em Java é for (Tipo apelido : coleção), onde "Tipo" é o tipo dos elementos, "apelido" é a variável local e "coleção" é o array ou lista a ser percorrido.
<!--ID: 1771252689358-->
****************

Sobre a interface List e a classe ArrayList, qual das alternativas é FALSA?
A. A lista inicia vazia e seus elementos são alocados sob demanda. 
B. Diferente dos arrays, as listas permitem inserções e deleções de forma mais fácil. 
C. O tamanho da lista é acessado pela propriedade length. 
D. Listas não aceitam tipos primitivos diretamente sem que ocorra #flashcard
Resposta Correta: C
Justificativa: Em Java, o tamanho de um array é obtido via .length, mas para listas (como ArrayList), o tamanho é obtido através do método .size().
<!--ID: 1771252689363-->


Analise o seguinte comando de uma lista chamada list: list.removeIf(x -> x.charAt(0) == 'M');. Qual a função deste código?
A. Remove o primeiro elemento da lista se ele for a letra 'M'. 
B. Remove todos os elementos da lista que começam com a letra 'M'. 
C. Adiciona o caractere 'M' em todos os elementos da lista. 
D. Gera um erro de compilação, pois removeIf não aceita #flashcard
Resposta Correta: B
Justificativa: O método removeIf utiliza um predicado (lambda). Neste caso, ele percorre a lista e remove todos os elementos x cuja primeira letra (charAt(0)) seja igual a 'M'.
<!--ID: 1771252689366-->


Em relação à memória, onde são armazenados os objetos criados com new e onde ficam as variáveis locais de um método?
A. Objetos no Stack; Variáveis locais no Heap. 
B. Tudo é armazenado no Stack para maior performance. 
C. Tudo é armazenado no Heap para permitir o Garbage Collector. 
D. Objetos no Heap; Variáveis locais no #flashcard
Resposta Correta: D
Justificativa: Objetos instanciados dinamicamente residem no Heap. Variáveis locais (como tipos primitivos e ponteiros de referência) residem no Stack e são desalocadas quando o escopo termina.
<!--ID: 1771252689371-->


Dada uma matriz int[][] mat = new int;, como se obtém a quantidade de linhas e a quantidade de colunas da primeira linha, respectivamente?
A. mat.size() e mat.size() 
B. mat.length e mat.length 
C. mat.width e mat.height 
D. mat.total e mat.sub #flashcard
Resposta Correta: B
Justificativa: Como matrizes em Java são "vetores de vetores", mat.length retorna a quantidade de linhas (tamanho do array principal) e mat[i].length retorna a quantidade de colunas daquela linha específica.
<!--ID: 1771252689375-->


Ao utilizar list.stream().filter(x -> x > 4).findFirst().orElse(null);, o que o método orElse(null) garante?
A. Que a lista será limpa caso o valor não seja encontrado. 
B. Que se nenhum elemento atender ao critério (maior que 4), o resultado será o valor null. 
C. Que o primeiro elemento da lista será sempre excluído. 
D. Que o programa lançará uma exceção se não houver #flashcard
Resposta Correta: B
Justificativa: O método findFirst() retorna um Optional. O uso de orElse(null) define que, caso o filtro não encontre nenhum resultado, a variável receberá null em vez de causar erro ou retornar um objeto vazio.
<!--ID: 1771252689379-->


Qual das seguintes estruturas de dados é a mais indicada quando se necessita de acesso imediato a um elemento pela sua posição, mas o tamanho da coleção nunca mudará?
A. ArrayList 
B. LinkedList 
C. Vetor (Array) 
D. Stream #flashcard
Resposta Correta: C
Justificativa: Embora as listas tenham vantagens, o vetor (array) é a estrutura mais simples e performática para acesso imediato via índice quando o tamanho é fixo e conhecido previamente.
<!--ID: 1771252689383-->

Faça um programa em Java que leia um número inteiro N (máximo 10), armazene N números inteiros em um vetor e mostre apenas os números negativos digitados. #flashcard

Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int[] vect = new int[n];
for (int i = 0; i < n; i++) {
    vect[i] = sc.nextInt();
}
System.out.println("NUMEROS NEGATIVOS:");
for (int i = 0; i < n; i++) {
    if (vect[i] < 0) {
        System.out.println(vect[i]);
    }
}
sc.close();
<!--ID: 1771253170640-->



Faça um programa que leia N números reais, armazene-os em um vetor e mostre os valores, a soma e a média dos elementos. #flashcard
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
double[] vect = new double[n];
double soma = 0.0;
for (int i = 0; i < n; i++) {
    vect[i] = sc.nextDouble();
    soma += vect[i];
}
System.out.print("VALORES = ");
for (int i = 0; i < n; i++) {
    System.out.print(vect[i] + " ");
}
double media = soma / n;
System.out.printf("%nSOMA = %.2f%n", soma);
System.out.printf("MEDIA = %.2f%n", media);
sc.close();
<!--ID: 1771253170645-->



Faça um programa que leia nome, idade e altura de N pessoas e mostre a altura média e a porcentagem de pessoas com menos de 16 anos, exibindo seus nomes. #flashcard
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
String[] nomes = new String[n];
int[] idades = new int[n];
double[] alturas = new double[n];
double soma = 0.0;
int cont = 0;
for (int i = 0; i < n; i++) {
    sc.nextLine();
    nomes[i] = sc.nextLine();
    idades[i] = sc.nextInt();
    alturas[i] = sc.nextDouble();
    soma += alturas[i];
    if (idades[i] < 16) {
        cont++;
    }
}
double media = soma / n;
double percentual = cont * 100.0 / n;
System.out.printf("Altura media: %.2f%n", media);
System.out.printf("Pessoas com menos de 16 anos: percentual);
for (int i = 0; i < n; i++) {
    if (idades[i] < 16) {
        System.out.println(nomes[i]);
    }
}
sc.close();
<!--ID: 1771253170649-->



Faça um programa que leia N números inteiros e mostre os números pares e a quantidade de pares digitados. #flashcard
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int[] vect = new int[n];
int cont = 0;
for (int i = 0; i < n; i++) {
    vect[i] = sc.nextInt();
}
System.out.println("NUMEROS PARES:");
for (int i = 0; i < n; i++) {
    if (vect[i] % 2 == 0) {
        System.out.print(vect[i] + " ");
        cont++;
    }
}
System.out.println("\nQUANTIDADE DE PARES = " + cont);
sc.close();
<!--ID: 1771253170653-->


Faça um programa que leia N números reais e mostre o maior valor e sua posição no vetor (considerando índice inicial 0). #flashcard
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
double[] vect = new double[n];
for (int i = 0; i < n; i++) {
    vect[i] = sc.nextDouble();
}
double maior = vect[0];
int pos = 0;
for (int i = 1; i < n; i++) {
    if (vect[i] > maior) {
        maior = vect[i];
        pos = i;
    }
}
System.out.println("MAIOR VALOR = " + maior);
System.out.println("POSICAO DO MAIOR VALOR = " + pos);
sc.close();
<!--ID: 1771253170657-->



Faça um programa que leia dois vetores A e B com N elementos e gere um terceiro vetor C contendo a soma dos elementos correspondentes. #flashcard

Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int[] A = new int[n];
int[] B = new int[n];
int[] C = new int[n];
for (int i = 0; i < n; i++) {
    A[i] = sc.nextInt();
}
for (int i = 0; i < n; i++) {
    B[i] = sc.nextInt();
}
for (int i = 0; i < n; i++) {
    C[i] = A[i] + B[i];
    System.out.println(C[i]);
}
sc.close();
<!--ID: 1771253170661-->



Faça um programa que leia N números reais, calcule a média do vetor e mostre os elementos abaixo da média. #flashcard
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
double[] vect = new double[n];
double soma = 0.0;
for (int i = 0; i < n; i++) {
    vect[i] = sc.nextDouble();
    soma += vect[i];
}
double media = soma / n;
System.out.printf("MEDIA DO VETOR = %.3f%n", media);
System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
for (int i = 0; i < n; i++) {
    if (vect[i] < media) {
        System.out.println(vect[i]);
    }
}
sc.close();
<!--ID: 1771253170665-->



Faça um programa que leia N números inteiros e mostre a média apenas dos números pares ou a mensagem “NENHUM NUMERO PAR”. #flashcard
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int[] vect = new int[n];
int soma = 0;
int cont = 0;
for (int i = 0; i < n; i++) {
    vect[i] = sc.nextInt();
    if (vect[i] % 2 == 0) {
        soma += vect[i];
        cont++;
    }
}
if (cont > 0) {
    double media = (double) soma / cont;
    System.out.printf("MEDIA DOS PARES = %.1f%n", media);
} else {
    System.out.println("NENHUM NUMERO PAR");
}
sc.close();
<!--ID: 1771253170670-->



Faça um programa que leia nomes e idades em vetores separados e mostre o nome da pessoa mais velha. #flashcard
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
String[] nomes = new String[n];
int[] idades = new int[n];
int maiorIdade = 0;
String nomeMaisVelho = "";
for (int i = 0; i < n; i++) {
    sc.nextLine();
    nomes[i] = sc.nextLine();
    idades[i] = sc.nextInt();
    if (idades[i] > maiorIdade) {
        maiorIdade = idades[i];
        nomeMaisVelho = nomes[i];
    }
}
System.out.println("PESSOA MAIS VELHA: " + nomeMaisVelho);
sc.close();
<!--ID: 1771253170673-->



Faça um programa que leia nomes e duas notas de alunos e imprima os nomes dos alunos aprovados (média ≥ 6.0). #flashcard
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
String[] nomes = new String[n];
double[] n1 = new double[n];
double[] n2 = new double[n];
for (int i = 0; i < n; i++) {
    sc.nextLine();
    nomes[i] = sc.nextLine();
    n1[i] = sc.nextDouble();
    n2[i] = sc.nextDouble();
}
System.out.println("Alunos aprovados:");
for (int i = 0; i < n; i++) {
    double media = (n1[i] + n2[i]) / 2.0;
    if (media >= 6.0) {
        System.out.println(nomes[i]);
    }
}
sc.close();
<!--ID: 1771253170677-->



Faça um programa que leia altura e gênero (M/F) de N pessoas e calcule menor altura, maior altura, média das mulheres e número de homens. #flashcard
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
double[] alturas = new double[n];
char[] genero = new char[n];
double menor = 0, maior = 0, somaMulheres = 0;
int contMulheres = 0, contHomens = 0;
for (int i = 0; i < n; i++) {
    alturas[i] = sc.nextDouble();
    genero[i] = sc.next().charAt(0);
    if (i == 0) {
        menor = maior = alturas[i];
    } else {
        if (alturas[i] < menor) menor = alturas[i];
        if (alturas[i] > maior) maior = alturas[i];
    }
    if (genero[i] == 'F') {
        somaMulheres += alturas[i];
        contMulheres++;
    } else {
        contHomens++;
    }
}
System.out.printf("Menor altura = %.2f%n", menor);
System.out.printf("Maior altura = %.2f%n", maior);
if (contMulheres > 0) {
    double media = somaMulheres / contMulheres;
    System.out.printf("Media das alturas das mulheres = %.2f%n", media);
}
System.out.println("Numero de homens = " + contHomens);
sc.close();
<!--ID: 1771253170681-->


