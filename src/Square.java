import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
/**
 * This class represents the square shape. 
 * It is positioned in relation to the top left corner of the window.
 * @author Sam
 *
 */
public class Square extends ClosedShape{
	private int side;
	//the length of the square's sides
	/**
	 * Creates a square.
	 * @param x The display component's x position.
	 * @param y The display component's y position.
	 * @param vx The display component's x velocity.
	 * @param vy The display component's y velocity.
	 * @param side the length of the squares sides.
	 * @param colour The line colour or fill colour.
	 * @param isFilled True if the square is filled with colour, false if not filled in.
	 */
	public Square (int insertionTime, int x, int y, int vx, int vy, int side, Color colour, boolean isFilled,boolean pulses) {
		super (insertionTime, x, y, vx, vy, colour, isFilled, pulses);
		this.side = side;
	    
    }
	@Override
	/**
	 * increments the side by 1
	 */
	public void grow() {
		side +=1;
	}
	 @Override
	/** 
	 * decrements the side by 1
	 */
	 public void shrink() {
		side -=1;
	 }
	 @Override  
	 /**
     * Method to convert a square to a string.
     */
	 public String toString () {
		 String result = "This is a square \n";
		 result += super.toString ();
		 result += "Its side is " + this.side + "\n";
		 return result;
	    }  
	 /**
     * @param Resets the side.
     */
	 public void setSide (int side) {
		 this.side = side;
	 }   
	 /**
	  * @return The side of the square.
	  */
	 public int getSide() {
		 return side;
	 }
	 @Override
	 /**
	  * @return The width of the square.
	  */
	 public int getWidth() {
		 return side;
	 }
	 @Override
	 /**
	  * @return The height of the square.
	  */
	 public int getHeight() {
		 return side;
	 }	
	    
	 /**
	  * Draws the square in the window.
	  * @param g The graphics object of the scene component.
	  */
	 @Override
	 public void draw (GraphicsContext g) {
		 g.setFill( colour );
		 g.setStroke( colour );
		 //draws filled or empty/transparent shape
		 if (isFilled) {
			 g.fillRect(x, y, side, side);
		 }	 
		 else {
			 g.strokeRect(x, y, side, side);
		 }
	 }	
}