# Usar imagem base do OpenJDK
FROM openjdk:17-jdk-slim

# Configurar o diretório de trabalho
WORKDIR /app

# Copiar o arquivo JAR da aplicação (ajuste o nome conforme necessário)
COPY target/GS24.jar /app/app.jar

# Expor a porta da aplicação (ajuste conforme necessário)
EXPOSE 8080

# Comando para executar a aplicação
CMD ["java", "-jar", "app.jar"]