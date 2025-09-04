package service;

import model.Student;
import model.Classroom;

public class SeatingArrangement {
    private Student[][] seats;

    public SeatingArrangement(Classroom classroom) {
        seats = new Student[classroom.getRows()][classroom.getCols()];
    }

    public void assignSeats(Student[] students) {
        int index = 0;
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                if (index < students.length) {
                    seats[i][j] = students[index++];
                }
            }
        }
    }

    public void displaySeatingChart() {
        System.out.println("\n--- Seating Arrangement ---");
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                if (seats[i][j] != null) {
                    System.out.print("[" + seats[i][j].getRollNumber() + "] ");
                } else {
                    System.out.print("[Empty] ");
                }
            }
            System.out.println();
        }
    }
}
