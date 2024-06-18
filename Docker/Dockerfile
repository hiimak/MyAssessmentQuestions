#Explain what happens here, what do you see in this Dockerfile?

FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAVA_OPTS
ENV JAVA_OPTS=$JAVA_OPTS
COPY challanges.jar challanges.jar
EXPOSE 3000
ENTRYPOINT exec java $JAVA_OPTS -jar challanges.jar
# For Spring-Boot project, use the entrypoint below to reduce Tomcat startup time.
#ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar challanges.jar
