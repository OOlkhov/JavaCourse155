import java.util.*;

public class Animals{
	public static void main (String[] args) {
		Cat cat1 = new Cat ("Murzik", "red", true, 6);
		cat1.makeNoise();
		cat1.beFriendly();
		cat1.play();
		Cat cat2 = new Cat ("Bandit", "black", true, 5);
		Cat cat3 = new Cat ("Felix", "green", true, 3);
		System.out.println("=============================");
		
		Dog dog1 = new Dog("Sharik", "brown", true, 8);
		dog1.makeNoise();
		dog1.beFriendly();
		dog1.play();
		dog1.tellJob();
		dog1.serve();
		Dog dog2 = new Dog ("Spot", "white", true, 5);
		Dog dog3 = new Dog ("Fantik", "rgb", false, 3);
		
		System.out.println("=============================");
		
		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(cat1);
		animals.add(cat2);
		animals.add(cat3);
		animals.add(dog1);
		animals.add(dog2);
		animals.add(dog3);
		System.out.println(animals);
		
		
		
		
		
	}
}