
public class Cat extends Mammal {

	private int liv;
	
	public Cat(String latinName, int nursingTime, int liv){
		super(latinName, nursingTime);
		this.liv=liv;
		
	}
	

	public int getLiv(){
		return liv;
	}
	

	public void setLiv(int liv){
		this.liv = liv;
		
	}
	
	
	public String getInfo(){
		
		return " The cat \"" + super.get_latingName() + " nurses for " + super.get_nursingTime() + " months and has " + liv + " lifes.";
		
	}
	
}

