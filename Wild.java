abstract class Wild extends Animal  {
	
	private int numberOfFights = 0;
	private String location = "Park";
	
	public int getNumberOfFights (){
		return numberOfFights;
	}
	
	public void setNumberOfFights (int numberOfFights){
		this.numberOfFights = numberOfFights;
	}
	
	public String getLocation (){
		return location;
	}
	
	public void setLocation (String location){
		this.location = location;
	}
	
	public abstract void eat();
	
	final void sleep(){
		System.out.println("I'm sleeping");
	}
	
}