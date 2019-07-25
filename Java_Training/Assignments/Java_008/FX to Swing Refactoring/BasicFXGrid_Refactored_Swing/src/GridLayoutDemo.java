import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GridLayoutDemo  implements ActionListener {
    private JFrame mainFrame;
    private JLabel headerLabel;
    private JPanel controlPanel;

    public GridLayoutDemo(){
        prepareGUI();
    }

    private void prepareGUI(){
        mainFrame = new JFrame("Grid Demo");
        mainFrame.setSize(400,300);
        mainFrame.setLayout(new GridLayout(3, 1));
        headerLabel = new JLabel("",JLabel.CENTER );

        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());

        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.setVisible(true);
    }

    private void showGridLayoutDemo() throws NullPointerException {
        headerLabel.setText("Push a Button");
        JPanel panel = new JPanel();
        panel.setSize(300,300);
        GridLayout layout = new GridLayout(2,3);
        layout.setHgap(2);
        layout.setVgap(2);
        panel.setLayout(layout);
        int length = 6;
        JButton[] buttons = new JButton[length];
        JPanel[] panels = new JPanel[length];
        int x;
        String prefixLabel = "Button ";
        for (x = 0; x < length; x++) {
            buttons[x] = new JButton(prefixLabel.concat(Integer.toString(x + 1)));
            buttons[x].addActionListener(this);
            panels[x] = new JPanel();
            panels[x].setLayout(new GridLayout(2, 1));
            panels[x].setSize(20, 20);
            panels[x].add(buttons[x]);
            panel.add(panels[x]);
        }

        controlPanel.add(panel);
        mainFrame.setVisible(true);
    }


    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                GridLayoutDemo gridLayoutDemo = new GridLayoutDemo();
                gridLayoutDemo.showGridLayoutDemo();
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

    }
}