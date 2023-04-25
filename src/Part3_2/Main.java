package Part3_2;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Text circulation");
        JPanel panel = new JPanel(new GridLayout(4, 2));
        JButton button = new JButton("SomeText");
        JButton button2 = new JButton("Click to copy to the label");
        JButton button3 = new JButton("Click to copy to startButton");
        JButton button4 = new JButton("Click to copy to Field2  ");
        JLabel label = new JLabel("Label");
        JTextField textField1 = new JTextField("Text field 1");
        JTextField textField2 = new JTextField("Text field 2");
        panel.add(button);
        panel.add(textField1);
        panel.add(button2);
        panel.add(label);
        panel.add(button4);
        panel.add(textField2);
        panel.add(button3);
        button.addActionListener(new ButtonListener(textField1, button));
        button2.addActionListener(new ButtonListener2(label, textField1));
        button4.addActionListener(new ButtonListener4(textField2, textField1));
        button3.addActionListener(new ButtonListener3(textField2, button));

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(panel);
    }

}
