import java.awt.*;
import java.awt.event.*;

public class Sample16_5 extends Frame {
    Image im;

    public static void main(String[] args) {
        Sample16_5 sm = new Sample16_5();
    }

    public Sample16_5() {
        super("샘플");

        Toolkit tk = getToolkit();
        im = tk.getImage("Image.jpg");

        addWindowListener(new SampleWindowListener());

        setSize(250, 200);
        setVisible(true);
    }

    public void paint(Graphics g) {
        g.drawImage(im, 100, 100, this);
    }

    class SampleWindowListener extends WindowAdapter {
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    }
}