import java.awt.*;
import java.awt.event.*;

public class Sample16_1 extends Frame {
    public static void main(String[] args) {
        Sample16_1 sm = new Sample16_1();
    }

    public Sample16_1() {
        super("샘플");

        addWindowListener(new SampleWindowListener());

        setSize(250, 200);
        setVisible(true);
    }

    class SampleWindowListener extends WindowAdapter {
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    }
}
