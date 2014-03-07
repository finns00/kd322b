
public class Snake extends Animal {

	private boolean giftig;
	
	public Snake(String latinName, boolean giftig){
		super(latinName);
		setGiftig(giftig);
		
	}
	
	
	public boolean getGiftig(){
		return giftig;
	}
	

	public void setGiftig(boolean giftig){
		this.giftig = giftig;
	}


	public String getInfo() {
		
		String s;
		if (giftig){
			s = "";
		}else{
			s = "not ";
		}
		
		return " The snake \"" + super.get_latingName() + " is " + s + " poisoness.";
		
	}
}
