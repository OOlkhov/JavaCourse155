

public class Cat extends Animal implements Pet, Comparable <Cat> {
	
	private boolean goesOutside;
	private int weight;
	private static int count = 0;
	
	public Cat(String name, String color, boolean goesOutside, int w) {
		super(name, color);
		this.goesOutside = goesOutside;
		weight = w;
		new Counter().setCount();
	}
	
	public int getWeight (){
		return weight;
	}
	
	public void setWeight (int w){
		weight = w;
	}
		

	public void makeNoise(){
		System.out.println("Meay meay meay");
	}
	
	public void escapeFromDog() {
		System.out.println("Nah-nah, in your dreams doggy");
	}
	
	public void purr() {
		System.out.println("purrrrrrrrrrrrrrr");
	}
	
	public String hunt(){
		return "Object Mouse";
	}
	
	public boolean getGoesOutside(){
		return goesOutside;
	}
	
	public void setGoesOutside(boolean goesOut) {
		goesOut = goesOutside;
	}
	
	public void eat(){
		System.out.println("Meay I'm eating");
	}
	
	public void beFriendly(){
		System.out.println("I like people");
	}
	
	public void play(){
		System.out.println("Here is my favourite toy, let's play");
	}
	
	public String toString() {
		return super.getName() + " " + super.getColor() + " " + this.getWeight();
	}
	
	public int compareTo(Cat c) {
		if (this.getWeight() == c.getWeight()) {
			return 0;
		} else if (this.getWeight() < c.getWeight()) {
			return -1;
		} else {
			return 1;
		}
	}
	
	public class Habitat {
		private static final String planet = "Earth";
		private String continent;
		private String country;
		private String area;
		
		public Habitat(String continent, String country, String area){
			this.continent = continent;
			this.country = country;
			this.area = area;
		}
		
		public void info (){
			System.out.println(planet + " " + continent + " " + country + " " + area);
		}
		
	}
	
	public class Owner {
		private String name;
		private int age;
		
		public Owner (String name, int age){
			this.name = name;
			this.age = age;
		}
		
		public void ownerInfo(){
			System.out.println("Owner is " + name + ", he/she is " + age + " years old.");
		}
	}
	
	public static int getCount() {
		return count;
	}
	
	private static class Counter {
		private void setCount (){
			count = count + 1;
		}
	}
	
	public enum CatName{
	Martyn, Masik, Murzyk, Tiger, Ryzhyk, Snizhok}
	
	public CatName getCatName (){
		int rand = (int)(Math.random()*6);
		return CatName.values()[rand];
	}
	
	
	
	
}