
TARGET DECK: 16 - Interfaces

Qual é a definição técnica de uma Interface em Java, considerando o modelo clássico (pré-Java 8)?
A. É uma classe abstrata que possui apenas atributos privados e métodos getters e setters. 
B. É um tipo que define um conjunto de operações que uma classe deve implementar, estabelecendo um contrato. 
C. É uma estrutura de dados utilizada exclusivamente para simular herança múltipla de estados (atributos). 
D. É um tipo especial de classe que não pode ser instanciado e não permite a definição de nenhum método. #flashcard
Resposta Correta: B
Justificativa: Conforme as fontes, a interface é um tipo que define um conjunto de operações que uma classe deve implementar, estabelecendo um contrato que a classe deve cumprir.
<!--ID: 1771333233857-->


Qual é a principal vantagem arquitetural de se utilizar interfaces em um sistema de software?
A. Aumentar o acoplamento entre as camadas de serviço e repositório. 
B. Garantir que todas as classes tenham a mesma implementação de um método. 
C. Criar sistemas com baixo acoplamento e maior flexibilidade. 
D. Facilitar o uso de variáveis globais em todo o projeto. #flashcard
Resposta Correta: C
Justificativa: As fontes destacam que o uso de interfaces serve para criar sistemas com baixo acoplamento e flexíveis.
<!--ID: 1771333233862-->


Sobre o "Problema do Diamante" e a herança múltipla em Java, assinale a alternativa correta:
A. Java permite herança múltipla de classes para facilitar o reuso de código. 
B. O problema do diamante ocorre quando uma classe implementa duas interfaces com assinaturas de métodos diferentes. 
C. Uma classe em Java pode implementar múltiplas interfaces, e isso não é considerado herança múltipla de classes, pois não há reuso de estado. 
D. Interfaces não podem ser utilizadas para resolver ambiguidades causadas pela existência do mesmo método em mais de uma superclasse. #flashcard
Resposta Correta: C
Justificativa: As fontes explicam que herança múltipla de classes não é permitida na maioria das linguagens, mas uma classe pode implementar mais de uma interface (cumprir contratos), o que é diferente de herar reuso de código de múltiplas classes.
<!--ID: 1771333233866-->


O que caracteriza o padrão de desenvolvimento "Inversão de Controle" (IoC)?
A. A classe "pai" passa a ser responsável por instanciar todas as suas dependências manualmente. 
B. Consiste em retirar da classe a responsabilidade de instanciar suas próprias dependências. 
C. É um processo onde o compilador inverte a ordem de execução dos métodos para otimizar a memória. 
D. Obriga que todas as dependências de uma classe sejam obrigatoriamente privadas. #flashcard
Resposta Correta: B
Justificativa: De acordo com as fontes, a Inversão de Controle é um padrão que consiste em retirar da classe a responsabilidade de instanciar suas dependências.
<!--ID: 1771333233871-->


Sobre o método compareTo(T o) da interface Comparable, qual é o retorno esperado quando o objeto que chama o método é "maior" que o objeto passado como parâmetro?
A. Um número inteiro negativo. 
B. O valor booleano true. 
C. O valor zero. 
D. Um número inteiro positivo. #flashcard
Resposta Correta: D
Justificativa: As fontes indicam que o método compareTo retorna um inteiro positivo se o objeto for maior que o objeto especificado.
<!--ID: 1771333233876-->


A partir de qual versão do Java as interfaces passaram a permitir a inclusão de "default methods" (métodos concretos)?
A. Java 7 
B. Java 8 
C. Java 10 
D. Java 11 #flashcard
Resposta Correta: B
Justificativa: As fontes afirmam explicitamente que, a partir do Java 8, as interfaces podem conter métodos concretos chamados "default methods".
<!--ID: 1771333233880-->


Qual é a intenção básica de se utilizar "default methods" em interfaces?
A. Forçar todas as classes a sobrescreverem o método, mesmo que a implementação seja idêntica. 
B. Permitir que interfaces possuam construtores e atributos de instância. 
C. Prover uma implementação padrão para métodos, evitando repetição de código e mantendo a retrocompatibilidade. 
D. Substituir completamente o uso de classes abstratas em qualquer cenário de design. #flashcard
Resposta Correta: C
Justificativa: Segundo as fontes, a intenção é prover implementação padrão para evitar repetição em toda classe que implementa a interface e manter a retrocompatibilidade com sistemas existentes.
<!--ID: 1771333233884-->


Considere o código abaixo. Qual será o resultado da execução?
System.out.println("alex".compareTo("maria"));
A. Um número positivo. 
B. Zero. 
C. Um número negativo. 
D. Uma exceção do tipo ClassCastException. #flashcard
Resposta Correta: C
Justificativa: Nas fontes, o exemplo mostra que "alex".compareTo("maria") retorna -12 (um número negativo), pois "alex" vem antes de "maria" na ordem lexicográfica.
<!--ID: 1771333233888-->


Em relação às diferenças entre interfaces e classes abstratas, qual das seguintes afirmações é verdadeira?
A. Interfaces podem possuir construtores, enquanto classes abstratas não podem. 
B. Ambas podem possuir atributos de instância (variáveis de estado). 
C. Interfaces não possuem recursos como construtores e atributos, ao contrário das classes abstratas. 
D. Uma classe pode estender múltiplas classes abstratas, mas implementar apenas uma interface. #flashcard 
Resposta Correta: C
Justificativa: As fontes destacam que interfaces são bem diferentes de classes abstratas, pois interfaces não possuem recursos como construtores e atributos.
<!--ID: 1771333233892-->


O que é a "Injeção de Dependência" no contexto de interfaces?
A. É uma forma de realizar a inversão de controle onde um componente externo instancia a dependência e a injeta no objeto "pai". 
B. É o ato de declarar uma interface dentro de outra interface para herança múltipla. 
C. É um erro de compilação que ocorre quando se tenta instanciar uma interface diretamente com o operador new. 
D. É o processo de converter uma classe concreta em uma interface. #flashcard
Resposta Correta: A
Justificativa: Conforme as fontes, a injeção de dependência é uma forma de realizar a inversão de controle, onde um componente externo instancia a dependência, que é então injetada no objeto "pai" (ex: via construtor).
<!--ID: 1771333233897-->


No design de camadas apresentado nas fontes, qual é a vantagem de a classe RentalService possuir um atributo do tipo TaxService (interface) em vez de BrazilTaxService (classe concreta)?
A. Permite que o RentalService controle como o imposto do Brasil é calculado internamente. 
B. Estabelece um acoplamento forte, garantindo que o código nunca mude. 
C. Caracteriza um acoplamento fraco, pois o RentalService não conhece a dependência concreta e não precisa mudar se a classe concreta mudar. 
D. Permite que a interface TaxService instancie automaticamente a classe adequada. #flashcard
Resposta Correta: C
Justificativa: As fontes explicam que o uso da interface gera acoplamento fraco: a classe RentalService não conhece a dependência concreta e, se esta mudar, a classe RentalService não muda nada.
<!--ID: 1771333233901-->


Em relação a aspectos comuns, tanto a herança de classes quanto a implementação de interfaces permitem o uso de:
A. Reuso de implementação de atributos de instância. 
B. Polimorfismo e relação "é-um". 
C. Construtores herdados. 
D. Herança múltipla de estado. #flashcard
Resposta Correta: B
Justificativa: As fontes listam como aspectos em comum entre herança e interfaces a relação "é-um", a generalização/especialização e o polimorfismo.
<!--ID: 1771333233906-->


O que acontece, de acordo com as regras do compilador Java, se uma classe implementar duas interfaces que possuem um "default method" com a exata mesma assinatura?
A. O compilador escolherá automaticamente a implementação da primeira interface declarada. 
B. O programa compilará, mas lançará uma exceção em tempo de execução. 
C. O compilador reclamará da duplicidade, obrigando o programador a sobrescrever o método na classe que as implementa. 
D. A classe será automaticamente marcada como abstrata. #flashcard
Resposta Correta: C
Justificativa: As fontes mencionam que o compilador reclama se houver mais de um método com a mesma assinatura vindo de interfaces, obrigando o desenvolvedor a sobrescrevê-lo.
<!--ID: 1771333233910-->


Analise o seguinte trecho de código de uma classe que implementa Comparable:
public class Employee implements Comparable< Employee > {
    private String name;
    // ... construtor e getters
    @Override
    public int compareTo(Employee other) {
        return name.compareTo(other.getName());
    }
}
Ao executar Collections.sort(list) em uma lista de Employee, a ordenação será feita por:
A. Salário, de forma crescente. 
B. Nome, de forma alfabética. 
C. Ordem de inserção na lista. 
D. Nome, de forma reversa. #flashcard
Resposta Correta: B
Justificativa: O método compareTo implementado no exemplo das fontes utiliza name.compareTo(other.getName()), o que resulta em uma ordenação alfabética baseada no atributo nome.
<!--ID: 1771333233914-->


Qual é o papel de uma classe abstrata (como AbstractShape) em um design que também utiliza interfaces (como Shape)?
A. Substituir a interface para evitar o uso de métodos abstratos. 
B. Prover uma estrutura comum e reuso de código (como o atributo color) para todas as subclasses, enquanto a interface define o contrato. 
C. Impedir que as subclasses implementem os métodos da interface. 
D. Permitir que a interface seja instanciada indiretamente por meio do construtor. #flashcard
Resposta Correta: B
Justificativa: As fontes mostram um cenário onde se usa a interface Shape para o contrato e a classe abstrata AbstractShape para definir uma estrutura comum reutilizável (como a cor) para todas as figuras.
<!--ID: 1771333233918-->

Implemente a interface OnlinePaymentService contendo os métodos interest e paymentFee para representar um serviço de pagamento online. #flashcard
public interface OnlinePaymentService {
    double paymentFee(double amount);
    double interest(double amount, int months);
}
<!--ID: 1771333641120-->



Implemente a classe PaypalService que implementa OnlinePaymentService, aplicando 1% de juro simples por mês e 2% de taxa de pagamento. #flashcard
public class PaypalService implements OnlinePaymentService {
    @Override
    public double interest(double amount, int months) {
        return amount * 0.01 * months;
    }
    @Override
    public double paymentFee(double amount) {
        return amount * 0.02;
    }
}
<!--ID: 1771333641139-->



Implemente a classe Installment contendo data de vencimento e valor da parcela. #flashcard
public class Installment {
    private Date dueDate;
    private Double amount;
    public Installment(Date dueDate, Double amount) {
        this.dueDate = dueDate;
        this.amount = amount;
    }
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(dueDate) + " - " + String.format("%.2f", amount);
    }
}
<!--ID: 1771333641144-->



Implemente a classe Contract contendo número, data, valor total e lista de parcelas. #flashcard
public class Contract {
    private Integer number;
    private Date date;
    private Double totalValue;
    private List< Installment > installments = new ArrayList<>();
    public Contract(Integer number, Date date, Double totalValue) {
        this.number = number;
        this.date = date;
        this.totalValue = totalValue;
    }
    public Date getDate() {
        return date;
    }
    public Double getTotalValue() {
        return totalValue;
    }
    public List< Installment > getInstallments() {
        return installments;
    }
}
<!--ID: 1771333641149-->



Implemente a classe ContractService que recebe um OnlinePaymentService e processa um contrato gerando as parcelas com juros e taxa. #flashcard
public class ContractService {
    private OnlinePaymentService onlinePaymentService;
    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }
    public void processContract(Contract contract, int months) {
        double basicQuota = contract.getTotalValue() / months;
        for (int i = 1; i <= months; i++) {
            double updatedQuota = basicQuota
                    + onlinePaymentService.interest(basicQuota, i);
            double fullQuota = updatedQuota
                    + onlinePaymentService.paymentFee(updatedQuota);
            Calendar cal = Calendar.getInstance();
            cal.setTime(contract.getDate());
            cal.add(Calendar.MONTH, i);
            contract.getInstallments().add(
                    new Installment(cal.getTime(), fullQuota)
            );
        }
    }
}
<!--ID: 1771333641153-->



Implemente o fluxo principal que leia os dados do contrato, instancie PaypalService, processe o contrato e imprima as parcelas geradas. #flashcard
Scanner sc = new Scanner(System.in);
SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
Integer number = sc.nextInt();
sc.nextLine();
Date date = sdf.parse(sc.nextLine());
Double totalValue = sc.nextDouble();
Contract contract = new Contract(number, date, totalValue);
int months = sc.nextInt();
ContractService service =
        new ContractService(new PaypalService());
service.processContract(contract, months);
for (Installment inst : contract.getInstallments()) {
    System.out.println(inst);
}
sc.close();
<!--ID: 1771333641158-->
