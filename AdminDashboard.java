import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.ArrayList;

public class AdminDashboard extends JFrame {
    public static List<Student> students = new ArrayList<>();
    public static List<ExamHall> halls = new ArrayList<>();

    public AdminDashboard() {
        setTitle("Admin Dashboard");
        setSize(400, 400);
        setLayout(new BorderLayout());

        // Main button panel
        JPanel buttonPanel = new JPanel(new GridLayout(3, 1));
        JButton addStudentBtn = new JButton("Add Student");
        JButton addHallBtn = new JButton("Add Exam Hall");
        JButton generateBtn = new JButton("Generate Seating");

        addStudentBtn.addActionListener(e -> new StudentInputForm());
        addHallBtn.addActionListener(e -> new ExamHallForm());
        generateBtn.addActionListener(e -> new SeatingGenerator());

        buttonPanel.add(addStudentBtn);
        buttonPanel.add(addHallBtn);
        buttonPanel.add(generateBtn);

        // Back button panel (smaller size)
        JPanel backPanel = new JPanel();
        JButton backBtn = new JButton("←");
        backBtn.setPreferredSize(new Dimension(60, 30));
        backBtn.setFont(new Font("Arial", Font.PLAIN, 14));
        backBtn.setToolTipText("Go back to Login");

        backBtn.addActionListener(e -> {
            dispose(); // ✅ Closes Admin Dashboard
            new LoginScreen(); // ✅ Opens LoginScreen
        });




        addHallBtn.addActionListener(e -> {
    //dispose();
    new ExamHallForm();
});

generateBtn.addActionListener(e -> {
    dispose();
    new SeatingGenerator();
});


        backPanel.add(backBtn);

        // Add panels to frame
        add(buttonPanel, BorderLayout.CENTER);
        add(backPanel, BorderLayout.SOUTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
