FROM java:8-jre
WORKDIR /usr/src
ENV MYSQL_URL=jdbc:mysql://localhost:3306/shopingcart
ENV MY_SQL_USER=root
ENV MY_SQL_PASSWORD=Welcome123
ADD ./target/DockerProject-0.0.1-SNAPSHOT.jar /usr/src/DockerProject-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","DockerProject-0.0.1-SNAPSHOT.war"]
