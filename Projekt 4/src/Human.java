public class Human {

	private Dog dog;
	
	private String name;
	
	private String info;
	
	
	public Human(String name){
		
		this.name = name;
		
	
	}
	
	
	public String getName(){
		return name;
	}
	
	
	public void buyDog(Dog dog){
		
		this.dog = dog;
		
	}
	
	
	public String getInfo(){
		
		if(dog != null){
			
			info = info + name + " har en hund som heter " + dog.getName();
			
		}else{
			
			info = info + name + " har ingen hund";
			
		}
		
		return info;
		
	}
	
}
