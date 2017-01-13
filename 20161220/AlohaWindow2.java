import java.awt.*;
import javax.swing.*;

public class AlohaWindow2 {
	static JFrame frame;
	static JLabel label;
	static JButton button;
	static Container ctnr;
	public static void main(String[] args) {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,200);
		frame.setTitle("オウハク");
		frame.setLayout(new FlowLayout());

		label = new JLabel("HELLO");

		button = new JButton("ClickMe!");

		ctnr = frame.getContentPane();
		ctnr.add(label);
		ctnr.add(button);

		frame.setVisible(true);
	}
}