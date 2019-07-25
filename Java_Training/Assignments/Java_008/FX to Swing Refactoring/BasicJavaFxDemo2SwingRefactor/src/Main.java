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
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setVerticalAlignment(JLabel.CENTER);
		JButton btn1 = new JButton();
		btn1.setText("Say \'Hello World\'");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
			    label.setText("Hello World!");
			} 
		});
		JButton btn2 = new JButton();
		btn2.setText("Reset");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				label.setText("");
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
				demo = new SwingGui("2 Buttons and a label");
				frm = demo.getFrame();
				frm = setFrameStuff(frm, 375, 100, JFrame.EXIT_ON_CLOSE);
				frm.setVisible(true);
			}
		});
	}
}