FROM openjdk:17-alpine
COPY build/libs/CarApplication-0.0.1-SNAPSHOT.jar /CarApplication-app/
CMD ["java","-jar","/CarApplication-0.0.1-SNAPSHOT.jar"]