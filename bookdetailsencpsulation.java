class BookDetails{
	private String Title;
	private String Author;
	private int price;
	private int publish_Year;
	public void setTitle(String Title){
		this.Title=Title;
	}
	public void setAuthor(String Author){
		this.Author=Author;
	}
	public void setPrice(int price){
		this.price=price;
	}
	public void setPublish_year(int publish_Year){
		this.publish_Year=publish_Year;
	}
	public String getTitle(){
		return this.Title;
	}
	public String getAuthor(){
		return this.Author;
	}
	public int getPrice(){
		return this.price;
	}
	public int getPublish_Year(){
		return this.publish_Year;
	}
}
class bookdetailsencpsulation{
	public static void main(String[] args){
		BookDetails b = new BookDetails();
		b.setAuthor("Husen Basha");
		b.setTitle("Mindset");
		b.setPrice(230);
		b.setPublish_year(2018);
		System.out.println("The Book Title is:"+b.getTitle());
		System.out.println("The Book Author is "+b.getAuthor());
		System.out.println("The Book price is "+b.getPrice());
		System.out.println("The Book Publish year is "+b.getPublish_Year());
	}
}
