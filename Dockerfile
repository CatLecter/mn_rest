FROM amazoncorretto:17.0.7

EXPOSE 8080

WORKDIR /usr/src/app

COPY target/mn_rest-0.1.jar mn_rest-0.1.jar

CMD java -Xmx512m -jar mn_rest-0.1.jar