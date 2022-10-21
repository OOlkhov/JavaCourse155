public class TestInner {
	public static void main (String[] args){
		Cat cat1 = new Cat ("Murzik", "red", true, 6);
		Cat.Habitat cats1Habitat = cat1.new Habitat1("Europe", "Ukraine", "all-over");
		Cat.Habitat 