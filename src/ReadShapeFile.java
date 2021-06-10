/**
 *  @author Sam
 */
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
/**
 * This class reads a shape file.  For the format of this shape file, see the assignment description.
 * Also, please see the shape files ExampleShapes.txt, ExampleShapesStill.txt, and TwoRedCircles.txt.
 * 
 * The format is extended for an arc for step 4.
 * Arc format: arc(name) px py vx vy filled width height r g b inserttime startangle extent closure(int)
 * 
 * The format is also extended for step 5 as pulses is required.
 * The adds pulses to the end of every line in the file (true or false).
 */
public class ReadShapeFile {
	
	public static Circle readCircle(ArrayList<String> data) {
		//see closed shape constructor for pulses and is filled
		boolean pulses;
		boolean isFilled;
		Color colour = Color.rgb(Integer.parseInt(data.get(7)), Integer.parseInt(data.get(8)), Integer.parseInt(data.get(9)));
		//sets isFilled
		if (data.get(5).equals("true")){
			isFilled = true;
		}else {
			isFilled = false;
		}
		//sets pulses
		if (data.get(11).equals("true")){
			pulses = true;
		}else {
			pulses = false;
		}
		//creates and returns a Circle, see Circle constructor for details
		return new Circle(Integer.parseInt(data.get(10)), 
				Integer.parseInt(data.get(1)), 
				Integer.parseInt(data.get(2)),
				Integer.parseInt(data.get(3)),
				Integer.parseInt(data.get(4)),
				Integer.parseInt(data.get(6)),
				colour, isFilled, pulses);
	}
	/**
	 * This class transforms an arraylist into an Oval object and returns it	
	 * @param data An arraylist of strings on the oval's line in order of occurrence.
	 * @return Oval returns an Oval
	 */
	public static Oval readOval(ArrayList<String> data) {
		//see closed shape constructor for pulses and is filled
		boolean isFilled;
		boolean pulses;
		Color colour = Color.rgb(Integer.parseInt(data.get(8)), Integer.parseInt(data.get(9)), Integer.parseInt(data.get(10)));
		//sets isFilled
		if (data.get(5).equals("true")){
			isFilled = true;
		}else {
			isFilled = false;
		}
		//sets pulses
		if (data.get(12).equals("true")){
			pulses = true;
		}else {
			pulses = false;
		}
		//creates and returns an Oval, see Oval constructor for details
		return new Oval(Integer.parseInt(data.get(11)), 
						Integer.parseInt(data.get(1)), 
						Integer.parseInt(data.get(2)),
						Integer.parseInt(data.get(3)),
						Integer.parseInt(data.get(4)),
						Integer.parseInt(data.get(6)),
						Integer.parseInt(data.get(7)),
						colour, isFilled,pulses);	
	}
	/**
	 * This class transforms an arraylist into an Square object and returns it	
	 * @param data An arraylist of strings on the oval's line in order of occurrence.
	 * @return Square returns a Square
	 */
	public static Square readSquare(ArrayList<String> data) {
		//see closed shape constructor for pulses and is filled
		boolean pulses;
		boolean isFilled;
		Color colour = Color.rgb(Integer.parseInt(data.get(7)), Integer.parseInt(data.get(8)), Integer.parseInt(data.get(9)));
		//sets isFilled
		if (data.get(5).equals("true")){
			isFilled = true;
		}else {
			isFilled = false;
		}
		//sets pulses
		if (data.get(11).equals("true")){
			pulses = true;
		}else {
			pulses = false;
		}
		//creates and returns a Square, see Square constructor for details
		return new Square(Integer.parseInt(data.get(10)), 
						Integer.parseInt(data.get(1)), 
						Integer.parseInt(data.get(2)),
						Integer.parseInt(data.get(3)),
						Integer.parseInt(data.get(4)),
						Integer.parseInt(data.get(6)),
						colour, isFilled,pulses);
	}
	/**
	 * This class transforms an arraylist into an Rect object and returns it.	
	 * @param data An arraylist of strings on the rectangle's line in order of occurrence.
	 * @return Rect returns a Rect.
	 */
	public static Rect readRect(ArrayList<String> data) {
		//see closed shape constructor for pulses and is filled
		boolean pulses;
		boolean isFilled;
		Color colour = Color.rgb(Integer.parseInt(data.get(8)), Integer.parseInt(data.get(9)), Integer.parseInt(data.get(10)));
		//sets isFilled
		if (data.get(5).equals("true")){
			isFilled = true;
		}else {
			isFilled = false;
		}
		//sets pulses
		if (data.get(12).equals("true")){
			pulses = true;
		}else {
			pulses = false;
		}
		//creates and returns a Rect, see Rect constructor for details
		return new Rect(Integer.parseInt(data.get(11)), 
			Integer.parseInt(data.get(1)), 
			Integer.parseInt(data.get(2)),
			Integer.parseInt(data.get(3)),
			Integer.parseInt(data.get(4)),
			Integer.parseInt(data.get(6)),
			Integer.parseInt(data.get(7)),
			colour, isFilled,pulses);
			
	}
	/**
	 * This class transforms an arraylist into an Arc object and returns it.	
	 * @param data An arraylist of strings on the arc's line in order of occurrence.
	 * @return Arc returns an Arc.
	 */
public static Arc readArc(ArrayList<String> data) {
	//see closed shape constructor for pulses and is filled
	boolean isFilled;
	boolean pulses;
		
		
	Color colour = Color.rgb(Integer.parseInt(data.get(8)), Integer.parseInt(data.get(9)), Integer.parseInt(data.get(10)));
	//sets isFilled
	if (data.get(5).equals("true")){
		isFilled = true;
	}else {
		isFilled = false;
	}
	//sets pulses
	if (data.get(15).equals("true")){
		pulses = true;
	}else {
		pulses = false;
	}
	//creates and returns an Arc, see Arc constructor for details
	return new Arc(Integer.parseInt(data.get(11)), 
		Integer.parseInt(data.get(1)), 
		Integer.parseInt(data.get(2)),
		Integer.parseInt(data.get(3)),
		Integer.parseInt(data.get(4)),
		Integer.parseInt(data.get(6)),
		Integer.parseInt(data.get(7)),
		colour, isFilled,Integer.parseInt(data.get(12)),
		Integer.parseInt(data.get(13)),Integer.parseInt(data.get(14)),pulses);
			
	}
	
	/**
	 * Reads the data file used by the program and returns the constructed queue of closed shapes
	 * @param in the scanner of the file
	 * @return the queue represented by the data file
	 */
	private static Queue<ClosedShape> readDataFile(Scanner in) {
		//The queue of shapes in the file
		Queue<ClosedShape> shapeQueue = new Queue<ClosedShape>();
		//iterates through every line in the file
		while (in.hasNextLine()) {
			String word = "";
			//word is a series of characters or single character follow by a space or new line
			ArrayList<String> wordList = new ArrayList<String>();
			//arraylist of words on a line
			String currentLine = in.nextLine();
			int index = 0;
			//iterates through every character in the line starting at index 0
			while (index < currentLine.length()){
				if (currentLine.charAt(index) != ' '){
					word += currentLine.charAt(index);
				}
					index ++;
				//add the word to the wordList if the word is finished(the next character is space)
				if (index < currentLine.length() && currentLine.charAt(index) == ' ') {
					wordList.add(word);
					word = "";
				}
			}
			wordList.add(word);
			//gets the first word on a line and runs the corresponding read method adding it to the queue of shapes.
			if (wordList.get(0).equals("circle")){
				System.out.println(readCircle(wordList).toString());
				shapeQueue.enqueue(readCircle(wordList));
			}else if(wordList.get(0).equals("oval")){
				System.out.println(readOval(wordList).toString());
				shapeQueue.enqueue(readOval(wordList));
			}else if(wordList.get(0).equals("square")){
				System.out.println(readSquare(wordList).toString());
				shapeQueue.enqueue(readSquare(wordList));
			}else if(wordList.get(0).equals("rect")){
				System.out.println(readRect(wordList).toString());
				shapeQueue.enqueue(readRect(wordList));
			}else if(wordList.get(0).equals("arc")){
				System.out.println(readArc(wordList).toString());
				shapeQueue.enqueue(readArc(wordList));
			}
		}
		return shapeQueue;
	}

	/**
	 * Method to read the file and return a queue of shapes from this file. 
	 * 
	 * @param filename the name of the file (string)
	 * @return the queue of shapes from the file
	 * @throws FileNotFoundException 
	 */
	public static Queue<ClosedShape> readDataFile(String filename) {
		File file = new File(filename);
		Scanner in = null;
		try {
			in = new Scanner(file);
			return readDataFile(in);
		}
		catch (FileNotFoundException e) {
			System.out.println ("Cannot open "+ file);
			System.exit(0);
			return null;
		}
	    
	}
}
