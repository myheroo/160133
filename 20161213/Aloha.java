public class Aloha{
	public static void main(String[] args){
		while(true){
			System.out.print("input data > ");
			String data = new java.util.Scanner(System.in).nextLine();
			System.out.println(data);
			if(data.equals("exit")){
				System.out.println("終わり");
				break;

			}
		}
	}
}