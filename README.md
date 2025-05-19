# togglz-switch-feature
This repo will demo usability of Togglz library feature of Springboot application.


**Project Description**

This project demonstrates the use of the Togglz library in a Spring Boot application to manage feature toggles. [cite: 3]

**Key Functionality**

The core functionality revolves around controlling the application of a discount to product prices based on a feature toggle. [cite: 9, 10, 11, 12, 13, 14]

* **Feature Toggle:** The `TOGGLZ_APPLIED` feature toggle is used to determine whether a 5% discount is applied to the price of products. [cite: 7, 8, 9, 10, 11]
   
* **Discount Logic:** If the `TOGGLZ_APPLIED` feature is active, the `applyTogglz` method in `SiddhuTogglzApplication` calculates and applies the discount to each product's price. [cite: 12, 13, 14]
   
* **Product Retrieval:** The `InventoryService` is used to retrieve a list of products with their initial prices. [cite: 9, 24, 25, 26, 27]
   
* **API Endpoint:** The `/products` API endpoint in `SiddhuTogglzApplication` returns a list of products, either with or without the discount, depending on the state of the feature toggle. [cite: 9, 10, 11]

**Files**

* `pom.xml`:  This file contains the project's dependencies, including the Togglz Spring Boot Starter and Togglz Console. [cite: 4]
   
* `src/main/java/com/siddhu/SiddhuTogglzApplication.java`: This is the main application file that defines the API endpoint and the logic for applying the feature toggle. [cite: 5, 6]
   
* `src/main/java/com/siddhu/dto/Product.java`: This file defines the `Product` data transfer object. [cite: 16, 17, 18, 19, 20, 21, 22, 23]
   
* `src/main/java/com/siddhu/service/InventoryService.java`: This file contains the service responsible for retrieving product data. [cite: 24, 25]
   
* `src/main/resources/application.yml`: This file configures the Togglz feature, specifying whether it is enabled and where to load additional Togglz properties. [cite: 3]
