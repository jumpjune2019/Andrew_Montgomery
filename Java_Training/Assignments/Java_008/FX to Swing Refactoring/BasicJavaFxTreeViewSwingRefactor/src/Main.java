import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JToggleButton;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;
import javax.swing.tree.TreeSelectionModel;

public class Main {
	public static void expandTreeAll(JTree tree) {
		TreeNode root = (TreeNode) tree.getModel().getRoot();
		expandAll(tree, new TreePath(root));
	}
	private static void expandAll(JTree tree, TreePath parent) {
		TreeNode node = (TreeNode) parent.getLastPathComponent();
		if (node.getChildCount() >= 0) {
			for (Enumeration<? extends TreeNode> e = node.children(); e.hasMoreElements();) {
				TreeNode n = (TreeNode) e.nextElement();
				TreePath path = parent.pathByAddingChild(n);
				expandAll(tree, path);
			}
	    }
		tree.expandPath(parent);
//		tree.collapsePath(parent);
	}
	public static void collapseTreeAll(JTree tree) {
		TreeNode root = (TreeNode) tree.getModel().getRoot();
	    collapseAll(tree, new TreePath(root));
	}
	private static void collapseAll(JTree tree, TreePath parent) {
		TreeNode node = (TreeNode) parent.getLastPathComponent();
		if (node.getChildCount() >= 0) {
			for (Enumeration<? extends TreeNode> e = node.children(); e.hasMoreElements();) {
				TreeNode n = (TreeNode) e.nextElement();
				TreePath path = parent.pathByAddingChild(n);
				expandAll(tree, path);
			}
	    }
//	    tree.expandPath(parent);
	    tree.collapsePath(parent);
	}
	public static JFrame setFrameStuff(JFrame frm, int width, int height, int onExit) {		
		frm.setSize(width, height);
		frm.setDefaultCloseOperation(onExit);
		JPanel mainPanel = new JPanel(new GridLayout(5,1));
		JLabel mainLabel = new JLabel();
		mainLabel.setText("Tree View Demo");
		mainLabel.setVerticalAlignment(JLabel.CENTER);
		mainLabel.setHorizontalAlignment(JLabel.CENTER);
		JLabel selectionLabel = new JLabel();
		selectionLabel.setVerticalAlignment(JLabel.CENTER);
		selectionLabel.setHorizontalAlignment(JLabel.CENTER);
		selectionLabel.setText("No Selection");
		JLabel pathLabel = new JLabel();
		pathLabel.setVerticalAlignment(JLabel.CENTER);
		pathLabel.setHorizontalAlignment(JLabel.CENTER);
		DefaultMutableTreeNode top = new DefaultMutableTreeNode("Food");
		DefaultMutableTreeNode catagory = null;
		DefaultMutableTreeNode food = null;
		catagory = new DefaultMutableTreeNode("Fruits");
		top.add(catagory);
		DefaultMutableTreeNode appleTypes = new DefaultMutableTreeNode("Apples");
		catagory.add(appleTypes);
		food = new DefaultMutableTreeNode("Fuji");
		appleTypes.add(food);
		food = new DefaultMutableTreeNode("Winesap");
		appleTypes.add(food);
		food = new DefaultMutableTreeNode("Clark");
		appleTypes.add(food);
		food = new DefaultMutableTreeNode("Pears");
		catagory.add(food);
		food = new DefaultMutableTreeNode("Oranges");
		catagory.add(food);
		catagory = new DefaultMutableTreeNode("Vegetables");
		top.add(catagory);
		food = new DefaultMutableTreeNode("Corn");
		catagory.add(food);
		food = new DefaultMutableTreeNode("Peas");
		catagory.add(food);
		food = new DefaultMutableTreeNode("Broccoli");
		catagory.add(food);
		food = new DefaultMutableTreeNode("Beans");
		catagory.add(food);
		catagory = new DefaultMutableTreeNode("Nuts");
		top.add(catagory);
		food = new DefaultMutableTreeNode("Walnuts");
		catagory.add(food);
		food = new DefaultMutableTreeNode("Almonds");
		catagory.add(food);
		food = new DefaultMutableTreeNode("Pistachios");
		catagory.add(food);
		food = new DefaultMutableTreeNode("Cashews");
		catagory.add(food);
		JTree treeMain = new JTree(top);
		treeMain.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
		treeMain.addTreeSelectionListener(new TreeSelectionListener() {
			@Override
			public void valueChanged(TreeSelectionEvent arg0) {
				selectionLabel.setText("Currently Selected is: " + treeMain.getLastSelectedPathComponent().toString());
				pathLabel.setText("Complete Path is: " + treeMain.getSelectionPath().toString());
			}
		});
		JScrollPane treeView = new JScrollPane(treeMain);
		JToggleButton btn = new JToggleButton();
		btn.setText("Collapse All");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				if(btn.isSelected()) {
				    btn.setText("Expand All");
				    collapseTreeAll(treeMain);
				}else {
					btn.setText("Collapse All");
					expandTreeAll(treeMain);
				}
			  } 
		});
		mainPanel.add(mainLabel);
		mainPanel.add(treeView);
		mainPanel.add(selectionLabel);
		mainPanel.add(pathLabel);
		mainPanel.add(btn);
		frm.add(mainPanel);
		return frm;
	}
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			SwingGui demo;
			JFrame frm;
			public void run() {
				demo = new SwingGui("Tree View Demo");
				frm = demo.getFrame();
				frm = setFrameStuff(frm, 400, 800, JFrame.EXIT_ON_CLOSE);
				frm.setVisible(true);
			}
		});
	}
}