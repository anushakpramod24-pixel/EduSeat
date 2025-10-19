public class Student {
    private String name;
    private String roll;
    private String subject;
    private int seatNumber;
    private String hallName;

    public Student(String name, String roll, String subject) {
        this.name = name;
        this.roll = roll;
        this.subject = subject;
    }

    public String getName() { return name; }
    public String getRoll() { return roll; }
    public String getSubject() { return subject; }
    public int getSeatNumber() { return seatNumber; }
    public String getHallName() { return hallName; }

    public void assignSeat(int seatNumber, String hallName) {
    this.seatNumber = seatNumber;
    this.hallName = hallName;
}


    public String toString() {
        return "Roll: " + roll + ", Name: " + name + ", Subject: " + subject +
               ", Seat: " + seatNumber + ", Hall: " + hallName;
    }
}
