
TARGET DECK: 15 - Arquivos

Qual classe do pacote java.io é utilizada para representar de forma abstrata um arquivo e o seu caminho, mas não é utilizada para ler ou escrever dados diretamente?
A. Scanner 
B. FileReader 
C. File 
D. BufferedWriter #flashcard
Resposta Correta: C
Justificativa: Segundo as fontes, a classe File é uma representação abstrata de um arquivo e seu caminho, enquanto as outras classes são voltadas para a leitura ou escrita de conteúdo.
<!--ID: 1771331263586-->


Ao utilizar a classe Scanner para ler um arquivo, qual a maneira correta de garantir que o recurso seja fechado mesmo que ocorra uma exceção?
A. Fechar o Scanner no final do bloco try. 
B. Chamar o método sc.close() dentro de um bloco finally, após verificar se o objeto não é nulo. 
C. O Java fecha o Scanner automaticamente ao fim da execução do método main. 
D. Utilizar apenas a cláusula catch para tratar a IOException. #flashcard
Resposta Correta: B
Justificativa: O código de exemplo nas fontes demonstra que o fechamento do Scanner deve ser feito em um bloco finally com uma verificação de nulidade (if (sc != null)) para garantir que o recurso seja liberado.
<!--ID: 1771331263593-->


Sobre a diferença entre as classes FileReader e BufferedReader, qual afirmação está correta?
A. FileReader é mais rápido que o BufferedReader por acessar o arquivo diretamente. 
B. FileReader é um stream de leitura de caracteres, enquanto o BufferedReader provê uma leitura mais rápida através de um buffer. 
C. BufferedReader só pode ser instanciado passando um objeto do tipo File como argumento. 
D. FileReader é utilizado exclusivamente para arquivos binários. #flashcard
Resposta Correta: B
Justificativa: As fontes indicam que o FileReader é um stream de leitura de caracteres a partir de arquivos e que o BufferedReader é mais rápido no processo de leitura.
<!--ID: 1771331263598-->


O bloco try-with-resources, introduzido a partir do Java 7, tem como principal característica:
A. Exigir que todos os recursos declarados sejam do tipo String. 
B. Capturar exceções de tempo de execução (Runtime) automaticamente. 
C. Garantir que os recursos declarados no parêntese do try sejam fechados automaticamente ao final do bloco. 
D. Impedir que o programador utilize blocos catch. #flashcard
Resposta Correta: C
Justificativa: Conforme as fontes, o try-with-resources é um bloco que declara recursos e garante que eles serão fechados ao final, sem a necessidade de um fechamento manual no finally.
<!--ID: 1771331263602-->


Considere o código: new FileWriter(path, true). O parâmetro booleano true indica que:
A. O arquivo será criado apenas se ele não existir. 
B. O arquivo será aberto em modo de leitura apenas. 
C. Novos dados serão acrescentados ao final do arquivo existente (modo append). 
D. O arquivo será recriado do zero, apagando o conteúdo anterior. #flashcard
Resposta Correta: C
Justificativa: As fontes especificam que a chamada new FileWriter(path, true) serve para acrescentar conteúdo ao arquivo existente, em vez de recriá-lo.
<!--ID: 1771331263610-->


Qual método da classe BufferedReader é utilizado para ler uma linha completa de texto e o que ele retorna ao chegar ao fim do arquivo?
A. next(), retorna uma String vazia. 
B. readLine(), retorna null. 
C. read(), retorna -1. 
D. getNextLine(), lança uma IOException. #flashcard
Resposta Correta: B
Justificativa: No código exemplo das fontes, o método br.readLine() é usado dentro de um loop while (line != null), indicando que ele retorna null quando o fim do arquivo é atingido.
<!--ID: 1771331263615-->


Ao manipular pastas com a classe File, qual método deve ser usado para obter apenas os diretórios dentro de um caminho específico?
A. path.listDirectories() 
B. path.listFiles(File::isDirectory) 
C. path.getFolders() 
D. path.mkdir(File::folder) #flashcard
Resposta Correta: B
Justificativa: O exemplo de código nas fontes utiliza o método listFiles passando uma referência de método File::isDirectory como filtro para listar apenas pastas.
<!--ID: 1771331263620-->


O método mkdir() da classe File é utilizado para:
A. Excluir uma pasta existente. 
B. Criar uma nova subpasta a partir de um caminho e retornar um booleano indicando o sucesso da operação. 
C. Renomear um arquivo. 
D. Retornar uma lista de arquivos dentro de um diretório. #flashcard
Resposta Correta: B
Justificativa: As fontes mostram o uso de new File(strPath + "\\subdir").mkdir() para criar um diretório, armazenando o resultado em uma variável booleana success.
<!--ID: 1771331263626-->


Dado um objeto File path = new File("C:\\temp\\in.txt");, qual seria o retorno esperado do método path.getName()?
A. C:\temp 
B. C:\temp\in.txt 
C. in.txt 
D. .txt #flashcard
Resposta Correta: C
Justificativa: O método getName() retorna apenas o nome do arquivo ou da pasta final do caminho, conforme exemplificado nas fontes.
<!--ID: 1771331263631-->


Qual a função do método newLine() da classe BufferedWriter?
A. Inserir uma quebra de linha apropriada de acordo com o sistema operacional. 
B. Limpar o buffer de escrita. 
C. Criar um novo arquivo físico no disco. 
D. Mover o cursor para o início do arquivo. #flashcard
Resposta Correta: A
Justificativa: No exemplo de escrita de arquivos, o método bw.newLine() é chamado após cada bw.write(line) para inserir uma nova linha no arquivo de texto.
<!--ID: 1771331263635-->


Na estrutura de tratamento de erros ao ler arquivos, qual exceção é comumente capturada por ser a superclasse das exceções de entrada e saída?
A. FileException 
B. RuntimeException 
C. IOException 
D. InputMismatchException #flashcard
Resposta Correta: C
Justificativa: As fontes citam a IOException como a exceção padrão a ser tratada em operações com File, Scanner, FileReader e FileWriter.
<!--ID: 1771331263642-->


Analise o seguinte código e identifique a afirmação correta: try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) { ... }
A. O recurso bw não será fechado se ocorrer um erro dentro do try. 
B. O código falhará na compilação porque FileWriter não pode estar dentro do try. 
C. O objeto bw será fechado automaticamente ao final do bloco, mesmo que ocorra uma exceção, dispensando o finally. 
D. Este bloco só é válido em versões do Java anteriores à 7. #flashcard
Resposta Correta: C
Justificativa: Este é um exemplo de try-with-resources, que garante o fechamento automático dos recursos ao final do bloco.
<!--ID: 1771331263646-->


Se você precisar obter o caminho completo (diretório pai) onde um arquivo está localizado, qual método da classe File deve usar?
A. getPath() 
B. getParent() 
C. getFolder() 
D. getAbsolute() #flashcard
Resposta Correta: B
Justificativa: Conforme demonstrado nas fontes, o método getParent() é utilizado para extrair a informação do caminho superior (pai) do arquivo.
<!--ID: 1771331263650-->


Para ler arquivos de forma eficiente em termos de performance, qual é a cadeia de decoradores (wrapping) recomendada?
A. new Scanner(new File(path)) 
B. new FileReader(new BufferedReader(path)) 
C. new BufferedReader(new FileReader(path)) 
D. new File(new FileReader(path)) #flashcard
Resposta Correta: C
Justificativa: As fontes mostram que o BufferedReader é instanciado recebendo um FileReader como argumento para otimizar a velocidade de leitura.
<!--ID: 1771331263655-->


O método listFiles() quando chamado em um objeto File que representa um arquivo (e não uma pasta) retorna:
A. Uma lista vazia. 
B. null. 
C. Uma exceção do tipo IOException. 
D. O próprio arquivo dentro de um array. #flashcard
Resposta Correta: B
Justificativa: Embora não explicitamente detalhado o comportamento para arquivos no texto, o uso de listFiles() em diretórios retorna um array de arquivos (File[]). Na API padrão do Java (conhecimento técnico esperado para OCP relacionado à classe File), se o caminho não for um diretório, o método retorna null.
<!--ID: 1771331263660-->

Faça um programa em Java que leia um caminho de pasta e utilize a classe File para exibir getPath(), getParent() e getName(). #flashcard
Scanner sc = new Scanner(System.in);
String strPath = sc.nextLine();
File path = new File(strPath);
System.out.println("getPath: " + path.getPath());
System.out.println("getParent: " + path.getParent());
System.out.println("getName: " + path.getName());
sc.close();
<!--ID: 1771331468462-->



Faça um programa em Java que leia o caminho de um arquivo .csv, crie uma subpasta chamada out e gere um arquivo summary.csv contendo o nome do produto e o valor total (preço × quantidade). #flashcard
Scanner sc = new Scanner(System.in);
String sourceFileStr = sc.nextLine();
File sourceFile = new File(sourceFileStr);
String sourceFolderStr = sourceFile.getParent();
boolean success = new File(sourceFolderStr + "/out").mkdir();
String targetFileStr = sourceFolderStr + "/out/summary.csv";
try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr));
     BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {
    String line = br.readLine();
    while (line != null) {
        String[] fields = line.split(",");
        String name = fields[0];
        double price = Double.parseDouble(fields[1]);
        int quantity = Integer.parseInt(fields[2]);
        double total = price * quantity;
        bw.write(name + "," + String.format("%.2f", total));
        bw.newLine();
        line = br.readLine();
    }
}
catch (IOException e) {
    System.out.println("Error: " + e.getMessage());
}
sc.close();
<!--ID: 1771331468468-->


Faça um programa que utilize BufferedReader e BufferedWriter dentro de um bloco try-with-resources para garantir o fechamento automático dos arquivos. #flashcard
try (BufferedReader br = new BufferedReader(new FileReader("input.csv"));
     BufferedWriter bw = new BufferedWriter(new FileWriter("output.csv"))) {
    String line = br.readLine();
    while (line != null) {
        bw.write(line);
        bw.newLine();
        line = br.readLine();
    }
}
catch (IOException e) {
    System.out.println("Error: " + e.getMessage());
}
<!--ID: 1771331468472-->



Faça um programa que utilize split(",") para separar os dados de uma linha lida de um arquivo CSV e converter os valores numéricos corretamente. #flashcard
String line = "TV LED,1290.99,1";
String[] fields = line.split(",");
String name = fields[0];
double price = Double.parseDouble(fields[1]);
int quantity = Integer.parseInt(fields[2]);
double total = price * quantity;
<!--ID: 1771331468477-->



Implemente a lógica para obter a pasta pai de um arquivo e criar dinamicamente uma subpasta chamada out. #flashcard
File sourceFile = new File(sourceFileStr);
String sourceFolderStr = sourceFile.getParent();
File outFolder = new File(sourceFolderStr + "/out");
outFolder.mkdir();
<!--ID: 1771331468482-->
