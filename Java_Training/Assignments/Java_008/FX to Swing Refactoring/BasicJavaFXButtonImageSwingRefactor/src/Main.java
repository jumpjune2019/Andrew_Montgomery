import java.awt.ComponentOrientation;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Main {
	public static JFrame setFrameStuff(JFrame frm, int width, int height, int onExit) {	
		frm.setSize(width, height);
		frm.setDefaultCloseOperation(onExit);
		JPanel mainPanel = new JPanel(new GridLayout(5, 1));
		JLabel mainLabel = new JLabel();
		mainLabel.setText("Push a Button");
		mainLabel.setVerticalAlignment(JLabel.CENTER);
		mainLabel.setHorizontalAlignment(JLabel.CENTER);
		JLabel resultLabel = new JLabel();
		resultLabel.setText(" ");
		resultLabel.setVerticalAlignment(JLabel.CENTER);
		resultLabel.setHorizontalAlignment(JLabel.CENTER);
		ImageIcon fungusImg = new ImageIcon(new ImageIcon("fungi.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT));
		ImageIcon dairyImg = new ImageIcon(new ImageIcon("dairy.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT));
		JButton resetBtn = new JButton();
		resetBtn.setText("Reset");
		resetBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
			    resultLabel.setText(" ");
			  } 
		});
		JButton fungusBtn = new JButton();
		fungusBtn.setText("Fungi");
		fungusBtn.setIcon(fungusImg);
		fungusBtn.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		fungusBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
			    resultLabel.setText(fungusBtn.getText().toLowerCase());
			  } 
		});
		JButton dairyBtn = new JButton();
		dairyBtn.setText("Dairy");
		dairyBtn.setIcon(dairyImg);
		dairyBtn.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		dairyBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
			    resultLabel.setText(dairyBtn.getText().toLowerCase());
			  } 
		});
		mainPanel.add(mainLabel);
		mainPanel.add(fungusBtn);
		mainPanel.add(dairyBtn);
		mainPanel.add(resultLabel);
		mainPanel.add(resetBtn);
		frm.add(mainPanel);
		return frm;
	}
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			SwingGui demo;
			JFrame frm;
			public void run() {
				demo = new SwingGui("Using Images with Buttons");
				frm = demo.getFrame();
				frm = setFrameStuff(frm, 300, 600, JFrame.EXIT_ON_CLOSE);
				frm.setVisible(true);
			}
		});
	}
}
