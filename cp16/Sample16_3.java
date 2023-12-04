import java.awt.*;
import java.awt.event.*;

public class Sample16_3 extends Frame {
    private Button bt;

    public static void main(String[] args) {
        Sample16_3 sm = new Sample16_3();
    }

    public Sample16_3() {
        super("샘플");

        bt = new Button("환영합니다.");
        add(bt);

        addWindowListener(new SampleWindowListener());
        bt.addActionListener(new SampleActionListener());

        setSize(250, 200);
        setVisible(true);
    }

    class SampleWindowListener extends WindowAdapter {
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    }

    class SampleActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            bt.setLabel("안녕하세요.");
        }
    }
}