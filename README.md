# Relatório – Trabalho 3: API

## Visão Geral

Este projeto utiliza os modelos desenvolvidos no Trabalho 2 (Livraria) e expande as funcionalidades, disponibilizando endpoints HTTP para criação e listagem dos itens (livros e revistas).

## Endpoints Disponíveis

- **POST /api/books:** Adiciona um novo livro.
- **GET /api/books:** Lista todos os livros.
- **POST /api/magazines:** Adiciona uma nova revista.
- **GET /api/magazines:** Lista todas as revistas.

### Com o projeto rodando

- Acesse **http://localhost:8080/docs:** para a documentação interativa via Swagger UI, onde poderá para testar a API através da interface.

## Requisitos e Conformidade

- **Mínimo de 4 POJOs:**  
  Foram implementadas as classes `Author`, `Item`, `Book`, `Magazine` e `Library`.

- **Composição “tem-um” e Extensão “é-um”:**

  - `Library` agrega `Book` e `Magazine`.
  - `Book` e `Magazine` estendem `Item`.

- **4 Métodos para Invocação Remota:**  
  Os métodos `addBook`, `addMagazine`, `listBooks` e `listMagazines` foram implementados e estão expostos via HTTP.

## Considerações Finais

Este relatório evidencia a continuidade do trabalho desenvolvido no Trabalho 2 e sua evolução para o Projeto 3, com ênfase na implementação de endpoints para facilitar a comunicação via HTTP e a manutenção dos requisitos originais.
