# 📚 Simulação de Biblioteca em Java

## 🎯 Objetivo

Este projeto tem como objetivo simular o funcionamento básico de uma **biblioteca**. Nele, usuários (alunos e professores) podem **emprestar** e **devolver livros**. O foco está na **lógica de negócio** e no uso de **boas práticas de programação em Java**.

## ⚙️ Funcionalidades

- **Emprestar Livro**  
  - 📖 Usuários podem pegar emprestado um livro disponível na biblioteca.  
  - 🎓 **Alunos:** Só podem realizar o empréstimo se possuírem créditos (> 0). Cada empréstimo consome 1 crédito.  
  - 👩‍🏫 **Professores:** Podem emprestar livros sem restrição de crédito.

- **Devolver Livro**  
  - 📚 Apenas o usuário que efetuou o empréstimo pode devolver o livro.  
  - 🎓 **Alunos:** Recuperam 1 crédito ao devolver um livro.  
  - 🔄 O sistema exibe a lista dos livros disponíveis antes e depois da devolução.

- **Gerenciamento da Biblioteca**  
  - 📂 Inclusão de novos livros no sistema.  
  - 🔍 Listagem dinâmica dos livros disponíveis para empréstimo.

## 🛠️ Tecnologias Utilizadas

- **Java** – OpenJDK 17.0.9 (Lançado em 17/10/2023)
- **Eclipse IDE** – Ambiente de desenvolvimento utilizado para criar e organizar o projeto
- **GitHub Desktop** – Para versionamento e gerenciamento do repositório

## 📁 Estrutura de Pastas
```plaintext
biblioteca-java/
├── .gitattributes
├── .classpath              # Configuração de dependências do Eclipse
├── .project                # Arquivo de projeto Eclipse
├── .settings/              # Configurações do Eclipse (compilação, formatação, etc.)
│
├── src/                    # Código-fonte Java
│   └── bibliotecaJava/     # Pacote principal da aplicação
│       ├── App.java                     # Execução simples (sem Scanner)
│       ├── AppScanner.java              # Execução interativa com Scanner
│       ├── Livro.java                   # Entidade Livro
│       ├── Usuario.java                 # Classe abstrata base para usuários
│       ├── Aluno.java                   # Herda de Usuario
│       ├── Professor.java               # Herda de Usuario
│       ├── Biblioteca.java              # Lógica principal da biblioteca
│       ├── EmprestarLivroUseCase.java  # Lógica de empréstimo
│       └── DevolverLivroUseCase.java   # Lógica de devolução
│
├── bin/                    # Saída de arquivos compilados (.class)
│
├── README.md               # Documentação do projeto
└── LICENSE                 # Licença de 
```


## 🚀 Como Executar

**1. Clone o repositório, abra no Eclipse e execute:**

   - Clone o repositório usando o comando abaixo:

     ```bash
     git clone https://github.com/seu-usuario/biblioteca-java.git
     ```

**2.  No Eclipse** 
- vá em **File > Import...**, selecione **Existing Projects into Workspace** 
- escolha o diretório `biblioteca-java`  
    -finalize a importação.

**3.  Para executar o sistema:**

- Execute a classe `AppScanner.java` para a **versão interativa**
- Execute a classe `App.java` para a **versão de teste**
- Siga as instruções exibidas no terminal para interagir com o sistema de **empréstimos** e **devoluções** de livros.
