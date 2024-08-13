FROM openjdk:21
LABEL maintainer="java.net"
ADD target/springProducts-0.0.1-SNAPSHOT.jar spring-products.jar
ENTRYPOINT ["java","-jar","spring-products.jar"]