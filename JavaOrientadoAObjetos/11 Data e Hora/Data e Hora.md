>O objetivo central destas classes é permitir que o desenvolvedor Java represente, formate e manipule **instantes** no tempo. Embora a classe `Date` armazene internamente o número de milissegundos desde 01/01/1970 (Era Unix), ela trabalha em conjunto com `SimpleDateFormat` para exibição e `Calendar` para operações aritméticas e extração de dados.

**1. A Classe Date**

**Conceito:** Representa um instante específico no tempo, pertencente ao pacote `java.util`. Internamente, armazena os milissegundos decorridos desde a meia-noite de 1 de janeiro de 1970 (GMT/UTC).

**Sintaxe Java:**
• `new Date()`: Cria uma data com o instante atual.
• `new Date(long millis)`: Cria uma data com milissegundos específicos.

**Exemplo Prático:**

```java
Date x1 = new Date(); // Instante atual
Date x2 = new Date(System.currentTimeMillis()); // Instante atual explicitamente
Date x3 = new Date(0L); // Representa 01/01/1970 00:00:00 GMT
Date x4 = new Date(1000L * 60L * 60L * 5L); // 5 horas após a data zero [3].
```


**2. SimpleDateFormat**

**Conceito:** É uma classe utilizada para definir formatos de conversão entre objetos `Date` e `String`, permitindo tanto a formatação (Data para Texto) quanto o parsing (Texto para Data).

**Sintaxe Java:**
• `SimpleDateFormat sdf = new SimpleDateFormat("padrão");`.
• Exemplos de padrões: `"dd/MM/yyyy"` ou `"dd/MM/yyyy HH:mm:ss"`.

**Exemplo Prático:**

```java
SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

Date y1 = sdf1.parse("25/06/2018"); // Converte texto em Date
System.out.println(sdf2.format(y1)); // Formata Date para texto [3].
```


**3. Padrão ISO 8601 e Classe Instant**

**Conceito:** O ISO 8601 é o padrão internacional para representação de data e hora no formato `yyyy-MM-ddTHH:mm:ssZ`. A classe `Instant` é usada para representar esse ponto na linha do tempo, especialmente em UTC.

**Sintaxe Java:**
• `Date.from(Instant.parse("2018-06-25T15:42:07Z"))`.

**Exemplo Prático:**

```java
// Cria uma data a partir de uma string no padrão ISO 8601 (UTC)
Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
System.out.println("y3: " + y3); [3].
```


**4. TimeZone (Fuso Horário)**

**Conceito:** Por padrão, o Java utiliza o fuso horário local do sistema. Para exibir ou manipular datas em outros fusos, como o GMT (Greenwich Mean Time), deve-se configurar o `TimeZone` no formatador.

**Sintaxe Java:**

• `sdf.setTimeZone(TimeZone.getTimeZone("GMT"));`.

**Exemplo Prático:**

```java
SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
System.out.println("Data em GMT: " + sdf3.format(y3)); [3].
```


**5. Manipulando Datas com Calendar: Somando Unidades de Tempo**

**Conceito:** A classe `Calendar` é utilizada para realizar cálculos com datas, como adicionar ou subtrair dias, horas ou meses, já que a classe `Date` possui muitas funções obsoletas.

**Sintaxe Java:**
• `Calendar.getInstance()`: Obtém uma instância do calendário.
• `cal.setTime(date)`: Define a data a ser manipulada.
• `cal.add(Calendar.UNIT, valor)`: Soma ou subtrai o valor da unidade definida.

**Exemplo Prático:**

```java
Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
Calendar cal = Calendar.getInstance();
cal.setTime(d);
cal.add(Calendar.HOUR_OF_DAY, 4); // Adiciona 4 horas à data
d = cal.getTime(); // Recupera a data atualizada [2].
```


**6. Obtendo Unidades de Tempo com Calendar**

**Conceito:** Além de somar valores, o `Calendar` permite extrair partes isoladas de uma data, como apenas o mês, o ano ou os minutos.

**Sintaxe Java:**
• `cal.get(Calendar.UNIT)`.

**Exemplo Prático:**
```java
Calendar cal = Calendar.getInstance();
cal.setTime(d);
int minutes = cal.get(Calendar.MINUTE);
int month = 1 + cal.get(Calendar.MONTH); // Nota: Janeiro é 0, por isso soma-se 1

System.out.println("Minutes: " + minutes);
System.out.println("Month: " + month); [5].
```

**Observação/Boa Prática:** Ao extrair o mês com `Calendar.MONTH`, lembre-se sempre de adicionar **1** ao resultado, pois em Java os meses são indexados a partir de **0** (Janeiro = 0, Fevereiro = 1, etc.).