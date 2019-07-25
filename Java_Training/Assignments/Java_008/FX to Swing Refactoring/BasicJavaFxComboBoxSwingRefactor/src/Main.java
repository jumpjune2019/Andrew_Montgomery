import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Main {
	public static JFrame setFrameStuff(JFrame frm, int width, int height, int onExit) {		
		frm.setSize(width, height);
		frm.setDefaultCloseOperation(onExit);
		JPanel mainPanel = new JPanel(new GridLayout(3,1));
		JLabel mainLabel = new JLabel();
		mainLabel.setVerticalAlignment(JLabel.CENTER);
		mainLabel.setHorizontalAlignment(JLabel.CENTER);
		mainLabel.setText("Select Transport Type");
		JLabel resultLabel = new JLabel();
		resultLabel.setVerticalAlignment(JLabel.CENTER);
		resultLabel.setHorizontalAlignment(JLabel.CENTER);
		String transportTypes[] = {"Train", "Car", "Airplane"};
		JComboBox<String> transports = new JComboBox<String>(transportTypes);
		transports.setSelectedItem(null);
		transports.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultLabel.setText("Selected: " + transports.getSelectedItem().toString());
			}
		});
		mainPanel.add(mainLabel);
		mainPanel.add(transports);
		mainPanel.add(resultLabel);
		frm.add(mainPanel);
		return frm;
	}
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			SwingGui demo;
			JFrame frm;
			public void run() {
				demo = new SwingGui("ComboBox Demo");
				frm = demo.getFrame();
				frm = setFrameStuff(frm, 400, 400, JFrame.EXIT_ON_CLOSE);
				frm.setVisible(true);
			}
		});
	}
}