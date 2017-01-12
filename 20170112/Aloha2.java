public class Aloha2{
	public static void main(String[] args){
		Alohaman2 am;
		if(args.length==4){
			am= new Alohaman2(args[2],args[3]);
		} else if(args.length<3){
			am = new Alohaman2();
		}
		
	}
}

class Alohaman2{
	private String msg;
	private String msg2;
	
	public Alohaman2(){
		this.msg = "ALOHA!";
		this.msg2 = "アロハ！";
	}

	public Alohaman2(String msg,String msg2){
		this.msg =msg;
		this.msg2 = msg2;
	}

	public void sayAloha(){
		System.out.println(this.msg);
	}

	public void sayAloha(int num, int x){
		for(int i=0; i<num; i++){
			if(i%x==0){
				System.out.println(this.msg2);
			} else{
				System.out.println(this.msg);
			}
		}
	}
}