public class Aloha{
	public static void main(String[] args){
		int data0 = Integer.parseInt(args[0]);
		String data1 = args[1];
		String data2 = args[2];
		int data3 = Integer.parseInt(args[3]);

		Alohaman am = new Alohaman();
		Alohaman bm = new Alohaman(data1,data2);

		
		am.sayAloha();
		am.sayAloha(data0);
//		am.sayAloha(Integer.parseInt(args[1]),Integer.parseInt(args[2]));
		bm.sayAloha(data0,data3);
	}
}

class Alohaman{
	private String msg;
	private String msg2;

	public Alohaman(){
		this.msg = "ALOHA!";
		this.msg2 = "アロハ！";
	}

	public Alohaman(String m1, String m2){
		this.msg = m1;
		this.msg2 = m2;
	}

	public void sayAloha(){
		System.out.println(this.msg);
	}

	public void sayAloha(int n){
		for(int i=0; i<n; i++){
			System.out.println(i+1+this.msg);
		}
	}

	public void sayAloha(int n, int x){
		for(int i=0; i<n; i++){
			if(i%x==0){
				System.out.println(i+1+this.msg2);
			} else{
				System.out.println(i+1+this.msg);
			}
		}
	}
}