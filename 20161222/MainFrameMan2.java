import java.awt.*;
import javax.swing.*;

public class MainFrameMan2 {
	public static void main(String[] args) {
		FrameMan fm = new FrameMan();
	}
}

class FrameMan {
	//データ
	JFrame frame;
	JPanel panel;
	JLabel label;
	ImageIcon icon;

	//メソッド
	public FrameMan(){
		System.out.println("ALOHA2!");

		//windowを作る
		openWindow();
	}
	private void openWindow(){
		//windowを作る
		frame = new JFrame();
		//windowの設定
		frame.setLocation(200,200);
		frame.setSize(300,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//画像データを作る
		icon = new ImageIcon("1_Desktop_Icons/icon_256.png");

		//パネルとラベルを作る
		panel = new JPanel();
		label = new JLabel(icon);

		//パネルとラベルを表示する
		panel.add(label);
		frame.add(panel);

		//windowを表示する
		frame.setVisible(true);
	}

}
