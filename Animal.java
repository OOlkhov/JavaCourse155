public class Animal {
	private String name;
	private String color;
	
	public Animal (String name){
		this.name = name;
	}
	
	public Animal (String name, String color){
		this.name = name;
		this.color = color;
	}
		
	public String getName() {
		return name;
	}
	
	public String getColor() {
		return color;
	}
	
	public void sayHello() {
		System.out.println("Hello, I'm " + name + ". My color is " + color);
	}
}