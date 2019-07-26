import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class myJFrame implements ActionListener {
    JPanel centerPanel;
    JLabel bottomLabel,  topLabel;

    int centerPanelRows,centerPanelColumns;

    //constructor
    myJFrame(String title) {
        randomRowGenerator();
        randomColumnGenerator();
        //Create a new JFrame container.
        JFrame jFrame = new JFrame(title);
        //set FlowLayout for layout manager
        jFrame.setLayout(new BorderLayout());
        // set size for jframe
        jFrame.setSize(2000, 2000);
        //Terminate the program when the user closes the app
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //create components
        centerPanel= new JPanel();
        topLabel = new JLabel("Basic Matrix Demo");
        bottomLabel = new JLabel("There was not a seat selected");

        // set properties
        topLabel.setPreferredSize(new Dimension(310, 150));

        centerPanel.setBackground(Color.BLACK);
        centerPanel.setPreferredSize(new Dimension(200, 300));
        bottomLabel.setPreferredSize(new Dimension(300, 150));

        // set centerPanel layout to grid layout.
        centerPanel.setLayout(new GridLayout(centerPanelRows,centerPanelColumns,1,1));
        //add components to jframe

        jFrame.add(bottomLabel,BorderLayout.SOUTH);
        jFrame.add(centerPanel,BorderLayout.CENTER);
        jFrame.add(topLabel,BorderLayout.NORTH);

        jFrame.pack();
        //Display the frame
        jFrame.setVisible(true);
        generateMatrix(centerPanelRows,centerPanelColumns);
    }
    public void actionPerformed(ActionEvent actionEvent) {
        String action = actionEvent.getActionCommand();
        bottomLabel.setText("Selected Seat: "+action);

    }

    public void randomRowGenerator() {

        centerPanelRows = (int) (Math.random() * 5) + 2;

    }
    public  void randomColumnGenerator() {

        centerPanelColumns = (int) (Math.random() * 5) + 2;

    }
    private JPanel generateCells(int numRows, int numColums){

        String seatText = (char)(65+numRows)+"-"+(numColums+1);

        //Initialize components
        JPanel Cell = new JPanel();
        JPanel CellLabelContainer = new JPanel();
        JPanel CellButtonContainer= new JPanel();
        JLabel seatLabel = new JLabel(seatText);
        JButton SeatButton = new JButton(seatText);
        //set some colors to see corners
        CellButtonContainer.setBackground(Color.CYAN);
        CellLabelContainer.setBackground(Color.RED);
        // add action listener
        SeatButton.addActionListener(this);
        //add components to their containers
        CellLabelContainer.add(seatLabel, BorderLayout.NORTH);
        CellButtonContainer.add(SeatButton,BorderLayout.SOUTH);
        Cell.add(CellLabelContainer);
        Cell.add(CellButtonContainer,BorderLayout.CENTER);

        Cell.setPreferredSize(new Dimension(50,50));
        Cell.setLayout(new BoxLayout(Cell,1));
        Cell.setBackground(Color.magenta);
        return Cell;
    }

    private void generateMatrix(int NumRows, int numColums){
        for (int i=0; i<NumRows;i++){
            for (int b=0;b<numColums;b++){
                JPanel tempCell = generateCells(i,b);
                String seat = (char)(65+i) + "-" + b+1;
                centerPanel.add(seat,tempCell);
            }
        }
    }


}