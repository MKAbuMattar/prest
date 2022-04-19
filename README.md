# prest

prest is a text-saving application for your various needs.

***

## prest

Microservice architectures are quickly becoming the 
"new normal." Building tiny, self-contained, 
ready-to-run apps may provide your code with 
a lot more flexibility and robustness. Many 
purpose-built capabilities in Spring Boot make 
it simple to design and run microservices in 
production at scale. This app just depicts 
the microservices' structure.

## microservices' order
- utility-service
- entity-service
- eureka-service
- zuul-service
- prest-service

## Setup Instructions
```bash
git clone https://github.com/MKAbuMattar/prest
cd prest
```

***

> NOTE : change an application.properties data to match your work environment.

## Running the Application
```bash
# first, need to install all dependencies.
mvn clean install
mvn clean compile
mvn clean package

# run the microservices' by order

## eureka-service
java -jar ./eureka-service/target/eureka-service-0.0.1-SNAPSHOT.jar

## zuul-service
java -jar ./zuul-service/target/zuul-service-0.0.1-SNAPSHOT.jar

## prest-service
java -jar ./prest-service/target/prest-service-0.0.1-SNAPSHOT.jar

```