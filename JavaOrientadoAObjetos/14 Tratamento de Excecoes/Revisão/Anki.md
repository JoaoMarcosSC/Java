
TARGET DECK: 14 - Tratamento de Excecoes

Em Java, o que define tecnicamente uma exceção?
A. É um erro de sintaxe que impede a compilação do código. 
B. É um objeto herdado da classe java.lang.Throwable que representa uma condição de erro ou comportamento inesperado. 
C. É uma estrutura de controle de fluxo similar ao "if-else". 
D. É um método especial disparado automaticamente pelo Garbage Collector. #flashcard
Resposta Correta: B
Justificativa: De acordo com as fontes, uma exceção em Java é qualquer condição de erro ou comportamento inesperado encontrado por um programa em execução, sendo representada por objetos que herdam da hierarquia de Throwable.
<!--ID: 1771330199238-->


Sobre a diferença entre as classes Exception e RuntimeException, qual afirmação está correta?
A. O compilador obriga o tratamento ou propagação de classes que herdam de Exception (exceto RuntimeException), enquanto para RuntimeException o tratamento não é obrigatório. 
B. RuntimeException deve obrigatoriamente ser tratada com um bloco try-catch, caso contrário o código não compila. 
C. Somente RuntimeException pode ser lançada usando a cláusula throw. 
D. Ambas exigem obrigatoriamente a declaração na assinatura do método com a cláusula throws. #flashcard
Resposta Correta: A
Justificativa: As fontes especificam que o compilador Java obriga o tratamento (try-catch) ou propagação (throws) para java.lang.Exception, mas não impõe essa obrigatoriedade para as exceções do tipo java.lang.RuntimeException.
<!--ID: 1771330199243-->


Analise a hierarquia de exceções do Java. Qual das seguintes classes é considerada um erro crítico da máquina virtual, e não uma exceção comum de fluxo de aplicação?
A. IOException 
B. NullPointerException 
C. OutOfMemoryError 
D. InputMismatchException #flashcard
Resposta Correta: C
Justificativa: Conforme o diagrama de hierarquia das fontes, OutOfMemoryError e VirtualMachineError estão sob a árvore de Error, que representa problemas graves na JVM, enquanto as outras opções são exceções de aplicação ou de runtime.
<!--ID: 1771330199247-->


O que acontece quando uma exceção é lançada em um método e não é capturada (tratada) dentro dele?
A. O programa é reiniciado imediatamente. 
B. A exceção é propagada na pilha de chamadas de métodos em execução até ser capturada ou o programa ser encerrado. 
C. O compilador gera um erro automático e impede a execução de outros métodos. 
D. O valor de retorno do método torna-se automaticamente null. #flashcard
Resposta Correta: B
Justificativa: Quando lançada, uma exceção é propagada na pilha de chamadas ("call stack") até encontrar um bloco de tratamento ou causar o encerramento do programa.
<!--ID: 1771330199252-->


Qual é a principal função do bloco finally em uma estrutura try-catch-finally?
A. Capturar exceções que não foram previstas nos blocos catch anteriores. 
B. Executar um código somente se nenhuma exceção ocorrer no bloco try. 
C. Garantir a execução de um trecho de código independentemente de ter ocorrido ou não uma exceção, como para fechar recursos (arquivos ou conexões). 
D. Reiniciar o bloco try caso um erro de entrada de dados seja detectado. #flashcard
Resposta Correta: C
Justificativa: O bloco finally contém código que deve ser executado sempre, ocorrendo erro ou não, sendo o exemplo clássico o fechamento de arquivos ou conexões de banco de dados.
<!--ID: 1771330199257-->


Considere o seguinte trecho de código Java:
try {
    String[] vect = {"Apple", "Banana", "Orange"};
    System.out.println(vect[6]);
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("Erro de indice");
} finally {
    System.out.println("Fim do bloco");
}
Qual será a saída no console?
A. Erro de indice 
B. Fim do bloco 
C. Erro de indice Fim do bloco 
D. O código não compila pois falta a cláusula throws. #flashcard
Resposta Correta: C
Justificativa: O código tenta acessar um índice inexistente (5), lançando ArrayIndexOutOfBoundsException. O bloco catch captura a exceção e imprime "Erro de indice", e o bloco finally é executado logo em seguida, imprimindo "Fim do bloco".
<!--ID: 1771330199261-->


Sobre as cláusulas throw e throws, assinale a alternativa correta:
A. throws é usado para lançar uma exceção manualmente, enquanto throw é usado na assinatura do método. 
B. throw lança uma exceção e interrompe o método; throws propaga a exceção ao invés de tratá-la, sendo usado na assinatura do método. 
C. Ambas têm a mesma função e podem ser usadas de forma intercambiável. 
D. throw só pode ser usado com exceções do tipo Error. #flashcard
Resposta Correta: B
Justificativa: De acordo com o resumo da aula, a cláusula throw lança a exceção e "corta" a execução do método, enquanto a cláusula throws declara que o método pode propagar aquela exceção para quem o chamou.
<!--ID: 1771330199265-->


Quais são as vantagens de utilizar o modelo de tratamento de exceções em vez de utilizar códigos de erro manuais (como retornar strings ou inteiros)? (Selecione todas as que se aplicam)
A. Permite delegar a lógica do erro para a classe responsável pelas regras de negócio. 
B. Permite que construtores também tratem ou lancem exceções. 
C. Organiza o tratamento de diferentes tipos de erros de forma hierárquica. 
D. O código fica mais limpo, evitando aninhamentos excessivos de condicionais. #flashcard
Resposta Correta: A, B, C, D
Justificativa: Todas as alternativas são listadas nas fontes como vantagens do modelo de exceções do Java: delegação de lógica, suporte em construtores, organização hierárquica e simplificação do código (evitando condicionais aninhadas).
<!--ID: 1771330199270-->


Ao utilizar múltiplos blocos catch para tratar diferentes exceções, qual regra de hierarquia deve ser observada?
A. As exceções mais genéricas (como Exception) devem vir antes das mais específicas (como IOException). 
B. A ordem dos blocos catch não importa para o compilador. 
C. É permitido o uso de upcasting, capturando uma exceção específica através de um tipo mais genérico. 
D. Cada bloco try só pode aceitar no máximo dois blocos catch. #flashcard
Resposta Correta: C
Justificativa: O material afirma que no bloco catch deve ser especificado o tipo da exceção e que o "upcasting é permitido". Na prática do Java (estilo OCP), exceções mais específicas devem vir antes das genéricas para serem capturadas corretamente, mas a alternativa C descreve corretamente a possibilidade técnica mencionada na fonte.
<!--ID: 1771330199274-->


No contexto de um programa que lê um arquivo (como o exemplo do Scanner com File), por que é importante verificar se o recurso não é nulo antes de fechá-lo no finally?
A. Para evitar uma NullPointerException caso a abertura do recurso tenha falhado no bloco try. 
B. Porque o método close() só funciona em objetos que não foram instanciados. 
C. Para garantir que o arquivo seja excluído do disco. 
D. É uma exigência do compilador para qualquer variável local dentro do try. #flashcard
Resposta Correta: A
Justificativa: No exemplo prático fornecido, o fechamento do Scanner dentro do finally é protegido por um if (sc != null), garantindo que não ocorra um erro ao tentar fechar um recurso que nunca chegou a ser aberto com sucesso.
<!--ID: 1771330199279-->


Qual classe na hierarquia do Java é a superclasse direta de todas as outras classes de exceção e erro?
A. Exception 
B. RuntimeException 
C. Throwable 
D. ObjectError #flashcard
Resposta Correta: C
Justificativa: O diagrama de hierarquia mostra que Throwable é a classe base da qual derivam tanto Error quanto Exception.
<!--ID: 1771330199283-->


Em um cenário de reserva de hotel, qual seria a "Solução Boa" (Solução 3) para validar se a data de saída é anterior à data de entrada?
A. Retornar uma String de erro no método de atualização. 
B. Validar os dados com if-else diretamente no programa principal (Main). 
C. Criar uma exceção personalizada e lançá-la (throw) no método de atualização da reserva. 
D. Utilizar um comando System.exit(0) para parar o programa. #flashcard
Resposta Correta: C
Justificativa: As fontes indicam que a solução 3 (considerada boa) envolve o tratamento de exceções, permitindo que a lógica de validação seja delegada à classe responsável (Reservation) e que erros sejam lançados de forma consistente.
<!--ID: 1771330199288-->


O que o método e.printStackTrace() faz quando chamado em um bloco catch?
A. Exclui o rastro do erro para proteger a segurança do sistema. 
B. Imprime na tela a pilha de chamadas de métodos que levaram à ocorrência da exceção. 
C. Converte a exceção em um arquivo de log criptografado. 
D. Finaliza a execução da JVM imediatamente sem executar o finally. #flashcard
Resposta Correta: B
Justificativa: No exemplo do método 2, e.printStackTrace() é utilizado para mostrar o rastro de execução, o que ajuda a identificar onde o erro ocorreu na pilha de chamadas.
<!--ID: 1771330199293-->


Uma classe de exceção personalizada criada pelo programador para representar um erro de negócio (como "Saldo Insuficiente") deve preferencialmente herdar de qual classe para que o compilador obrigue o seu tratamento?
A. Error 
B. RuntimeException 
C. Exception 
D. Throwable #flashcard
Resposta Correta: C
Justificativa: De acordo com o material, se herdar de Exception, o compilador obriga a tratar ou propagar, o que é desejável para garantir que erros de negócio sejam tratados; se herdar de RuntimeException, o tratamento não é obrigatório.
<!--ID: 1771330199297-->


Analise o código abaixo e identifique o erro conceitual:
public void myMethod() {
    try {
        // código que gera IOException
    } catch (Exception e) {
        System.out.println("Erro");
    } catch (IOException e) {
        System.out.println("Erro específico");
    }
}
A. Não há erro; o código compila perfeitamente. 
B. O bloco catch (IOException) nunca será alcançado pois IOException é uma subclasse de Exception. 
C. Falta o bloco finally, que é obrigatório em todo try. 
D. O método deveria ter a cláusula throws RuntimeException na sua assinatura. #flashcard
Resposta Correta: B
Justificativa: Embora o material mencione que o upcasting é permitido, em Java, colocar um catch mais genérico (Exception) antes de um mais específico (IOException) resulta em erro de compilação, pois a exceção específica já teria sido capturada pelo bloco genérico superior. Isso reflete a importância da organização hierárquica mencionada nas fontes.
<!--ID: 1771330199302-->

Implemente uma classe Account contendo número, titular, saldo e limite de saque, garantindo que o saldo não possa ser alterado diretamente. #flashcard
public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;
    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }
    public Double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        balance += amount;
    }
}
<!--ID: 1771330430359-->



Implemente no método withdraw da classe Account as validações para impedir saque acima do limite ou sem saldo suficiente, lançando uma exceção personalizada. #flashcard
public void withdraw(double amount) {
    if (amount > withdrawLimit) {
        throw new DomainException("The amount exceeds withdraw limit");
    }
    if (amount > balance) {
        throw new DomainException("Not enough balance");
    }
    balance -= amount;
}
<!--ID: 1771330430364-->



Implemente uma exceção personalizada DomainException para representar erros de regra de negócio. #flashcard
public class DomainException extends RuntimeException {
    public DomainException(String msg) {
        super(msg);
    }
}
<!--ID: 1771330430369-->



Implemente o fluxo principal utilizando try-catch para capturar a exceção de domínio e exibir a mensagem de erro conforme os exemplos. #flashcard
try {
    Account acc = new Account(number, holder, initialBalance, withdrawLimit);
    acc.withdraw(amount);
    System.out.printf("New balance: %.2f%n", acc.getBalance());
}
catch (DomainException e) {
    System.out.println("Withdraw error: " + e.getMessage());
}
catch (RuntimeException e) {
    System.out.println("Unexpected error");
}
<!--ID: 1771330430373-->



Implemente o programa completo que leia os dados da conta, realize o saque e trate possíveis exceções conforme o enunciado. #flashcard
Scanner sc = new Scanner(System.in);
Integer number = sc.nextInt();
sc.nextLine();
String holder = sc.nextLine();
Double initialBalance = sc.nextDouble();
Double withdrawLimit = sc.nextDouble();
Account acc = new Account(number, holder, initialBalance, withdrawLimit);
Double amount = sc.nextDouble();
try {
    acc.withdraw(amount);
    System.out.printf("New balance: %.2f%n", acc.getBalance());
}
catch (DomainException e) {
    System.out.println("Withdraw error: " + e.getMessage());
}
sc.close();
<!--ID: 1771330430378-->


