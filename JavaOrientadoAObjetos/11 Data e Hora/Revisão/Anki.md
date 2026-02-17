TARGET DECK: 11 - Data e Hora

Um objeto da classe java.util.Date armazena internamente qual informação para representar um instante no tempo? 
A. Uma String formatada no padrão ISO 8601. 
B. O número de segundos desde o início do ano atual do sistema. 
C. O número de milissegundos desde a meia-noite de 1 de janeiro de 1970 GMT/UTC. 
D. Um conjunto de inteiros representando separadamente dia, mês, ano e fuso. #flashcard 
Resposta Correta: C Justificativa: De acordo com as fontes, um objeto Date armazena internamente o número de milissegundos desde a meia-noite de 1 de janeiro de 1970 GMT (conhecido como Era Unix).
<!--ID: 1771254194050-->


Na utilização da classe SimpleDateFormat, qual é a diferença entre os padrões de formatação "MM" e "mm"? 
A. "MM" representa o mês e "mm" representa os minutos. 
B. "MM" representa os minutos e "mm" representa o mês. 
C. Não há diferença, ambos representam o mês, mas em formatos distintos. 
D. "MM" é usado para anos bissextos e "mm" para anos comuns. #flashcard 
Resposta Correta: A Justificativa: Nas convenções de SimpleDateFormat, "MM" (maiúsculo) é o código para Meses, enquanto "mm" (minúsculo) é o código para Minutos.
<!--ID: 1771254194055-->


Qual é a forma correta de criar um objeto Date a partir de uma String que segue o padrão ISO 8601 (ex: "2018-06-25T15:42:07Z")? 
A. new Date("2018-06-25T15:42:07Z"); 
B. Date.parseISO("2018-06-25T15:42:07Z"); 
C. Date.from(Instant.parse("2018-06-25T15:42:07Z")); 
D. Calendar.fromDate("2018-06-25T15:42:07Z"); #flashcard
Resposta Correta: C Justificativa: As fontes demonstram que, para converter uma String no formato ISO 8601 para Date, utiliza-se o método estático parse da classe Instant e o método from da classe Date.
<!--ID: 1771254194059-->


Considere o código: SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); sdf.setTimeZone(TimeZone.getTimeZone("GMT"));. O que o método setTimeZone fará ao formatar uma data? 
A. Alterará o valor interno de milissegundos do objeto Date. 
B. Forçará a impressão da data utilizando o fuso horário de Greenwich, independentemente do fuso horário local do computador. 
C. Converterá a data para o padrão ISO 8601 automaticamente. 
D. Impedirá que a data seja formatada se não estiver em GMT. #flashcard 
Resposta Correta: B Justificativa: Definir o TimeZone no formatador SimpleDateFormat faz com que o método format exiba a data convertida para aquele fuso específico, mesmo que o sistema local esteja em outro fuso.
<!--ID: 1771254194063-->


Ao utilizar a classe Calendar para obter o mês de uma data específica (cal.get(Calendar.MONTH)), qual valor será retornado para uma data em Janeiro? 
A. 1 
B. 0 
C. 12 
D. -1 #flashcard 
Resposta Correta: B Justificativa: Em Java, a numeração dos meses na classe Calendar começa em 0 (Janeiro é 0, Fevereiro é 1, etc.). Por isso, o material indica que se deve somar 1 ao resultado para exibição usual.
<!--ID: 1771254194067-->


Analise o fragmento de código:Calendar cal = Calendar.getInstance();cal.setTime(d);cal.add(Calendar.HOUR_OF_DAY, 4);d = cal.getTime();O que este código realiza? 
A. Define a hora do dia exatamente como 4 horas da manhã. 
B. Cria um novo objeto Calendar com 4 horas de duração. 
C. Adiciona 4 horas ao valor da data contida na variável d. 
D. Extrai apenas os minutos da data. #flashcard 
Resposta Correta: C Justificativa: O método add da classe Calendar é utilizado para somar (ou subtrair) uma quantidade de tempo a uma unidade específica da data (neste caso, HOUR_OF_DAY).
<!--ID: 1771254194071-->


Como se obtém um objeto Date representando o instante exato da execução do comando? (Selecione todas as corretas) 
A. new Date(); 
B. Date.from(Instant.now()); 
C. new Date(System.currentTimeMillis()); 
D. new Date(0L); #flashcard
Resposta Correta: A, C Justificativa: As fontes citam explicitamente new Date() e new Date(System.currentTimeMillis()) como formas de criar uma data com o instante atual. new Date(0L) cria a data zero (01/01/1970).
<!--ID: 1771254194075-->


O que acontece se tentarmos executar sdf.parse("25/06/2018") onde sdf foi instanciado como new SimpleDateFormat("dd/MM/yyyy HH:mm:ss")? 
A. O Java completa automaticamente com "00:00:00". 
B. O programa compila, mas pode lançar uma ParseException em tempo de execução devido à falta de correspondência do padrão. 
C. O compilador gera um erro obrigando o uso de ISO 8601. 
D. O retorno será um objeto do tipo Calendar. #flashcard 
Resposta Correta: B Justificativa: O método parse tenta converter o texto baseando-se exatamente no padrão definido. Se o texto ("25/06/2018") não contiver os campos esperados pelo padrão ("HH:mm:ss"), uma exceção de parse será lançada.
<!--ID: 1771254194080-->


Para extrair apenas os minutos de um objeto Date chamado myDate, qual sequência de comandos é necessária? 
A. int m = myDate.getMinutes(); 
B. Calendar cal = Calendar.getInstance(); cal.setTime(myDate); int m = cal.get(Calendar.MINUTE); 
C. int m = SimpleDateFormat.getMinute(myDate); 
D. int m = Instant.parse(myDate).get(Calendar.MINUTE); #flashcard
Resposta Correta: B Justificativa: Como as funções de extração direta em Date são obsoletas, o material ensina a usar o Calendar: primeiro instancia o calendário, define o tempo com setTime e depois usa o método get com a constante Calendar.MINUTE.
<!--ID: 1771254194084-->


Qual é a finalidade do sufixo "Z" no padrão ISO 8601 ("yyyy-MM-ddTHH:mm:ssZ")? 
A. Indica que a data está no fuso horário local. 
B. Indica que a data está em formato comprimido. 
C. Indica que o instante está em UTC (Coordinated Universal Time / Zulu Time). 
D. Representa o final da String para o compilador Java. #flashcard 
Resposta Correta: C Justificativa: O "Z" no final da string ISO 8601 indica o fuso horário UTC (ou "Zulu Time").
<!--ID: 1771254194088-->
