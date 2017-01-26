import java.io.*;
public class ArrayFile {
	public static void main(String[] args){
		FileReader fr;
		BufferedReader br;
		String[] words = new String[22];
		try{
			fr = new FileReader("words.txt");
			br = new BufferedReader(fr);
			String data;
			int i = 0;
			while((data = br.readLine()) != null){
				words[i] = data;
				i++;
			}
		} catch(IOException e){
			System.out.println("IO Error.");
		}
		int rdm = (int)(Math.random()*22);
		System.out.println(words[rdm]);
		rdm = (int)(Math.random()*22);
		System.out.println(words[rdm]);

	}
}