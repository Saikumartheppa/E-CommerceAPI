<h1 align="center"> ShopNow-API </h1>

>### Framework
* SpringBoot
>### Language
* Java
>### Data flow
In this project, we have four layers-
* **Controller** - The controller layer handles the HTTP requests, translates the JSON parameter to object, and authenticates the request and transfer it to the business (service) layer.
* **Service** -The business layer handles all the business logic. It consists of service classes and uses services provided by data access layers.
* **Repository** - This layer maintains the MySQL as database on which CRUD operations are performed . In this created Interfaces
* **Model** - This layer consists basically various classes required for the project and these classes consists the attributes to be stored.
>### Data Structure

* **Product Model**: The Product model represents the data structure for storing product information. It typically includes attributes such as ID, name, description, price, etc.

* **Address Model**: The Address model represents the data structure for storing address information. It typically includes attributes such as ID, street, city, state, postal code, etc.

* **User Model**: The User model represents the data structure for storing user information. It typically includes attributes such as ID, name, email, address, etc.

* **Order Model**: The Order model represents the data structure for storing order information. It typically includes attributes such as ID, user details, product details, total amount, etc.


>### Project Summary

The Ecommerce API is designed to provide functionality for managing an ecommerce platform. It includes features such as browsing products, adding items to the cart, placing orders, managing user information, and more. The application is built using Spring Boot and uses MySQL as the database for storing ecommerce data. The API endpoints can be explored and tested using Swagger UI.

>### Installation and Usage

* Clone the repository to your local machine.
* Make sure you have Java, Maven, and MySQL installed.
* Set up the database configuration in the application.properties file.
* Run the application using Maven or your preferred IDE.
* Access the API endpoints using Swagger UI by navigating to the appropriate URL (e.g., `http://localhost:8080/swagger-ui.html`).