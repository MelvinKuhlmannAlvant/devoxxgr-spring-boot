FROM registry.access.redhat.com/ubi8/openjdk-17:1.15

WORKDIR /app

COPY target/spring-boot-demo-0.0.1-SNAPSHOT.jar /app/

# Application port
EXPOSE 8080

# JMX (Java Management Extensions) port
EXPOSE 8081

ENTRYPOINT ["java", \
    "-Dcom.sun.management.jmxremote", \
    "-Dcom.sun.management.jmxremote.port=8081", "-Dcom.sun.management.jmxremote.rmi.port=8081", \
    "-Dcom.sun.management.jmxremote.local.only=false", \
    "-Dcom.sun.management.jmxremote.authenticate=false", \
    "-Dcom.sun.management.jmxremote.ssl=false", \
    "-Djava.rmi.server.hostname=localhost", \
    "-jar", \
    "spring-boot-demo-0.0.1-SNAPSHOT.jar" \
    ]
