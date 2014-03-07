
public class Constants {

	/** sätter en max och minimun värde till size och price*/
	public static int MIN_SIZE = 8;
	public static int MAX_SIZE = 28;
	
	public static int MIN_PRICE = 0;
	public static int MAX_PRICE = 30000;
	
	/**array för vilka färger som får användas*/
	public static String[] OK_COLOR =  {"blue", "red", "yellow"};
	
	
	/** går igenom ifall färgerna är tillåtna eller inte*/
	public static String checkColor(String col){
		
		col = col.toLowerCase();
		
		String colorFalse="färgen finns inte";
		
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
