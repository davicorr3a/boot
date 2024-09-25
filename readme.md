### Descrição do Projeto: API Básica de CRUD com Spring Boot

Este projeto é uma implementação básica de uma API RESTful utilizando o framework **Spring Boot**, com operações CRUD (Create, Read, Update, Delete) aplicadas a um recurso "Produto". O projeto servirá como um exemplo introdutório para entender a construção de uma API usando os métodos HTTP **GET**, **POST**, **PUT** e **DELETE**.

#### Objetivos:

1.  Criar uma API capaz de lidar com requisições relacionadas a um produto.
    
2.  Implementar os métodos HTTP principais:
    
    *   **GET**: Buscar um ou mais produtos.
        
    *   **POST**: Adicionar novos produtos.
        
    *   **PUT**: Atualizar as informações de um produto existente.
        
    *   **DELETE**: Remover produtos do sistema.
        

#### Tecnologias utilizadas:

*   **Spring Boot**: Framework Java para desenvolvimento rápido de aplicações.
    
*   **Spring Data JPA**: Para integração com o banco de dados.
    
*   **Hibernate**: ORM para manipulação de dados.
    
*   **H2 Database**: Banco de dados em memória para testes.
    
*   **Lombok**: Simplificação de código com geração automática de getters, setters e construtores.
    
*   **Maven**: Gerenciador de dependências.
    

#### Estrutura do Projeto:

1.  **Model (ProductModel)**: Representa a entidade "Produto" com campos como id, nome, preço, etc.
    
2.  **DTO (ProductRecordDto)**: Objeto de Transferência de Dados para comunicação entre a API e o cliente.
    
3.  **Repository (ProductRepository)**: Interface que estende o JpaRepository para interagir com o banco de dados.
    
4.  **Controller (ProductController)**: Define os endpoints e mapeia os métodos HTTP para as operações da API.
    

#### Funcionalidades:

1.  **GET** /products: Retorna uma lista com todos os produtos cadastrados.
    
    *   **GET** /products/{id}: Retorna um produto específico pelo id.
        
2.  **POST** /products: Cadastra um novo produto na base de dados, validando as informações recebidas no corpo da requisição.
    
3.  **PUT** /products/{id}: Atualiza as informações de um produto existente identificado pelo id.
    
4.  **DELETE** /products/{id}: Remove um produto da base de dados pelo id.
    

#### Exemplo de Endpoints:

*   **GET** /products: Retorna todos os produtos.
    
*   **GET** /products/{id}: Retorna o produto com o ID especificado.
    
*   **POST**: Cria um novo produto.
    
*   **PUT**: Atualiza um produto.
    
*   **DELETE**: Remove um produto existente.
    

**Considerações Finais:**

*   Este projeto visa ser uma base simples para quem está começando com **Spring Boot** e deseja aprender a implementar APIs RESTful com operações básicas de CRUD. Ele pode ser expandido com funcionalidades como paginação, autenticação, validações mais complexas, e a integração com bancos de dados reais como **MySQL** ou **PostgreSQL**.