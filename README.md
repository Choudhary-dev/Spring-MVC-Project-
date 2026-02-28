🚀 Project Overview

This application allows users to:

➕ Create new records

📋 View all records

✏️ Update existing records

❌ Delete records

The project follows the traditional Spring MVC flow using DispatcherServlet, Controllers, Services/DAO, and JSP views.

🛠️ Tech Stack

Backend: Java

Framework: Spring MVC

Frontend: JSP, HTML, CSS

Build Tool: Maven

Server: Apache Tomcat

Architecture Pattern: MVC (Model-View-Controller)

📂 Project Structure
Spring-MVC-Project-
│
├── src/main/java
│   ├── controller/
│   ├── model/
│   ├── dao/
│   └── service/
│
├── src/main/webapp
│   ├── WEB-INF/
│   │   ├── web.xml
│   │   └── spring-servlet.xml
│   └── views/
│
├── pom.xml
└── README.md
🔄 Application Flow

Client sends HTTP request.

DispatcherServlet receives the request.

Request is mapped to the appropriate Controller.

Controller interacts with Service/DAO layer.

Data is returned to JSP view.

Response is rendered in browser.

⚙️ How to Run the Project
1️⃣ Clone Repository
git clone https://github.com/Choudhary-dev/Spring-MVC-Project-
2️⃣ Build Project
mvn clean install
3️⃣ Deploy on Tomcat

Copy generated .war file from target/

Paste into Tomcat/webapps

Start Tomcat server

4️⃣ Open in Browser
http://localhost:9090/<your-app-name>
📌 Key Learning Outcomes

Understanding Spring MVC architecture

Implementing CRUD operations

Form handling and model binding

Working with JSP and View Resolver

Deployment on Apache Tomcat

🔮 Future Improvements

Add database integration (MySQL)

Add Hibernate / JPA

Add validation

Improve UI using Bootstrap

Convert to Spring Boot

👨‍💻 Author

Choudhary Dev
