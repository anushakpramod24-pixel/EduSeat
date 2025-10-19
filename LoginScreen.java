import javax.swing.*;
import java.awt.*;

public class LoginScreen extends JFrame {
    public LoginScreen() {
        setTitle("Exam Seating System");
        setSize(300, 150);
        setLayout(new GridLayout(2, 1));

        JButton adminBtn = new JButton("Admin Login");
        JButton studentBtn = new JButton("Student Login");

        adminBtn.addActionListener(e -> {
            dispose();
            new AdminDashboard();
        });

        studentBtn.addActionListener(e -> {
            dispose();
            new StudentLogin();
        });

        add(adminBtn);
        add(studentBtn);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
