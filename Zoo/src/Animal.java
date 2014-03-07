
public abstract class Animal {

	private String latinName;
	
	public Animal(String latinName){
		this.latinName=latinName;
	}
	
	public abstract String getInfo();

	public String get_latingName() {
		
		return latinName;
		
	}
		
	
	
}
