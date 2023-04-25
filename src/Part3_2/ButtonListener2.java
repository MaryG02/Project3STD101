package Part3_2;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener2 implements ActionListener {
    private JLabel label;
    private JTextField textField1;
    private JFrame frame;


    public ButtonListener2(JLabel label, JTextField textField1) {
        this.label = label;
        this.textField1 = textField1;
    }

    public void actionPerformed(ActionEvent e) {

        int result = JOptionPane.showConfirmDialog(frame, textField1.getText(),"Copy to label?", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (result == JOptionPane.OK_OPTION) {
            label.setText(textField1.getText());
            JOptionPane.showMessageDialog(frame, "Text copied to label!", "Info", JOptionPane.INFORMATION_MESSAGE);
        }

    }
}