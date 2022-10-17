import java.util.Comparator;

public class Dog extends Animal implements Pet, Serve, Comparator<Dog> {
	
	private boolean hasDoghouse;
	private boolean hasMaster;
	private int age;
	
	public Dog(String name, String color, boolean hasMaster, int a) {
		super(name, color);
		this.hasMaster = hasMaster;
		age = a;
	}
	
	public void makeNoise(){
		System.out.println("Woof! Woof!");
	}
	
	public void chaseCat(){
		System.out.println("If only I could climb a tree");
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int a){
		age = a;
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
	
	public String toString() {
		return super.getName() + " " + super.getColor() + " " + this.getAge();
	}
	
	public int compare (Dog d1, Dog d2){
		if (d1.getAge() == d2.getAge()){return 0;}
		if (d1.getAge() == d2.getAge()){
			return 1;
		}
		else {
			return -1;
		}
	}
		
}