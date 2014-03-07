import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Bike> SellBikes = new ArrayList<Bike>();
		
		SellBikes.add(new Bike("Blue", 20, 5000));
		SellBikes.add(new Bike("Yellow", 23, 3000));
		SellBikes.add(new Bike("Red", 14, 4000));
		SellBikes.add(new Bike("Yellow", 10, 2000));
		SellBikes.add(new Bike("Red", 14, 1000));
		SellBikes.add(new Bike("Blue", 20, 5000));
		SellBikes.add(new Bike("Yellow", 60, 3000));
		SellBikes.add(new Bike("Red", 40, 4000));
		SellBikes.add(new Bike("Yellow", 30, 2000));
		SellBikes.add(new Bike("Red", 50, 1000));
		
	
	for(int i = 0; i < SellBikes.size(); i++){
		
		Bike b = SellBikes.get(i);
		
			System.out.println("color: " + b.getColor() + "  " + b.getSize() + "tum" + "  " + b.getPrice() + "kr" + "  ");
			
	}
	
	System.out.println("\n totalt antal cyklar:" + Bike.getNbrOfBikes());
		}
	
	}


