
## 1. ProdutoController

### Mapeamento de requisição PUT

A anotação `@PutMapping("/{id}")` indica que esse método responde a **requisições HTTP do tipo PUT**. Em APIs REST, o método PUT é utilizado para **atualizar um recurso existente**, identificado pelo seu ID.

O trecho `/{id}` define uma **variável de caminho (path variable)**, que representa o identificador do produto que será atualizado.

```Java
@PutMapping("/{id}")
```

### Assinatura do método

O método `atualizar` não retorna nenhum valor (`void`), pois o objetivo principal é **modificar o estado de um recurso existente**, não necessariamente devolvê-lo na resposta.

Ele recebe dois parâmetros:
- o `id`, vindo da URL
- o objeto `Produto`, vindo do corpo da requisição

```Java
public void atualizar(@PathVariable("id") String id,       
	                  @RequestBody Produto produto){
```

### Uso do `@PathVariable`

A anotação `@PathVariable("id")` indica que o valor presente na URL deve ser extraído e atribuído ao parâmetro `id` do método.

Ou seja, se a chamada for:
`PUT /produtos/abc123`
O valor `"abc123"` será recebido pelo método.

```Java
@PathVariable("id") String id
```

### Uso do `@RequestBody`

A anotação `@RequestBody` instrui o Spring a **converter automaticamente o JSON enviado no corpo da requisição** em um objeto Java do tipo `Produto`.

Isso permite que os dados atualizados sejam enviados pelo cliente em formato JSON.

```Java
@RequestBody Produto produto
```

### Atribuição do ID ao objeto

Mesmo que o JSON enviado contenha (ou não) um campo `id`, o código força o uso do **ID vindo da URL**, garantindo consistência entre o recurso solicitado e o recurso atualizado.

Essa linha sobrescreve o `id` do objeto recebido com o valor correto.

```Java
produto.setId(id);
```

Esse passo é essencial porque:
- o `id` é a chave primária (`@Id`)
- o JPA utiliza o `id` para decidir se deve **atualizar** ou **inserir** um registro

### Persistência da atualização

O método `save` do `ProdutoRepository` é utilizado novamente. No contexto do JPA:
- Se o `id` já existir no banco → é feito um **UPDATE**
- Se o `id` não existir → é feito um **INSERT**
    
Nesse caso, a intenção é atualizar um produto existente.
```Java
produtoRepository.save(produto);
```

## 2. Postman
### Método HTTP e URL

Em APIs REST, o PUT é usado quando o cliente envia a nova representação completa do recurso.

A URL configurada é:

```Java
http://localhost:8081/produtos/:id
```

O trecho `:id` representa uma **variável de caminho**, que será substituída pelo identificador real do produto a ser atualizado.

### Uso de Path Variables no Postman

Na aba **Params**, o Postman permite definir o valor da **Path Variable** `id`.

### Configuração exibida
- **Key:** `id`
- **Value:** _(UUID do produto já existente)_

O Postman substitui automaticamente `:id` pelo valor informado, formando a URL final:

```Java
http://localhost:8081/produtos/{uuid}
```

Esse valor precisa corresponder a um produto **já salvo no banco**, caso contrário o `save` criará um novo registro.

### Corpo da requisição (Body)

Na aba **Body**, a opção **raw** com o tipo **JSON** está selecionada. Isso indica que os dados enviados no corpo da requisição estão no formato JSON.

O JSON contém os **novos valores** do produto que será atualizado:

```Json
{   
	"nome": "HD",   
	"descricao": "HD Kingston",   
	"preco": 200.0 
}
```

Note que o campo `id` **não está presente no JSON**. Isso é intencional, pois o ID é controlado pela URL.

### Relação com o método `atualizar`

Essa configuração do Postman corresponde diretamente ao método:

```Java
@PutMapping("/{id}") 
public void atualizar(@PathVariable("id") String id,     
                     @RequestBody Produto produto){    
     produto.setId(id);     
     produtoRepository.save(produto); 
}
```

O fluxo no backend é:
1. O Spring extrai o `id` da URL
2. Converte o JSON em um objeto `Produto`
3. O ID da URL é atribuído ao objeto
4. O método `save` é executado
5. O registro no banco é atualizado

### Resposta da API

O Postman mostra:
- **Status:** `200 OK`
- **Body:** vazio

Isso é esperado porque:

- O método retorna `void`
- A atualização foi executada com sucesso
- Não há necessidade de retornar o objeto atualizado

### Comportamento após a atualização

Depois dessa chamada:
- O produto no banco passa a ter os novos valores
- Um `GET /produtos/{id}` retornará os dados atualizados
- O ID permanece o mesmo

### PUT vs POST (nesta aula)

- **POST** cria um novo recurso e gera um ID
- **PUT** atualiza um recurso existente usando o ID da URL

Esse teste no Postman confirma que a operação de **Update** do CRUD está funcionando corretamente.

### Conclusão

Essa tela do Postman demonstra a **atualização completa de um produto via API REST**, validando a integração entre:

**Postman → Controller → Repository → Banco (H2)**

Com isso, o CRUD da aplicação está totalmente funcional e consistente do ponto de vista REST.