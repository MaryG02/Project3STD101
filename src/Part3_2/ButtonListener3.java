package Part3_2;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener3 implements ActionListener {
    private JTextField textField2;
    private JButton button;
    private JFrame frame;


    public ButtonListener3(JTextField textField2, JButton button) {
        this.textField2 = textField2;
        this.button = button;
    }

    public void actionPerformed(ActionEvent e) {

        int result = JOptionPane.showConfirmDialog(frame, textField2.getText(),"Copy back to button?", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (result == JOptionPane.OK_OPTION) {
            button.setText(textField2.getText());
            JOptionPane.showMessageDialog(frame, "Text copied to button!", "Info", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}