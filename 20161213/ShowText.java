import java.io.*;

public class ShowText{
	public static void main(String[] args){
		String fileName = args[0];
		String keyword = args[1];
		FileReader fr = null;
		BufferedReader br = null;

		try{
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);

			String data;
			while((data=br.readLine()) != null){
				// System.out.println(data);
				if(data.contains(keyword)){
					System.out.println(data);
					System.out.println("KWD,Found!");
				}
			}

			br.close();
		} catch(IOException e){
			System.err.println("エラーです。");
			System.exit(1);
		}
	}
}