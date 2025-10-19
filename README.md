# API de Tarefas - Spring Boot

## Descrição
API RESTful para gerenciamento de tarefas desenvolvida em Java com Spring Boot.

## Funcionalidades Implementadas
- ✅ Criar tarefa (POST /api/tarefas)
- ✅ Listar todas as tarefas (GET /api/tarefas)
- ✅ Buscar tarefa por ID (GET /api/tarefas/{id})
- ✅ Atualizar tarefa (PUT /api/tarefas/{id})
- ✅ Remover tarefa (DELETE /api/tarefas/{id})

## Tecnologias Utilizadas
- Java 17
- Spring Boot 3.2.0
- Spring Data JPA
- MySQL
- Maven

## Pré-requisitos
1. Java 17 ou superior
2. Maven 3.6 ou superior
3. MySQL Server rodando na porta 3306
4. Banco de dados será criado automaticamente

## Como executar
1. Clone o projeto
2. Configure o MySQL (usuário: root, senha: root)
3. Execute: `mvn spring-boot:run`
4. A aplicação estará disponível em: http://localhost:8080

## Endpoints da API

### 1. Criar Tarefa
**POST** `/api/tarefas`
```json
{
  "nome": "Nome do Aluno - RU123456",
  "dataEntrega": "2024-12-31",
  "responsavel": "Nome do Aluno"
}
```

### 2. Listar Tarefas
**GET** `/api/tarefas`

### 3. Buscar Tarefa por ID
**GET** `/api/tarefas/{id}`

### 4. Atualizar Tarefa
**PUT** `/api/tarefas/{id}`
```json
{
  "nome": "Nome Atualizado - RU123456",
  "dataEntrega": "2024-12-31",
  "responsavel": "Nome Atualizado"
}
```

### 5. Remover Tarefa
**DELETE** `/api/tarefas/{id}`

## Estrutura do Projeto
```
src/
└── main/
    ├── java/
    │   └── com/faculdade/apitarefas/
    │       ├── ApiTarefasApplication.java
    │       ├── controller/
    │       │   └── TarefaController.java
    │       ├── model/
    │       │   └── Tarefa.java
    │       └── repository/
    │           └── TarefaRepository.java
    └── resources/
        └── application.properties
```

## Testes no Postman
Importe a collection ou teste manualmente os endpoints acima.
Certifique-se de incluir seu nome e RU nos testes conforme solicitado na atividade.