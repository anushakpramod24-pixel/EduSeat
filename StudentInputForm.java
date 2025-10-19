import javax.swing.*;
import java.awt.*;

public class StudentInputForm extends JFrame {
    private JTextField nameField;
    private JTextField rollField;
    private JTextField subjectField;

    public StudentInputForm() {
        setTitle("Add Student");
        setSize(300, 200);
        setLayout(new GridLayout(4, 2));

        nameField = new JTextField();
        rollField = new JTextField();
        subjectField = new JTextField();
        JButton addBtn = new JButton("Add");

        add(new JLabel("Name:")); add(nameField);
        add(new JLabel("Roll No:")); add(rollField);
        add(new JLabel("Subject:")); add(subjectField);
        add(addBtn);

        addBtn.addActionListener(e -> {
            String name = nameField.getText().trim();
            String roll = rollField.getText().trim();
            String subject = subjectField.getText().trim();

            if (name.isEmpty() || roll.isEmpty() || subject.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please fill all fields.");
                return;
            }

            // Add student to list
            AdminDashboard.students.add(new Student(name, roll, subject));
            JOptionPane.showMessageDialog(this, "Student added!");

            // ✅ Close current form and open a new one
            SwingUtilities.invokeLater(() -> {
                dispose(); // close current window
                new StudentInputForm(); // open new blank form
            });
        });

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
}
