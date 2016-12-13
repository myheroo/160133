import java.io.*;

public class CopyByteImage{
	public static void main(String[] args){
		FileOutputStream outFile = null;
		try {
//			inFile = new FileInputStream("1.jpg");
			outFile = new FileOutputStream("1.jpg");
//			int data = inFile.read();
			int data1 = outFile.write(data);
			System.out.println(data1);
			outFile.close();
		} catch (Exception e) {
			System.err.println("エラーです。");
			System.exit(1);
		}
	}
}