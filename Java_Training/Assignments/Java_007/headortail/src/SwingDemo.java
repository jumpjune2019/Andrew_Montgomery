// A Simple Swing Class

import javax.swing.*;

public class SwingDemo {
    private JFrame jfrm;
    SwingDemo(String title) {
        // Create a new JFrame container
        jfrm = new JFrame(title);
        jfrm.setLayout(new BoxLayout(jfrm.getContentPane(), BoxLayout.Y_AXIS));
    }
    // Create A Getter Method
    public JFrame getFrame() {
        return jfrm;
    }
}
