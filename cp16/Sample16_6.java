import java.awt.*;
import java.awt.event.*;

public class Sample16_6 extends Frame {
    int x = 10;
    int y = 10;

    public static void main(String[] args) {
        Sample16_6 sm = new Sample16_6();
    }

    public Sample16_6() {
        super("샘플");

        addWindowListener(new SampleWindowListener());
        addMouseListener(new SampleMouseAdapter());

        setSize(250, 200);
        setVisible(true);
    }

    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.fillOval(x, y, 10, 10);
    }

    class SampleWindowListener extends WindowAdapter {
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    }

    class SampleMouseAdapter extends MouseAdapter {
        public void mousePressed(MouseEvent e) {
            x = e.getX();
            y = e.getY();
            repaint();
        }
    }
}