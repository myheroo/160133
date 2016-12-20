import java.awt.*;
import javax.swing.*;

public class AlohaWindow {
	public static void main(String[] args) {
		//windowを作る
		JFrame frame = new JFrame();
		//windowのサイズ
		frame.setSize(200,200);
		//windowのタイトル
		frame.setTitle("オウハク");
		//windowがを終わるとき、プログラムも終わる
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//"HELLO"と表示するラベル(JLabel)を作る
		JLabel label = new JLabel("HELLO");
		Container ctnr = frame.getContentPane();
		ctnr.add(label,BorderLayout.CENTER);
		//ボタンを作る
		JButton button = new JButton("Click Me!");
		ctnr.add(button,BorderLayout.SOUTH);
		//windowを表示する
		frame.setVisible(true);
	}
}