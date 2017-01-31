import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class Aloha3 {
	public static void main(String[] args) {
		PPAPMan pm = new PPAPMan();
	}
}

class PPAPMan implements ActionListener{
	JFrame frame;
	JButton buttonSave;
	JButton buttonNext;
	JPanel buttonPanel;
	JLabel word1;
	JLabel word2;
	JPanel wordPanel;
	JTextArea memo;
	JScrollPane memoPane;
	String[] words = new String[23];

	public PPAPMan() {
		frame = new JFrame("PPAP");
		frame.setLocation(400,400);
		frame.setSize(300,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		buttonSave = new JButton("Save");
		buttonSave.addActionListener(this);
		buttonSave.setActionCommand("save");

		buttonNext = new JButton("Next");
		buttonNext.addActionListener(this);
		buttonNext.setActionCommand("next");

		word1 = new JLabel("ALOHA");
		word2 = new JLabel("ALOHA");
		memo = new JTextArea(5,20);

		Container con = frame.getContentPane();
		con.setLayout(new GridLayout(3,1));
		buttonPanel = new JPanel();
		wordPanel = new JPanel();
		memoPane = new JScrollPane(memo);

		buttonPanel.add(buttonSave);
		buttonPanel.add(buttonNext);
		wordPanel.add(word1);
		wordPanel.add(word2);

		con.add(buttonPanel);
		con.add(wordPanel);
		con.add(memoPane);
		
		frame.setVisible(true);

	}

	public void actionPerformed(ActionEvent ae){
		String cmd = ae.getActionCommand();
		if(cmd.equals("save")) {
			FileWriter fw = null;
			PrintWriter pw = null;

			try {
				fw = new FileWriter("data.txt");
				pw = new PrintWriter(fw);
				String data = memo.getText();
				pw.println(data);
			} catch(IOException e){
				System.out.println("IO Error");
			} finally {
				try {
					fw.close();
					pw.close();
				} catch(IOException e) {
					System.out.println("IO Error");
				}
			}
		} else if(cmd.equals("next")) {
			FileInputStream fr;
			BufferedReader br;
			InputStreamReader isr;
			try {
				fr = new FileInputStream("output.txt");
		//		fr = new FileReader("words.txt");
				isr = new InputStreamReader(fr,"UTF-8");
				br = new BufferedReader(isr);

				String data;
				int i = 0;
				while((data = br.readLine()) != null){
					words[i] = data ;
					i++;
				}
				int rmd1 = (int)(Math.random()*23);
				int rmd2 = (int)(Math.random()*23);

				word1.setText(words[rmd1]);
				word2.setText(words[rmd2]);

			} catch(IOException e) {
				System.out.println("IO Error");
			}
		}
	}
}