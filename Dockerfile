FROM openjdk:8-jdk-alpine
ADD target/*.jar /usr/share/server-gateway.jar
EXPOSE 9020
ENTRYPOINT ["java", "-jar", "/usr/share/server-gateway.jar"]