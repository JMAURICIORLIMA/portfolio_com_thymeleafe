# Portifólio

- Project - Maven
- Spring boot (version) - 3.2.4
- Packaging - java
- java (version) - 17
- Dependencies
  - Spring Web
  - PostgreSQL Drive
  - Spring Data JPA
  - Thymeleaf
  - Lombok
  - Spring Boot DevTools

#
## Conexão banco de dados
- application.properties
  - spring.application.name=portfolio
  - spring.datasource.url=jdbc:postgresql://localhost:5432/db_portfolio
  - spring.datasource.username=rootAdmin
  - spring.datasource.password=passwordDatabase
  - spring.datasource.driver-class-name=org.postgresql.Driver

`# Configuração adicional`
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
spring.jpa.hibernate.ddl-auto=update

#
## Site para download do postfolio
> https://bootstrapmade.com/demo/iPortfolio/

## Container docker criado para rodar e armazenar o banco de dados postgres.
> sudo docker run -p 5432:5432 -e POSTGRES_PASSWORD=passwordDatabase -v ~/IdeaProjects/portifolio/postgres:/var/lib/postgresql/data -d postgres:16