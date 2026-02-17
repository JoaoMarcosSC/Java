
TARGET DECK: 18 - Programação Funcional, Expressões Lambda

No contexto do paradigma de programação funcional, o que significa dizer que uma função possui "transparência referencial"?
A. A função pode acessar e modificar variáveis globais a qualquer momento. 
B. O resultado da função é sempre o mesmo para os mesmos dados de entrada, sem efeitos colaterais. 
C. A função deve ser obrigatoriamente declarada dentro de uma interface funcional. 
D. A função permite que o compilador altere logicamente a ordem dos comandos para otimizar o processamento. #flashcard
Resposta Correta: B
Justificativa: Uma função possui transparência referencial se seu resultado for sempre o mesmo para os mesmos dados de entrada, implicando na ausência de efeitos colaterais.
<!--ID: 1771335240621-->


Qual das alternativas define corretamente uma "Interface Funcional" em Java?
A. É qualquer interface que possua pelo menos um método default. 
B. É uma interface que herda obrigatoriamente de java.lang.Runnable. 
C. É uma interface que possui um único método abstrato. 
D. É uma interface que não possui métodos, servindo apenas como marcação. #flashcard
Resposta Correta: C
Justificativa: De acordo com as fontes, uma interface funcional é aquela que possui um único método abstrato, e suas implementações são tratadas como expressões lambda.
<!--ID: 1771335240626-->


Sobre expressões lambda em Java, é correto afirmar que:
A. São funções anônimas de primeira classe. 
B. Exigem a declaração explícita de todos os tipos de dados dos parâmetros. 
C. Só podem ser utilizadas em conjunto com a interface Serializable. 
D. Não podem ser passadas como argumentos para métodos. #flashcard
Resposta Correta: A
Justificativa: Em programação funcional, uma expressão lambda corresponde a uma função anônima de primeira classe.
<!--ID: 1771335240631-->


Considere o uso do operador :: em Java. Qual é a finalidade técnica dessa sintaxe?
A. Comparar se dois objetos são instâncias da mesma classe. 
B. Representar uma referência de método (Method Reference), permitindo passar funções como parâmetros. 
C. Acessar membros privados de uma superclasse. 
D. Criar uma nova instância de uma interface funcional. #flashcard
Resposta Correta: B
Justificativa: O operador :: é usado para "method references" (Classe::método), indicando que funções podem ser passadas como parâmetros ou retornadas.
<!--ID: 1771335240635-->


Qual interface funcional é a mais adequada para ser utilizada com o método removeIf de uma coleção?
A. Consumer< T > 
B. Function<T, R > 
C. Predicate< T > 
D. Supplier< T > #flashcard
Resposta Correta: C
Justificativa: O método removeIf recebe um Predicate< T >, que possui o método boolean test(T t) para decidir quais elementos devem ser removidos.
<!--ID: 1771335240640-->


Analise o seguinte código e identifique a interface funcional que define o comportamento do método forEach: list.forEach(p -> System.out.println(p.getName()));
A. Predicate 
B. Function 
C. Supplier 
D. Consumer #flashcard
Resposta Correta: D
Justificativa: O método forEach utiliza a interface Consumer< T >, cujo método abstrato é void accept(T t), sendo esperado que ele possa gerar efeitos colaterais como impressões em tela.
<!--ID: 1771335240645-->


Sobre a API de Streams do Java, qual das seguintes afirmações sobre "Operações Intermediárias" é verdadeira?
A. Elas produzem um resultado final (como uma lista ou um número) e encerram a stream. 
B. Elas retornam uma nova stream e são executadas apenas quando uma operação terminal é invocada (lazy evaluation). 
C. Exemplos incluem forEach, count e reduce. 
D. Só podem existir no máximo duas operações intermediárias em um pipeline. #flashcard
Resposta Correta: B
Justificativa: Operações intermediárias produzem uma nova stream, permitindo o encadeamento, e só executam quando uma operação terminal é invocada, característica conhecida como "lazy evaluation".
<!--ID: 1771335240650-->


No processamento de dados com Streams, qual operação é utilizada para transformar os elementos de uma stream em outros elementos (por exemplo, transformar uma lista de objetos em uma lista de Strings com os nomes desses objetos)?
A. filter 
B. map 
C. distinct 
D. sorted #flashcard
Resposta Correta: B
Justificativa: A função map aplica uma função a todos os elementos de uma stream para transformá-los.
<!--ID: 1771335240656-->


Quais das opções abaixo são consideradas "Operações Terminais" em uma Stream? (Selecione todas as que se aplicam)
A. filter 
B. collect 
C. reduce 
D. limit #flashcard
Resposta Correta: B, C
Justificativa: collect e reduce são operações terminais que produzem um objeto não-stream ou um valor. filter e limit são operações intermediárias.
<!--ID: 1771335240661-->


Qual a principal característica de uma Stream em relação ao seu uso?
A. Ela pode ser reutilizada várias vezes após o processamento. 
B. Ela permite acesso aleatório aos elementos através de índices. 
C. Ela é "single-use", ou seja, só pode ser operada uma única vez. 
D. Ela armazena os dados permanentemente na memória. #flashcard
Resposta Correta: C
Justificativa: Uma stream é "single-use", o que significa que ela só pode ser "usada" uma única vez em um pipeline.
<!--ID: 1771335240666-->


Considere o método Stream.iterate(0, x -> x + 2). Como esse método se comporta?
A. Ele cria uma stream finita com apenas dois elementos (0 e 2). 
B. Ele gera uma stream infinita de números pares começando em 0. 
C. Ele lança um erro de compilação por não possuir um limite definido. 
D. Ele soma todos os números de zero até dois. #flashcard
Resposta Correta: B
Justificativa: O método Stream.iterate cria uma stream baseada em uma função de iteração; no exemplo dado, ele gera uma sequência infinita começando em 0 e somando 2 a cada passo.
<!--ID: 1771335240671-->


Dada a interface Function<T, R>, o que representam os tipos genéricos T e R?
A. T é o tipo do argumento de entrada e R é o tipo do resultado. 
B. Ambos devem obrigatoriamente ser do tipo String. 
C. T é o tipo do retorno e R é o tipo do argumento. 
D. Representam dois argumentos de entrada para uma função matemática. #flashcard
Resposta Correta: A
Justificativa: A interface Function<T, R> define o método R apply(T t), onde T é o tipo de entrada e R é o tipo do resultado retornado.
<!--ID: 1771335240675-->


Qual operação de Stream é classificada como "short-circuit"?
A. map 
B. anyMatch 
C. forEach 
D. reduce #flashcard
Resposta Correta: B
Justificativa: De acordo com as fontes, operações como anyMatch, allMatch, noneMatch, findFirst, findAny e limit são consideradas "short-circuit".
<!--ID: 1771335240680-->


Analise o trecho de código abaixo: int sum = list.stream().reduce(0, (x, y) -> x + y); Qual é a função do valor 0 nesta operação?
A. É o valor máximo permitido para a soma. 
B. É o valor de identidade (inicial) da redução. 
C. Indica que a stream deve ser filtrada para ignorar zeros. 
D. É o índice do elemento onde a soma deve começar. #flashcard
Resposta Correta: B
Justificativa: No método reduce, o primeiro argumento (0) é o valor de identidade inicial sobre o qual a operação de acumulação será aplicada.
<!--ID: 1771335240684-->


Qual é a ordem correta das etapas para converter uma lista em uma stream, filtrar os dados, transformar os dados e, por fim, voltar para uma lista?
A. list.collect(...).filter(...).map(...).stream() 
B. list.stream().filter(...).map(...).collect(...) 
C. list.map(...).filter(...).collect(...).stream() 
D. list.stream().collect(...).map(...).filter(...) #flashcard
Resposta Correta: B
Justificativa: O pipeline padrão demonstrado nas fontes segue a ordem: converter para stream (.stream()), aplicar operações intermediárias (filter, map) e aplicar a operação terminal para coletar o resultado (collect).
<!--ID: 1771335240689-->

Faça um programa em Java que leia funcionários de um arquivo .csv (nome, email e salário) e armazene-os em uma lista. #flashcard
Scanner sc = new Scanner(System.in);
String path = sc.nextLine();
List< Employee > list = new ArrayList<>();
try (BufferedReader br = new BufferedReader(new FileReader(path))) {
    String line = br.readLine();
    while (line != null) {
        String[] fields = line.split(",");
        String name = fields[0];
        String email = fields[1];
        double salary = Double.parseDouble(fields[2]);
        list.add(new Employee(name, email, salary));
        line = br.readLine();
    }
}
catch (IOException e) {
    System.out.println("Error: " + e.getMessage());
}
<!--ID: 1771335511380-->



Utilize Stream API para mostrar, em ordem alfabética, os emails dos funcionários cujo salário seja maior que um valor informado pelo usuário. #flashcard
double salary = sc.nextDouble();
List< String > emails = list.stream()
        .filter(e -> e.getSalary() > salary)
        .map(Employee::getEmail)
        .sorted()
        .collect(Collectors.toList());
emails.forEach(System.out::println);
<!--ID: 1771335511384-->



Utilize Stream API para calcular a soma dos salários dos funcionários cujo nome começa com a letra 'M'. #flashcard
double sum = list.stream()
        .filter(e -> e.getName().charAt(0) == 'M')
        .map(Employee::getSalary)
        .reduce(0.0, Double::sum);
<!--ID: 1771335511388-->


System.out.printf("Sum of salary of people whose name starts with 'M': %.2f%n", sum);


Implemente a classe Employee contendo nome, email e salário para ser utilizada com Stream API. #flashcard
public class Employee {
    private String name;
    private String email;
    private Double salary;
    public Employee(String name, String email, Double salary) {
        this.name = name;
        this.email = email;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public Double getSalary() {
        return salary;
    }
}
<!--ID: 1771335511392-->

Implemente o fluxo principal que leia o caminho do arquivo, o salário de referência e execute os dois processamentos utilizando expressões lambda. #flashcard
Scanner sc = new Scanner(System.in);
String path = sc.nextLine();
double salary = sc.nextDouble();
List< Employee > list = new ArrayList<>();
try (BufferedReader br = new BufferedReader(new FileReader(path))) {
    String line = br.readLine();
    while (line != null) {
        String[] fields = line.split(",");
        list.add(new Employee(
                fields[ 0 ],
                fields[ 1 ],
                Double.parseDouble(fields[ 2 ])
        ));
        line = br.readLine();
    }
}
catch (IOException e) {
    System.out.println("Error: " + e.getMessage());
}
list.stream()
        .filter(e -> e.getSalary() > salary)
        .map(Employee::getEmail)
        .sorted()
        .forEach(System.out::println);
double sum = list.stream()
        .filter(e -> e.getName().startsWith("M"))
        .map(Employee::getSalary)
        .reduce(0.0, Double::sum);

System.out.printf("Sum: %.2f%n", sum);
sc.close();