
## 1. ProdutoRepository

### `List<Produto>`

O tipo de retorno indica que:
- A consulta pode retornar **zero, um ou vários registros**
- Todos os registros retornados serão do tipo `Produto`

Isso faz sentido porque **mais de um produto pode ter o mesmo nome**.

### `findBy`

O prefixo `findBy` indica que o método executa uma **consulta de busca** no banco de dados.
Outros prefixos comuns seriam:
- `findAllBy`
- `existsBy`
- `countBy`

### `Nome`

Essa parte do nome do método **deve corresponder exatamente ao nome do atributo da entidade** `Produto`.
Na entidade você tem:
`private String nome;`
Por isso, o método se chama `findByNome`.  
Se o atributo se chamasse `descricao`, o método deveria ser `findByDescricao`.

### Parâmetro `String nome`
O parâmetro representa o **valor usado na cláusula WHERE** da consulta
Ou seja, esse valor será comparado com a coluna `nome` da tabela `produto`.

### Query gerada pelo Spring (conceitualmente)
Internamente, o Spring Data JPA gera algo equivalente a:
```sql
SELECT *  FROM produto  WHERE nome = ?
```
O `?` é substituído pelo valor passado como parâmetro no método.

## 2. ProdutoController

### Mapeamento de requisição GET sem Path Variable

A anotação `@GetMapping` **sem caminho definido** indica que esse método responde a requisições HTTP do tipo **GET** para o mesmo caminho base do controller.

Diferente dos outros GETs (`/{id}`), aqui **não há variável de caminho**, pois o filtro será feito por **parâmetro de consulta (query param)**.

```Java
@GetMapping
```

### Assinatura do método

O método `buscar` retorna uma **lista de produtos**, pois a busca por nome pode retornar **zero, um ou vários registros**.

```Java
public List<Produto> buscar(@RequestParam("nome") String nome){
```

### Uso do `@RequestParam`

A anotação `@RequestParam("nome")` indica que o valor do parâmetro **vem da query string da URL**, e não do corpo nem do caminho.

Nesse exemplo:
- `nome` é a chave do parâmetro
- `HD` é o valor capturado
- Esse valor é atribuído à variável `nome` do método

```Java
@RequestParam("nome") String nome
```

### Diferença entre `@RequestParam` e `@PathVariable`

- `@PathVariable` → faz parte do caminho da URL
    `/produtos/{id}`

- `@RequestParam` → vem após `?` na URL
    `/produtos?nome=HD`

Nesse método, o filtro é **opcional e baseado em critério**, não em identidade única.

### Chamada ao repositório

O método utiliza o novo método adicionado ao `ProdutoRepository`:
```Java
return produtoRepository.findByNome(nome);
```

Aqui acontece o seguinte:
1. O Spring recebe o valor do parâmetro `nome`
2. Chama `findByNome(nome)`
3. O Spring Data JPA gera automaticamente a query
4. Executa a busca no banco
5. Retorna uma lista de `Produto`
### Convivência com outros GETs

Agora o controller possui **dois GETs distintos**:
- `GET /produtos/{id}` → busca por ID (único)
- `GET /produtos?nome=valor` → busca por nome (lista)

O Spring consegue diferenciar os dois porque:
- Um usa **Path Variable**
- O outro usa **Request Param**

## 3. Postman

### Método HTTP e URL
No Postman, o método selecionado é **GET**, utilizado para **consulta de dados**.  
A URL configurada é:

```Java
http://localhost:8081/produtos?nome=HD
```

Diferente dos endpoints que usam _Path Variable_ (`/{id}`), aqui o filtro é feito por **parâmetro de consulta (query parameter)**, indicado pelo `?` na URL.

### Uso de Query Params no Postman

Na aba **Params**, o Postman mostra a seção **Query Params**, onde são definidos os parâmetros que vão após o `?` na URL.

### Configuração exibida na imagem
- **Key:** `nome`
- **Value:** `HD`

O Postman monta automaticamente a URL final com base nesses valores:

```Java
/produtos?nome=HD
```

Esse parâmetro será enviado ao backend como parte da requisição.

### Relação direta com o controller
Essa chamada corresponde exatamente ao método abaixo no `ProdutoController`:

```Java
@GetMapping 
public List<Produto> buscar(@RequestParam("nome") String nome){
     return produtoRepository.findByNome(nome);
}
```


O fluxo no backend é:
1. O Spring identifica uma requisição `GET /produtos`
2. Lê o parâmetro de consulta `nome`
3. Atribui o valor `"HD"` ao parâmetro `nome` do método
4. Executa `produtoRepository.findByNome(nome)`
5. Retorna uma lista de produtos encontrados

---

### Diferença entre Query Param e Path Variable

- **Query Param**
    `/produtos?nome=HD`
    Usado para **filtros e buscas**
    
- **Path Variable**
    `/produtos/{id}`
    Usado para **identificar um recurso único**

### Corpo da resposta (Response Body)

A resposta retornada pela API é um **array JSON**, pois o método retorna `List<Produto>`.

```Json
[
   {
        "id": "aab4f304-09f2-4bc9-bc2e-051f6071edd0",
        "nome": "HD",
        "descricao": "HD Sata",
        "preco": 200.0
    },
    
	{
	"id": "885b564d-6adc-4ef3-8a0e-0eb2a4f174c1",     
	"nome": "HD",     
	"descricao": "HD Kingston",     
	"preco": 200.0   
	} 
]
```

Isso confirma que:
- Existem **dois produtos** com o nome `"HD"`
- Ambos foram retornados na mesma requisição
- A busca não se limita a um único registro

### Status HTTP

O Postman exibe **200 OK**, indicando que:
- A requisição foi processada corretamente
- O endpoint foi encontrado
- A busca foi executada com sucesso