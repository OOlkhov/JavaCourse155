public class Cat extends Animal implements Pet, Comparable <Cat> {
	
	private boolean goesOutside;
	private int weight;
	
	public Cat(String name, String color, boolean goesOutside, int w) {
		super(name, color);
		this.goesOutside = goesOutside;
		weight = w;
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
}