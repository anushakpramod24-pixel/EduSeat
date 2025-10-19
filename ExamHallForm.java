import javax.swing.*;
import java.awt.*;

public class ExamHallForm extends JFrame {
    public ExamHallForm() {
        setTitle("Add Exam Hall");
        setSize(300, 200);
        setLayout(new GridLayout(3, 2));

        JTextField nameField = new JTextField();
        JTextField capField = new JTextField();
        JButton addBtn = new JButton("Add");

        add(new JLabel("Hall Name:")); add(nameField);
        add(new JLabel("Capacity:")); add(capField);
        add(addBtn);

        addBtn.addActionListener(e -> {
            String name = nameField.getText();
            int cap = Integer.parseInt(capField.getText());
            AdminDashboard.halls.add(new ExamHall(name, cap));
            JOptionPane.showMessageDialog(this, "Hall added!");
        });

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
}
