import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingControlDemo {
    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;

    public SwingControlDemo(){
        prepareGUI();
    }
    public static void main(String[] args){
        SwingControlDemo  swingControlDemo = new SwingControlDemo();
        swingControlDemo.showRadioButtonDemo();
    }
    private void prepareGUI(){
        mainFrame = new JFrame("Radio Button Demos");
        mainFrame.setSize(400,400);
        mainFrame.setLayout(new GridLayout(3, 1));

        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }
        });
        headerLabel = new JLabel("", JLabel.CENTER);
        statusLabel = new JLabel("",JLabel.CENTER);
        statusLabel.setSize(350,100);

        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());

        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
    }
    private void showRadioButtonDemo(){
        headerLabel.setText("Radio Buttons");

        final JRadioButton radTrain = new JRadioButton("Train", true);
        final JRadioButton radCar = new JRadioButton("Car");
        final JRadioButton radPlane = new JRadioButton("Plane");
        final JRadioButton radBoat = new JRadioButton("Boat");

        radTrain.setMnemonic(KeyEvent.VK_T);
        radCar.setMnemonic(KeyEvent.VK_C);
        radPlane.setMnemonic(KeyEvent.VK_P);
        radBoat.setMnemonic(KeyEvent.VK_B);

        radTrain.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                statusLabel.setText("Train RadioButton: "
                        + (e.getStateChange()==1?"checked":"unchecked"));
            }
        });
        radCar.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                statusLabel.setText("Car RadioButton: "
                        + (e.getStateChange()==1?"checked":"unchecked"));
            }
        });
        radPlane.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                statusLabel.setText("Plane RadioButton: "
                        + (e.getStateChange()==1?"checked":"unchecked"));
            }
        });
        radBoat.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                statusLabel.setText("Boat RadioButton: "
                        + (e.getStateChange()==1?"checked":"unchecked"));
            }
        });

        //Group the radio buttons.
        ButtonGroup group = new ButtonGroup();

        group.add(radTrain);
        group.add(radCar);
        group.add(radPlane);
        group.add(radBoat);

        controlPanel.add(radTrain);
        controlPanel.add(radCar);
        controlPanel.add(radPlane);
        controlPanel.add(radBoat);

        mainFrame.setVisible(true);
    }
}