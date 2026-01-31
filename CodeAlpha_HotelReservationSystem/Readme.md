# Hotel Reservation Management System (Java)

## 📌 Overview
The **Hotel Reservation Management System** is a Java-based application designed to simulate the process of searching, booking, and managing hotel rooms.  
It follows **Object-Oriented Programming (OOP)** principles and provides functionality for room categorization, reservation handling, payment simulation, and booking management.  
The system is console-based and suitable for learning core Java concepts along with basic file/database persistence.

---

## 🎯 Features
- Search available hotel rooms
- Room categorization:
  - Standard
  - Deluxe
  - Suite
- Book hotel rooms
- Cancel existing reservations
- Simulated payment processing
- View booking and reservation details
- Manage room availability
- Uses OOP concepts for clean design
- Supports file-based persistence for bookings and availability (can be extended to database)

---

## 🛠️ Technologies Used
- **Java (JDK 8 or later)**
- Object-Oriented Programming (OOP)
- Java Collections Framework
- File I/O (for data persistence)
- Console-based user interface

---

## 📂 Project Structure
Main.java
Main.class
User.java
User.class
Room.java
Room.class
Reservation.java
Reservation.class
Payment.java
Payment.class


### Class Responsibilities
- **Main**  
  Entry point of the application and user interaction flow.
- **User**  
  Represents users who book and manage reservations.
- **Room**  
  Defines room details such as room type, price, and availability.
- **Reservation**  
  Handles booking information including user, room, and dates.
- **Payment**  
  Simulates payment processing and confirmation.

---

## ▶️ How to Run the Program

### 1️⃣ Prerequisites
- Java JDK installed
- Any Java IDE or Command Line Interface

### 2️⃣ Compile (if source files are modified)
```bash
javac *.java
java Main

🖥️ How It Works

Users can search rooms based on category and availability.

Users select a room type and make a reservation.

Payment is simulated before booking confirmation.

Reservation details are displayed after booking.

Users can cancel reservations, updating room availability.

Booking data can be stored and retrieved using File I/O.

🚀 Possible Enhancements

Database integration (MySQL / SQLite)

Date-based availability checking

Multiple users with authentication

GUI version using Swing or JavaFX

Dynamic pricing for rooms

Admin panel for hotel management
