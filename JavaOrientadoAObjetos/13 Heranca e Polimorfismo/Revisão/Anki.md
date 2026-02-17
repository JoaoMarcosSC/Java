
TARGET DECK: 13 - Heranca e Polimorfismo

Qual é a definição correta para o conceito de Herança em Java, conforme descrito nas fontes?
A. É uma associação entre objetos que permite compartilhar dados em tempo de execução. 
B. É um tipo de associação que permite que uma classe herde todos os dados e comportamentos de outra. 
C. É o processo de instanciar uma classe abstrata através do modificador extends. 
D. É a capacidade de um método possuir múltiplas assinaturas dentro da mesma classe. #flashcard
Resposta Correta: B Justificativa: Segundo as fontes, a herança é uma associação entre classes (e não entre objetos) que permite o reuso de atributos e métodos (dados e comportamento), estabelecendo uma relação do tipo "é-um".
<!--ID: 1771257722575-->



Sobre o modificador de acesso protected, qual das seguintes afirmações é verdadeira?
A. Um membro protected só é acessível dentro da própria classe onde foi declarado. 
B. Um membro protected é acessível por qualquer classe do projeto, independentemente do pacote. 
C. Um membro protected é acessível na mesma classe, em classes do mesmo pacote e em subclasses, mesmo que estas estejam em pacotes diferentes. 
D. Atributos protected são obrigatoriamente final e não podem ser  alterados. #flashcard
Resposta Correta: C Justificativa: O material explica que o modificador protected permite o acesso a membros por subclasses, mesmo que estas pertençam a pacotes diferentes da superclasse.
<!--ID: 1771257699165-->


Considere as classes Account (superclasse) e BusinessAccount (subclasse). O que ocorre na linha de código: Account acc = new BusinessAccount(1001, "Alex", 0.0, 500.0);?
A. Downcasting. 
B. Erro de compilação, pois os tipos são incompatíveis. 
C. Upcasting. 
D. Instanciação de uma interface abstrata. #flashcard
Resposta Correta: C Justificativa: O Upcasting ocorre quando se faz o casting de uma subclasse para uma superclasse. Como BusinessAccount é uma Account, a atribuição é permitida e comum para o uso de polimorfismo.
<!--ID: 1771257699173-->


Qual é a finalidade do operador instanceof em Java?
A. Verificar se um objeto é uma instância de um determinado tipo antes de realizar um downcasting. 
B. Comparar se dois objetos possuem o mesmo valor de memória. 
C. Converter automaticamente uma superclasse em uma subclasse. 
D. Criar uma nova instância de uma classe abstrata. #flashcard
Resposta Correta: A Justificativa: Conforme as fontes, o instanceof é usado para testar o tipo de um objeto antes de realizar o downcasting, evitando erros em tempo de execução caso o objeto não seja do tipo esperado.
<!--ID: 1771257699178-->


Sobre a sobreposição (sobrescrita) de métodos, qual é a utilidade da anotação @Override?
A. Tornar o método privado na subclasse. 
B. Impedir que o método seja herdado por outras classes. 
C. Informar ao compilador que a intenção é sobrescrever um método da superclasse, facilitando a detecção de erros e a leitura. 
D. Indicar que o método deve ser executado apenas em classes abstratas. #flashcard
Resposta Correta: C Justificativa: A anotação @Override é uma boa prática que avisa ao compilador que o método é uma sobreposição, facilitando a compreensão do código e garantindo que o método realmente exista na superclasse.
<!--ID: 1771257699182-->


Qual palavra-chave é utilizada para chamar a implementação de um método ou um construtor da superclasse a partir da subclasse?
A. this 
B. extends 
C. super 
D. abstract #flashcard
Resposta Correta: C Justificativa: A palavra super é utilizada para referenciar membros da superclasse, permitindo chamar construtores ou métodos da classe base dentro da classe derivada.
<!--ID: 1771257699188-->


O que acontece ao declarar uma classe com o modificador final, como em public final class SavingsAccount?
A. A classe não pode mais ser instanciada. 
B. A classe não pode ser herdada (evita a criação de subclasses). 
C. Todos os métodos da classe tornam-se automaticamente abstratos. 
D. A classe torna-se visível apenas dentro do próprio pacote. #flashcard
Resposta Correta: B Justificativa: O modificador final aplicado a uma classe evita que ela seja herdada por qualquer outra classe, garantindo segurança e, em alguns casos, ganhos de performance.
<!--ID: 1771257699193-->


Qual é a consequência de declarar um método como final em uma superclasse?
A. O método torna-se obrigatório em todas as subclasses. 
B. O método não possui corpo e deve ser implementado pela subclasse. 
C. O método evita ser sobreposto (sobrescrito) nas subclasses. 
D. O método só pode ser chamado através da palavra-chave super. #flashcard
Resposta Correta: C Justificativa: Um método declarado como final impede que subclasses criem suas próprias implementações (sobreposição) para aquele método.
<!--ID: 1771257699197-->


De acordo com as fontes, como o Polimorfismo é definido na Programação Orientada a Objetos?
A. É a capacidade de uma classe herdar de múltiplas superclasses simultaneamente. 
B. É o recurso que permite que variáveis de um tipo genérico apontem para objetos de tipos específicos diferentes, apresentando comportamentos distintos. 
C. É a técnica de esconder atributos de uma classe usando o modificador private. 
D. É a conversão obrigatória de tipos primitivos para objetos  wrappers. #flashcard
Resposta Correta: B Justificativa: O polimorfismo permite que objetos de diferentes subclasses sejam tratados como objetos da superclasse, mas executem seus comportamentos específicos conforme o tipo real do objeto em memória.
<!--ID: 1771257699201-->


Sobre classes abstratas, qual das afirmações abaixo é verdadeira?
A. Elas podem ser instanciadas normalmente usando a palavra-chave new. 
B. Elas são classes que não podem ser instanciadas e servem apenas para garantir a herança e o polimorfismo. 
C. Uma classe abstrata não pode possuir métodos com implementação. 
D. Somente classes final podem ser declaradas como abstratas. #flashcard
Resposta Correta: B Justificativa: Classes abstratas não podem ser instanciadas diretamente. Elas existem para fornecer uma base genérica para outras classes (subclasses) herdarem e implementarem comportamentos.
<!--ID: 1771257699207-->


Se uma classe possui pelo menos um método abstrato, o que deve ser feito com a declaração dessa classe?
A. Ela deve ser declarada como static. 
B. Ela deve ser declarada como final. 
C. Ela deve ser obrigatoriamente declarada como abstract. 
D. Ela não pode ter  construtores. #flashcard
Resposta Correta: C Justificativa: As fontes declaram explicitamente que se uma classe possui pelo menos um método abstrato, então essa classe também deve ser obrigatoriamente abstrata. 
<!--ID: 1771257699211-->


Qual é o principal motivo para se criar um método abstrato em uma superclasse?
A. Economizar memória no Heap. 
B. Quando a classe é genérica demais para saber como implementar aquele comportamento específico. 
C. Para permitir que o método seja chamado sem a necessidade de um objeto. 
D. Para garantir que o método seja private em todas as subclasses. #flashcard
Resposta Correta: B Justificativa: Métodos abstratos são necessários quando a superclasse define que um comportamento deve existir, mas não possui informações suficientes para implementá-lo (ex: o cálculo da área de uma "Figura" genérica).
<!--ID: 1771257699217-->


No exemplo de polimorfismo com as variáveis Account x e Account y, quando o método withdraw é chamado, o compilador sabe exatamente qual implementação será executada?
A. Sim, o compilador identifica o tipo específico no momento da compilação. 
B. Não, o compilador só sabe que as variáveis são do tipo Account; a associação com o tipo específico ocorre apenas em tempo de execução. 
C. Sim, desde que o programador use o modificador static nos métodos. 
D. Não, pois o Java não suporta polimorfismo em métodos de saque. #flashcard
Resposta Correta: B Justificativa: O material explica que a associação do tipo específico com o tipo genérico é feita em tempo de execução (dynamic binding), e o compilador não sabe previamente qual versão do método será chamada.
<!--ID: 1771257699223-->


Qual das seguintes opções descreve uma vantagem das classes abstratas mencionada nas fontes?
A. Permitem o reuso de código e facilitam o polimorfismo, permitindo tratar coleções de objetos de forma uniforme. 
B. Aumentam a velocidade de compilação do projeto em 20%. 
C. Impedem que o programador utilize listas ou vetores. 
D. Tornam o uso da palavra-chave extends opcional. #flashcard
Resposta Correta: A Justificativa: Classes abstratas permitem tratar diferentes tipos de forma uniforme (como uma lista de contas de vários tipos), favorecendo o reuso e o polimorfismo.
<!--ID: 1771257699227-->

Implemente um enum OrderStatus contendo os valores PENDING_PAYMENT, PROCESSING, SHIPPED e DELIVERED para representar o status de um pedido. #flashcard
public enum OrderStatus {
    PENDING_PAYMENT,
    PROCESSING,
    SHIPPED,
    DELIVERED;
}
<!--ID: 1771328990182-->



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
<!--ID: 1771328990189-->



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
<!--ID: 1771328990193-->



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
<!--ID: 1771328990198-->



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
<!--ID: 1771328990202-->



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
for (int i = 0; i < n; i++) {
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
<!--ID: 1771328990207-->
