FROM java:17
COPY target/myapp.jar /usr/src/myapp/
WORKDIR /usr/src/myapp
EXPOSE 8080
CMD ["java", "-jar", "myapp.jar"]