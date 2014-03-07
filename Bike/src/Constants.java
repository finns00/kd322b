
public class Constants {

	/** s�tter en max och minimun v�rde till size och price*/
	public static int MIN_SIZE = 8;
	public static int MAX_SIZE = 28;
	
	public static int MIN_PRICE = 0;
	public static int MAX_PRICE = 30000;
	
	/**array f�r vilka f�rger som f�r anv�ndas*/
	public static String[] OK_COLOR =  {"blue", "red", "yellow"};
	
	
	/** g�r igenom ifall f�rgerna �r till�tna eller inte*/
	public static String checkColor(String col){
		
		col = col.toLowerCase();
		
		String colorFalse="f�rgen finns inte";
		
		boolean colorSant = false;
		
		for(int i = 0; i < OK_COLOR.length; i++){
		
			if (col.equals(OK_COLOR[i])){
			colorSant = true;
		}
		}
		
		if(colorSant){
			return col;
		}else {
			return colorFalse;
		}
		
			
}
	
}
