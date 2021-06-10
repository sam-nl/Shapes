import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
/**
 * This class represents the arc shape. 
 * It is positioned in relation to the top left corner of the window.
 * There are three different types of arc that look different.
 * @author Sam
 *
 */
public class Arc extends ClosedShape{
	private int length;
	//length of the arc.
	private int width;
	//width of the arc.
	private int startAngle;
	//where the angle starts
	private int arcExtent;
	//where the angle ends(extent of the angle)
	private int closure;
	//the arc's closure(the type of arc)
	/**
	 * Creates an arc.
	 * @param x The display component's x position.
	 * @param y The display component's y position.
	 * @param vx The display component's x velocity.
	 * @param vy The display component's y velocity.
	 * @param width of the arc.
	 * @param length of the arc.
	 * @param colour The line colour or fill colour.
	 * @param isFilled True if the square is filled with colour, false if not filled in.
	 * @param startAngle The point where the arc angle starts in degrees.
	 * @param arcExtent	The point where the angle ends in degrees.
	 * @param closure The type of the arc stored as int, 1 = chord 2 = open 3 = round, changes the appearance of the angle
	 * @param pulses True if the shape pulses(shrinks and grows), false if it remains constant size
	 */
	public Arc (int insertionTime, int x, int y, int vx, int vy, int width, int length, Color colour, boolean isFilled,int startAngle, int arcExtent, int closure,boolean pulses) {
    	super (insertionTime, x, y, vx, vy, colour, isFilled,pulses);
    	this.length = length;
    	this.width = width;
    	this.startAngle = startAngle;
    	this.arcExtent = arcExtent;
    	this.closure = closure;
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
	 * Method to convert an arc to a string.
	 */
	public String toString () {
		String result = "This is an Arc \n";
		result += super.toString ();
		result += "Its width is " + this.width + "\n";
		result += "Its length is " + this.length + "\n";
		result += "Its start angle is " + this.startAngle + "\n";
		result += "Its arc extent is " + this.arcExtent + "\n";
		result += "Its closure is " + this.closure + "\n";	
		return result;
	}
	/**
	 * Sets the width of the arc.
	 * @param width
	 */
	public void setWidth (int width) {
		this.width = width;
	}
	/**
	 * Sets the length of the arc.
	 * @param length
	 */
	public void setLength (int length) {
		this.length = length;
	}
	@Override
	/**
     * @return The width of the arc.
     */
	public int getWidth() {
		return width;
	}
	@Override
	/**
	 * @return The height of the arc.
	 */
	public int getHeight() {
		return length;
	}
	@Override
	/**
	 * Draws the arc in the window.
	 * The arc can either be of closure (the type of arc) chord, open or round.
	 * The type depends on this.closure. 1= chord 2= open 3= round.
	 * @param g The graphics object of the scene component.
	 */
	public void draw (GraphicsContext g) {
		g.setFill(this.colour);
		g.setStroke(this.colour);
		//draws filled shape, can either be chord, open or round
		if (isFilled) {
			if (closure == 1){
				g.fillArc(x, y, width, length, startAngle, arcExtent, ArcType.CHORD);
			}
			else if (closure == 2){
				g.fillArc(x, y, width, length, startAngle, arcExtent, ArcType.OPEN);
			}
			else if (closure == 3){
				g.fillArc(x, y, width, length, startAngle, arcExtent, ArcType.ROUND);
			}
	    } 
		//draws empty/transparent shape can either be chord open or round
		else {
			if (closure == 1){
				g.strokeArc(x, y, width, length, startAngle, arcExtent, ArcType.CHORD);
			}
			else if (closure == 2){
				g.strokeArc(x, y, width, length, startAngle, arcExtent, ArcType.OPEN);
			}
			else if (closure == 3){
				g.strokeArc(x, y, width, length, startAngle, arcExtent, ArcType.ROUND);
			}	
		}
	}
}