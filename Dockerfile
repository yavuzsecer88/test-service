FROM openjdk:11
COPY . /tmp
WORKDIR /tmp
CMD java com.springdemo.testservice.TestServiceApplication
