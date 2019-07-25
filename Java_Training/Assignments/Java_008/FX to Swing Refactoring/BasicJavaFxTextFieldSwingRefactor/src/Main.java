import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Main {
	public static JFrame setFrameStuff(JFrame frm, int width, int height, int onExit) {	
		frm.setSize(width, height);
		frm.setDefaultCloseOperation(onExit);
		JPanel mainPanel = new JPanel(new GridLayout(4, 1));
		JLabel mainLabel = new JLabel();
		mainLabel.setText("Text Field Demo");
		mainLabel.setVerticalAlignment(JLabel.CENTER);
		mainLabel.setHorizontalAlignment(JLabel.CENTER);
		JLabel resultLabel = new JLabel();
		resultLabel.setText("Search String :");
		resultLabel.setVerticalAlignment(JLabel.CENTER);
		resultLabel.setHorizontalAlignment(JLabel.CENTER);
		JTextField textIn = new JTextField();
		textIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				resultLabel.setText("Search String : " + textIn.getText());
			} 
		});
		JButton btn = new JButton();
		btn.setText("Get Search String");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
			    resultLabel.setText("Search String : " + textIn.getText());
			} 
		});
		
		mainPanel.add(mainLabel);
		mainPanel.add(textIn);
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
				demo = new SwingGui("Text Field Demo");
				frm = demo.getFrame();
				frm = setFrameStuff(frm, 400, 200, JFrame.EXIT_ON_CLOSE);
				frm.setVisible(true);
			}
		});
	}
}
