# 💰 Expense Tracker (Kotlin Console App)

A simple **Kotlin-based console application** that allows users to manage and track their expenses by category.
The app supports adding, viewing, searching, and updating expenses in an interactive menu-driven system.

---

## 📌 Features

* ➕ Add expenses under different categories
* 📋 View all saved categories and their expenses
* 🔍 Search for a specific category
* ✏️ Remove or reduce expense from a category
* 🚪 Exit the application safely
* 🧠 Input validation and error handling

---

## 🛠️ Built With

* Kotlin (JVM)
* Console-based I/O (`readln()`)
* Mutable Map for data storage

---

## 📂 Project Structure

```
src/
 └── ExpenseTracker.kt
```

---

## ⚙️ How It Works

The application uses a `MutableMap<String, Data>` where:

* Key → Category name
* Value → Data class containing:

  * Category name
  * Total expense

### Data Model

```kotlin
data class Data(
    val category: String,
    var expense: Double
)
```

---

## 🚀 Main Functionalities

### 1. Add Expense

* User enters number of categories
* Each category stores a total expense
* If category exists, expense is updated

---

### 2. Show All Categories

Displays all stored categories and their expenses.

---

### 3. Search Category

Search by category name and display its total expense.

---

### 4. Remove Expense

Reduce a specific amount from a category (if valid).

---

### 5. Exit

Safely terminates the program.

---

## 🧠 Key Concepts Used

* Loops (`while`, `for`)
* Exception handling (`try-catch`)
* Maps (`mutableMapOf`)
* Functions
* Data classes
* Conditional statements (`when`)

---

## ⚠️ Notes

* Input validation is partially handled using try-catch
* Category names are case-sensitive
* Expenses cannot go below zero

---

## 📸 Example Output

```
Choose option:
1 -> Add expense
2 -> Show all Category
3 -> Search by expense
4 -> Remove expense
5 -> Exit
```

---

## 👨‍💻 Author

Made by Marwan 🚀
Kotlin learner & future Android developer

---

## 📈 Future Improvements

* Add file/database storage
* GUI version (Android app)
* Edit category names
* Add date tracking for expenses
* Charts and analytics

---
 👨‍💻
