import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class Main {
	public static JFrame setFrameStuff(JFrame frm, int width, int height, int onExit) {		
		frm.setSize(width, height);
		frm.setDefaultCloseOperation(onExit);
		JLabel mainLabel = new JLabel();
		mainLabel.setVerticalAlignment(JLabel.CENTER);
		mainLabel.setHorizontalAlignment(JLabel.CENTER);
		ImageIcon fungusImg = new ImageIcon(new ImageIcon("fungi.png").getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT));
		mainLabel.setIcon(fungusImg);
		frm.add(mainLabel);
		return frm;
	}
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			SwingGui demo;
			JFrame frm;
			public void run() {
				demo = new SwingGui("Fungi is hilarious!");
				frm = demo.getFrame();
				frm = setFrameStuff(frm, 540, 540, JFrame.EXIT_ON_CLOSE);
				frm.setVisible(true);
			}
		});
	}
}