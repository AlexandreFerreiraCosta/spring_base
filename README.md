# REPOSITORIO EM CONSTRUÇÃO
# Base spring project 
BASE SPRING PROJECT

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

Na pasta **docker** localizado em na raiz do repositório existe um docker compose que já prepara os containers necessários para a aplicação executar.
Utilize o comando abaixo para subir os containers

```` Java
    $ docker-compose -f docker-compose.yml up -d
```` 

O backend pode ser iniciado localmente fora da IDE através do comando dentro do diretório servico:

```` Java
    $ ./mvnw
```` 

