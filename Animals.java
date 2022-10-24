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
		
		System.out.println("Would you like to add animals? (yes/no)");
		
		Scanner sc = new Scanner(System.in);
		String choice = sc.nextLine();
		if (choice.equals("yes")){
			System.out.println("Go ahead!");
			while (sc.hasNextLine()){
				
				String animal = sc.nextLine();
				if (!animal.equals("")){
				Animal a = new Animal(animal);
				animals.addAnimal(a);}
				else break;
				
			}
		}
		
		
		System.out.println ("Show animals? (yes/no)");
		if (sc.hasNextLine()){
			choice = sc.nextLine();
			if (choice.equals("yes")) animals.printAnimals();
			else if (choice.equals("no")) System.out.println("Good bye");
			else System.out.println("Please enter yes or no");
		}
		else System.out.println("Thanks for playing");
			
		
		
		
	}
}