package Part3_2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener implements ActionListener {
    private JTextField textField1;
    private JButton button;
    private JFrame frame;



    public ButtonListener(JTextField textField1, JButton button) {
        this.textField1 = textField1;

        this.button = button;
    }

    public void actionPerformed(ActionEvent e) {

        int result = JOptionPane.showConfirmDialog(frame, button.getText(),"Copy to Field 1?", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (result == JOptionPane.OK_OPTION) {
            textField1.setText(button.getText());
            JOptionPane.showMessageDialog(frame, "Text copied to field 1!", "Info", JOptionPane.INFORMATION_MESSAGE);
        }
    }

}


