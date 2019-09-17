# Spring Boot on Docker connecting to MySQL Docker container
1. Create a `Dockerfile` for creating a docker image from the Spring Boot Application
`FROM openjdk:8
 ADD target/docker-hello-world.jar docker-hello-world.jar
 EXPOSE 8080
 ENTRYPOINT ["java", "-jar", "docker-hello-world.jar"]`

4. Using the Dockerfile create the Docker image.
From the directory of Dockerfile - `docker build . -t docker-hello-world`

5. Run the Docker image (docker-spring-mysql) created in #4.
`docker run -p 8085:8080 --name docker-hello-world -d docker-hello-world`

## Useful Docker commands
- `docker images`
- `docker container ls`
- `docker logs <container_name>`
- `docker stop <container_name>`
- `docker container rm <container_name>`
- `docker image rm <image_name>`
