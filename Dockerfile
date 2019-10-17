FROM openjdk:11-jre-slim
COPY build/libs/*.jar /usr/app/
WORKDIR /usr/app
EXPOSE 8080
CMD exec java -Xms128m -Xmx512m -jar *.jar

