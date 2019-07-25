import javax.swing.JFrame;

public class SwingGui {
	private JFrame jfrm;
	SwingGui(String title) {
		// Create a new JFrame container.
		jfrm = new JFrame(title);
	}
	public JFrame getFrame() {
		return jfrm;
	}
}
