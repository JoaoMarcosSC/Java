
TARGET DECK: 17 - Generics, Set, Map

Quais são os principais benefícios de utilizar Generics em Java? (Selecione todas as que se aplicam)
A. Aumento de performance ao evitar o casting excessivo. 
B. Reuso de código para diferentes tipos de dados. 
C. Segurança de tipos (Type safety), permitindo que o compilador detecte erros de tipo. 
D. Permite que uma lista de inteiros seja referenciada por uma variável de lista de objetos. #flashcard 
Resposta Correta: A, B, C
Justificativa: De acordo com as fontes, os benefícios do Generics são reuso, type safety e performance. A alternativa D está incorreta porque Generics são invariantes em Java.
<!--ID: 1771334222976-->


Considere o seguinte trecho de código. Qual será o resultado da compilação?
List< Object > myObjs = new ArrayList< Object >();
List< Integer > myNumbers = new ArrayList< Integer >();
myObjs = myNumbers;
A. Compila normalmente, pois Integer é um subtipo de Object. 
B. Erro de compilação, pois List< Object > não é o supertipo de List< Integer >. 
C. Erro de execução (Runtime Error) devido ao casting inválido. D. Compila apenas se for utilizado o curinga List< ? >. #flashcard 
Resposta Correta: B
Justificativa: As fontes explicam que Generics são invariantes: uma List< Object > não é o supertipo de qualquer tipo de lista, como uma List< Integer >.
<!--ID: 1771334222981-->


Sobre o uso de tipos curinga (wildcards), qual das seguintes afirmações sobre List< ? > é verdadeira?
A. É o supertipo de qualquer tipo de lista. 
B. Permite adicionar qualquer objeto à lista usando o método add(). 
C. O compilador sabe exatamente qual é o tipo específico da lista instanciada. 
D. Garante que apenas objetos da classe Object sejam inseridos. #flashcard 
Resposta Correta: A
Justificativa: Conforme as fontes, List< ? > é o supertipo de qualquer tipo de lista, mas não é possível adicionar dados a uma coleção desse tipo porque o compilador não sabe qual é o tipo específico da instância.
<!--ID: 1771334222985-->


O princípio "Get/Put" define regras para o uso de curingas delimitados. No cenário de COVARIÂNCIA (List< ? extends Number >), qual afirmação é correta?
A. É possível adicionar (put) qualquer número à lista. 
B. É possível ler (get) elementos, e o tipo retornado será ao menos um Number. 
C. Não é possível ler nenhum dado da lista. 
D. É permitido adicionar o valor null. #flashcard 
Resposta Correta: B
Justificativa: Na covariância (extends), o acesso (get) é permitido (retornando o tipo delimitador), mas a inserção (put) resulta em erro de compilação.
<!--ID: 1771334222994-->


No cenário de CONTRAVARIÂNCIA (List< ? super Number>), como funciona a operação de escrita (put) e leitura (get)?
A. A leitura (get) é segura e retorna sempre um Number. 
B. A escrita (put) é permitida para tipos Number ou seus subtipos (como Integer). 
C. Tanto a escrita quanto a leitura são proibidas. 
D. O método get() retorna um objeto do tipo Integer. #flashcard
Resposta Correta: B
Justificativa: Na contravariância (super), a inserção (put) é permitida para o tipo delimitador ou seus subtipos, mas a leitura (get) não é segura para um tipo específico, retornando apenas Object.
<!--ID: 1771334222998-->


Sobre os métodos hashCode e equals da classe Object, é correto afirmar que:
A. O método equals é extremamente rápido, enquanto o hashCode é lento. 
B. Se o hashCode de dois objetos for diferente, os objetos são garantidamente diferentes. 
C. Se o hashCode de dois objetos for igual, os objetos são garantidamente iguais. 
D. Tipos comuns como String e Integer não possuem implementação própria. #flashcard 
Resposta Correta: B
Justificativa: As fontes estabelecem a "regra de ouro": se o hashCode for diferente, os objetos são diferentes; se for igual, pode haver colisão, exigindo o equals para confirmação.
<!--ID: 1771334223002-->


Qual implementação da interface Set deve ser escolhida se a prioridade for a velocidade de execução das operações (O(1)) e a ordem dos elementos não importar?
A. TreeSet 
B. LinkedHashSet 
C. HashSet 
D. ArraySet #flashcard
Resposta Correta: C
Justificativa: O HashSet é a implementação mais rápida, oferecendo operações em tempo constante O(1), mas não garante nenhuma ordenação.
<!--ID: 1771334223006-->


Qual característica diferencia o TreeSet das demais implementações de Set?
A. Ele permite elementos duplicados. 
B. Ele mantém os elementos na ordem em que foram inseridos. 
C. Ele ordena os elementos automaticamente com base no método compareTo. 
D. Ele utiliza uma tabela hash interna para busca. #flashcard 
Resposta Correta: C
Justificativa: O TreeSet é mais lento que o HashSet (O(log(n))), mas mantém os elementos ordenados pelo compareTo do objeto ou por um Comparator.
<!--ID: 1771334223010-->


Se uma classe personalizada não sobrescrever os métodos hashCode e equals, como as coleções baseadas em Hash (como HashSet e HashMap) testarão a igualdade dos objetos?
A. Comparando os valores de todos os atributos da classe. 
B. Comparando as referências (ponteiros) de memória dos objetos. 
C. Lançando uma exceção de tempo de execução. 
D. Utilizando a ordem alfabética do nome da classe. #flashcard 
Resposta Correta: B
Justificativa: De acordo com as fontes, se hashCode e equals não estiverem implementados em classes personalizadas, o Java utiliza a comparação de referências (ponteiros).
<!--ID: 1771334223014-->


Para que um objeto da classe Product possa ser armazenado e ordenado corretamente em um TreeSet, o que é obrigatório?
A. A classe Product deve herdar de ArrayList. 
B. A classe Product deve implementar a interface Comparable. 
C. O TreeSet deve ser instanciado com um tamanho inicial definido. 
D. A classe Product deve possuir apenas atributos numéricos. #flashcard 
Resposta Correta: B
Justificativa: Conforme mostrado no exemplo prático, para usar TreeSet com objetos personalizados, a classe deve implementar Comparable para definir a lógica de ordenação.
<!--ID: 1771334223019-->


Sobre a interface Map<K, V>, qual afirmação é verdadeira?
A. Ela admite repetições do objeto chave (Key). 
B. Os elementos são indexados por uma posição numérica, como em um array. 
C. É uma coleção de pares chave/valor onde a chave não pode ser repetida. 
D. O método add() é usado para inserir novos elementos. #flashcard 
Resposta Correta: C
Justificativa: O Map é uma coleção de pares chave/valor que não admite repetições da chave e cujos elementos são indexados pela própria chave.
<!--ID: 1771334223023-->


O que acontece ao executar o comando cookies.put("phone", "99771133") se a chave "phone" já existir no TreeMap?
A. O Java lança uma DuplicateKeyException. 
B. O novo valor substitui o valor antigo associado àquela chave. 
C. O comando é ignorado e o valor antigo é mantido. 
D. O valor é adicionado em uma nova posição de memória. #flashcard
Resposta Correta: B
Justificativa: Conforme o exemplo das fontes, o método put sobrescreve o valor se a chave já existir no mapa.
<!--ID: 1771334223027-->


Qual o retorno do método map.get(key) quando a chave informada não existe no dicionário?
A. Lança uma exceção NoSuchElementException. 
B. Retorna uma String vazia "". 
C. Retorna o valor null. 
D. Retorna o valor zero para tipos numéricos. #flashcard
Resposta Correta: C
Justificativa: O exemplo de demonstração do Map mostra que ao tentar acessar uma chave inexistente (como um email removido), o retorno é null.
<!--ID: 1771334223031-->


Qual a sintaxe correta para declarar um método genérico que aceita uma lista de qualquer tipo que implemente a interface Comparable?
A. public static < T extends Comparable< T >> T findMax(List< T > list) 
B. public static < T implements Comparable> T findMax(List< T > list) 
C. public static < T > T findMax(List< T extends Comparable> list) 
D. public static Comparable findMax(List< ? super T > list) #flashcard
Resposta Correta: A
Justificativa: As fontes mostram que a delimitação de tipos genéricos em métodos usa a palavra-chave extends (mesmo para interfaces) na assinatura: <T extends Comparable< T >>.
<!--ID: 1771334223037-->


No contexto da interface Set, para que servem os métodos addAll, retainAll e removeAll, respectivamente?
A. Cópia, Limpeza e Exclusão. 
B. União, Interseção e Diferença. 
C. Ordenação, Filtro e Mapeamento. 
D. Adição, Pesquisa e Remoção. #flashcard
Resposta Correta: B
Justificativa: As fontes definem addAll como união, retainAll como interseção (mantém apenas o que há em comum) e removeAll como diferença (remove o que está no outro conjunto).
<!--ID: 1771334223042-->

Faça um programa em Java que leia os alunos dos cursos A, B e C e utilize um Set para calcular o total de alunos distintos do instrutor. #flashcard
Scanner sc = new Scanner(System.in);
Set< Integer > students = new HashSet<>();
int nA = sc.nextInt();
for (int i = 0; i < nA; i++) {
    students.add(sc.nextInt());
}
int nB = sc.nextInt();
for (int i = 0; i < nB; i++) {
    students.add(sc.nextInt());
}
int nC = sc.nextInt();
for (int i = 0; i < nC; i++) {
    students.add(sc.nextInt());
}
System.out.println("Total students: " + students.size());
sc.close();
<!--ID: 1771334583922-->



Explique por que a estrutura Set é adequada para resolver o problema de alunos repetidos em múltiplos cursos. #flashcard
// Set não permite elementos duplicados.
// Ao adicionar os códigos dos alunos,
// valores repetidos são automaticamente ignorados.
Set< Integer > students = new HashSet<>();
<!--ID: 1771334583928-->


Faça um programa que utilize um Map<String, Integer> para consolidar a contagem total de votos de cada candidato a partir de um arquivo CSV. #flashcard
Scanner sc = new Scanner(System.in);
String path = sc.nextLine();
Map<String, Integer> votes = new HashMap<>();
try (BufferedReader br = new BufferedReader(new FileReader(path))) {
    String line = br.readLine();
    while (line != null) {
        String[] fields = line.split(",");
        String name = fields[0];
        int count = Integer.parseInt(fields[1]);
        if (votes.containsKey(name)) {
            votes.put(name, votes.get(name) + count);
        } else {
            votes.put(name, count);
        }
        line = br.readLine();
    }
}
catch (IOException e) {
    System.out.println("Error: " + e.getMessage());
}
for (String key : votes.keySet()) {
    System.out.println(key + ": " + votes.get(key));
}
sc.close();
<!--ID: 1771334583932-->



Implemente um exemplo utilizando TreeMap para armazenar pares chave/valor e imprimir os dados ordenados pela chave. #flashcard
Map<String, String> cookies = new TreeMap<>();
cookies.put("username", "maria");
cookies.put("email", "maria@gmail.com");
cookies.put("phone", "99771122");
for (String key : cookies.keySet()) {
    System.out.println(key + ": " + cookies.get(key));
}
<!--ID: 1771334583936-->


Implemente um HashMap<Product, Double> e explique por que é necessário sobrescrever equals e hashCode na classe Product. #flashcard
Map<Product, Double> stock = new HashMap<>();
Product p1 = new Product("Tv", 900.0);
stock.put(p1, 10000.0);
// Para que objetos com mesmo nome e preço
// sejam considerados iguais como chave,
// é necessário sobrescrever equals e hashCode.
<!--ID: 1771334583941-->



Implemente os métodos equals e hashCode na classe Product para que objetos com mesmo nome e preço sejam considerados iguais. #flashcard
@Override
public int hashCode() {
    return Objects.hash(name, price);
}
@Override
public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Product other = (Product) obj;
    return Objects.equals(name, other.name)
            && Objects.equals(price, other.price);
}
<!--ID: 1771334583946-->



Faça um programa que demonstre o uso dos principais métodos de Map: put, remove, containsKey, get e size. #flashcard
Map<String, String> map = new HashMap<>();
map.put("a", "1");
map.put("b", "2");
System.out.println(map.containsKey("a"));
System.out.println(map.get("b"));
map.remove("a");
System.out.println(map.size());
<!--ID: 1771334583950-->
