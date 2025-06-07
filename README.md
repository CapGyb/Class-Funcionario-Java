# Sistema de Cadastro de Funcionários

Projeto final da disciplina **Programação de Soluções Computacionais**, com objetivo de implementar um sistema CRUD completo em Java com persistência em arquivo texto, utilizando exclusivamente interação via console.

## 📌 Funcionalidades

* Criar novo funcionário
* Listar todos os funcionários
* Buscar funcionário por ID
* Atualizar dados de um funcionário
* Deletar um funcionário
* Persistência dos dados em arquivo `funcionarios.txt`
* Interface limpa via terminal com limpeza de tela e pausas entre as ações

## 📁 Estrutura de Pastas

```
├── src/
│   ├── Funcionario.java
│   ├── FuncionarioController.java
│   ├── FuncionarioRepository.java
│   ├── FuncionarioView.java
│   └── Main.java
└── README.md
```

## 💡 Requisitos

* Java 11 ou superior
* Terminal, prompt de comando ou IDE com suporte a execução de arquivos Java

## ▶️ Como Compilar e Executar

### 1. Compilar os arquivos

Acesse a pasta `src/` no terminal:

```bash
cd src
javac *.java
```

### 2. Executar o programa

```bash
java Main
```

## 📦 Como Gerar o Executável `.jar`

1. Compile os arquivos:

```bash
javac src/*.java
```

2. Crie o arquivo `manifest.txt` com o seguinte conteúdo:

```
Main-Class: Main
```

> ⚠️ Lembre-se de adicionar uma quebra de linha no final do arquivo.

3. Gere o `.jar`:

```bash
jar cfm app.jar manifest.txt -C src/ .
```

4. Execute o `.jar`:

```bash
java -jar app.jar
```

## ✅ Validações Implementadas

* Nome não pode ser vazio
* Salário não pode ser negativo
* Os dados são verificados antes de serem salvos no arquivo

## 📌 Observações

* O arquivo `funcionarios.txt` será criado automaticamente se não existir.
* Todas as alterações (inclusões, edições ou exclusões) atualizam o arquivo imediatamente.
* O terminal é limpo a cada exibição de menu, e há pausa entre as ações para melhor usabilidade.

## 👥 Autores

* **Raphael Silva Brito** — [GitHub](https://github.com/CapGyb)
* **Lorraynne Silva** — [GitHub](https://github.com/LorraynneSilva)
* **Vitoria Borges** — [GitHub](https://github.com/vitoriaborges38)

---

> "Código limpo é código que funciona e se explica sozinho."
