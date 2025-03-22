# Usamos la imagen base de OpenJDK 17
FROM openjdk:17-jdk-slim

# Establecemos el directorio de trabajo en /app
WORKDIR /app

# Copiamos el JAR generado por Maven al contenedor
COPY target/ContainerMicro-0.0.1-SNAPSHOT.jar app.jar

# Exponemos el puerto en el que corre la aplicación
EXPOSE 8080

# Comando para ejecutar el servicio
ENTRYPOINT ["java", "-jar", "app.jar"]
