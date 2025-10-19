import javax.swing.*;
import java.awt.*;

public class SeatingGenerator extends JFrame {
    public SeatingGenerator() {
        setTitle("Seating Plan");
        setSize(400, 400);
        setLayout(new BorderLayout());

        int studentIndex = 0;
        StringBuilder sb = new StringBuilder("Seating Plan\n\n");

        for (ExamHall hall : AdminDashboard.halls) {
            sb.append("Exam Hall: ").append(hall.getName()).append("\n");
            for (int seatNumber = 1; seatNumber <= hall.getCapacity() && studentIndex < AdminDashboard.students.size(); seatNumber++) {
                Student s = AdminDashboard.students.get(studentIndex++);
                s.assignSeat(seatNumber, hall.getName());
                sb.append("Seat: ").append(seatNumber).append(", Student: ").append(s.getName()).append("\n");
            }
            sb.append("\n");
        }

        JTextArea area = new JTextArea(sb.toString());
        area.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(area);

        JButton backBtn = new JButton("Back to Admin");
        backBtn.addActionListener(e -> {
            dispose(); // Close seating window
            new AdminDashboard(); // Reopen admin dashboard
        });

        JPanel bottomPanel = new JPanel();
        bottomPanel.add(backBtn);

        add(scrollPane, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
}
