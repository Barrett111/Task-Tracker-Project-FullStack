#  Task Tracker App

A full-stack **Task Tracker** web application built with:

-  Spring Boot (Java) — Backend API
-  React + TypeScript + NextUI — Frontend UI
-  PostgreSQL — Database
-  Docker Compose — Container orchestration

---

 Features

- Create, update, delete task lists
- Add, update, delete tasks inside lists
- Track progress via task completion
- Responsive, clean UI with NextUI
- Fully containerized with Docker Compose

---

##  Project Structure
TaskTracker/
├── frontEndTaskTracker/ # React + TypeScript Frontend
│ └── src/
├── TaskTracker/ # Spring Boot Backend
│ └── src/
├── docker-compose.yml # Docker config
└── README.md # Project documentation


---

## ⚒️ Tech Stack

| Layer      | Tech                     |
|------------|--------------------------|
| Frontend   | React, Vite, TypeScript, NextUI |
| Backend    | Spring Boot, Spring Data JPA, Hibernate |
| Database   | PostgreSQL               |
| DevOps     | Docker, Docker Compose   |

---

##  Running with Docker Compose

###  Prerequisites

- [Docker Desktop](https://www.docker.com/products/docker-desktop/) installed and running

###  Start the project

```bash
docker-compose up --build
SPRING_DATASOURCE_URL: jdbc:postgresql://db:5432/tasktracker
SPRING_DATASOURCE_USERNAME: rushikesh118
SPRING_DATASOURCE_PASSWORD: root123
```
### Author
Developed By Rushikesh Ranaware
