# Shoppify 🛒 — *Comprehensive e-commerce platform with advanced user and product management.*

**Shoppify** is an application built with **Spring Boot** that allows managing a complete online store, including users and their permissions, product catalog, sales, metrics, and supplier purchases for stock replenishment.

## ✨ Main features

- 🔹 Advanced user management with different roles and permissions.
- 🔹 Complete product catalog with categories, variants, and reviews.
- 🔹 Shopping cart and optimized checkout process.
- 🔹 Inventory management with low stock alerts.
- 🔹 Supplier purchases for automatic replenishment.
- 🔹 Sales, product, and customer analytics and metrics.
- 🔹 Promotion, coupon, and discount system.
- 🔹 Invoice and PDF report generation.

## 🔧 Design and applied patterns

This project has a professional approach with the goal of applying different concepts from the Spring Boot ecosystem, such as:

- Layered architecture (Controllers, Services, Repositories).
- DTO (Data Transfer Object) pattern for data transfer between layers.
- Object mapping with MapStruct.
- Validations with Hibernate Validator.
- Centralized exception handling.
- Authentication and authorization with Spring Security and JWT.
- RESTful API with HATEOAS to improve navigability.
- API documentation with OpenAPI/Swagger.

## 🛠️ Technologies used

| Technology              | Description                                     |
|-------------------------|-------------------------------------------------|
| Spring Boot 3.2.5       | Main backend framework                          |
| Java 21                 | Language version                                |
| Spring Data JPA         | Data persistence                                |
| PostgreSQL              | Main database                                   |
| Spring Security         | Authentication and authorization                |
| JWT                     | Tokens for authentication                       |
| Lombok                  | Boilerplate code reduction                      |
| MapStruct               | Automatic object mapping                        |
| Hibernate Validator     | Data validation                                 |
| Hibernate Envers        | Entity auditing                                 |
| Thymeleaf               | Template engine for emails                      |
| OpenAPI/Swagger         | API documentation                               |
| Spring HATEOAS          | Hypermedia links for REST API                   |
| Docker                  | Application containerization                    |

## 📁 Project structure
```plaintext
Unspecified = Implemented
+ = To be implemented
$$$ = Desirable (Low priority)
$$ = Desirable (Medium priority)
$ = Desirable (High priority)



org.shoppify
│
├── config
│   └── Application configurations
│
├── controller
│   ├── product
│   │   ├── ProductController 
│   │   ├── ProductCategoryController 
│   │   ├── ProductReviewController +
│   │   ├── CategoryController
│   ├── user
│   │   ├── UserController
│   │   ├── RoleController
│   │   ├── PermissionController
│   │   ├── WishlistController (User-product intermediate) +
│   ├── Transaction
│   │   ├── ShippingController (Shipments)
│   │   ├── SupplierController (New purchase)
│   │   ├── PurchaseController (New Sell)
│   │   ├── Transaction (Cart)

│   ├── marketing
│   │   ├── CouponController $$$
│   │   ├── DiscountController $
│   ├── analytics
│   │   ├── SalesMetricsController  + 
│   │   ├── CustomerMetricsController +
│   │   ├── InventoryMetricsController +

│   ├── NotificationController $$
│   ├── AuditController
│
├── dto
│   ├── request
│   │   ├── product
│   │   ├── user
│   │   ├── order
│   │   ├── supplier
│   │   ├── analytics
│   ├── response
│       ├── product
│       ├── user
│       ├── order
│       ├── supplier
│       ├── analytics
│
├── model
│   ├── assembler
│   ├── entity
│   ├── exception
│   ├── mapper
│   ├── specification
│
├── security
│   ├── controller
│   ├── model
│   ├── service
│   ├── filter
│   ├── config
│
├── service
│   ├── product
│   ├── user
│   ├── order
│   ├── supplier
│   ├── analytics
│   ├── notification
│   ├── payment
│
├── util
│   ├── Utility classes
```

## Filter searches

- Currently, searches are case-insensitive.
- For accent insensitivity, it is recommended to enable the `unaccent` extension in PostgreSQL or use a normalized support column; it is not enabled by default.
