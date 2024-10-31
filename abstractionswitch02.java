 import java.util.Scanner;
interface Bank{								//Abstract class or interface
	void deposit(int amount);
	void withdraw(int amount);
	void checkBalance();					//Abstract Methods Declaration
}
class ATM implements Bank{					//IS-A relationship
	int balance = 54000;
	public void deposit(int amount){
		System.out.println("the Deposited amount is "+ amount);
		balance = balance+amount;
		System.out.println("The Deposit transaction successfull");
		System.out.println("After done the transaction the available balance is "+ balance);
		System.out.println("+_______________________________+");
		
		
		
	}
	public void withdraw(int amount){
		System.out.println("The Withdreaw request is processed ");
		balance = balance-amount;
		System.out.println("the withdraw process is successfull");
		System.out.println("The Remaining amount is "+balance);
		System.out.println("+_______________________________+");
	}
	public void checkBalance(){
		System.out.println("Your balance is fetched ");
		System.out.println("the Available amount IS "+ balance);
		System.out.println("the Balanace fetched successfully");
		System.out.println("+_______________________________+");
	}
}
class abstractionswitch02{
	public static void main(String[] args){
		Bank b = new ATM();									//UpCasting
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to SBI ATM Services ");
		System.out.println("-----------------------------");
		while(true){
			System.out.println("01.Deposit\n02.Withdraw\n03.CheckBalance\n04.Exit");
			System.out.println("Enter Your Choice ");
			int choice = scan.nextInt();
			
			switch(choice){
				case 01:
				System.out.println("Enter the Amount to be Depostied ");
				int damt = scan.nextInt();
				b.deposit(damt);
				break;
				
				case 2:
				System.out.println("Enter the Amount to be withdraw");
				int wamt = scan.nextInt();
				b.withdraw(wamt);
				break;
				
				case 3:
				System.out.println("Check Your Bank Balance");
				b.checkBalance();
				break;
				
				case 4:
				System.out.println("Thank You Visit Again");
				break;
				
				default: System.out.println("InValid Choice Thank You");
			}
		}
	}
}