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
- H2 Database
- Maven

## Pré-requisitos
1. Java 17 ou superior
2. Maven 3.6 ou superior
3. H2 Database (em memória - não precisa instalar)

## Como executar
1. Clone o projeto
2. Execute: `mvn spring-boot:run`
3. A aplicação estará disponível em: http://localhost:8080
4. Console H2: http://localhost:8080/h2-console

## Endpoints da API

### 1. Criar Tarefa
**POST** `/api/tarefas`
```json
{
  "titulo": "Nome do Aluno - RU123456",
  "dataEntrega": "2024-12-31",
  "responsavel": "Nome do Aluno",
  "feito": false
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
  "titulo": "Nome Atualizado - RU123456",
  "dataEntrega": "2024-12-31",
  "responsavel": "Nome Atualizado",
  "feito": true
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