>O objetivo deste capítulo é capacitar o desenvolvedor a realizar a **manipulação de arquivos e pastas** no sistema operacional, abrangendo a leitura e escrita de arquivos de texto, o gerenciamento de fluxos de dados de forma eficiente e a navegação na estrutura de diretórios.

### **1. Lendo arquivo texto com as classes File e Scanner**

**Conceito:** A classe `File` é uma representação abstrata do caminho de um arquivo ou diretório. O `Scanner` pode ser utilizado como um leitor de texto a partir de um objeto `File`. É necessário tratar a `IOException`, pois operações de arquivo podem falhar.

**Sintaxe Java:**

```java
File file = new File("caminho_do_arquivo");
Scanner sc = new Scanner(file);
```

**Exemplo Prático:**

```java
File file = new File("C:\\temp\\in.txt");
Scanner sc = null;
try {
    sc = new Scanner(file);
    while (sc.hasNextLine()) {
        System.out.println(sc.nextLine());
    }
} catch (IOException e) {
    System.out.println("Error: " + e.getMessage());
} finally {
    if (sc != null) {
        sc.close();
    }
}
```

### **2. FileReader e BufferedReader**

**Conceito:** O `FileReader` é um fluxo (stream) de leitura de caracteres a partir de arquivos. O `BufferedReader` é uma classe que envolve o `FileReader` para proporcionar uma leitura **mais rápida** e eficiente através de um buffer.

**Sintaxe Java:**

```java
FileReader fr = new FileReader(path);
BufferedReader br = new BufferedReader(fr);
```

**Exemplo Prático:**

```java
String path = "C:\\temp\\in.txt";
BufferedReader br = null;
FileReader fr = null;
try {
    fr = new FileReader(path);
    br = new BufferedReader(fr);
    String line = br.readLine();
    while (line != null) {
        System.out.println(line);
        line = br.readLine();
    }
} catch (IOException e) {
    System.out.println("Error: " + e.getMessage());
} finally {
    try {
        if (br != null) br.close();
        if (fr != null) fr.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
}
```

### **3. Bloco try-with-resources**

**Conceito:** Introduzido no Java 7, é um bloco `try` que declara um ou mais recursos (como fluxos de arquivos) e **garante que esses recursos serão fechados automaticamente** ao final do bloco, dispensando o uso explícito do bloco `finally` para fechar os arquivos.

**Sintaxe Java:**

```java
try (Tipo recurso = new Tipo()) {
    // Uso do recurso
} catch (IOException e) { ... }
```

**Exemplo Prático:**

```java
String path = "C:\\temp\\in.txt";
try (BufferedReader br = new BufferedReader(new FileReader(path))) {
    String line = br.readLine();
    while (line != null) {
        System.out.println(line);
        line = br.readLine();
    }
} catch (IOException e) {
    System.out.println("Error: " + e.getMessage());
}
```

### **4. FileWriter e BufferedWriter**

**Conceito:** O `FileWriter` é um fluxo de escrita de caracteres em arquivos. O `BufferedWriter` torna a escrita mais rápida. Ao instanciar o `FileWriter`, pode-se escolher entre recriar o arquivo ou acrescentar conteúdo ao existente.

- **Recria o arquivo:** `new FileWriter(path)`.
- **Acrescenta ao arquivo existente:** `new FileWriter(path, true)`.

**Exemplo Prático:**

```java
String[] lines = new String[] { "Good morning", "Good afternoon", "Good night" };
String path = "C:\\temp\\out.txt";
try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
    for (String line : lines) {
        bw.write(line);
        bw.newLine(); // Insere quebra de linha
    }
} catch (IOException e) {
    e.printStackTrace();
}
```

### **5. Manipulando pastas com File**

**Conceito:** A classe `File` também permite listar pastas e arquivos em um diretório, além de criar novas pastas.

**Exemplo Prático (Listagem e Criação):**

```java
String strPath = "C:\\temp";
File path = new File(strPath);

// Listar apenas pastas
File[] folders = path.listFiles(File::isDirectory);
for (File folder : folders) { System.out.println(folder); }

// Listar apenas arquivos
File[] files = path.listFiles(File::isFile);
for (File file : files) { System.out.println(file); }

// Criar uma subpasta
boolean success = new File(strPath + "\\subdir").mkdir();
```

### **6. Informações do caminho do arquivo**

**Conceito:** É possível acessar partes específicas do caminho de um objeto `File` através de métodos dedicados.

**Sintaxe e Métodos Principais:**

- `getName()`: Obtém apenas o nome do arquivo (sem o caminho).
- `getParent()`: Obtém apenas o caminho da pasta onde o arquivo está.
- `getPath()`: Obtém o caminho completo (incluindo o nome do arquivo).

**Exemplo Prático:**

```java
File path = new File("C:\\temp\\in.txt");
System.out.println("getPath: " + path.getPath());
System.out.println("getParent: " + path.getParent());
System.out.println("getName: " + path.getName());
```
