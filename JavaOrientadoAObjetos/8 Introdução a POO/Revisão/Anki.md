
TARGET DECK: 8 - Introdução a POO

Qual das seguintes opções define corretamente a relação entre Classe e Objeto em Java? 
A. Classe é uma instância em memória, enquanto Objeto é o molde. 
B. Um Objeto é a definição do tipo e a Classe é a alocação dinâmica. 
C. A Classe é o molde (definição do tipo) e o Objeto é uma instância dessa classe. 
D. Não há diferença técnica entre Classe e Objeto. #flashcard 
Reposta Correta: C
Justificativa: Conforme as fontes, a Classe é a definição do tipo estruturado, enquanto os Objetos são instâncias dessa classe.
<!--ID: 1768759268857-->


Ao definir um método que realiza um cálculo e devolve um valor numérico com casas decimais, qual deve ser o "tipo de retorno" especificado na assinatura do método? 
A. void 
B. double 
C. String 
D. static #flashcard
Reposta Correta: B
Justificativa: O tipo de retorno indica o tipo de dado que o método envia de volta. Para valores numéricos com precisão decimal, utiliza-se double. O void é usado quando o método não retorna nada.
<!--ID: 1768759268864-->


Sobre o prefixo public utilizado em atributos e métodos, é correto afirmar que: 
A. Ele impede que o atributo seja modificado após a inicialização. 
B. Ele indica que o atributo ou método pode ser usado em outros arquivos. 
C. Ele torna o método obrigatoriamente estático. 
D. Ele limita o acesso apenas ao pacote entities. #flashcard
Reposta Correta: B
Justificativa: De acordo com as fontes, o prefixo public indica que o membro (atributo ou método) está acessível para uso em outros arquivos do projeto.
<!--ID: 1768759268868-->


Considere o código: Triangle x = new Triangle();. O que ocorre no momento da execução desta linha? 
A. Ocorre uma alocação dinâmica de memória (instanciação). 
B. O Java remove a classe Triangle da memória. 
C. A variável x armazena o valor da área do triângulo. 
D. É criada uma constante estática. #flashcard
Reposta Correta: A
Justificativa: O uso da palavra-chave new realiza a instanciação, que é a alocação dinâmica de memória para criar um objeto na memória Heap.
<!--ID: 1768759268873-->


Quais são os dois principais benefícios de se utilizar métodos dentro de uma classe para realizar cálculos (como o cálculo de área), em vez de fazer o cálculo no programa principal? (Selecione duas) 
A. Aumento do uso de memória RAM. 
B. Reaproveitamento de código, eliminando repetições. 
C. Delegação de responsabilidades, onde a classe cuida de sua própria lógica. 
D. Obrigatoriedade de transformar todos os atributos em Strings. #flashcard 
Reposta Correta: B, C
Justificativa: As fontes citam explicitamente o reaproveitamento (eliminar código repetido) e a delegação de responsabilidades (a classe deve ser responsável por saber calcular suas operações) como benefícios.
<!--ID: 1768759268877-->


Analise o trecho abaixo e identifique a afirmação correta sobre a classe Object: System.out.println(product); 
A. O comando falhará se a classe Product não for estática. 
B. O Java chama implicitamente o método toString() da classe Product. 
C. A classe Product deve herdar manualmente de Object usando extends Object. 
D. O método toString() pertence exclusivamente à classe Scanner. #flashcard
Reposta Correta: B
Justificativa: Toda classe em Java é uma subclasse de Object, que possui o método toString(). Ao imprimir um objeto, esse método é chamado para converter o objeto em String.
<!--ID: 1768759268881-->


Sobre Membros Estáticos (static), qual das seguintes opções é verdadeira? 
A. Eles dependem da criação de um objeto para serem chamados. 
B. São chamados a partir do próprio nome da classe. 
C. Cada objeto criado possui sua própria cópia dos atributos estáticos. 
D. Métodos estáticos podem acessar qualquer atributo de instância diretamente. #flashcard 
Reposta Correta: B
Justificativa: Membros estáticos (membros de classe) fazem sentido independentemente de objetos e são chamados diretamente pelo nome da classe.
<!--ID: 1768759268885-->


O que acontece se você tentar chamar um membro de instância (não estático) dentro de um método que foi declarado como static? 
A. O programa compila, mas gera erro de execução. 
B. O Java converte o membro de instância em estático automaticamente. 
C. Ocorre um erro de compilação. 
D. O membro de instância é inicializado com zero. #flashcard 
Reposta Correta: C
Justificativa: As fontes destacam explicitamente: "dentro de um método estático você não pode chamar membros de instância da mesma classe".
<!--ID: 1768759268889-->


Em relação à declaração de constantes em Java (como o valor de PI), qual combinação de palavras-chave é comumente utilizada conforme os padrões de membros estáticos? 
A. public void constant 
B. public static final 
C. private transient volatile 
D. public dynamic var #flashcard 
Reposta Correta: B
Justificativa: Para declarar constantes que pertencem à classe e não mudam de valor, utiliza-se public static final.
<!--ID: 1768759268893-->


Qual a utilidade da palavra-chave this em métodos como this.quantity += quantity;? 
A. Criar uma nova instância da classe. 
B. Referenciar o atributo da própria classe, diferenciando-o de uma variável local ou parâmetro. 
C. Indicar que o método é estático. 
D. Finalizar a execução do programa. #flashcard 
Reposta Correta: B
Justificativa: O this é usado para referenciar o atributo do próprio objeto (da instância), sendo comum em métodos onde o parâmetro tem o mesmo nome do atributo.
<!--ID: 1768759268897-->


No contexto de UML, o que representam as seções de um diagrama de classe como o da classe Product? 
A. Nome da classe, Atributos e Métodos. 
B. Variáveis Locais, Loops e Condicionais. 
C. Pacotes, Importações e Comentários. 
D. Somente os valores digitados pelo usuário. #flashcard
Reposta Correta: A
Justificativa: O projeto da classe em UML mostra o nome da classe no topo, seguido pelos atributos (dados) e, por fim, os métodos (operações).
<!--ID: 1768759268901-->


Uma classe que possui  membros estáticos: 
A. Deve ser instanciada com new obrigatoriamente. 
B. Geralmente funciona como uma classe utilitária e não precisa ser instanciada. 
C. Não pode conter constantes. 
D. Não pode ser usada em outros pacotes. #flashcard
Reposta Correta: B
Justificativa: Classes utilitárias (como uma calculadora ou conversor) que possuem apenas membros estáticos não precisam de objetos para operar, sendo chamadas pelo nome da classe.
<!--ID: 1768759268907-->


No problema dos triângulos, por que a area() é um membro de instância e não um membro estático? 
A. Porque o cálculo de PI é necessário. 
B. Porque a área depende dos valores específicos dos atributos (a, b, c) de cada triângulo (objeto). 
C. Porque métodos de instância são sempre mais rápidos. 
D. Porque triângulos não podem ser representados por classes. #flashcard
Reposta Correta: B
Justificativa: Cada triângulo possui suas próprias medidas e, portanto, sua própria área. É uma operação concernente ao objeto individual.
<!--ID: 1768759268911-->


Qual método da classe Object é frequentemente sobreposto para personalizar a exibição dos dados de um objeto em formato de texto? 
A. getClass 
B. hashCode 
C. equals 
D. toString #flashcard
Reposta Correta: D
Justificativa: O método toString é o responsável por converter o objeto para String, permitindo formatar como os dados (nome, preço, etc.) aparecem na tela.
<!--ID: 1768759268915-->


Considere uma classe Calculator com o método public static double volume(double radius). Como esse método deve ser chamado no programa principal? 
A. Calculator.volume(3.0); 
B. volume(3.0); 
C. Calculator calc = new Calculator(); calc.volume(3.0); (embora possível, não é o padrão para static) 
D. new volume(3.0); #flashcard
Reposta Correta: A
Justificativa: Métodos estáticos são chamados a partir do próprio nome da classe, sem necessidade de instanciar um objeto. A opção C é desencorajada para membros estáticos.
<!--ID: 1768759268920-->

Faça um programa em Java que utilize uma classe Rectangle com atributos width e height e métodos para calcular área, perímetro e diagonal de um retângulo. #flashcard
public class Rectangle {
    public double width;
    public double height;
    public double area() {
        return width * height;
    }
    public double perimeter() {
        return 2 * (width + height);
    }
    public double diagonal() {
        return Math.sqrt(width * width + height * height);
    }
}
<!--ID: 1768759678796-->


Faça um programa em Java que utilize uma classe Employee para armazenar nome, salário bruto e imposto, calcular o salário líquido e aplicar um aumento percentual no salário. #flashcard
public class Employee {
    public String name;
    public double grossSalary;
    public double tax;
    public double netSalary() {
        return grossSalary - tax;
    }
    public void increaseSalary(double percentage) {
        grossSalary += grossSalary * percentage / 100.0;
    }
    public String toString() {
        return name + ", $ " + String.format("%.2f", netSalary());
    }
}
<!--ID: 1768759678801-->



Faça um programa em Java que utilize uma classe Student para armazenar três notas, calcular a nota final, verificar se o aluno foi aprovado e informar quantos pontos faltaram caso ele tenha sido reprovado. #flashcard
public class Student {
    public String name;
    public double grade1;
    public double grade2;
    public double grade3;
    public double finalGrade() {
        return grade1 + grade2 + grade3;
    }
    public double missingPoints() {
        if (finalGrade() < 60.0) {
            return 60.0 - finalGrade();
        } else {
            return 0.0;
        }
    }
}
<!--ID: 1768759678805-->


