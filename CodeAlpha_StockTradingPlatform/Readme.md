# Basic Stock Trading Simulation (Java)

## 📌 Overview
This project is a **Java-based stock trading simulation** that models a simple trading environment using **Object-Oriented Programming (OOP)** principles.  
Users can view market data, buy and sell stocks, and track portfolio performance over time.  
The application is console-based and demonstrates core concepts such as classes, objects, encapsulation, and file structure in Java.

---

## 🎯 Features
- Simulated stock market with dynamic stock data
- Buy and sell stock operations
- Portfolio tracking with holdings and value calculation
- Object-Oriented design for:
  - Stocks
  - Market
  - Portfolio
  - Portfolio Manager
- Clear separation of responsibilities using multiple classes
- Precompiled `.class` files included for execution

---

## 🛠️ Technologies Used
- **Java (JDK 8 or later)**
- Object-Oriented Programming (OOP)
- Java Collections
- Console-based interface

---

## 📂 Project Structure
Main.java
Main.class
Market.java
Market.class
Stock.java
Stock.class
Portfolio.java
Portfolio.class
PortfolioManager.java
PortfolioManager.class


### Class Responsibilities
- **Main**  
  Entry point of the application; starts the trading simulation.
- **Market**  
  Manages available stocks and displays market data.
- **Stock**  
  Represents individual stocks with price and quantity.
- **Portfolio**  
  Stores user-owned stocks and calculates portfolio value.
- **PortfolioManager**  
  Handles buy/sell operations and portfolio performance tracking.

---

## ▶️ How to Run the Program

### 1️⃣ Prerequisites
- Java JDK installed
- Command Prompt / Terminal or any Java IDE

### 2️⃣ Compile (if needed)
```bash
javac *.java
java Main

🖥️ How It Works

The market initializes with available stocks.

Users can view stock prices.

Users can buy or sell stocks through portfolio operations.

Portfolio value updates based on transactions.

Performance can be tracked over time during execution.

🚀 Possible Enhancements

File I/O to save and load portfolio data

Database integration for persistent storage

User authentication and multiple user portfolios

GUI version using Swing or JavaFX

Real-time or API-based stock price simulation
