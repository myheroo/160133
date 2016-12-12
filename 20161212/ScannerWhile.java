public class ScannerWhile {
	public static void main(String[] args){
		String data;
		while(true){
			System.out.println("input data > ");
			data = new java.util.Scanner(System.in).nextLine();
			System.out.println(data);
		}
	}
}