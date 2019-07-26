import javax.swing.*;

public class Main {
    public static void main(String []args){
        //create the frame on the event with dispatching thread.
        Runnable doRun = new Runnable() {
            @Override
            public void run() {
                new myJFrameStuff(" The Matrix Challenge");
            }
        };
        SwingUtilities.invokeLater(doRun);

    }

}