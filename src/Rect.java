import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
/**
 * This class represents the rectangle shape. 
 * It is positioned in relation to the top left corner of the window.
 * @author Sam
 *
 */
public class Rect extends ClosedShape{
	private int width;
	//the rectangle's width
	private int length;
	//the rectangle's length
	/**
	 * Creates a square.
	 * @param x The display component's x position.
	 * @param y The display component's y position.
	 * @param vx The display component's x velocity.
	 * @param vy The display component's y velocity.
	 * @param width of the rectangle.
	 * @param length of the rectangle
	 * @param colour The line colour or fill colour.
	 * @param isFilled True if the square is filled with colour, false if not filled in.
	 */
	public Rect (int insertionTime, int x, int y, int vx, int vy, int width,int length, Color colour, boolean isFilled,boolean pulses) {
	    	super (insertionTime, x, y, vx, vy, colour, isFilled,pulses);
	    	this.width = width;
	    	this.length = length;	    
	    }
	@Override
	/**
	 * increments the height and width by 1
	 */
	public void grow() {
		width += 1;
		length += 1;
	}
	@Override
	/**
	 * decrements the height and width by 1
	 */
	public void shrink() {
		width -= 1;
		length -= 1;
	}
	@Override
	/**
     * Method to convert a rectangle to a string.
     */
    public String toString () {
    	String result = "This is a rectangle \n";
    	result += super.toString ();
    	result += "Its width is " + this.width + "\n";
    	result += "Its length is " + this.length + "\n";
    	return result;
    }    
    /**
     * @param width sets the width.
     */
    public void setWidth (int width) {
    	this.width = width;
    } 
    /**
     * @param length sets the length.
     */
	public void setLength (int length) {
	    this.length = length;
	}
	@Override
	/**
	 * @return width The width of the rectangle.
	 */
	public int getWidth() {
		return width;
	}
	@Override
	 /**
	  * @return The height of the rectangle.
	  */
	public int getHeight() {
		return length;
	}
	
	@Override
	/**
	 * Draws the rectangle in the window.
	 * @param g The graphics object of the scene component.
	 */
	public void draw (GraphicsContext g) {
		g.setFill( colour );
		g.setStroke( colour );
		//draws filled or empty/transparent shape
		if (isFilled) {
			g.fillRect(x, y, width, length);
		} 
		else {
			g.strokeRect(x, y, width, length);
		}
	}
}