// A simple Swing Program
import javax.swing.*;
import java.awt.*;
public class Main {

    public static void centerAndSizeJFrameOnScreen(JFrame frm, int width, int height) {
        // set the size of the frame to half in width and height
        frm.setSize(width, height);
        // here's the part where the JFrame gets actually centered
        frm.setLocationRelativeTo(null);
    }

    public static JFrame setFrameStuff(JFrame frm, int onExit, int width, int height) {
        // this will center and size the JFrame on screen
        // it will have a height and width of half the screen
        centerAndSizeJFrameOnScreen(frm, width, height);
        frm.setDefaultCloseOperation(onExit);

        JPanel panel1 = new JPanel();
//		JPanel panel2 = new JPanel();

        panel1.setLayout(new FlowLayout());
//		panel2.setLayout(new FlowLayout());

        ButtonDemo bd = new ButtonDemo();
        bd.setButtons(panel1, "Click to Flip!", "Reset", "You Pressed First", "waiting......");
//		ButtonDemo bd2 = new ButtonDemo();
//		bd2.setButtons(panel2, "Up", "Down", "Going Up!", "Going Down!");

        frm.add(panel1);
//		frm.add(panel2);
        return frm;
    }

    public static void main(String args[]) {
        Runnable head_or_tails = new Runnable() {
            SwingDemo demo;
            JFrame frm;

            public void run() {
                demo = new SwingDemo("Head or Tails");
                frm = demo.getFrame();
                frm = setFrameStuff(frm, JFrame.EXIT_ON_CLOSE, 510, 380);
                frm.setVisible(true);
            }
        };
        SwingUtilities.invokeLater(head_or_tails);
    }

//    public static void main(String args[]) {
//        SwingUtilities.invokeLater(new Runnable() {
//            SwingDemo demo;
//            JFrame frm;
//
//            public void run() {
//                demo = new SwingDemo("Head or Tails");
//                frm = demo.getFrame();
//                frm = setFrameStuff(frm, JFrame.EXIT_ON_CLOSE, 510, 380);
//                frm.setVisible(true);
//            }
//        });
//    }
}