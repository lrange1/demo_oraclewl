FROM openjdk:8-jdk-alpine
LABEL maintainer="jeisson.osoriod@sophossolutions.com"
LABEL description="Servicio Demo"
ARG JAR_FILE=target/demo-weblogic*.jar
COPY ${JAR_FILE} app.jar
EXPOSE 9080
ENTRYPOINT ["java","-jar","/app.jar"]

#docker build -t demosophos:1.0 .
#docker run --name demosophos -p 9080:9080 -t demosophos:1.0

#docker cp demo-weblogic-0.0.1-SNAPSHOT.war 6bba9939bd6a:/u01/oracle/user_projects/domains/base_domain/
#docker container exec -it 6bba9939bd6a sh