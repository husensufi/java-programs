//Java Program for calculate volume using method overloading concept

class Example{
	public void volume(String Name){
		System.out.println(Name);
	}
	public void volume(int side){
		System.out.println("\n\nThe Volume of Cube is:\n"+(side*side*side));
	}
	public void volume(int radius, double height){
		System.out.println("\n\n The Volume of Cylinder is :\n"+(3.142*radius*radius*height));
	}
	public void volume(double radius){
		System.out.println("\n\n the volume of shephere is:\n"+((4/3)*3.142*radius*radius*radius));
	}
}
class volumecalculation{
	public static void main(String[] args){
		Example a = new Example();
		a.volume("Husen Basha");
		a.volume(15);
		a.volume(13,12.3);
		a.volume(8.35);
	}
}
		