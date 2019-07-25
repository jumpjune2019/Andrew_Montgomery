import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JToggleButton;
import javax.swing.SwingUtilities;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Main {
	private static String oldVal = null;
	public static JFrame setFrameStuff(JFrame frm, int width, int height, int onExit) {		
		frm.setSize(width, height);
		frm.setDefaultCloseOperation(onExit);
		JPanel mainPanel = new JPanel(new GridLayout(5,1));
		JLabel mainLabel = new JLabel();
		mainLabel.setText("Select Transport Type");
		mainLabel.setVerticalAlignment(JLabel.CENTER);
		mainLabel.setHorizontalAlignment(JLabel.CENTER);
		JLabel resultLabel = new JLabel();
		resultLabel.setVerticalAlignment(JLabel.CENTER);
		resultLabel.setHorizontalAlignment(JLabel.CENTER);
		resultLabel.setText("Nothing Clicked.");
		DefaultListModel<String> itemList = new DefaultListModel<String>();
		itemList.addElement("Train");
		itemList.addElement("Car");
		itemList.addElement("Airplane");
		JList<String> listItems = new JList<String>(itemList);
		JScrollPane scroll = new JScrollPane(listItems);
		listItems.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent e) {
				resultLabel.setText("Transport Selected is " + listItems.getSelectedValue().toString());
				System.out.println("What used to be selected was " + oldVal);
				oldVal = listItems.getSelectedValue().toString();
			}
		});
		JButton addBtn = new JButton();
		addBtn.setText("Add Item");
		addBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				itemList.addElement("Test");
			} 
		});
		JButton removeBtn = new JButton();
		removeBtn.setText("Remove First Item");
		removeBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(itemList.getSize() > 0) {
					itemList.remove(0);
				}else {
					oldVal = null;
				}
			} 
		});
		mainPanel.add(mainLabel);
		mainPanel.add(scroll);
		mainPanel.add(resultLabel);
		mainPanel.add(addBtn);
		mainPanel.add(removeBtn);
		frm.add(mainPanel);
		return frm;
	}
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			SwingGui demo;
			JFrame frm;
			public void run() {
				demo = new SwingGui("ListView Demo");
				frm = demo.getFrame();
				frm = setFrameStuff(frm, 400, 300, JFrame.EXIT_ON_CLOSE);
				frm.setVisible(true);
			}
		});
	}
}