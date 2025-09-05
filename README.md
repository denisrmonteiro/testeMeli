# Eccomerce API

Esta API foi desenvolvida como parte do teste técnico para a vaga de Desenvolvedor Sr no MELI. Ela retorna os detalhes de um item a venda na plataforma. Esta API será consumida por um frontend de e-Commerce

## Setup

- clone o projeto
- execute `mvn clean install`
- Rode a aplicação com `mvn spring-boot:run`

## Endpoints

- `GET /api/items/{id}`: Retorna os detalhes do item com base no ID

## Decisões de arquitetura

- Utilizei o framework spring boot para agilidade e simplicidade na criação da API REST.
- Os dados dos itens estão armazenados em um arquivo local (`items.json`) e são carregados na inicialização.
- A estrutura foi pensada para ser facilmente extensível, caso seja necessário adicionar persistência com banco de dados futuramente.

## Arquivo de dados

- O arquivo `items.json` está localizado em `src/main/resources`

## Requisitos não funcionais

- Foram incluídos os seguintes requisitos:
    . Testes unitários
    . Documentação via swagger




