import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.SwingUtilities;

public class Main {
	public static JFrame setFrameStuff(JFrame frm, int width, int height, int onExit) {		
		frm.setSize(width, height);
		frm.setDefaultCloseOperation(onExit);
		JPanel mainPanel = new JPanel(new GridLayout(3,1));
		JLabel mainLabel = new JLabel();
		mainLabel.setText("Push a Button");
		mainLabel.setVerticalAlignment(JLabel.CENTER);
		mainLabel.setHorizontalAlignment(JLabel.CENTER);
		JLabel resultLabel = new JLabel();
		resultLabel.setVerticalAlignment(JLabel.CENTER);
		resultLabel.setHorizontalAlignment(JLabel.CENTER);
		JToggleButton btn = new JToggleButton();
		btn.setText("ON/OFF");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				if(btn.isSelected()) {
					resultLabel.setText("Button is On");
				}else {
				    resultLabel.setText("Button is Off");
				}
			  } 
		});
		mainPanel.add(mainLabel);
		mainPanel.add(btn);
		mainPanel.add(resultLabel);
		frm.add(mainPanel);
		return frm;
	}
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			SwingGui demo;
			JFrame frm;
			public void run() {
				demo = new SwingGui("Toggle Button Demo");
				frm = demo.getFrame();
				frm = setFrameStuff(frm, 150, 300, JFrame.EXIT_ON_CLOSE);
				frm.setVisible(true);
			}
		});
	}
}