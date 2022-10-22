public class TestInner {
	public static void main (String[] args){
		Cat cat1 = new Cat ("Murzik", "red", true, 6);
		Cat.Habitat cats1Habitat = cat1.new Habitat("Europe", "Ukraine", "all-over");
		System.out.println(cat1);
		cats1Habitat.info();
		
		Cat.Owner cats1Owner = cat1.new Owner("Masha", 10);
		cats1Owner.ownerInfo();
		
	}
}