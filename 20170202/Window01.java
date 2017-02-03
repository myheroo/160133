import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class Window01 {
	public static void main(String[] args) {
		Window win = new Window();
	}
}

class Window implements ActionListener{
	JFrame frame;
	ImageIcon img;
	ImageIcon img2;
	JPanel panel;
	JLabel label;
	JButton button;
	int num = 0;

	public Window() {
		frame = new JFrame("160133");
		frame.setLocation(400,400);
		frame.setSize(400,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		img = new ImageIcon("1_Desktop_Icons/icon_256.png");
		img2 = new ImageIcon("1_Desktop_Icons/icon_128.png");
		panel = new JPanel();
		label = new JLabel(img);
		button = new JButton("ClickMe!");
		button.addActionListener(this);


		panel.add(label);
		panel.add(button);
		Container con = frame.getContentPane();		
		con.add(panel);
		
//		frame.getContentPane().add(panel);
		frame.setVisible(true);
	}



	public void actionPerformed(ActionEvent ae) {
		if(num%2==0){
			label.setIcon(img2);
		} else {
			label.setIcon(img);
		}
		num++;
	}
}