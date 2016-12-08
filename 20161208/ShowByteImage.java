import java.io.*;

public class ShowByteImage {
	public static void main(String[] args){
/*		FileInputStream inFile = null;
		try {
			inFile = new FileInputStream("1.jpg");
			int data = inFile.read();
			System.out.println(data);
			inFile.close();
		} catch (Exception e) {
			System.err.println("エラーです。");
			System.exit(1);
		}
*/

/*		FileInputStream inFile = null;
		try {
			inFile = new FileInputStream("1.jpg");
			int data;
			while((data = inFile.read()) != -1){
				System.out.println(data);
			}
			inFile.close();
		} catch (Exception e) {
			System.err.println("エラーです。");
			System.exit(1);
		}
*/

		FileInputStream inFile = null;
		try {
			inFile = new FileInputStream("1.jpg");
			int data;
			int n = 0;
			while((data = inFile.read()) != -1){
				System.out.println(data);
				n++;
			}
			
			System.out.println("繰返し:" + n + "回");
		
			inFile.close();
			
		} catch (Exception e) {
			System.err.println("エラーです。");
			System.exit(1);
		}
	}
}