# 📄 Requisitos do Sistema - Controle Estoque (V1)

## 🎯 Objetivo do Sistema

Desenvolver um sistema em java executado no terminal que permita o 
gerenciamento básico de produtos em estoque, incluindo cadastro e vizualização.

---

## 📌 Escopo

### Incluido nesta versão:

- Cadastro de produtos
- Listagem de Produtos

### Não incluído(Por enquanto):

- Banco de dados
- Interface gráfica
- Persistência em arquivo
- Autenticação de usuário

---

## ⚙️ Requisitos Funcionais (RF)

### RF01 - Cadastrar Produto

O sistema deve permitir cadastrar um produto informando :

- Nome
- Quantidade

### RF02 - Listar Produtos

O sistema deve exibir todos os produtos cadastrados, contendo:

- Nome 
- Quantidade

### RF03 - Menu Interativo

O sistema deve apresentar um menu com opções:

- Cadastrar Produto
- Listar Produto 
- Sair

### RF04 - Encerramento 

O sistema deve encerrar apenas quando o usuário selecionar a opção de saída.

---

## 🧱 Requisitos não Funcionais (RNF)

### RNF01 - Execução 

O sistema deve ser executado via terminal.

### RNF02 - Usuabilidade

O sistema deve exibir mensagens claras ao usuário.

### RNF03 - Robustez básica

o sistema deve tratar entradas inválidas sem encerrar inesperadamente.

### RNF04 - Estrutura do Código

O código deve ser organizado e legível, seguindo boas práticas básicas.

---

## 📊 Modelo de Dados

### Produto 

Atributos

- nome (String)
- quantidade (int)

---

## ⚠️ Regras do Negício 

### RF01

Quantidade do Produto não pode ser negativa.

### RF02 

O nome do Produto não pode ser vazio.

---

## 📍 Critérios de Sucesso

O sistema será conciderado correto se:

- Permitir múltiplos cadastros
- Arazenar corretamente os dados
- Listar todos os Produtos Cadastrados 
- Não encerrar inesperadamente 