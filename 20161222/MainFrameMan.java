import java.awt.*;
import javax.swing.*;

public class MainFrameMan {
	public static void main(String[] args){
		FrameMan fm = new FrameMan();
	}
}

class FrameMan {
	//データ
	JFrame frame;
	JPanel panel;
	JLabel label;
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

		//パネルとラベルを作る
		panel = new JPanel();
		label = new JLabel("ALOHA");

		//パネルとラベルを表示する
		panel.add(label);
		frame.add(panel);

		//windowを表示する
		frame.setVisible(true);
	}

}