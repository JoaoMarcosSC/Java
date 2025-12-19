
## 1. Classe `Produto` (camada de modelo)

Essa classe representa um **modelo de domínio** (ou entidade simples), responsável por **encapsular os dados** de um produto. Em aplicações Spring, esse tipo de classe é usado para transportar dados entre camadas (Controller, Service, Repository) e também para serialização/deserialização de JSON.

### Declaração do pacote

A instrução `package` define o **namespace** da classe, organizando o código em módulos lógicos e evitando conflitos de nomes. Aqui, o pacote `model` indica que a classe pertence à camada de modelo da aplicação.

```Java
package io.github.cursodsousa.produtosapi.model;
```

### Declaração da classe

A palavra-chave `public` torna a classe acessível a partir de qualquer outro pacote. A palavra-chave `class` define uma nova classe Java chamada `Produto`.

```Java
public class Produto {
```

### Atributos privados (encapsulamento)

Os atributos são declarados como `private` para aplicar o princípio do **encapsulamento**, impedindo acesso direto aos dados e forçando o uso de métodos para leitura e escrita. Cada atributo representa uma característica do produto.

```Java
private String id; 
private String nome; 
private String descricao; 
private double preco;
```

### Métodos getters

Os métodos `get` permitem **acesso controlado** aos atributos privados. A sintaxe segue o padrão JavaBeans, essencial para frameworks como o Spring funcionarem corretamente (ex.: binding de JSON).

```Java
public String getId() {     
return id; 
}  

public String getNome() {     
return nome; 

}  public String getDescricao() {     
return descricao; 

}  public double getPreco() {     
return preco; 
}
```

### Métodos setters

Os métodos `set` permitem **alterar o valor dos atributos privados**. A palavra-chave `this` é usada para diferenciar o atributo da classe do parâmetro do método.

```Java
public void setId(String id) {     
this.id = id; 
}  

public void setNome(String nome) {     
this.nome = nome; 
}  

public void setDescricao(String descricao) {     
this.descricao = descricao; 
}  

public void setPreco(double preco) {     
this.preco = preco; 
}
```

### Sobrescrita do método `toString`

A anotação `@Override` indica que o método está sobrescrevendo um método da classe `Object`. O método `toString` define como o objeto será representado em forma de texto, sendo muito útil para logs e depuração.

```Java
@Override public String toString() {     
return "Produto{" +             
	"id='" + id + '\'' +             
	", nome='" + nome + '\'' +             
	", descricao='" + descricao + '\'' +             
	", preco=" + preco +             
	'}'; 
	}
```

## 2. Classe `ProdutoController` (camada de controller)

Essa classe pertence à **camada de controle**, responsável por **receber requisições HTTP**, processar os dados recebidos e retornar respostas ao cliente.

### Declaração do pacote

O pacote `controller` indica que essa classe lida com **endpoints HTTP** e regras de entrada/saída da aplicação.

```Java
package io.github.cursodsousa.produtosapi.controller;
```

---

### Anotação `@RestController`

Essa anotação define a classe como um **controller REST**, indicando que os métodos retornam dados diretamente no corpo da resposta HTTP, geralmente em JSON.

```Java
@RestController
```

### `@RequestMapping`

Define um **prefixo comum de URL** para todos os endpoints da classe. Nesse caso, todas as rotas começam com `/produtos`.

```Java
@RequestMapping("produtos")
```

### Mapeamento de requisição POST

A anotação `@PostMapping` indica que o método responde a requisições HTTP do tipo **POST**. Como não há caminho definido, ele herda o caminho da classe (`/produtos`).

```Java
@PostMapping
```

### Uso do `@RequestBody`

A anotação `@RequestBody` instrui o Spring a **converter automaticamente o JSON recebido no corpo da requisição** em um objeto Java do tipo `Produto`, utilizando os getters e setters.

```Java
public Produto salvar(@RequestBody Produto produto){
```

### Corpo do método

O método imprime o objeto recebido no console (usando o `toString`) e retorna o próprio objeto. O Spring converte automaticamente esse objeto de volta para JSON na resposta HTTP.

```Java
System.out.println("Produto recebido" + produto); return produto;
```

## Funcionamento prático

Quando uma requisição `POST /produtos` é enviada com um JSON como:

```Java
{   
"id": "1",   
"nome": "Notebook",   
"descricao": "Notebook Dell",   
"preco": 4500.00 }
```

O Spring:

1. Converte o JSON em um objeto `Produto`
2. Executa o método `salvar`
3. Imprime o produto no console
4. Retorna o mesmo objeto como resposta


## 3. Postman

O primeiro ponto importante é a **definição do método HTTP e da URL**. O método `POST` indica que a requisição está enviando dados para o servidor com o objetivo de criar ou processar um recurso. A URL `http://localhost:8081/produtos` aponta para a aplicação rodando localmente na porta `8081`, utilizando o mapeamento definido no controller pela anotação `@RequestMapping("produtos")`.

**Trecho configurado no Postman:**

```json
POST http://localhost:8081/produtos
```


Em seguida, é definido o **corpo da requisição (Body)**. Como a API espera receber um objeto `Produto`, o corpo da requisição é enviado no formato **JSON**, que é o padrão mais comum para comunicação entre APIs REST. No Postman, isso é feito selecionando a opção `raw` e o tipo `JSON`, o que automaticamente configura o header `Content-Type: application/json`.

O JSON enviado contém apenas os campos `nome`, `descricao` e `preco`. O campo `id` não é enviado porque, nesse estágio, ele ainda não está sendo gerado ou persistido no backend.

**JSON enviado no Body da requisição:**

```json
{   
"nome": "Pendrive",   
"descricao": "Kingston",   
"preco": 20 }
```

Ao enviar essa requisição, o Postman transmite o JSON no corpo da requisição HTTP. No backend, o Spring utiliza a anotação `@RequestBody` para **converter automaticamente esse JSON em um objeto Java do tipo `Produto`**, fazendo o mapeamento campo a campo com base nos nomes dos atributos e nos setters da classe.

Esse processo é chamado de **desserialização** (JSON → objeto Java).

Após o envio, o Postman exibe a **resposta do servidor**. O status `200 OK` indica que a requisição foi processada com sucesso. Como o método do controller retorna o próprio objeto `Produto`, o Spring realiza o processo inverso, chamado de **serialização** (objeto Java → JSON), e devolve o objeto como resposta HTTP.

**JSON retornado na resposta:**

```json
{   
"id": null,   
"nome": "Pendrive",   
"descricao": "Kingston",   
"preco": 20.0 }
```


O campo `id` aparece como `null` porque, no código atual, não existe nenhuma lógica para gerar ou atribuir um valor a ele. Os demais campos retornam exatamente os valores enviados, com a diferença de que o campo `preco` aparece como `20.0`, pois no Java ele é do tipo `double`.

Em resumo, esse teste no Postman valida todo o fluxo básico da API:
1. Envio de uma requisição HTTP `POST`
2. Transmissão de dados em JSON
3. Conversão automática do JSON para objeto Java (`@RequestBody`)
4. Execução do método do controller
5. Retorno do objeto convertido novamente para JSON
6. Recebimento da resposta com status `200 OK`