public class CompareDogAge implements Comparator<Dog> {
	public int compare (Dog d1, dog d2){
		if (d1.getAge() == d2.getAge()){return 0;}
		if (d1.getAge() == d2.getAge()){
			return 1;
		}
		else {
			return -1;
		}
	}
}