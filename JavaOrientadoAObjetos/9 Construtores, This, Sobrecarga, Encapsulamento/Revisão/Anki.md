
TARGET DECK: 9 - Construtores, This, Sobrecarga, Encapsulamento

Qual das seguintes afirmações sobre construtores em Java é verdadeira?
A. Um construtor deve ter o mesmo nome da classe e retornar void. 
B. Se um programador definir qualquer construtor customizado na classe, o Java não fornecerá mais o construtor padrão automaticamente. 
C. Construtores são usados apenas para imprimir mensagens durante a criação do objeto. 
D. Uma classe pode ter apenas um construtor por #flashcard
Resposta Correta: B
Justificativa: Conforme as fontes, se um construtor customizado não for especificado, a classe disponibiliza o construtor padrão. No entanto, ao criar um construtor próprio, perde-se o padrão, a menos que ele seja explicitamente declarado.
<!--ID: 1771251226684-->


Sobre o uso da palavra-chave this, selecione as opções que representam usos comuns descritos no material:
A. Serve para destruir um objeto e liberar memória. 
B. É uma referência para o próprio objeto, usada para diferenciar atributos de variáveis locais. 
C. Pode ser usada para passar o próprio objeto como argumento na chamada de outro método. 
D. É usada para declarar variáveis que não podem ter seu valor #flashcard
Resposta Correta: B, C
Justificativa: As fontes indicam que os usos comuns do this são referenciar o próprio objeto, diferenciar atributos de variáveis locais (especialmente em construtores) e passar o objeto como argumento.
<!--ID: 1771251226689-->


O que define tecnicamente o conceito de sobrecarga (overloading) em Java?
A. É a capacidade de uma classe ter vários métodos com o mesmo nome e a mesma lista de parâmetros. 
B. É a capacidade de uma classe oferecer mais de uma operação com o mesmo nome, desde que possuam diferentes listas de parâmetros. 
C. É o ato de esconder atributos de uma classe usando o modificador private. 
D. É o processo de herdar métodos de uma classe #flashcard
Resposta Correta: B
Justificativa: A sobrecarga é definida nas fontes como o recurso de uma classe possuir mais de uma operação com o mesmo nome, porém com diferentes listas de parâmetros.
<!--ID: 1771251226693-->


No contexto de encapsulamento, qual é a recomendação geral ("regra de ouro") para os atributos de uma classe?
A. Devem ser sempre public para facilitar o acesso de qualquer parte do sistema. 
B. Devem ser protected para que apenas subclasses os vejam. 
C. Devem ser private e o acesso deve ocorrer apenas por meio de métodos get e set. 
D. Devem ser declarados sem modificador de acesso para uso dentro do mesmo #flashcard
Resposta Correta: C
Justificativa: Segundo o material, a "regra de ouro" do encapsulamento é que o objeto deve garantir seu estado consistente, não expondo atributos diretamente (usando private) e permitindo acesso via métodos getters e setters.
<!--ID: 1771251226697-->


Considere o código abaixo:
public class Product {
    private String name;
    private double price;
public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
O que acontece se tentarmos instanciar um objeto com Product p = new Product();? 
A. O código compila normalmente e os atributos ficam com valores nulos. 
B. O código gera um erro de compilação, pois o construtor padrão não está mais disponível. 
C. O Java chama automaticamente o construtor de dois parâmetros passando null e 0.0. 
D. O objeto é criado, mas não pode ser acessado por outras #flashcard
Resposta Correta: B
Justificativa: Como a classe possui um construtor customizado Product(String name, double price), o Java retira o construtor padrão Product(). Para que o código compilasse, o desenvolvedor teria que declarar explicitamente o construtor vazio.
<!--ID: 1771251226701-->


Qual modificador de acesso permite que um membro seja acessado na própria classe, em classes do mesmo pacote e em subclasses de pacotes diferentes?
A. private 
B. (nada/default) 
C. protected 
D. public #flashcard
Resposta Correta: C
Justificativa: O modificador protected permite o acesso dentro do mesmo pacote e também por subclasses localizadas em pacotes diferentes.
<!--ID: 1771251226706-->


Sobre o padrão JavaBeans para getters e setters, qual a assinatura correta para recuperar o valor de um atributo private int quantity;?
A. public void setQuantity(int quantity) 
B. public int getQuantity() 
C. private int quantity() 
D. public int quantityGetter() #flashcard
Resposta Correta: B
Justificativa: O padrão JavaBeans estabelece que para obter um valor (getter), utiliza-se o prefixo get seguido do nome do atributo com a primeira letra maiúscula, retornando o tipo do dado.
<!--ID: 1771251226709-->


Analise a seguinte situação: Uma classe Account possui um atributo balance (saldo). Por que, segundo os princípios de encapsulamento do material, o método setBalance(double balance) seria desencorajado?
A. Porque o saldo não deve ser alterado livremente, mas sim através de operações de negócio como depósito e saque. 
B. Porque o tipo double não pode ser usado em métodos set. 
C. Porque métodos set só podem ser usados para Strings. 
D. Porque o saldo deve ser obrigatoriamente public para o #flashcard
Resposta Correta: A
Justificativa: O material enfatiza que o saldo de uma conta não deve ser alterado livremente para garantir a consistência do objeto. Alterações no saldo devem ocorrer por métodos específicos como deposit e withdraw.
<!--ID: 1771251226714-->


Qual o comportamento de um membro (atributo ou método) declarado sem nenhum modificador de acesso em Java?
A. Ele é visível para todas as classes do projeto. 
B. Ele é estritamente privado à classe. 
C. Ele só pode ser acessado por classes que estejam no mesmo pacote. 
D. Ele se torna automaticamente protected por #flashcard
Resposta Correta: C
Justificativa: Quando nenhum modificador é especificado (acesso de pacote), o membro só pode ser acessado por classes dentro do mesmo pacote.
<!--ID: 1771251226718-->


Imagine uma classe com três construtores: um sem parâmetros, um com String name e outro com String name, double price. Isso é um exemplo de:
A. Encapsulamento. 
B. Sobrecarga. 
C. Injeção de dependência forçada. 
D. Herança de #flashcard
Resposta Correta: B
Justificativa: Ter múltiplos construtores com o mesmo nome, mas listas de parâmetros diferentes na mesma classe, é o conceito de sobrecarga.
<!--ID: 1771251226722-->


O que acontece com os atributos de um objeto quando executamos product = new Product(); em uma classe que possui o construtor padrão e nenhum valor inicial foi definido?
A. Eles permanecem sem espaço alocado na memória. 
B. Recebem valores padrão da linguagem, como null para objetos, 0.0 para números decimais e 0 para inteiros. 
C. O programa dispara uma exceção de "NullPointerException". 
D. O compilador obriga a inicialização manual antes de prosseguir com a #flashcard
Resposta Correta: B
Justificativa: Ao instanciar um objeto sem passar valores, os atributos são iniciados com valores padrão: null para tipos referência, 0.0 para double e 0 para int.
<!--ID: 1771251226726-->


Em um sistema bancário baseado no exercício de fixação do material, se o número da conta não pode ser alterado após a criação, como isso deve ser refletido no código?
A. Não deve ser criado um método setNumber para esse atributo. 
B. O atributo deve ser declarado como public. 
C. Deve-se criar um método getNumber que retorne sempre um valor fixo. 
D. Deve-se remover o atributo do #flashcard
Resposta Correta: A
Justificativa: Para impedir a alteração de um valor que deve ser constante após a criação do objeto, simplesmente não fornecemos o método set correspondente, mantendo o atributo private.
<!--ID: 1771251226731-->


Qual é o objetivo de usar a função String.format("%.2f", price) dentro do método toString() de uma classe?
A. Arredondar o preço para o número inteiro mais próximo. 
B. Formatar a saída numérica para exibir duas casas decimais. 
C. Converter o preço para um valor binário. 
D. Validar se o preço é um valor #flashcard
Resposta Correta: B
Justificativa: O material utiliza o String.format("%.2f", ...) para garantir que valores monetários (como preço e saldo) sejam exibidos com duas casas decimais na representação textual do objeto.
<!--ID: 1771251226735-->


Considere o modificador private. Qual das alternativas abaixo está correta?
A. Atributos privados podem ser acessados por subclasses em pacotes diferentes. 
B. O modificador private garante que o membro só seja acessível dentro da própria classe onde foi declarado. 
C. Métodos privados são visíveis para qualquer classe no mesmo pacote. 
D. private é o modificador padrão quando nada é #flashcard
Resposta Correta: B
Justificativa: O modificador private é o mais restritivo, limitando o acesso ao membro apenas à própria classe.
<!--ID: 1771251226741-->


No código this.quantity += quantity;, qual a função do primeiro quantity (precedido por this)?
A. Referenciar a variável local passada como parâmetro no método. 
B. Referenciar o atributo da classe (membro do objeto). 
C. Criar uma nova variável temporária na memória. 
D. Indicar que a variável é estática e pertence à #flashcard
Resposta Correta: B
Justificativa: O prefixo this. é usado para referenciar o atributo da classe, distinguindo-o de variáveis locais ou parâmetros que possuam o mesmo nome.
<!--ID: 1771251226745-->

Implemente um programa em Java que cadastre uma conta bancária informando número da conta (imutável), nome do titular (alterável) e depósito inicial opcional. O saldo não pode ser alterado diretamente, apenas por meio de depósito e saque (com taxa de $5.00 por saque), podendo ficar negativo. Após criar a conta, realize um depósito e um saque, exibindo os dados atualizados após cada operação. #flashcard
public class Account {
private final int number;
private String holder;
private double balance;
public Account(int number, String holder) {
	this.number = number;
	this.holder = holder;
}
public Account(int number, String holder, double initialDeposit) {
    this.number = number;
    this.holder = holder;
    deposit(initialDeposit);
}
    public int getNumber() {
        return number;
    }
    public String getHolder() {
        return holder;
    }
    public void setHolder(String holder) {
        this.holder = holder;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw(double amount) {
        balance -= amount + 5.0;
    }
    public String toString() {
        return "Account "
                + number
                + ", Holder: "
                + holder
                + ", Balance: $ "
                + String.format("%.2f", balance);
    }
}
<!--ID: 1771251513108-->

