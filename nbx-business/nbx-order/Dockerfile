FROM openjdk:17

RUN mkdir -p /nbx-order

WORKDIR /nbx-order

ARG JAR_FILE=target/nbx-order.jar

COPY ${JAR_FILE} app.jar

EXPOSE 7888

ENV TZ=Asia/Shanghai JAVA_OPTS="-Xms128m -Xmx256m -Djava.security.egd=file:/dev/./urandom"

CMD sleep 30; java -jar app.jar $JAVA_OPTS