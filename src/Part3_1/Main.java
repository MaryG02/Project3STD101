package Part3_1;
import javax.swing.*;
import java.awt.*;

public class Main  {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Chaos and layout variations");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        // 3.1.5 Labels
        JLabel label1 = new JLabel("Flow layout:");
        JLabel label2 = new JLabel("Border Layout:");

        // 3.1.7 TextFields
        JTextField textField1 = new JTextField("Some text here");
        JTextField textField2 = new JTextField("Text2");
        JTextField textField3 = new JTextField("A lot of text");
        JTextField textField4 = new JTextField("Even more text");


        // 3.1.6 Buttons
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        JButton button4 = new JButton("Button 4");
        JButton button5 = new JButton("Button 5");
        JButton button6 = new JButton("Button 6");
        JButton button7 = new JButton("Button 7");
        JButton button8 = new JButton("Button 8");
        JButton button9 = new JButton("Button 9");
        JButton button10 = new JButton("Button 10");

        //3.1.1 Flow Layout
        JPanel panel1 = new JPanel(new FlowLayout());
        panel1.add(label1);
        panel1.add(textField1);
        panel1.add(textField2);
        panel1.add(textField3);
        panel1.add(textField4);

        //3.1.2 Border Layout
        JPanel panel2 = new JPanel(new BorderLayout());
        panel2.add(label2, BorderLayout.NORTH);
        panel2.add(button10, BorderLayout.CENTER);
        panel2.add(button3, BorderLayout.EAST);
        panel2.add(button4, BorderLayout.WEST);
        panel2.add(button5, BorderLayout.SOUTH);

        // 3.1.3 Box layout, + 3.1.8 Rigid area, + 3.1.9 Glue
        JPanel panel3 = new JPanel();
        panel3.setLayout(new BoxLayout(panel3, BoxLayout.PAGE_AXIS));
        panel3.add(button6);
        panel3.add(Box.createRigidArea(new Dimension(0, 10)));
        panel3.add(button7);
        panel3.add(Box.createVerticalGlue());
        panel3.add(button8);
        panel3.add(Box.createRigidArea(new Dimension(0, 10)));
        panel3.add(button9);

        JPanel panel4 = new JPanel(new GridLayout(2, 2));
        panel4.add(new JLabel("This"));
        panel4.add(new JLabel("Is"));
        panel4.add(new JLabel("Grid"));
        panel4.add(new JLabel("Layout"));


        frame.setLayout(new GridLayout(2, 2));
        frame.add(panel1);
        frame.add(panel4);
        frame.add(panel3);
        frame.add(panel2);



        frame.setSize(600, 600);
        frame.setVisible(true);
    }
}
