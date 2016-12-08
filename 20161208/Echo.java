//ECHO

public class Echo {
	public static void main(String[] args) {
		
		while(true){	//開始
			System.out.print("入力してください > ");	
			String data = new java.util.Scanner(System.in).nextLine();	//入力
			System.out.println(data);
			if(data.equals("")){	//終了
				break;
			}
		}
	}
}