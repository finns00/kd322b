
public class Dog extends Mammal {

	private boolean dum;
	
	public Dog(String latinName, int nursingTime, boolean dum){
		super(latinName, nursingTime);
		setDum(dum);
		
	}
	
	
	public boolean getDum(){
		return dum;
	}
	
	
	public void setDum(boolean dum){
		this.dum = dum;
		
	}
	
	
	public String getInfo(){
		
		String s;
		if (dum){
			s = "";
		}
		else {
			s = "not ";
		}

		return " The dog \"" + super.get_latingName() + " nurses for " + super.get_nursingTime() + " months and is " + s + " stupid.";
		
	}
	
	
}
