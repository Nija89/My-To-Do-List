# My To-Do List Application
This is a To-Do List web application built using Spring Boot, Thymeleaf, and MySQL. It allows users to view, create, update, and delete tasks in a list. The application is designed with a clean user interface using Bootstrap.

## Features:
- CRUD Operations: Users can add new tasks, update existing ones, and delete tasks from the list.
- User Interface: A layout with a clear separation between the task list and the form to add or update tasks.
- Time Stamping: Each task is automatically timestamped when created.
- Database Integration: The application is connected to a MySQL database to store tasks persistently.

## Technologies Used:
- Backend: Spring Boot, Spring Data JPA
- Frontend: Thymeleaf, Bootstrap
- Database: MySQL
- Version Control: Git, GitHub


## How to Run:
1. Clone this repository:
   ```sh
   git clone https://github.com/yourusername/todolist.git

2. Set up your MySQL database.

3. Configure the database connection in application.properties.

4. Run the application using:
   ```sh
   mvn spring-boot:run

5. Access the application in your browser at http://localhost:8080/todolist/myList.
