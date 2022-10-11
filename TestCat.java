public class TestCat{
	public static void main (String[] args) {
		Cat cat1 = new Cat ("Murzik", "red", true);
		cat1.makeNoise();
		
		Dog dog1 = new Dog("Sharik", "brown", true);
		dog1.makeNoise();
	}
}