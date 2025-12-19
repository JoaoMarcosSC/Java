>O arquivo `application.yml` é o principal arquivo de **configuração externa** de uma aplicação Spring Boot. Ele permite definir propriedades da aplicação de forma declarativa, sem a necessidade de código Java. O formato **YAML (YAML Ain’t Markup Language)** utiliza indentação para representar hierarquia, substituindo o uso de chaves e pontos que seriam usados no formato `application.properties`.


A chave raiz `spring` agrupa todas as configurações relacionadas diretamente ao ecossistema Spring. Tudo que estiver indentado abaixo dela pertence ao contexto de configuração do framework.

```Java
spring:
```

A configuração `spring.application.name` define o **nome lógico da aplicação**. Esse nome é utilizado principalmente para identificação em logs, monitoramento e, em arquiteturas mais complexas, em ambientes com múltiplos serviços (microservices).

```Java
spring:   
	application:     
		name: Produtos API
```


A seção `spring.datasource` é responsável por configurar a **fonte de dados (DataSource)** da aplicação, ou seja, as informações necessárias para que o Spring consiga se conectar ao banco de dados. Essa configuração é utilizada diretamente pelo JPA, pelo Hibernate e por qualquer outro mecanismo de acesso a dados.


```Java
spring:   
	datasource:
```

A propriedade `url` define a **string de conexão JDBC** utilizada para acessar o banco de dados. No caso do H2, o prefixo `jdbc:h2:mem:` indica que o banco será criado **em memória**, existindo apenas enquanto a aplicação estiver em execução. O nome `produtos` identifica essa base de dados em memória.

```Java
spring:   
	datasource:     
		url: jdbc:h2:mem:produtos
```

Isso significa que:
- O banco não será salvo em disco
- Todos os dados serão perdidos ao reiniciar a aplicação
- É ideal para testes e desenvolvimento

A propriedade `username` define o **usuário do banco de dados**. No H2, o usuário padrão é `sa` (_system administrator_), que possui permissões administrativas.

```Java
spring:   
	datasource:     
	username: sa
```

A propriedade `password` define a **senha do usuário do banco de dados**. Em ambientes de desenvolvimento com H2, essa senha pode ser simples ou até vazia, dependendo da configuração.

```Java
spring:   
	datasource:     
		password:
```

A seção `spring.jpa` agrupa configurações relacionadas ao **JPA (Java Persistence API)**, que é a especificação usada pelo Spring para acesso a banco de dados via ORM. A propriedade `database-platform` informa ao JPA qual **dialeto SQL** deve ser utilizado, ou seja, como o SQL deve ser gerado de acordo com o banco de dados utilizado.

```Java
spring:   
	jpa: 
		database-platform: org.hibernate.dialect.H2Dialect
```

A seção `spring.h2` contém configurações específicas do banco de dados **H2**, que é um banco em memória muito utilizado para testes e ambientes de desenvolvimento. O H2 possui um **console web** que permite visualizar tabelas e executar comandos SQL diretamente no navegador.

```Java
spring:   
	h2:     
		console:       
			enabled: true       
			path: /h2-console
```
- `enabled: true` ativa o console web do H2
- `path: /h2-console` define o endpoint de acesso ao console

Na prática, com a aplicação rodando, o console pode ser acessado em:
`http://localhost:8081/h2-console`

A chave raiz `server` agrupa configurações relacionadas ao **servidor web embutido** do Spring Boot (Tomcat, por padrão). Essas configurações afetam diretamente como a aplicação é exposta na rede.

```Java
server:
```

A propriedade `server.port` define a **porta HTTP** na qual a aplicação será executada. Caso essa configuração não seja definida, o Spring Boot utiliza a porta padrão `8080`.

```Java
`server:   
	port: 8081`
```

Nesse caso, a aplicação passa a responder em:
`http://localhost:8081`

Em resumo, esse `application.yml`:
- Define o **nome da aplicação**
- Configura o **dialeto do banco de dados para o JPA**
- Habilita o **console web do H2**
- Altera a **porta padrão do servidor**