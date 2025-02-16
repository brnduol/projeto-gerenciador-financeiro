Atenção: Os outros 2 colaboradores foram ocultos por não saber se poderia faze uma publicação com seus nomes.

# 💰 Projeto Gerenciador Financeiro

Este é um projeto desenvolvido para a disciplina de **Técnicas de Programação 1**, com o objetivo de criar um **aplicativo desktop** que auxilie os usuários na **gestão de suas finanças pessoais**. O sistema permite organizar receitas e despesas de forma prática, proporcionando um controle mais eficiente do orçamento.

## 📌 Funcionalidades

- **Cadastro de Usuários**: Criação de contas de acesso ao sistema.
- **Login de Usuário**: Autenticação segura para acessar os dados financeiros.
- **Cadastro de Transações**: Registro de receitas e despesas com informações detalhadas.
- **Categorias Personalizadas**: Possibilidade de adicionar e gerenciar categorias de despesas e receitas.
- **Histórico de Transações**: Consulta de todas as movimentações financeiras registradas.
- **Geração de Relatórios**: Exibição de gráficos para análise das finanças, incluindo gráficos de pizza para categorização dos gastos.
- **Gerenciamento de Contas**: Adição e edição de contas bancárias dentro do sistema.

## ❌ Funcionalidades Removidas

Durante o desenvolvimento, algumas funcionalidades foram descontinuadas para manter o foco e simplificar a implementação:

- **Cartão de Crédito**: Devido à complexidade na lógica de implementação.
- **Limite Mensal**: Removido por não se alinhar com o objetivo principal do sistema.
- **Transferência entre Contas**: Excluída devido a dificuldades na implementação eficiente.

## 🛠️ Tecnologias Utilizadas

- **Java**: Linguagem principal utilizada no desenvolvimento.
- **Swing**: Biblioteca gráfica para construção da interface do usuário.
- **JFreeChart**: Utilizada para geração de gráficos visuais.

## 📌 Estrutura do Projeto

O projeto está dividido em módulos para facilitar a organização:

```
📂 projeto-gerenciador-financeiro
 ├── 📂 src
 │   ├── 📂 classesGerenciador   # Classes principais do sistema
 │   ├── 📂 telas                # Interfaces gráficas (Swing)
 │   ├── 📂 miniTelas            # Telas auxiliares do sistema
 ├── 📜 README.md                # Documento de apresentação do projeto
 ├── 📜 relatorio.pdf            # Documento detalhado do projeto com o diagrama UML
```

## 🏗️ Divisão das Tarefas

Cada integrante foi responsável pelo desenvolvimento de classes e telas específicas:

| Integrante  | Classes Implementadas | Telas Implementadas |
|------------|----------------------|--------------------|
| **Bruno** | `Carteira`, `Usuário`, `OrigemRenda`, `ContasUsuarios`, `ControleTelas` | Tela de Cadastro, Tela de Login, Tela Principal e MiniTelas |
| ******* | `Categoria`, `Balanco` | Tela de Categorias, Tela de Contas |
| ******* | `Transação`, `TransaçãoReceita`, `TransaçãoDespesa`, `Atualizável (Interface)` | Tela de Histórico, Tela de Gráficos |

## 🚀 Como Executar o Projeto

1. **Clone o repositório**:
   ```sh
   git clone https://github.com/brnduol/projeto-gerenciador-financeiro.git
   ```
2. **Abra o projeto em sua IDE de preferência** (NetBeans, IntelliJ IDEA, Eclipse).
3. **Compile e execute** a aplicação.
4. **Acesse o sistema** através da tela de login.

## 📄 Relatório

O documento detalhado do projeto pode ser encontrado no arquivo [`relatorio.pdf`](relatorio.pdf), contendo a **descrição do problema, regras de negócio, diagramas e telas implementadas**.

## 📌 Contribuidores

- **Bruno Eduardo dos Santos** - [GitHub](https://github.com/brnduol)
- ********* ******* *********
- ********* ******* ******* *********

## 📜 Licença

Este projeto foi desenvolvido para fins acadêmicos e pode ser utilizado para aprendizado. 

