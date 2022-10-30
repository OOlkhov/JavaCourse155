import java.util.*;

public class Animals{
	
	private int count = 0;
	private ArrayList<Animal> animals = new ArrayList<Animal>();
	
	public void addAnimal (Animal animal) {
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
	
	public void enterAnimal()  {
		Scanner sc = new Scanner(System.in);
		try {
			String animal = sc.nextLine();
			if (Character.isDigit(animal.charAt(0))){
				throw new FirstCharDigitException();
			}
			else{
				Animal a = new Animal(animal);
				addAnimal(a);
				System.out.println("Animal added");
			}
		}catch (FirstCharDigitException fcde){
			System.err.println("Exception occurred:\n" + fcde);
			}
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
		
		boolean run = true;
		
		while (run){
			System.out.println("Make your choice: 1 - enter new animal; 2 - print list of animals; 3 - exit.");
			Scanner sc = new Scanner(System.in);
			try{
				int choice = sc.nextInt();
				switch(choice){
				case 1: System.out.println("Go ahead!");
						animals.enterAnimal();
						break;
				case 2: animals.printAnimals();
						break;
				case 3: System.out.println("Thank you for playing.");
						run = false;
			}
				}
			catch(InputMismatchException ime){
				System.out.println("You were asked to enter an integer 1, 2 or 3.");
			}
			finally {
				System.out.println("Here comes finally");
			}
 			
		}
			
	}
}