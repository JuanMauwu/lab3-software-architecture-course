# ✅ Java 17 para coincidir con el pom.xml
FROM eclipse-temurin:17-jre-jammy

# Establecer el directorio de trabajo
WORKDIR /app

# ✅ Nombre del JAR según artifactId y version del pom.xml
COPY target/lab3vuelo-0.0.1-SNAPSHOT.jar app.jar

# Exponer el puerto de la aplicación
EXPOSE 8089

# Ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "app.jar"]