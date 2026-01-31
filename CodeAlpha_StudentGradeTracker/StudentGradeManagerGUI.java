import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

class Student {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}

public class StudentGradeManagerGUI extends JFrame {

    private ArrayList<Student> students = new ArrayList<>();

    private JTextField nameField;
    private JTextField scoreField;
    private JTextArea outputArea;

    public StudentGradeManagerGUI() {
        setTitle("Student Grade Management System");
        setSize(450, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Input Panel
        JPanel inputPanel = new JPanel(new GridLayout(3, 2, 10, 10));
        inputPanel.setBorder(BorderFactory.createTitledBorder("Add Student"));

        inputPanel.add(new JLabel("Student Name:"));
        nameField = new JTextField();
        inputPanel.add(nameField);

        inputPanel.add(new JLabel("Student Score:"));
        scoreField = new JTextField();
        inputPanel.add(scoreField);

        JButton addButton = new JButton("Add Student");
        JButton summaryButton = new JButton("Show Summary");

        inputPanel.add(addButton);
        inputPanel.add(summaryButton);

        // Output Area
        outputArea = new JTextArea();
        outputArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(outputArea);
        scrollPane.setBorder(BorderFactory.createTitledBorder("Summary Report"));

        add(inputPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        // Button Actions
        addButton.addActionListener(e -> addStudent());
        summaryButton.addActionListener(e -> showSummary());
    }

    private void addStudent() {
        String name = nameField.getText().trim();
        String scoreText = scoreField.getText().trim();

        if (name.isEmpty() || scoreText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter all fields.");
            return;
        }

        try {
            int score = Integer.parseInt(scoreText);
            students.add(new Student(name, score));
            outputArea.append("Added: " + name + " - " + score + "\n");
            nameField.setText("");
            scoreField.setText("");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Score must be a number.");
        }
    }

    private void showSummary() {
        if (students.isEmpty()) {
            outputArea.setText("No student data available.\n");
            return;
        }

        int total = 0;
        int highest = students.get(0).getScore();
        int lowest = students.get(0).getScore();

        StringBuilder report = new StringBuilder();
        report.append("---- Student Summary ----\n");

        for (Student s : students) {
            report.append("Name: ").append(s.getName())
                  .append(", Score: ").append(s.getScore()).append("\n");
            total += s.getScore();
            highest = Math.max(highest, s.getScore());
            lowest = Math.min(lowest, s.getScore());
        }

        double average = (double) total / students.size();

        report.append("\nTotal Students: ").append(students.size());
        report.append("\nAverage Score: ").append(String.format("%.2f", average));
        report.append("\nHighest Score: ").append(highest);
        report.append("\nLowest Score: ").append(lowest);

        outputArea.setText(report.toString());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new StudentGradeManagerGUI().setVisible(true);
        });
    }
}
