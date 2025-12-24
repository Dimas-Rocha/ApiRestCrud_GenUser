API REST - Sistema de Gerenciamento de Usuários
<img 
    align="left" 
    alt="Git" 
    title="Git"
    width="120px" 
    style="padding-right: 10px;" 
    src="https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white" 
/>
<img 
    align="left" 
    alt="Git" 
    title="Git"
    width="80px" 
    style="padding-right: 10px;" 
    src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" 
/>
<img 
    align="left" 
    alt="Git" 
    title="Git"
    width="120px" 
    style="padding-right: 10px;" 
    src="https://img.shields.io/badge/H2_Database-1.4.200-blue?style=for-the-badge" 
/>



Uma API REST simples desenvolvida em Java com Spring Boot para operações CRUD de usuários.

📋 Índice
-----------------------------------------------------------
Visão Geral
-----------------------------------------------------------
Funcionalidades

Tecnologias

Pré-requisitos

Instalação e Execução

Endpoints

Exemplos de Uso

Estrutura do Projeto

Banco de Dados

🚀 Visão Geral
API RESTful que fornece operações básicas de CRUD (Create, Read, Update, Delete) para gerenciamento de usuários. Desenvolvida como exemplo didático para demonstrar a criação de APIs com Spring Boot.
-----------------------------------------------------------

✨ Funcionalidades
-----------------------------------------------------------
✅ CREATE - Criar novos usuários

✅ READ - Listar e buscar usuários

✅ UPDATE - Atualizar dados de usuários

✅ DELETE - Remover usuários

✅ Validação - Email único e campos obrigatórios

✅ Banco em Memória - H2 Database para desenvolvimento

🛠️ Tecnologias
Java 17
-----------------------------------------------------------
Spring Boot 3.1+

Spring Data JPA

H2 Database (banco em memória)

Maven (gerenciamento de dependências)

📋 Pré-requisitos

Java 17 ou superior

Maven 3.6+

Git
🗂️ Estrutura do Projeto
-----------------------------------------------------------

src/
├── main/
│   ├── java/com/example/demo/
│   │   ├── controller/     # Controladores REST
│   │   ├── model/          # Entidades JPA
│   │   ├── repository/     # Interfaces de dados
│   │   ├── service/        # Lógica de negócio
│   │   └── config/         # Configurações
│   └── resources/
│       ├── application.properties
│       └── static/
└── test/                   # Testes unitários


.........................................................................


API REST Simple para Gestão de Usuários
Una API REST simple desarrollada en Java con Spring Boot para operaciones CRUD de usuarios.
-------------------------------------------------------------------------------------------
📋 Índice
-------------------------------------------------------------------------------------------
Visión General

Funcionalidades

Tecnologías Utilizadas

Requisitos Previos

Instalación y Ejecución

Puntos Finales

Ejemplos de Uso

Estructura del Proyecto

Base de Datos

🚀 Visión General
API RESTful que proporciona operaciones básicas CRUD (Crear, Leer, Actualizar, Eliminar) para la gestión de usuarios. Desarrollada como ejemplo didáctico para demostrar la creación de APIs con Spring Boot.
----------------------------------------------------------------------------------------
✨ Funcionalidades
✅ CREAR - Crear nuevos usuarios
✅ LEER - Listar y buscar usuarios
✅ ACTUALIZAR - Actualizar datos de usuarios
✅ ELIMINAR - Eliminar usuarios
✅ Validación - Email único y campos obligatorios
✅ Base en Memoria - Base de datos H2 para desarrollo

🛠️ Tecnologías

Java 17 - Lenguaje de programación

Spring Boot 3.1+ - Framework principal

Spring Data JPA - Acceso a datos

Base de datos H2 (base en memoria) - Base de datos para desarrollo

Maven - Gestión de dependencias

📋 Requisitos Previos

Java 17 o superior

Maven 3.6+

IDE compatible (IntelliJ, Eclipse, VS Code)

🎯 Instalación y Ejecución

bash
# Clonar el proyecto
git clone [url-del-repositorio]

# Navegar al directorio del proyecto
cd api-usuarios-springboot

# Construir el proyecto
mvn clean install

# Ejecutar la aplicación
mvn spring-boot:run
🔗 Puntos Finales

text
GET    /api/usuarios      - Listar todos los usuarios
GET    /api/usuarios/{id} - Obtener usuario por ID
POST   /api/usuarios      - Crear nuevo usuario
PUT    /api/usuarios/{id} - Actualizar usuario
DELETE /api/usuarios/{id} - Eliminar usuario


📊 Base de Datos

H2 Database: Base de datos en memoria para desarrollo

Consola H2: Disponible en http://localhost:8080/h2-console

JDBC URL: jdbc:h2:mem:testdb

Usuario: sa

Contraseña: (vacío)

🏗️ Estructura del Proyecto

text
src/
├── main/
│   ├── java/
│   │   └── com/
│   │       └── ejemplo/
│   │           └── api/
│   │               ├── controller/    # Controladores REST
│   │               ├── model/         # Entidades
│   │               ├── repository/    # Repositorios JPA
│   │               ├── service/       # Lógica de negocio
│   │               └── ApiApplication.java
│   └── resources/
...................................................................





API REST Simple para Gestão de Usuários
Una API REST simple desarrollada en Java con Spring Boot para operaciones CRUD de usuarios.

📋 Índice

Visión General

Funcionalidades

Tecnologías Utilizadas

Requisitos Previos

Instalación y Ejecución

Puntos Finales

Ejemplos de Uso

Estructura del Proyecto

Base de Datos

🚀 Visión General
API RESTful que proporciona operaciones básicas CRUD (Crear, Leer, Actualizar, Eliminar) para la gestión de usuarios. Desarrollada como ejemplo didáctico para demostrar la creación de APIs con Spring Boot.

✨ Funcionalidades
✅ CREAR - Crear nuevos usuarios
✅ LEER - Listar y buscar usuarios
✅ ACTUALIZAR - Actualizar datos de usuarios
✅ ELIMINAR - Eliminar usuarios
✅ Validación - Email único y campos obligatorios
✅ Base en Memoria - Base de datos H2 para desarrollo

🛠️ Tecnologías

Java 17 - Lenguaje de programación

Spring Boot 3.1+ - Framework principal

Spring Data JPA - Acceso a datos

Base de datos H2 (base en memoria) - Base de datos para desarrollo

Maven - Gestión de dependencias

📋 Requisitos Previos

Java 17 o superior

Maven 3.6+

IDE compatible (IntelliJ, Eclipse, VS Code)

🎯 Instalación y Ejecución

bash
# Clonar el proyecto
git clone [url-del-repositorio]

# Navegar al directorio del proyecto
cd api-usuarios-springboot

# Construir el proyecto
mvn clean install

# Ejecutar la aplicación
mvn spring-boot:run
🔗 Puntos Finales

text
GET    /api/usuarios      - Listar todos los usuarios
GET    /api/usuarios/{id} - Obtener usuario por ID
POST   /api/usuarios      - Crear nuevo usuario
PUT    /api/usuarios/{id} - Actualizar usuario
DELETE /api/usuarios/{id} - Eliminar usuario
📊 Base de Datos

H2 Database: Base de datos en memoria para desarrollo

Consola H2: Disponible en http://localhost:8080/h2-console

JDBC URL: jdbc:h2:mem:testdb

Usuario: sa

Contraseña: (vacío)

🏗️ Estructura del Proyecto

text
src/
├── main/
│   ├── java/
│   │   └── com/
│   │       └── ejemplo/
│   │           └── api/
│   │               ├── controller/    # Controladores REST
│   │               ├── model/         # Entidades
│   │               ├── repository/    # Repositorios JPA
│   │               ├── service/       # Lógica de negocio
│   │               └── ApiApplication.java
│   └── resources/
│       ├── application.properties     # Configuración
│       └── data.sql                   # Datos iniciales (opcional)
└── test/                              # Pruebas unitarias
│       ├── application.properties     # Configuración
│       └── data.sql                   # Datos iniciales (opcional)
└── test/                              # Pruebas unitarias

