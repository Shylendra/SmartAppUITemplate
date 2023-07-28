FROM openjdk:8
EXPOSE 7082
ADD smartapp-ui-web/target/smartapp-ui.jar smartapp-ui.jar
ENTRYPOINT ["java","-jar","/smartapp-ui.jar"]

