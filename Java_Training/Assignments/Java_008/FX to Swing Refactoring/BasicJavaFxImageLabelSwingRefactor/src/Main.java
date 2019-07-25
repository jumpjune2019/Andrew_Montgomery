import java.awt.ComponentOrientation;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class Main {
	public static JFrame setFrameStuff(JFrame frm, int width, int height, int onExit) {		
		frm.setSize(width, height);
		frm.setDefaultCloseOperation(onExit);
		ImageIcon fungusImg = new ImageIcon(new ImageIcon("fungi.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT));
		JLabel mainLabel = new JLabel();
		mainLabel.setText("Fungi");
		mainLabel.setIcon(fungusImg);
		mainLabel.setVerticalAlignment(JLabel.CENTER);
		mainLabel.setHorizontalAlignment(JLabel.CENTER);
		mainLabel.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		frm.add(mainLabel);
		return frm;
	}
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			SwingGui demo;
			JFrame frm;
			public void run() {
				demo = new SwingGui("Use an Image in a Label");
				frm = demo.getFrame();
				frm = setFrameStuff(frm, 400, 200, JFrame.EXIT_ON_CLOSE);
				frm.setVisible(true);
			}
		});
	}
}