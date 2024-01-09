##Proyecto Biblioteca 
(English at the end)

Este proyecto es una implementación de una API REST para una biblioteca, utilizando el framework Spring Boot. Proporciona operaciones básicas de CRUD (Crear, Leer, Actualizar y Eliminar) para gestionar los libros de la biblioteca.

Requisitos:
  * Java 8 o superior
  * Maven
  * Spring Boot

Dependencias:

  * H2
  * Spring Data JPA
  * Spring Web
  * Spring Boot Dev tools

Instalación
 - Clona este repositorio en tu máquina local.
 - Abre el proyecto en tu IDE de preferencia.
 - Asegúrate de tener las dependencias necesarias configuradas en tu archivo pom.xml.
 - Configura la conexión a la base de datos en el archivo application.properties.
 - Ejecuta la aplicación.

Uso

La API proporciona los siguientes endpoints:

- Listar todos los libros

      GET /api/libros

  Este endpoint devuelve una lista de todos los libros registrados en la biblioteca.

- Buscar un libro por ID

      GET /api/libros/{id}

  Este endpoint busca un libro por su ID y devuelve los detalles del libro correspondiente.

- Crear un nuevo libro

      POST /api/libros

   Este endpoint permite crear un nuevo libro. Debe proporcionarse un objeto JSON en el cuerpo de la solicitud con los datos del libro.

- Actualizar un libro existente

      PUT /api/libros

  Este endpoint permite actualizar los datos de un libro existente. Se debe proporcionar un objeto JSON en el cuerpo de la solicitud con los datos actualizados del libro.

- Eliminar un libro por ID

      DELETE /api/libros/{id}

  Este endpoint elimina un libro de la biblioteca según su ID.

- Eliminar todos los libros

      DELETE /api/libros

Este endpoint elimina todos los libros de la biblioteca.

Este proyecto fue desarrollado por KARVALA

##Library Project

This project is an implementation of a REST API for a library using the Spring Boot framework. It provides basic CRUD (Create, Read, Update, Delete) operations to manage the books in the library.

Dependencies:

  * H2
  * Spring Data JPA
  * Spring Web
  * Spring Boot Dev tools

Requirements:

  * Java 8 or higher
  * Maven
  * Spring Boot

Installation:
  * Clone this repository to your local machine.
  * Open the project in your preferred IDE.
  * Make sure you have the necessary dependencies configured in your pom.xml file.
  * Configure the database connection in the application.properties file.
  * Run the application.

Usage: 

The API provides the following endpoints:

- List all books

       GET /api/libros

  This endpoint returns a list of all the books registered in the library.

- Find a book by ID

      GET /api/libros/{id}

  This endpoint searches for a book by its ID and returns the details of the corresponding book.

- Create a new book

      POST /api/libros

  This endpoint allows creating a new book. A JSON object with the book's data must be provided in the request body.

- Update an existing book

      PUT /api/libros

  This endpoint allows updating the data of an existing book. A JSON object with the updated book's data must be provided in the request body.

- Delete a book by ID

       DELETE /api/libros/{id}

  This endpoint deletes a book from the library based on its ID.

- Delete all books

      DELETE /api/libros

  This endpoint deletes all books from the library.

Author:

 This project was developed by Karvala.