import java.util.Arrays;

public class TestCat{
	public static void main (String[] args) {
		Cat cat1 = new Cat ("Murzik", "red", true, 6);
		cat1.makeNoise();
		cat1.beFriendly();
		cat1.play();
		Cat cat2 = new Cat ("Bandit", "black", true, 5);
		Cat cat3 = new Cat ("Felix", "green", true, 3);
		System.out.println("=============================");
		
		Dog dog1 = new Dog("Sharik", "brown", true);
		dog1.makeNoise();
		dog1.beFriendly();
		dog1.play();
		dog1.tellJob();
		dog1.serve();
		
		Cat cats[] = {cat1, cat2, cat3};
		Arrays.sort(cats);
		for (Cat cat : cats) {   
			System.out.println(cat);
		}
		
	}
}