import javax.swing.*;
import java.awt.*;

public class StudentLogin extends JFrame {
    public StudentLogin() {
        setTitle("Student Portal");
        setSize(300, 200);
        setLayout(new GridLayout(3, 2));

        JLabel nameLabel = new JLabel("Enter Name:");
        JTextField nameField = new JTextField();

        JLabel rollLabel = new JLabel("Enter Roll No:");
        JTextField rollField = new JTextField();

        JButton viewBtn = new JButton("View Seat");

        // Add components row by row
        add(nameLabel); add(nameField);
        add(rollLabel); add(rollField);
        add(new JLabel()); add(viewBtn); // Empty label to align button

        viewBtn.addActionListener(e -> {
    String name = nameField.getText().trim();
    String roll = rollField.getText().trim();

    if (name.isEmpty() || roll.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter both Name and Roll No.");
        return;
    }

    boolean found = false; // ✅ Declare before the loop

    for (Student s : AdminDashboard.students) {
        if (s.getName().equalsIgnoreCase(name) && s.getRoll().equals(roll)) {
            String message = "Seat Arrangement:\n" +
                             "Name: " + s.getName() + "\n" +
                             "Roll No: " + s.getRoll() + "\n" +
                             "Subject: " + s.getSubject() + "\n" +
                             "Exam Hall: " + s.getHallName() + "\n" +
                             "Seat Number: " + s.getSeatNumber();
            JOptionPane.showMessageDialog(this, message);
            found = true;
            break; // ✅ Exit loop after finding match
        }
    }

    if (!found) {
        JOptionPane.showMessageDialog(this, "No seat arrangement found for given details.");
    }
});


        

      //  viewBtn.addActionListener(e -> {
        // String name = nameField.getText().trim();
        //String roll = rollField.getText().trim();

           // Add your seat lookup logic here

        
    
    
//};
       
    //}
     //  });

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
}
