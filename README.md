# spring-boot3-microservices
Microservices implementation using Eureka Service Discovery, as well as provide an idea on how to secure your microservices with with JWT Authentication using Spring Cloud Gateway. 

How to up this in local?

1. Ran the project swiggy-service-registry viz the Service Registry
2. Up the swiggy-gateway which acts as the Spring Cloud Gateway
3. Up the restaurant-service
4. Up the swiggy-app
5. Up the identity-service
   Trigger the identity-service related api's and generate the JWT token. For the rest of the api calls, use that token.
