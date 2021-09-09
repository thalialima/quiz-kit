FROM amazoncorretto:11.0.11-alpine
VOLUME /app
ADD /target/quiz-0.0.1-SNAPSHOT.jar /app/quiz-app-users.jar
EXPOSE 8580
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/quiz-app-users.jar"]