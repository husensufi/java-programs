class Father{
	int age=25;
}
class son extends Father{
	int age = 26;
}
class daughter extends Father{
	int ages = 24;
}
class ClassCastException02{
	public static void main(String[] args){
		Father f = new Father();
		son s = new son();
		daughter d = new daughter();
		
		System.out.println(f instanceof Father);  //True
		System.out.println(s instanceof son);			//True
		System.out.println(d instanceof daughter);		//True
		System.out.println(s instanceof Father);		//True
		System.out.println(f instanceof son);			//False
		System.out.println(d instanceof Father);		//True
		System.out.println(d instanceof Father);		//True	(daughter inherited from father class)
		System.out.println(f instanceof daughter);		//False (f instance not contain the properties of Daughter)
		
	}
}

		
		
		
		
		
		
		
		
		
		
		
		//The instanceof keyword is used it returns true object is an instance of the specified class or subclass