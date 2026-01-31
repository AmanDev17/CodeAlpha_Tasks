# Student Grade Management System (Java GUI)

## 📌 Overview
The **Student Grade Management System** is a Java-based desktop application built using **Swing**.  
It allows users to input, store, and manage student grades through a graphical user interface.  
The system calculates and displays the **average, highest, and lowest scores** of all students.

---

## 🎯 Features
- GUI-based application using **Java Swing**
- Add student names and scores
- Dynamic data storage using **ArrayList**
- Summary report of all students
- Automatic calculation of:
  - Average score
  - Highest score
  - Lowest score
- Input validation with dialog alerts
- Scrollable summary display

---

## 🛠️ Technologies Used
- **Java (JDK 8 or later)**
- **Swing (javax.swing)**
- **AWT (java.awt)**
- **ArrayList (java.util)**

---

## 📂 Project Structure

### Classes Included
- `Student` – Stores student name and score
- `StudentGradeManagerGUI` – Handles GUI and logic

---

## ▶️ How to Run the Program

### 1️⃣ Prerequisites
- Java JDK installed
- Java IDE (IntelliJ IDEA, Eclipse, NetBeans) or Command Line

### 2️⃣ Compile
```bash
javac StudentGradeManagerGUI.java
java StudentGradeManagerGUI

---- Student Summary ----
Name: Alice, Score: 85
Name: Bob, Score: 92

Total Students: 2
Average Score: 88.50
Highest Score: 92
Lowest Score: 85
