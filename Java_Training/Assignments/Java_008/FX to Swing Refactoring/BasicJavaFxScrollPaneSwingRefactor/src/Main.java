import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;

public class Main {
	public static JFrame setFrameStuff(JFrame frm, int width, int height, int onExit) {	
		frm.setSize(width, height);
		frm.setDefaultCloseOperation(onExit);
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
		JLabel mainLabel = new JLabel();
		mainLabel.setText("ScrollPane Demo");
		mainLabel.setVerticalAlignment(JLabel.CENTER);
		mainLabel.setHorizontalAlignment(JLabel.CENTER);
		String msg1 = "A ScrollPane streamlines the process";
		String msg2 = "of adding darn scroll bars to a window whose contents"; 
		String msg3 = "exceed the viewing area dimension of the window";
		String msg4 = "It also enables a control to fit in";
		String msg5 = "Such as this label control in JavaFX";
		String msg6 = "Without it, we could not really view well the content";
		String msg7 = "of a control if it overflowed, so using scrollbars helps lots!";
		JLabel label1 = new JLabel();
		label1.setText(msg1);
		JLabel label2 = new JLabel();
		label2.setText(msg2);
		JLabel label3 = new JLabel();
		label3.setText(msg3);
		JLabel label4 = new JLabel();
		label4.setText(msg4);
		JLabel label5 = new JLabel();
		label5.setText(msg5);
		JLabel label6 = new JLabel();
		label6.setText(msg6);
		JLabel label7 = new JLabel();
		label7.setText(msg7);
		JPanel gridPanel = new JPanel();
		gridPanel.setLayout(new BoxLayout(gridPanel, BoxLayout.Y_AXIS));
		gridPanel.add(label1);
		gridPanel.add(label2);
		gridPanel.add(label3);
		gridPanel.add(label4);
		gridPanel.add(label5);
		gridPanel.add(label6);
		gridPanel.add(label7);
		JScrollPane scrollPane = new JScrollPane(gridPanel);
		JButton btn = new JButton();
		btn.setText("Reset Scroll Pane to Top/Left");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
			    scrollPane.getHorizontalScrollBar().setValue(0);
			    scrollPane.getVerticalScrollBar().setValue(0);
			} 
		});
		mainPanel.add(mainLabel);
		mainPanel.add(scrollPane);
		mainPanel.add(btn);
		frm.add(mainPanel);
		return frm;
	}
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			SwingGui demo;
			JFrame frm;
			public void run() {
				demo = new SwingGui("ScrollPane Demo");
				frm = demo.getFrame();
				frm = setFrameStuff(frm, 200, 200, JFrame.EXIT_ON_CLOSE);
				frm.setVisible(true);
			}
		});
	}
}
