import java.io.*;
public class Memo {
	public static void main(String[] args){

		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;

		try{
			File outFile = new File("memo.txt");
			fw = new FileWriter(outFile);
			bw = new BufferedWriter(fw);
			pw = new PrintWriter(bw);
			String name = new java.util.Scanner(System.in).nextLine();
			pw.println(name);
			pw.close();

		} catch(IOException e){
			System.out.println("IO Error.");
		}
	}
}

