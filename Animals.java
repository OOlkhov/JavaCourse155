import java.util.*;

public class Animals{
	
	private int count = 0;
	private ArrayList<Animal> animals = new ArrayList<Animal>();
	
	public void addAnimal (Animal animal){
		if (count < 10){
			animals.add(animal);
			count++;}
		else {
			System.out.println("List limit reached");
		}
	}
	
	public void printAnimals(){
		System.out.println(animals);
	}
	
	public static void main (String[] args) {
		Cat cat1 = new Cat ("Murzik", "red", true, 6);
		Cat cat2 = new Cat ("Bandit", "black", true, 5);
		Cat cat3 = new Cat ("Felix", "green", true, 3);
		
		Dog dog1 = new Dog("Sharik", "brown", true, 8);
		Dog dog2 = new Dog ("Spot", "white", true, 5);
		Dog dog3 = new Dog ("Fantik", "rgb", false, 3);
		
		Animals animals = new Animals();
		animals.addAnimal(cat1);
		animals.addAnimal(cat2);
		animals.addAnimal(cat3);
		animals.addAnimal(dog1);
		animals.addAnimal(dog2);
		animals.addAnimal(dog3);
		animals.printAnimals();
		
		
		
		
		
	}
}