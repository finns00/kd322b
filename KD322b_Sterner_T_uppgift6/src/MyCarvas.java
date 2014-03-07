import javax.swing.JComponent;

import java.awt.Color;
import java.awt.Graphics;



public class MyCarvas extends JComponent {


	private int women;
	private int men;
	
	private float total; 
	
	public MyCarvas() {
		
		this.women = 0;
		this.men = 0;
		this.total = 0;
		
	}
	
	public MyCarvas (int women, int men){
		super();
		this.women = women;
		this.men = men;
		
	}
	
	public void updateValues(int women, int men){
	
		this.women = women;
		this.men = men;
		this.total=this.women+this.men;
		
		invalidate();
		repaint();
	}


	@Override
	public void paint(Graphics g) {
	
	
		
	int h = getHeight();
	int w = getWidth();
		
	if(women > 0){
		
			float womenPro = women / total;
			float pixelhWom = h*womenPro;
			
			System.out.println(womenPro);
			
			int posX = (w / 2) - (w / 4);
			int posY = (int) (h - pixelhWom);
			
			g.setColor(Color.BLUE);
			g.fillRect( posX, posY, w/4,(int) pixelhWom);

		} else {
			System.out.println(" no women ");
		}
	
	
	if(men > 0){
		
	       float menPro = men / total;
			float pixelhMen = h*menPro;
			
			System.out.println(menPro);
			
			int posX = (w / 2);
			int posY = (int) (h - pixelhMen);
			
			g.setColor(Color.RED);
			g.fillRect( posX, posY, w/4,(int) pixelhMen);
			
		

		} else {
			System.out.println("no men");
		}
	
	
	
	g.setColor(Color.BLACK);
	g.drawString("Totalt " + total + " sökande", 10, 10);
	
}

}


