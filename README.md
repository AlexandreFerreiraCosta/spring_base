# Base spring project 

Esta aplicação tem por objetivo geral fornecer um projeto base do Spring Boot.7

Sera efetuado melhorias no projeto.

## Setup do ambiente de desenvolvimento

Este projeto utiliza:
* Banco de dados Postgres
* JAVA 8
* Spring Boot 2.2.5
* Maven
* Git
* Docker

Premissas
* JDK 8 instalada
* Docker instalado
* Git instalado

Na pasta **docker** localizado na raiz do repositório existe um docker compose que já prepara o containe necessários para a aplicação executar.
Utilize o comando abaixo para subir os containers

```` Java
    $ docker-compose -f docker-compose.yml up -d --build
```` 

A aplicação pode ser iniciado localmente fora da IDE através do comando dentro do diretório spring_base:

```` Java
    $ ./mvnw
```` 

