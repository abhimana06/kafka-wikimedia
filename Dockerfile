FROM openjdk:18
EXPOSE 9095
ADD target/kafka-spring-project.jar kafka-spring-project.jar
ENTRYPOINT ["java", "-jar", "target/kafka-spring-project.jar"]