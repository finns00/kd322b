
public abstract class Mammal extends Animal{
	
	private int nursingTime;
	
	public Mammal (String latinName, int nursingTime){
		super(latinName);
		this.nursingTime=nursingTime;
	}
	
	public int get_nursingTime() {
		
		return nursingTime;
		
	}

	
	
}
