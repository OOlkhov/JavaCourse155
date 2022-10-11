public class Cat extends Wild {
	
	private boolean goesOutside;
	
	public Cat(String name, String color, boolean goesOutside) {
		super(name, color);
		this.goesOutside = goesOutside;
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
}