# Usa la imagen base de Ubuntu 20.04
FROM ubuntu:20.04

# Actualiza e instala Java 8
RUN apt-get update && \
    apt-get install -y openjdk-8-jdk

# Instala Tomcat 9
RUN apt-get install -y tomcat9

# Descarga la última versión de Jenkins en formato war

RUN apt-get install -y wget 
RUN mkdir -p /usr/local/tomcat/webapps/
RUN wget -O /usr/local/tomcat/webapps/jenkins.war https://updates.jenkins.io/latest/jenkins.war

# Expone el puerto 8080 de Tomcat
EXPOSE 8080

# Define el comando para iniciar Tomcat al arrancar el contenedor
CMD service tomcat8 start && tail -f /var/log/tomcat8/catalina.out

