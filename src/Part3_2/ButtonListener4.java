package Part3_2;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener4 implements ActionListener {
    private JTextField textField2;
    private JTextField textField1;
    private JFrame frame;


    public ButtonListener4(JTextField textField2, JTextField textField1) {
        this.textField2 = textField2;
        this.textField1 = textField1;
    }

    public void actionPerformed(ActionEvent e) {

        int result = JOptionPane.showConfirmDialog(frame, textField1.getText(),"Copy to text field 2?", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (result == JOptionPane.OK_OPTION) {
            textField2.setText(textField1.getText());
            JOptionPane.showMessageDialog(frame, "Text copied to text field 2!", "Info", JOptionPane.INFORMATION_MESSAGE);
        }

    }
}