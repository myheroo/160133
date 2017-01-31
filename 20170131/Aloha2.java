import java.io.*;

public class Aloha2 {
	public static void main(String[] args){
		String[] data = new String[100];
		Dataman dataman = new Dataman();
		Fileman fileman = new Fileman();

		dataman.inputData();
		dataman.saveData(data);

		fileman.writeFile(data);
	}
}


class Dataman {
	String[] data;
	int numData;

	public Dataman(){
		data = new String[100];	
		int numData = 2;
		data[0] = "Aoki,Ebina,52";
		data[1] = "Horie,Yokohama,55";
	}

	public void inputData(){
		System.out.print("何人のデータ？>");
		this.numData = Integer.parseInt(new java.util.Scanner(System.in).nextLine());
	}

	public void saveData(String[] strData){

		System.out.println("dataを保存しましょう！");
		strData[0] = "Aoki";
		strData[1] = "Horie";
		strData[2] = "Miwa";

	}
}

class Fileman {

	public Fileman(){
		System.out.println("Fileman!");
	}
		
	public void writeFile(String[] strData) {
		FileWriter fw = null;
		PrintWriter pw = null;

		try {
			fw = new FileWriter("output.txt",true);
			pw = new PrintWriter(fw);

			String msg = new java.util.Scanner(System.in).nextLine();

			pw.println(msg);
		} catch(IOException e){
			System.out.println("IO Error");
		} finally {
			
			pw.close();
		}

	}
}
