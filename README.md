# Relatório – Trabalho 3: API

## Visão Geral

Este projeto utiliza os modelos desenvolvidos no Trabalho 2 (Livraria) e expande as funcionalidades, disponibilizando endpoints HTTP para criação e listagem dos itens (livros e revistas).

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
