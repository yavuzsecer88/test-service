FROM        openjdk:14-alpine AS build

WORKDIR     /app
COPY        . .

RUN         ./gradlew --no-daemon build

FROM        openjdk:14-alpine AS final

RUN         mkdir /app
COPY        --from=build /app/build/libs/testApp.jar /app/app.jar

ENTRYPOINT ["java", "-ea", "-jar", "/app/app.jar"]