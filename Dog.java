public class Dog extends Animal implements Pet, Serve {
	
	private boolean hasDoghouse;
	private boolean hasMaster;
	
	public Dog(String name, String color, boolean hasMaster) {
		super(name, color);
		this.hasMaster = hasMaster;
	}
	
	public void makeNoise(){
		System.out.println("Woof! Woof!");
	}
	
	public void chaseCat(){
		System.out.println("If only I could climb a tree");
	}
	
	public String guard() {
		return "Object Thief";
	}
	
	public boolean getHasDoghouse(){
		return hasDoghouse;
	}
	
	public void setDoghouse (boolean dh){
		hasDoghouse = dh;
	}
	
	public boolean getHasMaster (){
		return hasMaster;
	}
	
	public void setHasMaster(boolean hasM) {
		hasMaster = hasM;
	}
	
	public void eat(){
		System.out.println("Woof I'm eating");
	}
	
	public void beFriendly(){
		System.out.println("I like people");
	}
	
	public void play(){
		System.out.println("Here is my favourite ball, let's play");
	}
	
	public void tellJob(){
		System.out.println("Hi! I work in the airport, I search for forbidden stuff");
	}
	
	public void serve(){
		System.out.println("There's some work me");
	}
}