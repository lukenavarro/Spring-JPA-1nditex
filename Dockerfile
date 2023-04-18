FROM openjdk:20-jdk-oraclelinux7
COPY target/pruebatecnica-0.0.1-SNAPSHOT.jar .
EXPOSE 8081
CMD ["java","-jar","pruebatecnica-0.0.1-SNAPSHOT.jar"]