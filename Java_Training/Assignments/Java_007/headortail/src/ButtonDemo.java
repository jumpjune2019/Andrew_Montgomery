import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.event.*;

public class ButtonDemo  implements ActionListener {
    JLabel jlab;
    String first;
    String second;
    String firstMsg;
    String secondMsg;

    public void setButtons(JPanel frm, String f, String s, String fMsg, String sMsg) {
        first = f;
        second = s;
        firstMsg = fMsg;
        secondMsg = sMsg;

        JButton jbtnUp = new JButton(first);
        JButton jbtnDown = new JButton(second);
        // Add action listeners.
        jbtnUp.addActionListener(this);
        jbtnDown.addActionListener(this);
        // Add the buttons to the content pane.
        frm.add(jbtnUp);
        frm.add(jbtnDown);
        // Create a label.
        jlab = new JLabel("waiting......");
        // Add the label to the frame.
        frm.add(jlab);
    }

    // Handle button events.

    public void actionPerformed(ActionEvent ae) {
        if(ae.getActionCommand().equals(first)) {
            jlab.setText(headOrTail(randomGenerator()));
        } else {
            jlab.setText(secondMsg);
        }
    }

    public static String headOrTail(int random) {
        String face = "";
        if(random == 1) {
            face = "Head";
        }else if(random == 2) {
            face = "Tail";
        } else {
            face = "We do not have the right dice.";
        }
        return face;
    }

    public static int randomGenerator() {
        int face = 1;
        face = (int)(Math.random()*2+1);
        return face;
    }
}
