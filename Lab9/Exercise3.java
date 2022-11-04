package Lab9;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Exercise 3");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);

        JLabel label = new JLabel("Enter file name: ");
        label.setBounds(10, 10, 100, 30);
        frame.add(label);

        JTextField textField = new JTextField();
        textField.setBounds(120, 10, 200, 30);
        frame.add(textField);

        JButton button = new JButton("Display");
        button.setBounds(350, 10, 100, 30);
        frame.add(button);

        JTextArea textArea = new JTextArea();
        textArea.setBounds(10, 50, 460, 400);
        frame.add(textArea);

        button.addActionListener(e -> {
        String fileName = "src\\Lab9\\" + textField.getText() + ".txt";
        String content = "";
        try {
            Scanner scanner = new Scanner(new File(fileName));
            while (scanner.hasNextLine()) {
                content += scanner.nextLine() + "\n";
            }
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        }
        textArea.setText(content);
        });

        frame.setVisible(true);
    }
}
