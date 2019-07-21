// A Simple Swing Program

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void centerAndSizeJFrameOnScreen(JFrame frm, int width, int height) {
        // Notes:
        // Set the size of the frame to half in width and height
        frm.setSize(width/2, height/2);
        // Notes:
        // Here is the part where the JFrame gets centered
        frm.setLocationRelativeTo(null);
    }

    public static JFrame setFrameStuff(JFrame frm, int onExit, int width, int height) {
        // Notes:
        // This will center and size the JFrame on screen
        // It will have a height and width of half the screen
        centerAndSizeJFrameOnScreen(frm, width, height);
        frm.setDefaultCloseOperation(onExit);

        JPanel panel1 = new JPanel();

        panel1.setLayout(new FlowLayout());

        ButtonDemo bd = new ButtonDemo();
        bd.setButtons(panel1, "Click to Flip!", "Reset", "headOrTails", "waiting......");

        frm.add(panel1);
        return frm;
    }


    public static void main(String args[]) {
        SwingUtilities.invokeLater(new Runnable() {
            SwingDemo demo;
            JFrame frm;

            public void run() {
                demo = new SwingDemo("Head or Tails");
                frm = demo.getFrame();
                frm = setFrameStuff(frm, JFrame.EXIT_ON_CLOSE, 600, 380);
                frm.setVisible(true);
            }
        });
    }

}
