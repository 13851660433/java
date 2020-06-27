import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class TwoStatesButton {
    JFrame frame = new JFrame();
    JCheckBox cb1 = new JCheckBox("Box1");
    JCheckBox cb2 = new JCheckBox("Box2");
    JCheckBox cb3 = new JCheckBox("Box3");
    JCheckBox cb4 = new JCheckBox("Box4");
    JCheckBox cb5 = new JCheckBox("Box5");
    JCheckBox cb6 = new JCheckBox("Box6");
    JRadioButton rb1 = new JRadioButton("JB1");
    JRadioButton rb2 = new JRadioButton("JB2");
    JRadioButton rb3 = new JRadioButton("JB3");
    JRadioButton rb4 = new JRadioButton("JB4");
    JRadioButton rb5 = new JRadioButton("JB5");
    JRadioButton rb6 = new JRadioButton("JB6");
    JTextArea ta = new JTextArea();
    public static void main(String[] args){
        TwoStatesButton ts = new TwoStatesButton();
        ts.go();
    }

    public void go(){
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        JPanel p4 = new JPanel();
        JPanel p5 = new JPanel();
        JPanel pa = new JPanel();
        JPanel pb = new JPanel();
        p1.add(cb1);
        p1.add(cb2);
        p1.add(cb3);
        Border etched = BorderFactory.createEtchedBorder();
        Border border = BorderFactory.createTitledBorder(etched, "JB");
        p1.setBorder(border);
        p2.add(cb4);
        p2.add(cb5);
        p2.add(cb6);
        border = BorderFactory.createTitledBorder(etched, "JBG");
        p2.setBorder(border);
        ButtonGroup group1 = new ButtonGroup();
        group1.add(cb4);
        group1.add(cb5);
        group1.add(cb6);
        p3.add(rb1);
        p3.add(rb2);
        p3.add(rb3);
        border = BorderFactory.createTitledBorder(etched, "JRB");
        p3.setBorder(border);
        p4.add(rb4);
        p4.add(rb5);
        p4.add(rb6);
        border = BorderFactory.createTitledBorder(etched, "JRBG");
        p4.setBorder(border);
        ButtonGroup group2 = new ButtonGroup();
        group2.add(rb4);
        group2.add(rb5);
        group2.add(rb6);
        JScrollPane jp = new JScrollPane();
        p5.setLayout(new BorderLayout());
        p5.add(jp);
        border = BorderFactory.createTitledBorder(etched, "Results");
        p5.setBorder(border);
        ItemListener il = new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                JCheckBox cb = (JCheckBox)e.getSource();
                if(cb == cb1){
                    ta.append("\n JBB" + cb1.isSelected());
                }else if(cb == cb2){ta.append("\njbb2" + cb2.isSelected());}
                else if(cb == cb3){ta.append("\njbb3" + cb3.isSelected());}
                else if(cb == cb4){ta.append("\njbb4" + cb4.isSelected());}
                else if(cb == cb5){ta.append("\njbb5" + cb5.isSelected());}
                else{ta.append("\njbb6" + cb6.isSelected());}
            }
        };
        cb1.addItemListener(il);
        cb2.addItemListener(il);
        cb3.addItemListener(il);
        cb4.addItemListener(il);
        cb5.addItemListener(il);
        cb6.addItemListener(il);
        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JRadioButton rb = (JRadioButton)e.getSource();
                if(rb == rb1){ta.append("\n RB1" + rb1.isSelected());}
                else if(rb == rb2){ta.append("\n RB2" + rb2.isSelected());}
                else if(rb == rb3){ta.append("\n RB3" + rb3.isSelected());}
                else if(rb == rb4){ta.append("\n RB4" + rb4.isSelected());}
                else if(rb == rb5){ta.append("\n RB5" + rb5.isSelected());}
                else{ta.append("\n RB6" + rb6.isSelected());}
            }
        };

        rb1.addActionListener(al);
        rb2.addActionListener(al);
        rb3.addActionListener(al);
        rb4.addActionListener(al);
        rb5.addActionListener(al);
        rb6.addActionListener(al);
        pa.setLayout(new GridLayout(0, 1));
        pa.add(p1);
        pa.add(p2);
        pb.setLayout(new GridLayout(0, 1));
        pb.add(p3);
        pb.add(p4);
        Container cp = frame.getContentPane();
        cp.setLayout(new GridLayout(0, 1));
        cp.add(pa);
        cp.add(pb);
        cp.add(p5);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
