# Copa GC

Sistema de placar em Java desenvolvido para simular o gerenciamento básico de uma Copa do Mundo fictícia.

O projeto foi criado para a disciplina de Gerência de Configuração, com foco na prática de versionamento de código usando Git e GitHub. A aplicação funciona pelo console e utiliza uma estrutura simples, sem interface gráfica, banco de dados ou frameworks externos.

---

## Objetivo do Projeto

O objetivo do Copa GC é organizar informações básicas de uma competição fictícia, permitindo trabalhar com seleções, partidas, artilheiros e classificação de grupos.

Além da implementação em Java, o projeto também tem como objetivo aplicar um fluxo de colaboração com branches, commits organizados, Pull Requests, revisão de código e resolução de conflitos.

---

## Funcionalidades

O sistema deve permitir:

- Listar seleções por grupo;
- Registrar resultados de partidas;
- Exibir a classificação de um grupo;
- Listar artilheiros;
- Executar as opções por meio de um menu no terminal.

---

## Tecnologias Utilizadas

- Java
- Git
- GitHub
- PowerShell ou terminal
- Execução via console

---

## Estrutura do Projeto

```text
copa-gc/
├── src/
│   ├── model/
│   │   ├── Selecao.java
│   │   └── Partida.java
│   ├── service/
│   │   └── Copa.java
│   ├── util/
│   │   └── CargaInicial.java
│   └── Main.java
├── .gitignore
└── README.md
```

---

## Classes do Sistema

### Selecao

Representa uma seleção participante da copa.

A classe armazena:

- Nome da seleção;
- Grupo da seleção;
- Código FIFA.

Também possui métodos getters e um método `toString()` para exibir os dados da seleção de forma organizada.

---

### Partida

Representa uma partida entre duas seleções.

A classe armazena:

- Seleção mandante;
- Seleção visitante;
- Gols do mandante;
- Gols do visitante.

Também possui métodos getters e um método `toString()` para exibir o placar da partida.

---

### Copa

Classe responsável pela lógica principal do sistema.

Suas responsabilidades incluem:

- Armazenar seleções;
- Armazenar partidas;
- Armazenar artilheiros;
- Registrar partidas;
- Listar seleções por grupo;
- Listar artilheiros;
- Calcular a classificação dos grupos.

---

### CargaInicial

Classe responsável por preencher o sistema com dados iniciais.

Ela deve adicionar:

- 8 seleções fictícias;
- 4 partidas de exemplo;
- 3 artilheiros fictícios.

---

### Main

Classe principal da aplicação.

Ela será responsável por:

- Iniciar o sistema;
- Criar os objetos necessários;
- Exibir o menu principal;
- Ler as opções do usuário;
- Chamar os métodos da classe `Copa`.

---

## Menu Principal

```text
=== Copa GC — Menu Principal ===

1. Listar selecoes por grupo
2. Registrar resultado de partida
3. Exibir classificacao do grupo
4. Listar artilheiros
0. Sair
```

---

## Como Executar

### 1. Clonar o repositório

```bash
git clone https://github.com/WeverttonSouza1/copa-gc.git
```

### 2. Entrar na pasta do projeto

```bash
cd copa-gc
```

### 3. Compilar o projeto

```bash
javac -d out src/model/*.java src/service/*.java src/util/*.java src/Main.java
```

### 4. Executar o sistema

```bash
java -cp out Main
```

---

## Organização das Branches

O desenvolvimento foi dividido em branches de feature.

| Branch | Responsabilidade |
|---|---|
| `feature/modelos` | Classes `Selecao` e `Partida` |
| `feature/copa` | Classe `Copa` e lógica de negócio |
| `feature/carga` | Dados iniciais do sistema |
| `feature/main` | Menu principal e integração |

Nenhum integrante deve commitar diretamente na branch `main`.

As alterações devem ser integradas por Pull Request, com revisão de outro integrante do grupo.

---

## Ordem de Integração

A ordem recomendada para merge das branches é:

1. `feature/modelos`
2. `feature/copa`
3. `feature/carga`
4. `feature/main`

Essa ordem evita problemas de dependência entre as classes.

---

## Padrão de Commits

O projeto utiliza o padrão Conventional Commits.

Exemplos:

```bash
feat(modelos): cria Selecao com atributos e toString
feat(modelos): cria Partida com placar e toString
docs(readme): documenta estrutura e fluxo do projeto
feat(copa): cria Copa com listas de selecoes e partidas
feat(carga): adiciona selecoes iniciais
feat(main): cria menu com Scanner e loop principal
fix(readme): resolve conflito em Como Executar
```

---

## Integrantes

| Integrante | Responsabilidades |
|---|---|
| Wevertton Souza | `feature/modelos` |
| Felipe Lima | `feature/copa` |
| Eduarda Cecília | `main` |
| Ana Clara | `feature/carga` |
---

## Disciplina

**Disciplina:** Gerência de Configuração  
**Instituição:** Universidade de Pernambuco  
**Professor:** Marcondes Ricarte  
**Período:** 2026.1

---

## Observação

Este projeto possui finalidade acadêmica e foi desenvolvido para praticar organização de código, colaboração em equipe, controle de versão, Pull Requests e resolução de conflitos utilizando Git e GitHub.
