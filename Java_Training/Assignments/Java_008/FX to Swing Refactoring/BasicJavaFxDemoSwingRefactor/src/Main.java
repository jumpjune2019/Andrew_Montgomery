import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Main {
	public static JFrame setFrameStuff(JFrame frm, int width, int height, int onExit) {		
		frm.setSize(width, height);
		frm.setDefaultCloseOperation(onExit);
		JButton btn = new JButton();
		btn.setText("Say \'Hello World\'");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
			    System.out.println("Hello World!");
			  } 
		});
		frm.add(btn);
		return frm;
	}
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			SwingGui demo;
			JFrame frm;
			public void run() {
				demo = new SwingGui("Hello World!");
				frm = demo.getFrame();
				frm = setFrameStuff(frm, 375, 100, JFrame.EXIT_ON_CLOSE);
				frm.setVisible(true);
			}
		});
	}
}