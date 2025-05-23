# Bookstore SpringBoot

Simple demo SpringBoot with Spring Data JPA

Requirements:

* Java 17

* Maven

To install:

* git clone https://github.com/pellyadolfo/bookstore-springboot.git

* cd bookstore-springboot

* mvn clean install

* cd target

* java -jar backend-0.0.1-SNAPSHOT.jar

Works together with https://github.com/pellyadolfo/bookstore-react

Features:

* Built on Spring Data JPA with Hibernate

* H2 embedded in memory Database

* Preloaded sample data on startup

* End points for entities: Books, Cart, Orders

* Business logic implemented

* Basic Authentication

* Swagger installed

* Builds a fat jar (no containerization)

* Unit Tests on repositories, services and controllers

* Integration Tests (excluded from builds)