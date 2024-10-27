abstract class Bank{
	public abstract void InterestRate();
}
class SBI extends Bank{
	
	SBI(){
		System.out.println("++++++++++++++++++++++++++++++++++");
		System.out.println("cONSTRUCTOR 01");
	}
	public void InterestRate(){
		System.out.println("hello World");
	}
}
class HDFC extends Bank{
	
	HDFC(){
		//System.out.println("+++++++++++++++++++++++++++++++++++++");
		System.out.println("Constructor 02");
	}
	public void InterestRate(){
		System.out.println("Hello Husen");
	}
}
class PNB extends Bank{
	
	PNB(){
	//	System.out.println("++++++++++++++++++++++++++++++++++++++");
		System.out.println("Constructor 03");
	}
	public void InterestRate(){
		System.out.println("Hello Basha");
	}
}
class abstractclass04{
	public static void main(String[] args){
		SBI s = new SBI();
		HDFC h = new HDFC();
		PNB p = new PNB();
		s.InterestRate();
		h.InterestRate();
		p.InterestRate();
	}
}


	