
## 1. ProdutoController
### Mapeamento de requisição GET com variável de caminho

A anotação `@GetMapping("/{id}")` indica que esse método responde a **requisições HTTP do tipo GET** e que a URL contém um **parâmetro dinâmico**, chamado `id`. Esse tipo de parâmetro é conhecido como _path variable_.

Isso permite chamadas como:

```Java
GET /produtos/123 GET /produtos/a1b2c3
```

```Java
@GetMapping("/{id}")
```

### Assinatura do método

O método `obterPorId` retorna um objeto do tipo `Produto`. O nome do método não influencia o endpoint, mas descreve semanticamente o que ele faz: buscar um produto pelo seu identificador.

```Java
public Produto obterPorId(@PathVariable("id") String id){
```

### Uso do `@PathVariable`

A anotação `@PathVariable("id")` informa ao Spring que o valor presente na URL, no lugar de `{id}`, deve ser capturado e atribuído ao parâmetro `id` do método.

Ou seja, se a URL for:

```Java
/produtos/abc123
```

o valor `"abc123"` será passado para a variável `id`.

```Java
@PathVariable("id") String id
```

### Consulta ao banco de dados

O método `findById` é fornecido automaticamente pelo `JpaRepository`. Ele realiza uma consulta no banco usando o campo marcado com `@Id` na entidade (`id`, no caso do `Produto`).

Esse método retorna um `Optional<Produto>`, pois o registro pode ou não existir.

```Java
produtoRepository.findById(id)
```

### Uso do `orElse(null)`

O método `orElse(null)` define o comportamento caso o produto **não seja encontrado** no banco:

- Se existir um produto com aquele ID → ele é retornado
- Se não existir → o método retorna `null`

```Java
.orElse(null)
```

Na prática, isso resulta em:
- Produto encontrado → JSON do produto
- Produto não encontrado → resposta vazia (HTTP 200 com body null)

### Conclusão

Essa nova parte adiciona à API a funcionalidade de **leitura por identificador**, completando o ciclo básico de persistência:
- O `POST` cria e salva o produto
- O `GET /produtos/{id}` recupera o produto salvo

## 2. Postman

### Método HTTP e URL

O método **GET**, que indica uma **operação de leitura**. Diferente do POST, o GET não envia corpo (body) para criar dados, apenas solicita informações existentes.

A URL utilizada é:

```JSON
http://localhost:8081/produtos/:id
```

O trecho `:id` indica que a URL possui uma **variável de caminho**, que será substituída por um valor real no momento da requisição.

### Uso de Path Variables no Postman

Na aba **Params**, o Postman separa dois conceitos importantes:
- **Query Params** → parâmetros após `?` na URL
- **Path Variables** → parâmetros embutidos no caminho da URL

Nesse caso, o endpoint usa **Path Variable**, então o valor do `id` é definido na seção **Path Variables**.

### Configuração feita no Postman
- **Key:** `id`
- **Value:** `18d9baf0-4352-4661-8fb5-af23d2db12eb`

O Postman automaticamente substitui `:id` na URL pelo valor informado, resultando internamente em algo como:

```Java
http://localhost:8081/produtos/18d9baf0-4352-4661-8fb5-af23d2db12eb
```

### Relação direta com o controller

Essa chamada corresponde exatamente ao método:
```Java
@GetMapping("/{id}") 
public Produto obterPorId(@PathVariable("id") String id)
```


O que acontece no backend:
1. O Spring identifica o endpoint `/produtos/{id}`
2. Extrai o valor presente na URL
3. Atribui esse valor ao parâmetro `id`
4. Executa `produtoRepository.findById(id)`
5. Retorna o produto encontrado

### Resposta da API (Response Body)

Na parte inferior do Postman é exibida a resposta da requisição, no formato **JSON**, com status **200 OK**, indicando sucesso.

```Json
{   
	"id": "18d9baf0-4352-4661-8fb5-af23d2db12eb",   
	"nome": "HD",   
	"descricao": "HD Sata",   
	"preco": 200.0 
}
```

Esse JSON representa exatamente o objeto `Produto` retornado pelo método do controller, já convertido automaticamente pelo Spring.

### Por que o produto foi encontrado

O produto retornado existe porque:
1. Ele foi criado anteriormente via `POST /produtos`
2. Foi salvo no banco H2 com um ID gerado por `UUID`
3. O mesmo ID foi usado agora na requisição GET

Isso confirma que:
- O dado foi persistido corretamente
- O `findById` está funcionando
- O mapeamento `@PathVariable` está correto

### Diferença entre POST e GET no Postman (nessa aula)

- **POST /produtos**
    - Envia JSON no body
    - Cria e salva o produto
    - Retorna o produto salvo

- **GET /produtos/{id}**
    - Não envia body
    - Usa Path Variable
    - Retorna um produto existente

### Conclusão

Essa tela do Postman demonstra o **ciclo completo de persistência e consulta** da API:
1. Produto criado e salvo no banco
2. ID gerado e retornado
3. ID reutilizado na URL
4. Produto recuperado via GET

Esse é um padrão fundamental em APIs REST e valida que a integração entre **Postman → Controller → Repository → Banco (H2)** está funcionando corretamente.
