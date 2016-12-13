import java.io.*;

public class ShowText{
	public static void main(String[] args){
		String fileName = args[0];
		FileReader fr = null;
		BufferedReader br = null;

		try{
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);

			String data;
			while((data=br.readLine()) != null){
				System.out.println(data);
			}

			br.close();
		} catch(IOException e){
			System.err.println("エラーです。");
			System.exit(1);
		}
	}
}