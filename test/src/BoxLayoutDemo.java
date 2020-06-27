import javax.swing.*;
import java.awt.*;

public class BoxLayoutDemo {
    private JFrame frame;
    private JPanel pv, ph;
    public static void main(String[] args){
        BoxLayoutDemo that = new BoxLayoutDemo();
        that.go();
    }
    void go(){
        frame = new JFrame("BOX");
        Container contentPane = frame.getContentPane();
//        pv = new JPanel();
//        pv.setLayout(new BoxLayout(pv, BoxLayout.Y_AXIS));
//        pv.add(new JLabel(" first"));
//        pv.add(new JLabel(" second"));
//        pv.add(new JLabel(" third"));
//        contentPane.add(pv, BorderLayout.CENTER);
        Box rowbox = Box.createVerticalBox();
        rowbox.add(new JLabel("1"));
        rowbox.add(new JLabel("2"));
        rowbox.add(new JLabel("3"));
        contentPane.add(rowbox, BorderLayout.NORTH);
//        ph = new JPanel();
//        ph.setLayout(new BoxLayout(ph, BoxLayout.X_AXIS));
//        ph.add(new JButton("YES"));
//        ph.add(new JButton("NO"));
//        ph.add(new JButton("Cancel"));
//        contentPane.add(ph, BorderLayout.SOUTH);
        Box colbox = Box.createHorizontalBox();
        colbox.add(new JButton("Y"));
        colbox.add(new JButton("N"));
        colbox.add(new JButton("C"));
        contentPane.add(colbox, BorderLayout.SOUTH);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
