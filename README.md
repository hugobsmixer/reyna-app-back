# Reyna App Backend

Este es un proyecto backend de prueba desarrollado con Spring Boot

## Requisitos Previos

Asegúrate de tener los siguientes requisitos instalados:

- **Java 11 o superior**: Spring Boot es compatible con Java 11 y versiones superiores.
- **Maven o Gradle**: Herramienta de gestión de dependencias y construcción de proyectos.
- **IDE opciona)**: Puedes usar Spring Tool Suite, IntelliJ IDEA, Eclipse, o cualquier otro IDE que prefieras.

## Clonar el Repositorio

Primero, clona este repositorio del proyecto a tu máquina local usando Git Bash o la terminal:
git clone https://github.com/hugobsmixer/reyna-app-back.git

## Importar el proyecto

Desde el IDE de su preferencia por favor importe el proyecto maven correspondiente.

## Configuración

Asegurate que la base de datos de sqlite llamada citas.db se encuentre en la carpeta del proyecto. Además en el archivo de configuración application.properties la cadena de conexión debe ser spring.datasource.url=jdbc:sqlite:citas.db

## Instalación

Desde la terminal del proyecto:

Ejecuta el comando mvn clean

Ejecuta el comando mvn install

## Ejecución

Ejecuta el comando mvn spring-boot:run

## Pruebas de endpoints

Puedes probar los endpoints en tu equipo local desde postman, utilizando las peticiones curl correspondientes 
curl http://localhost:9090/api/citas

