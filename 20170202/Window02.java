import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class Window02 {
	public static void main(String[] args) {
		WindowMan wm = new WindowMan();
	}
}

class WindowMan implements ActionListener{
	JFrame frame;
	JLabel lable;
	JButton button;
	JTextField answer;
	String[] quiz = new String[3];

	public WindowMan() {
		openWindow();
	}

	private void openWindow() {
		frame = new JFrame("160133_王博");
		frame.setLocation(400,400);
		frame.setSize(400,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		label = new JLabel(quiz[0]);
		panel.add(label);
		Container con = frame.getContentPane();
		con.add(label);
		button = new JButton("ClickMe!");
		button.addActionListener(this);

		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent ae){
		String kotae = answer.getText();
	}
}