import javax.swing.*;
import java.awt.*;

public class NineOne {
    JFrame frame = new JFrame("第九章程序题第一题");
    JTextArea ta;
    public static void main(String[] args){
        NineOne tad = new NineOne();
        tad.go();
    }

    public void go(){
        frame.setBounds(800, 300, 300, 400);
        ta = new JTextArea(10, 15);
        JScrollPane jsp = new JScrollPane(ta, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        JPanel panel = new JPanel();
        panel.add(jsp);
        Container cp = frame.getContentPane();
        cp.add(panel, BorderLayout.CENTER);
//        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
