public class Aloha{
	public static void main(String[] args){
		Alohaman am = new Alohaman();
		am.sayAloha();
		am.sayAloha(Integer.parseInt(args[0]));
		am.sayAloha(Integer.parseInt(args[1]),Integer.parseInt(args[2]));
	}
}

class Alohaman{
	private String msg;
	private String msg2;

	public Alohaman(){
		this.msg = "ALOHA!";
		this.msg2 = "アロハ！";
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