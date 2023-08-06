FROM bellsoft/liberica-openjdk-alpine:17
MAINTAINER borro.gg
COPY target/mongol-0.0.1-SNAPSHOT.jar  mongol-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/mongol-0.0.1-SNAPSHOT.jar"]