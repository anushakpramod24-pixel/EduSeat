import model.Student;
import model.Classroom;
import service.SeatingArrangement;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Enter classroom size
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();
        Classroom classroom = new Classroom(rows, cols);

        // Step 2: Enter number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter roll number of student " + (i + 1) + ": ");
            String roll = sc.nextLine();
            System.out.print("Enter name of student " + (i + 1) + ": ");
            String name = sc.nextLine();
            students[i] = new Student(roll, name);
        }

        // Step 3: Seating arrangement
        SeatingArrangement arrangement = new SeatingArrangement(classroom);
        arrangement.assignSeats(students);

        // Step 4: Display arrangement
        arrangement.displaySeatingChart();

        sc.close();
    }
}
