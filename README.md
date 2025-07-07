# 📚 Library Management System

A simple backend application that allows users to manage books in a library. Built using **Spring Boot**, **Spring Data JPA**, and **PostgreSQL**, this project supports REST APIs for CRUD operations on books.

---

## 🚀 Features

- Add new books to the library  
- View all available books  
- Delete books by ID  
- Automatically creates and connects to PostgreSQL database  
- Follows layered architecture with Controller, Repository, and Model

---

## 🛠 Technologies Used

- **Java 17**
- **Spring Boot 3.2.5**
- **Spring Web**
- **Spring Data JPA**
- **PostgreSQL**
- **Maven**
- **Lombok**
- **Jakarta Persistence**

---

## 📁 Project Structure

```
src/
└── main/
    ├── java/
    │   └── com.example.library.management/
    │       ├── controller/
    │       │   └── BookController.java
    │       ├── model/
    │       │   └── Book.java
    │       ├── repository/
    │       │   └── BookRepository.java
    │       └── LibraryManagementApplication.java
    └── resources/
        └── application.properties
```

---

## ⚙️ Setup Instructions

### ✅ Prerequisites

- Java 17+
- PostgreSQL installed and running
- PgAdmin (optional for DB UI)

### 📦 Clone the project

```bash
git clone https://github.com/<your-username>/library-management.git
cd library-management
```

### 📄 Configure Database

Edit `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/library_db
spring.datasource.username=postgres
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

✅ Make sure you have a PostgreSQL database named `library_db`.

### ▶️ Run the app

In IntelliJ or terminal:

```bash
./mvnw spring-boot:run
```

Or:

```bash
mvn spring-boot:run
```

---

## 📮 API Endpoints

| Method | Endpoint                   | Description        |
|--------|----------------------------|--------------------|
| GET    | `/api/books`               | Get all books      |
| POST   | `/api/books`               | Add a new book     |
| DELETE | `/api/books/{id}`          | Delete a book      |

---

## 📌 Example JSON (for POST request)

```json
{
  "title": "Clean Code",
  "author": "Robert C. Martin",
  "isbn": "ISBN12345",
  "quantity": 5
}
```

---

## 👨‍💻 Author

**Vijay Kumar Katherla**  
🔗 GitHub: [@vijaykumarkatherla](https://github.com/vijaykumarkatherla)
