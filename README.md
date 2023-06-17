# java-springboot
Java Springboot Projects

1. start.spring.io
2. Create a Maven + Java Project
3. Run basic app 
4. Create Rest Controller
    - Create a new package `com.example.demo.restController`
    - Create a new class `FunRestController`
    - Add `@RestController` annotation
    - Add `@GetMapping` annotation fo the method
    - Return a String "Hello World"
5. Spring Goals
    - Lightweight development with Java POJOs (Plain Old Java Objects)
    - Dependency injection to promote loose coupling
    - Minimize boilerplate Java code
    - Core Container
        - Beans
        - Core
        - Context
        - SpEL (Spring Expression Language)
    - Infrastructure
        - AOP (Aspect-oriented programming)
        - Aspects
        - Instrumentation
        - Messaging
        - Transacation
    - Data Access/Integration
        - JDBC
        - ORM (Object Relational Mapping [Integration with Hibernate and JPA])
        - Transaction (Add transaction support)
        - OXM (Object XML Mappers)
        - JMS (Java Messaging Service [For sending asynch messages to a broker])
    - Web Layer
        - Web
        - Servlet
        - Web-Socket
        - Web-MVC
        - Web-Portlet
    - Test Layer
        - Unit
        - Integration
        - Mock
6. Spring Projects
    - Additional Spring modules built on top of the core Spring Framework
    - Only include the modules you need, Some examples:
        - Spring Cloud
        - Spring Data
        - Spring Batch
        - Spring Security
        - Spring Integration
7. Maven 
    - Project Management Tool
    - Most popular use of Maven is for build and dependency management
    - Maven uses a Project Object Model (POM) file to manage project dependencies
8. Application Properties
    - Read data from application.properties
    - Add `@Value("${coach.name}")` to the field
    - Add `@Value("${team.name}")` to the field
9. Templates
    - Spring Boot includes auto-configuration for following template engines:
        - FreeMarker
        - Groovy
        - Thymeleaf [Popular template engine]
        - Mustache
        - JSP
10. Springboot Starters 
    - A curated list of Maven dependencies for given area
    - A collection of related dependencies grouped together
    - Tested and verified by Spring developer team
    - easier for the Devs to get started
    - Reduces the amount of maven configuration
11. Spring Boot Starter Parent
    - Maven degaults defined in the starter parent
    - Default compiler level
    - UTF-8 source encoding and Others...
12. Spring Boot DevTools
    - Automatic Restart
    - Live Reload
    - Global Settings
    - Remote Applications
    - Disable Caching
    - Automatic Build
    - Developer Tools WebSite: https://docs.spring.io/spring-boot/docs/current/reference/html/using-spring-boot.html#using-boot-devtools