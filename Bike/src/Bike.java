
/** Bike class*/
public class Bike {
	
	public static void main(String[] args) {
		
	}
	
	private String color;
	private int price;
	private int size;
	private static int nbrOfBikes;
	

	/** skapa en cykel utan pris*/
	public Bike(String color, int size) {
		this.color = color;
		this.size = size;
	}
	
	
	/** skapar en Bike med instans-variabler i sig. Dessa variabler är gränsade till numren i Constants*/
	public Bike(String color, int size, int price){
		
		this.color = Constants.checkColor(color);
		
		
		
		if(size <= Constants.MAX_SIZE && size >= Constants.MIN_SIZE ){
			this.size = size;
		}
		
		if(price <= Constants.MAX_PRICE && price >= Constants.MIN_PRICE ){
			this.price = price;
		}
		
		nbrOfBikes = nbrOfBikes + 1;
		
}
	/** returnar färgen den får in från Main till color String:en */
	public String getColor() {
		return color;
	}
	
	/** returnar sizen den får in från Main till size int:en */
	public int getSize(){
		return size;
	}
	
	/** returnar pricen den får in från Main till price int:en */
	public int getPrice(){
		return price;
	}
	
	public void setPrice(int price){
		if(price > Constants.MIN_PRICE && price < Constants.MAX_PRICE){
			
			this.price = price;
			
		}else{
			
			this.price = Constants.MIN_PRICE;
			
		}
	
	}

	
	public static int getNbrOfBikes(){
		return nbrOfBikes;
	}
	
}
