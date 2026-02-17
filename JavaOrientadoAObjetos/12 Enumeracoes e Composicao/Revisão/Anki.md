
TARGET DECK: 12 - Enumeracoes e Composicao

O que define tecnicamente uma Enumeração (enum) na linguagem Java?
A. É uma classe abstrata que permite apenas a criação de objetos via reflexão. 
B. É um tipo especial que serve para especificar de forma literal um conjunto de constantes relacionadas. 
C. É uma estrutura de repetição que auxilia o compilador a iterar sobre listas fixas. 
D. É um modificador de acesso que protege variáveis globais contra alterações em tempo de execução. #flashcard
Resposta Correta: B Justificativa: Segundo as fontes, enumerações são tipos especiais usados para definir um conjunto de constantes relacionadas, oferecendo melhor semântica e legibilidade.
<!--ID: 1771256361549-->


Quais são as principais vantagens de utilizar enumerações em vez de constantes inteiras ou Strings simples? (Selecione todas as corretas)
A. Melhor semântica no código. 
B. Código mais legível. 
C. Verificação de tipos auxiliada pelo compilador. 
D. Redução automática do consumo de memória RAM em 50% para cada constante. #flashcard 
Resposta Correta: A, B, C Justificativa: As fontes citam explicitamente que as vantagens do enum incluem melhor semântica, legibilidade e o auxílio do compilador na validação dos dados.
<!--ID: 1771256361553-->


Considere o seguinte código: OrderStatus os = OrderStatus.valueOf("DELIVERED");. Qual o resultado esperado desta operação?
A. O Java cria uma nova instância de String com o valor "DELIVERED". 
B. O Java converte o valor textual para o objeto correspondente definido no tipo enumerado OrderStatus. 
C. O código gera um erro de compilação, pois enums não aceitam Strings. 
D. A variável os recebe o índice numérico da constante no enum. #flashcard
Resposta Correta: B Justificativa: O método valueOf é utilizado para realizar a conversão de uma representação em String para o tipo constante do enum correspondente.
<!--ID: 1771256361561-->


No contexto de design de sistemas orientado a objetos, como as fontes definem a Composição?
A. É o processo de herdar comportamentos de uma superclasse para uma subclasse. 
B. É um tipo de associação que permite que um objeto contenha outro, estabelecendo uma relação "tem-um" ou "tem-vários". 
C. É a técnica de agrupar vários enums em um único arquivo de configuração. 
D. É a capacidade de um método possuir múltiplas assinaturas com diferentes parâmetros. #flashcard
Resposta Correta: B Justificativa: De acordo com o material, a composição é uma associação onde um objeto contém outros objetos, sendo descrita pelas relações tem-um ou tem-vários.
<!--ID: 1771256390470-->



Quais das seguintes são vantagens da utilização da composição em vez de colocar todas as responsabilidades em uma única classe? (Selecione todas as corretas)
A. Maior coesão das classes. 
B. Melhor organização e divisão de responsabilidades. 
C. Maior flexibilidade e reuso do código. 
D. Eliminação completa da necessidade de usar métodos construtores. #flashcard
Resposta Correta: A, B, C Justificativa: As fontes destacam que a composição favorece a organização, coesão, flexibilidade e o reuso, ao permitir que objetos especializados colaborem entre si.
<!--ID: 1771256361567-->


Ao desenhar um sistema, o material menciona várias categorias de classes para melhor organização e delegação. Quais são elas? (Selecione todas as corretas)
A. Entities e Services. 
B. Controllers e Repositories. 
C. Views. 
D. Printers e Scanners. #flashcard
Resposta Correta: A, B, C Justificativa: O material lista especificamente Entities, Controllers, Services, Views e Repositories como categorias de classes usadas para melhorar o design e a flexibilidade do sistema.
<!--ID: 1771256361571-->


Considere um objeto Order que possui o atributo status do tipo OrderStatus (enum). Qual das seguintes atribuições é válida?
A. order.setStatus(1); 
B. order.setStatus("SHIPPED"); 
C. order.setStatus(OrderStatus.PROCESSING); 
D. order.setStatus(new OrderStatus()); #flashcard
Resposta Correta: C Justificativa: Enums são tipos literais. Atribui-se um valor a uma variável do tipo enum utilizando a sintaxe TipoEnum.CONSTANTE. Enums não podem ser instanciados com new.
<!--ID: 1771256361575-->



Se uma classe Order possui uma associação com OrderItem indicada com um asterisco (* ) no lado de OrderItem no diagrama UML, isso significa que:
A. Um pedido não pode ter nenhum item. 
B. Um pedido pode ter vários itens, geralmente representados por uma coleção (como List). 
C. OrderItem é uma subclasse de Order. 
D. A classe Order é estática e não pode ser instanciada. #flashcard
Resposta Correta: B Justificativa: O asterisco (* ) na UML indica uma multiplicidade de "muitos", o que no código Java se traduz em uma relação "tem-vários", geralmente implementada com listas.
<!--ID: 1771256361579-->


Qual categoria de classe, segundo o design proposto, é responsável por lidar com a lógica de acesso a dados ou banco de dados?
A. Entities. 
B. Services. 
C. Repositories. 
D. Views #flashcard
Resposta Correta: C Justificativa: O diagrama de categorias de classes mostra os "Repositories" como a camada responsável pela persistência ou recuperação de dados.
<!--ID: 1771256361584-->


Analise a afirmação: "A composição permite que as responsabilidades sejam divididas entre diferentes objetos, promovendo classes mais simples". Esta afirmação é verdadeira?
A. Não, a composição torna o código mais complexo e difícil de manter. 
B. Sim, pois cada objeto cuida de sua própria parte do estado e comportamento, aumentando a coesão. 
C. Não, pois em Java a única forma de dividir responsabilidades é via herança múltipla. 
D. Sim, mas apenas se todos os objetos envolvidos forem tipos primitivos. #flashcard
Resposta Correta: B Justificativa: As fontes afirmam que a composição melhora a organização e a coesão do sistema ao distribuir as responsabilidades entre objetos especializados.
Como funciona a conversão de String para enum em Java?
Quais as vantagens da composição sobre a herança no design?
Quando devo usar StringBuilder em vez de concatenação comum?
<!--ID: 1771256361588-->

Implemente um enum OrderStatus contendo os valores PENDING_PAYMENT, PROCESSING, SHIPPED e DELIVERED para representar o status de um pedido. #flashcard
public enum OrderStatus {
    PENDING_PAYMENT,
    PROCESSING,
    SHIPPED,
    DELIVERED;
}
<!--ID: 1771256757725-->



Implemente uma classe Client contendo nome, email e data de nascimento, conforme o modelo de composição apresentado. #flashcard
public class Client {
    private String name;
    private String email;
    private Date birthDate;
    public Client(String name, String email, Date birthDate) {
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return name + " (" + sdf.format(birthDate) + ") - " + email;
    }
}
<!--ID: 1771256757730-->



Implemente uma classe Product contendo nome e preço. #flashcard
public class Product {
    private String name;
    private Double price;
    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public Double getPrice() {
        return price;
    }
}
<!--ID: 1771256757734-->



Implemente uma classe OrderItem contendo quantidade, preço e um objeto Product, além de um método para calcular o subtotal. #flashcard
public class OrderItem {
    private Integer quantity;
    private Double price;
    private Product product;
    public OrderItem(Integer quantity, Double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }
    public Double subTotal() {
        return price * quantity;
    }
    public String toString() {
        return product.getName()
                + ", $"
                + String.format("%.2f", price)
                + ", Quantity: "
                + quantity
                + ", Subtotal: $"
                + String.format("%.2f", subTotal());
    }
}
<!--ID: 1771256757739-->



Implemente uma classe Order contendo momento do pedido, status, cliente e uma lista de itens, além de métodos para adicionar, remover itens e calcular o total do pedido. #flashcard
public class Order {
    private Date moment;
    private OrderStatus status;
    private Client client;
    private List< OrderItem > items = new ArrayList<>();
    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }
    public void addItem(OrderItem item) {
        items.add(item);
    }
    public void removeItem(OrderItem item) {
        items.remove(item);
    }
    public Double total() {
        double sum = 0.0;
        for (OrderItem item : items) {
            sum += item.subTotal();
        }
        return sum;
    }
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: ");
        sb.append(sdf.format(moment));
        sb.append("\nOrder status: ");
        sb.append(status);
        sb.append("\nClient: ");
        sb.append(client);
        sb.append("\nOrder items:\n");
        for (OrderItem item : items) {
            sb.append(item);
            sb.append("\n");
        }
        sb.append("Total price: $");
        sb.append(String.format("%.2f", total()));
        return sb.toString();
    }
}
<!--ID: 1771256757743-->



Implemente o fluxo principal que leia os dados do cliente, crie o pedido com new Date() como momento, leia N itens e exiba o resumo do pedido conforme o exemplo. #flashcard
Scanner sc = new Scanner(System.in);
SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
String name = sc.nextLine();
String email = sc.nextLine();
Date birthDate = sdf.parse(sc.nextLine());
Client client = new Client(name, email, birthDate);
OrderStatus status = OrderStatus.valueOf(sc.nextLine());
Order order = new Order(new Date(), status, client);
int n = sc.nextInt();
for (int i = 0; i <n; i++) {
    sc.nextLine();
    String productName = sc.nextLine();
    double price = sc.nextDouble();
    int quantity = sc.nextInt();
    Product product = new Product(productName, price);
    OrderItem item = new OrderItem(quantity, price, product);
    order.addItem(item);
}
System.out.println(order);
sc.close();
<!--ID: 1771256757747-->

