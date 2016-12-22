import java.awt.*;
import java.awt.event.*;//click
import javax.swing.*;

public class MainFrameMan3 {
	public static void main(String[] args) {
		FrameMan fm = new FrameMan();
	}
}

class FrameMan implements ActionListener{
	//データ
	JFrame frame;
	JPanel panel;
	JLabel label;
	ImageIcon icon;
	JButton button;
	int num = 0;

	//メソッド
	public FrameMan(){

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


		//パネルとラベルとボタンを作る
		panel = new JPanel();
		label = new JLabel("HELLO!");
		button = new JButton("ClickMe!");
		button.addActionListener(this);

		//パネルとラベルを表示する
		panel.add(label);
		panel.add(button);
		frame.add(panel);

		//windowを表示する
		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		//ラベルを書き換える
		if(num%2==0){
			label.setText("Aoki!");
		} else {
			label.setText("HELLO!");
		}
		num++;
	}

}
