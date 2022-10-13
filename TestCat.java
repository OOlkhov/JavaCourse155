public class TestCat{
	public static void main (String[] args) {
		Cat cat1 = new Cat ("Murzik", "red", true);
		cat1.makeNoise();
		cat1.beFriendly();
		cat1.play();
		
		Dog dog1 = new Dog("Sharik", "brown", true);
		dog1.makeNoise();
		dog1.beFriendly();
		dog1.play();
		
	}
}