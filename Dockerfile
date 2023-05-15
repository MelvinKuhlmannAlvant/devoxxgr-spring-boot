FROM registry.access.redhat.com/ubi8/openjdk-17:1.15

WORKDIR /app

COPY target/spring-boot-demo-0.0.1-SNAPSHOT.jar /app/

EXPOSE 8080

CMD ["java", "-jar", "spring-boot-demo-0.0.1-SNAPSHOT.jar"]
