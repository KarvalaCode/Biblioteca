# Proyecto Biblioteca (English below)

## Objetivo del Proyecto
Este proyecto tiene como objetivo proporcionar una **API REST** para la gestión de una biblioteca, permitiendo operaciones básicas de **CRUD** (Crear, Leer, Actualizar y Eliminar) sobre los libros de la biblioteca.

## Flujo de Trabajo
El desarrollo de este proyecto sigue un flujo de trabajo estructurado utilizando las siguientes herramientas:
1. **IDE**: Utiliza tu IDE de preferencia para el desarrollo del proyecto. Se recomienda [IntelliJ IDEA](https://www.jetbrains.com/idea/) o [Eclipse](https://www.eclipse.org/).
2. **Gestión de Dependencias**: [Maven](https://maven.apache.org/) se utiliza para gestionar las dependencias del proyecto. Asegúrate de tener Maven instalado en tu entorno de desarrollo.
3. **Base de Datos**: Se emplea [H2](https://www.h2database.com/html/main.html) como base de datos en memoria para simplificar el desarrollo y las pruebas.
4. **Frameworks y Bibliotecas**: El proyecto utiliza [Spring Boot](https://spring.io/projects/spring-boot) para la construcción de la aplicación y [Spring Data JPA](https://spring.io/projects/spring-data-jpa) para la interacción con la base de datos. Además, [Spring Web](https://spring.io/projects/spring-framework) se utiliza para la creación de la API REST.

## Estructura del Proyecto
La estructura del proyecto se organiza de la siguiente manera:
- **src/main/java/net/Karvala/Biblioteca**:
  - `config`: Configuraciones específicas del proyecto.
  - `controllers`: Controladores que gestionan las solicitudes HTTP.
  - `entities`: Definición de la entidad `Libro`.
  - `repositories`: Interfaces de repositorios para la entidad `Libro`.
  - `BibliotecaApplication.java`: Clase principal que inicia la aplicación Spring Boot.
- **resources**: Archivos de recursos, como archivos de configuración y plantillas.
- **test**: Pruebas unitarias y de integración.
  - `controllers`: Pruebas para los controladores.
  - `LibroControllerTest.java`: Pruebas de integración utilizando [TestRestTemplate](https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/test/web/client/TestRestTemplate.html).
  - `LibroControllerUnitTest.java`: Pruebas unitarias utilizando [Mockito](https://site.mockito.org/) y [MockMvc](https://docs.spring.io/spring-security/site/docs/current/reference/html5/#testing-mockmvc).

## Dependencias Utilizadas
- [Spring Boot](https://spring.io/projects/spring-boot): Framework de desarrollo para aplicaciones Java basado en Spring. [Documentación Spring Boot](https://docs.spring.io/spring-boot/docs/current/reference/html/index.html)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa): Biblioteca de Spring para simplificar la implementación de repositorios de datos basados en JPA. [Documentación Spring Data JPA](https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#reference)
- [Spring Web](https://spring.io/projects/spring-framework): Módulo de Spring para el desarrollo de aplicaciones web y la creación de servicios REST. [Documentación Spring Web](https://docs.spring.io/spring-framework/docs/current/reference/html/web.html)
- [H2 Database](https://www.h2database.com/html/main.html): Sistema de gestión de bases de datos relacional en memoria. [Documentación H2 Database](https://www.h2database.com/html/documentation.html)

## Instalación
1. Clona este repositorio en tu máquina local.
2. Abre el proyecto en tu IDE preferido.
3. Asegúrate de tener las dependencias necesarias configuradas en tu archivo `pom.xml`.
4. Configura la conexión a la base de datos en el archivo `application.properties`.
5. Ejecuta la aplicación.

## Uso
La API proporciona los siguientes **endpoints**:

- **Listar todos los libros**:
  - GET `/api/libros`
    - Este endpoint devuelve una lista de todos los libros registrados en la biblioteca.

- **Encontrar un libro por ID**:
  - GET `/api/libros/{id}`
    - Este endpoint busca un libro por su ID y devuelve los detalles del libro correspondiente.

- **Crear un nuevo libro**:
  - POST `/api/libros`
    - Este endpoint permite crear un nuevo libro. Se debe proporcionar un objeto JSON con los datos del libro en el cuerpo de la solicitud.

- **Actualizar un libro existente**:
  - PUT `/api/libros`
    - Este endpoint permite actualizar los datos de un libro existente. Se debe proporcionar un objeto JSON con los datos actualizados del libro en el cuerpo de la solicitud

.

- **Eliminar un libro por ID**:
  - DELETE `/api/libros/{id}`
    - Este endpoint elimina un libro de la biblioteca basándose en su ID.

- **Eliminar todos los libros**:
  - DELETE `/api/libros`
    - Este endpoint elimina todos los libros de la biblioteca.

## Autor
Este proyecto fue desarrollado por [Karvala](https://github.com/KarvalaCode). 

---

# Library Project

## Project Objective
This project aims to provide a **REST API** for library management, allowing basic CRUD (Create, Read, Update, Delete) operations on library books.

## Workflow
The development of this project follows a structured workflow using the following tools:
1. **IDE**: Use your preferred IDE for project development. [IntelliJ IDEA](https://www.jetbrains.com/idea/) or [Eclipse](https://www.eclipse.org/) is recommended.
2. **Dependency Management**: [Maven](https://maven.apache.org/) is used to manage project dependencies. Ensure that Maven is installed in your development environment.
3. **Database**: [H2](https://www.h2database.com/html/main.html) is used as an in-memory database to simplify development and testing.
4. **Frameworks and Libraries**: The project uses [Spring Boot](https://spring.io/projects/spring-boot) for application construction and [Spring Data JPA](https://spring.io/projects/spring-data-jpa) for database interaction. Additionally, [Spring Web](https://spring.io/projects/spring-framework) is used for creating the REST API.

## Project Structure
The project structure is organized as follows:
- **src/main/java/net/Karvala/Biblioteca**:
  - `config`: Project-specific configurations.
  - `controllers`: Controllers handling HTTP requests.
  - `entities`: Definition of the `Libro` entity.
  - `repositories`: Repository interfaces for the `Libro` entity.
  - `BibliotecaApplication.java`: Main class initiating the Spring Boot application.
- **resources**: Resource files, such as configuration files and templates.
- **test**: Unit and integration tests.
  - `controllers`: Tests for controllers.
  - `LibroControllerTest.java`: Integration tests using [TestRestTemplate](https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/test/web/client/TestRestTemplate.html).
  - `LibroControllerUnitTest.java`: Unit tests using [Mockito](https://site.mockito.org/) and [MockMvc](https://docs.spring.io/spring-security/site/docs/current/reference/html5/#testing-mockmvc).
- **README.md**: Project documentation (this file).

## Used Dependencies
- [Spring Boot](https://spring.io/projects/spring-boot): Development framework for Java applications based on Spring. [Spring Boot Documentation](https://docs.spring.io/spring-boot/docs/current/reference/html/index.html)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa): Spring library to simplify the implementation of JPA-based data repositories. [Spring Data JPA Documentation](https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#reference)
- [Spring Web](https://spring.io/projects/spring-framework): Spring module for web application development and creating RESTful services. [Spring Web Documentation](https://docs.spring.io/spring-framework/docs/current/reference/html/web.html)
- [H2 Database](https://www.h2database.com/html/main.html): In-memory relational database management system. [H2 Database Documentation](https://www.h2database.com/html/documentation.html)

## Installation
1. Clone this repository to your local machine.
2. Open the project in your preferred IDE.
3. Ensure you have the necessary dependencies configured in your `pom.xml` file.
4. Configure the database connection in the `application.properties` file.
5. Run the application.

## Usage
The API provides the following **endpoints**:
- **List all books**:
  - GET `/api/libros`
    - This endpoint returns a list of all the books registered in the library.
- **Find a book by ID**:
  - GET `/api/libros/{id}`
    - This endpoint searches for a book by its ID and returns the details of the corresponding book.
- **Create a new book**:
  - POST `/api/libros`
    - This endpoint allows creating a new book. A JSON object with the book's data must be provided in the request body.
- **Update an existing book**:
  - PUT `/api/libros`
    - This endpoint allows updating the data of an existing book. A JSON object with the updated book's data must be provided in the request body.
- **Delete a book by ID**:
  - DELETE `/api/libros/{id}`
    - This endpoint deletes a book from the library based on its ID.
- **Delete all books**:
  - DELETE `/api/libros`
    - This endpoint deletes all books from the library.

## Author
This project was developed by [Karvala](https://github.com/KarvalaCode).
