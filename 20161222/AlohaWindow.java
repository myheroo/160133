import java.awt.*;
import javax.swing.*;

public class AlohaWindow {
	public static void main(String[] args){
		JFrame frame;
		//ウィンドウを作る
		frame = new JFrame();
		//ウィンドウの設定
		frame.setLocation(200,200);
		frame.setSize(300,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//ウィンドウを表示する
		frame.setVisible(true);
	}
}