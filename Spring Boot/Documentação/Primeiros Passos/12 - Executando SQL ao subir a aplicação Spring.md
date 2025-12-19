## data.sql

O arquivo `data.sql é um script SQL que o Spring Boot executa **automaticamente na inicialização da aplicação**, desde que exista um `DataSource configurado. Ele é utilizado para **popular ou preparar o banco de dados**, criando tabelas e/ou inserindo dados iniciais, principalmente em ambientes de desenvolvimento e teste.

A instrução CREATE TABLE é utilizada para **criar uma nova tabela** no banco de dados. O nome da tabela definido é produto, que representará os dados persistidos dos produtos da aplicação.

```JAVA
create table produto(
```

A coluna id é definida como identificador único da tabela. O tipo varchar2(255) indica que o campo armazenará texto com até 255 caracteres. A cláusula not null impede que o campo fique vazio, e primary key define essa coluna como chave primária da tabela, garantindo unicidade.

```JAVA
id varchar2(255) not null primary key,
```

A coluna nome representa o nome do produto. Assim como o id, ela utiliza o tipo varchar2(255) e é marcada como not null, garantindo que todo produto tenha um nome obrigatoriamente preenchido.

```JAVA
nome varchar2(255) not null,
```

A coluna descricao armazena uma descrição textual do produto. Ela também utiliza o tipo varchar2(255), porém **não possui a restrição not null**, o que significa que esse campo é opcional.

```JAVA
descricao varchar2(255),
```

A coluna preco armazena o valor monetário do produto. O tipo number(18,2) indica que o campo pode conter números com até 18 dígitos no total, sendo 2 deles após a vírgula decimal, o que é adequado para valores financeiros.

```JAVA
preco number(18,2)
```

A instrução é finalizada com ;, encerrando a definição da tabela.
### Relação com a aplicação Spring Boot

Ao iniciar a aplicação:
1. O Spring detecta o DataSource configurado no application.yml
2. Executa automaticamente o script data.sql
3. Cria a tabela produto no banco H2 em memória
4. A tabela fica disponível para uso por repositories e entidades JPA

## H2 Console

**H2 Console**, que é uma interface web fornecida pelo banco de dados H2 para **visualização e execução manual de comandos SQL**. Esse console é muito utilizado em ambientes de desenvolvimento para validar rapidamente se tabelas foram criadas corretamente e se os dados estão sendo persistidos.

O acesso ao console é possível porque ele foi explicitamente habilitado no `application.yml`, por meio da configuração `spring.h2.console.enabled=true`, e exposto no caminho `/h2-console`.

O console está conectado à base de dados identificada pela URL JDBC:
`jdbc:h2:mem:produtos`

Isso confirma que:
- O banco de dados é **em memória**
- O nome da base é `produtos`
- Essa base é exatamente a mesma configurada em `spring.datasource.url`

Como o banco é em memória, ele existe apenas enquanto a aplicação Spring Boot está em execução.

No painel lateral esquerdo, é exibida a **estrutura do banco de dados**. Nela aparece a tabela `PRODUTO`, com suas colunas:

- `ID`
- `NOME`
- `DESCRICAO`
- `PRECO`

Essa tabela existe porque o script `data.sql` foi executado automaticamente na inicialização da aplicação, criando a tabela conforme definido no comando `CREATE TABLE`.

Esse ponto valida dois conceitos importantes:
1. O Spring reconheceu o `data.sql`
2. O banco H2 foi inicializado corretamente

No campo principal de edição SQL, está sendo executado o comando:

```SQL
SELECT * FROM PRODUTO;
```

Esse comando SQL utiliza a instrução `SELECT` para consultar **todos os registros** da tabela `PRODUTO`. O uso do `*` indica que todas as colunas devem ser retornadas.

Na área de resultado, logo abaixo, o console mostra:

`(no rows)`

Isso significa que:
- A tabela existe
- A estrutura está correta
- **Não há registros inseridos**

Esse comportamento é esperado, pois até o momento:

- O endpoint `POST /produtos` apenas recebe e retorna o objeto
- Não existe lógica de persistência (JPA / Repository)
- Nenhum `INSERT` foi executado no banco

Ou seja, o teste feito via Postman **não grava dados na tabela**, apenas imprime o objeto no console e o devolve como resposta HTTP.**H2 Console**, que é uma interface web fornecida pelo banco de dados H2 para **visualização e execução manual de comandos SQL**. Esse console é muito utilizado em ambientes de desenvolvimento para validar rapidamente se tabelas foram criadas corretamente e se os dados estão sendo persistidos.