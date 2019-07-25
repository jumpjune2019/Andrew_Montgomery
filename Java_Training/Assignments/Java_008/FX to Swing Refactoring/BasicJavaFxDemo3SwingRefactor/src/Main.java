import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Main {
	public static JFrame setFrameStuff(JFrame frm, int width, int height, int onExit) {		
		frm.setSize(width, height);
		frm.setDefaultCloseOperation(onExit);
		JPanel panel = new JPanel(new GridLayout(3,1));
		JLabel label = new JLabel();
		label.setText("Push a Button!");
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setVerticalAlignment(JLabel.CENTER);
		JButton btn1 = new JButton();
		btn1.setText("Alpha");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
			    label.setText("Alpha was pressed.");
			} 
		});
		JButton btn2 = new JButton();
		btn2.setText("Beta");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				label.setText("Beta was pressed.");
			} 
		});
		panel.add(label);
		panel.add(btn1);
		panel.add(btn2);
		frm.add(panel);
		return frm;
	}
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			SwingGui demo;
			JFrame frm;
			public void run() {
				demo = new SwingGui("JavaFX Buttons, Events and Alignment");
				frm = demo.getFrame();
				frm = setFrameStuff(frm, 375, 100, JFrame.EXIT_ON_CLOSE);
				frm.setVisible(true);
			}
		});
	}
}