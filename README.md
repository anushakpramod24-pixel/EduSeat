# EduSeat 🎓 - Exam Seating Arrangement System

EduSeat is a simple **Java project** that arranges students in a classroom seating layout.

## ✨ Features
- Input student details (roll number, name).
- Input classroom size (rows × columns).
- Auto-generate seating arrangement.
- Displays seating chart (with empty seats if any).

## 📂 Project Structure
```
EduSeat/
 ├── src/
 │    ├── model/
 │    │     ├── Student.java
 │    │     └── Classroom.java
 │    ├── service/
 │    │     └── SeatingArrangement.java
 │    └── Main.java
 ├── .gitignore
 └── README.md
```

## ▶️ How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/EduSeat.git
   cd EduSeat/src
   ```
2. Compile:
   ```bash
   javac Main.java model/*.java service/*.java
   ```
3. Run:
   ```bash
   java Main
   ```

## 📌 Example Output
```
Enter number of rows: 2
Enter number of columns: 3
Enter number of students: 4
Enter roll number of student 1: 101
Enter name of student 1: Anusha
Enter roll number of student 2: 102
Enter name of student 2: Ramesh
Enter roll number of student 3: 103
Enter name of student 3: Priya
Enter roll number of student 4: 104
Enter name of student 4: Kiran

--- Seating Arrangement ---
[101] [102] [103] 
[104] [Empty] [Empty] 
```

## 🚀 Future Enhancements
- Randomized seating to avoid cheating.
- Support for multiple classrooms.
- Export seating chart to a file (CSV/PDF).
- GUI with JavaFX or Swing.

---

👨‍💻 Developed as a learning project for practicing **Java + GitHub**.
