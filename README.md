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
