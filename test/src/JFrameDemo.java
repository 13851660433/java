package test;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JFrameDemo {

	public static void main(String[] args) {
		JFrame frame = new JFrame("title");
		JButton button = new JButton("Press");
		JButton button1 = new JButton("Press");
		JPanel panel = new JPanel();
		frame.getContentPane().setBackground(Color.CYAN);
		panel.setBackground(Color.yellow);
		panel.add(button);
		panel.add(button1);
		frame.getContentPane().add(panel, BorderLayout.WEST);
		frame.setSize(500, 200);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
