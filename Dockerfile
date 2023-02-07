FROM openjdk:11
EXPOSE 8010
ADD target/myspringboot-app1.jar myspringboot-app1.jar
ENTRYPOINT ["java","-jar","myspringboot-app1.jar"]