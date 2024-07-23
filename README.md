# Sistema de Gerenciamento de Contas a Pagar - Pagamentos Spring

## Visão Geral

Trata-se de um sistema desenvolvido em Spring Boot para gerenciar contas a pagar. 

O sistema permite a criação, atualização, listagem, pagamento e exclusão de contas, além do gerenciamento de usuários. 

Utiliza autenticação JWT para assegurar que apenas usuários autenticados possam acessar as funcionalidades.

## Tecnologias

- Java 17
- Spring Boot 3.3.2
- Spring Security
- JWT
- JPA/Hibernate
- PostgreSQL 
- Flyway
- OpenAPI/Swagger
- Mockito (para testes unitários)

## Estrutura do Projeto

O projeto segue os princípios do DDD (Domain Driven Design) para a organização do código e das pastas.

## Configuração do Ambiente

- Docker e Docker Compose
- Java 17

### Comandos para Executar com Docker Compose

1. Compile e empacote a aplicação:
    ```bash
    ./mvnw clean package -DskipTests
    ```

2. Construa a imagem Docker:
    ```bash
    docker build -t pagamentos .
    ```

3. Suba os containers:
    ```bash
    docker-compose up
    ```
O sistema rodará na porta `localhost:8080`.

### Acessando a Aplicação

- Interface do Swagger: http://localhost:8080/swagger-ui/index.html

## Autenticação

Para acessar os endpoints protegidos, você deve autenticar-se no endpoint /usuarios/login e incluir o Bearer Token nas requisições.

### Endpoints Públicos

- `/usuarios/login`
- `/usuarios` (POST)

## Banco de Dados

O Flyway é utilizado para gerenciar e popular o banco de dados PostgreSQL. 

Os scripts de migração estão localizados em resources/db/migration.

### Exemplo de Script de Migração

```sql
INSERT INTO usuario (nome, email, senha, saldo)
VALUES ('Luiz Philipe', 'philipe@hotmail.com', '$2y$10$nhhwcC/rR8mQwEby41Zxh.1jDqWEhzn0kgO7sKu/0RBQoxiAaBcTS',
        1000.00),
       ('Pedro da Silva', 'pedro.silva@example.com', '$2y$10$nhhwcC/rR8mQwEby41Zxh.1jDqWEhzn0kgO7sKu/0RBQoxiAaBcTS',
        1500.00),
       ('Julio da Silva', 'julio.silva@example.com', '$2y$10$nhhwcC/rR8mQwEby41Zxh.1jDqWEhzn0kgO7sKu/0RBQoxiAaBcTS',
        500.00);
```

## Exemplo de Arquivo CSV

Para o endpoint de upload de CSV, você pode seguir este exemplo:

```
Nome,Descricao,Valor,DataVencimento,UsuarioId
"Conta de Luz","Conta mensal de energia elétrica",150.50,"15/09/2024",1
"Conta de Água","Conta mensal de água",75.25,"20/09/2024",1
"Internet","Serviço de internet mensal",99.99,"10/09/2024",2
"Aluguel","Pagamento mensal do aluguel",1200.00,"05/09/2024",3
"Telefone","Conta de telefone celular",49.90,"25/09/2024",1
```

## Executando Testes

Para executar os testes unitários, utilize o seguinte comando:

```bash
./mvnw test
```