

## 1. ProdutoController
### Mapeamento de requisição DELETE

A anotação `@DeleteMapping("/{id}")` indica que esse método responde a **requisições HTTP do tipo DELETE** e que o recurso a ser removido é identificado por um **parâmetro de caminho** (`id`).

Em APIs REST, o método DELETE é utilizado para **excluir um recurso existente**.

```Java
@DeleteMapping("/{id}")
```

Na prática, esse mapeamento permite chamadas como:

```Java
DELETE /produtos/18d9baf0-4352-4661-8fb5-af23d2db12eb
```

### Assinatura do método

O método `deletar` não retorna nenhum valor (`void`), o que é comum em operações de exclusão quando não há necessidade de retornar o recurso removido.

```Java
public void deletar(@PathVariable("id") String id){
```

### Uso do `@PathVariable`

A anotação `@PathVariable("id")` indica que o valor presente na URL, no lugar de `{id}`, deve ser capturado e atribuído ao parâmetro `id` do método.
Ou seja, o identificador do produto a ser deletado **vem diretamente da URL**.

```Java
@PathVariable("id") String id
```

### Exclusão do registro no banco de dados

O método `deleteById` é fornecido automaticamente pelo `JpaRepository`. Ele executa uma operação de **remoção do registro cuja chave primária corresponde ao ID informado**.

Internamente, o JPA/Hibernate:
- Verifica a existência do registro
- Executa o `DELETE` no banco de dados
- Remove o produto da tabela `produto`

```Java
produtoRepository.deleteById(id);
```

### Comportamento prático do endpoint

Após essa adição, a API passa a oferecer a operação de exclusão:
```Java
DELETE /produtos/{id}
```

Fluxo da requisição:
1. O cliente envia o ID pela URL
2. O Spring extrai o ID com `@PathVariable`
3. O repositório executa a exclusão
4. O registro é removido do banco

Se o ID existir, o produto é excluído.  
Se o ID não existir, o comportamento padrão do JPA é **não lançar erro** (a menos que seja configurado tratamento específico).

### Relação com o CRUD

Com esse método, o controller passa a oferecer três operações fundamentais:

- **Create** → `POST /produtos`
- **Read** → `GET /produtos/{id}`
- **Delete** → `DELETE /produtos/{id}`

## 2. Postman

### Método HTTP e URL

No Postman, o método HTTP selecionado é **DELETE**, que indica uma operação de **remoção de um recurso**. Esse método é usado em APIs REST quando o objetivo é excluir um registro existente.

A URL configurada é:

```Java
http://localhost:8081/produtos/:id
```

O trecho `:id` representa uma **variável de caminho**, que será substituída por um identificador real no momento da requisição.

### Uso de Path Variables no Postman

Na aba **Params**, o Postman separa os parâmetros em duas categorias:
- **Query Params** → parâmetros após `?`
- **Path Variables** → parâmetros que fazem parte do caminho da URL

Como esse endpoint utiliza Path Variable, o valor do `id` é informado na seção **Path Variables**.

#### Configuração
- **Key:** `id`
- **Value:** `7cbcc43a-d16f-4982-943e-a9baa564eae`

O Postman automaticamente substitui `:id` na URL, resultando internamente em:

```Java
http://localhost:8081/produtos/7cbcc43a-d16f-4982-943e-a9baa564eae
```

### Relação direta com o controller

Essa requisição corresponde exatamente ao método definido no `ProdutoController`:

```Java
@DeleteMapping("/{id}") public void deletar(@PathVariable("id") String id){ 
    produtoRepository.deleteById(id); 
}
```

O fluxo no backend é:
1. O Spring identifica o endpoint `/produtos/{id}`
2. Extrai o valor da URL
3. Atribui o valor ao parâmetro `id`
4. Executa `deleteById(id)` no repositório
5. Remove o registro do banco de dados

### Corpo da resposta (Response Body)

Na parte inferior do Postman, o corpo da resposta está vazio (`Body: Raw` sem conteúdo). Isso é esperado porque:

- O método retorna `void`
- A operação DELETE não precisa retornar dados
- O sucesso da operação é indicado pelo status HTTP

### Status HTTP 200 OK

O Postman exibe o status **200 OK**, indicando que a requisição foi processada com sucesso. Isso significa que:
- O endpoint foi encontrado
- O método foi executado
- O comando de exclusão foi realizado

### Comportamento prático após a exclusão

Depois dessa requisição:
- O produto deixa de existir no banco
- Um `GET /produtos/{id}` com o mesmo ID não retornará mais o produto
- O H2 Console não exibirá mais esse registro

### Conclusão

Essa tela do Postman demonstra a **operação de exclusão completa da API**, fechando o ciclo básico do CRUD:

- **Create** → POST
- **Read** → GET
- **Delete** → DELETE

A integração entre **Postman → Controller → Repository → Banco (H2)** está funcionando corretamente, e a aplicação já possui um fluxo REST consistente para manipulação de produtos.