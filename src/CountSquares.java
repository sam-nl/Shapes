import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.testfx.framework.junit.ApplicationTest;

import javafx.scene.control.Button;
import javafx.scene.control.Labeled;
import javafx.stage.Stage;


public class CountSquares extends ApplicationTest {

	// Holds the  current running game.
	private GameApplication game;
	
	/**
	 * This is called each time a test is run to start the game up.
	 * You need this exact method in every test suite.
	 */
	public void start(Stage stage) throws Exception {
		// Create the JavaFX application by instantiating it and
		// manually calling the JavaFX start method.
		game = new GameApplication();
		game.start(stage);
		stage.toFront();
	}

	/**
	 * Test case for square 1
	 * @throws InterruptedException
	 */
	@Test
    public void testCount1() throws InterruptedException {
		Thread.sleep(500);
		int x = 0;
        int y = 0;
        game.displaySquare(x, y);
        Thread.sleep(500);
        assertEquals(1, getNumberReds());
    }
	
	/**
	 * Test case for square 2
	 * @throws InterruptedException
	 */
	@Test
    public void testCount2() throws InterruptedException {
		Thread.sleep(500);
		int x = 1;
        int y = 0;
        game.displaySquare(x, y);
        Thread.sleep(500);
        assertEquals(1, getNumberReds());
    }
	
	/**
	 * Test case for square 3
	 * @throws InterruptedException
	 */
	@Test
    public void testCount3() throws InterruptedException {
		Thread.sleep(500);
		int x = 2;
        int y = 0;
        game.displaySquare(x, y);
        Thread.sleep(500);
        assertEquals(1, getNumberReds());
    }
	
	/**
	 * Test case for square 4
	 * @throws InterruptedException
	 */
	@Test
    public void testCount4() throws InterruptedException {
		Thread.sleep(500);
		int x = 3;
        int y = 0;
        game.displaySquare(x, y);
        Thread.sleep(500);
        assertEquals(1, getNumberReds());
    }
	/**
	 * Test case for square 5
	 * @throws InterruptedException
	 */
	@Test
    public void testCount5() throws InterruptedException {
		Thread.sleep(500);
		int x = 0;
        int y = 1;
        game.displaySquare(x, y);
        Thread.sleep(500);
        assertEquals(1, getNumberReds());
    }
	/**
	 * Test case for square 6
	 * @throws InterruptedException
	 */
	@Test
    public void testCount6() throws InterruptedException {
		Thread.sleep(500);
		int x = 1;
        int y = 1;
        game.displaySquare(x, y);
        Thread.sleep(500);
        assertEquals(1, getNumberReds());
    }
	
	/**
	 * Test case for square 7
	 * @throws InterruptedException
	 */
	@Test
    public void testCount7() throws InterruptedException {
		Thread.sleep(500);
		int x = 2;
        int y = 1;
        game.displaySquare(x, y);
        Thread.sleep(500);
        assertEquals(1, getNumberReds());
    }
	
	/**
	 * Test case for square 8
	 * @throws InterruptedException
	 */
	@Test
    public void testCount8() throws InterruptedException {
		Thread.sleep(500);
		int x = 3;
        int y = 1;
        game.displaySquare(x, y);
        Thread.sleep(500);
        assertEquals(1, getNumberReds());
    }
	
	/**
	 * Test case for square 9
	 * @throws InterruptedException
	 */
	@Test
    public void testCount9() throws InterruptedException {
		Thread.sleep(500);
		int x = 0;
        int y = 2;
        game.displaySquare(x, y);
        Thread.sleep(500);
        assertEquals(1, getNumberReds());
    }
	
	/**
	 * Test case for square 10
	 * @throws InterruptedException
	 */
	@Test
    public void testCount10() throws InterruptedException {
		Thread.sleep(500);
		int x = 1;
        int y = 2;
        game.displaySquare(x, y);
        Thread.sleep(500);
        assertEquals(1, getNumberReds());
    }
	
	/**
	 * Test case for square 11
	 * @throws InterruptedException
	 */
	@Test
    public void testCount11() throws InterruptedException {
		Thread.sleep(500);
		int x = 2;
        int y = 2;
        game.displaySquare(x, y);
        Thread.sleep(500);
        assertEquals(1, getNumberReds());
    }
	
	/**
	 * Test case for square 12
	 * @throws InterruptedException
	 */
	@Test
    public void testCount12() throws InterruptedException {
		Thread.sleep(500);
		int x = 3;
        int y = 2;
        game.displaySquare(x, y);
        Thread.sleep(500);
        assertEquals(1, getNumberReds());
    }
	
	/**
	 * Test case for square 13
	 * @throws InterruptedException
	 */
	@Test
    public void testCount13() throws InterruptedException {
		Thread.sleep(500);
		int x = 0;
        int y = 3;
        game.displaySquare(x, y);
        Thread.sleep(500);
        assertEquals(1, getNumberReds());
    }
	
	/**
	 * Test case for square 14
	 * @throws InterruptedException
	 */
	@Test
    public void testCount14() throws InterruptedException {
		Thread.sleep(500);
		int x = 1;
        int y = 3;
        game.displaySquare(x, y);
        Thread.sleep(500);
        assertEquals(1, getNumberReds());
    }
	
	
	/**
	 * Test case for square 15
	 * @throws InterruptedException
	 */
	@Test
    public void testCount15() throws InterruptedException {
		Thread.sleep(500);
		int x = 2;
        int y = 3;
        game.displaySquare(x, y);
        Thread.sleep(500);
        assertEquals(1, getNumberReds());
    }
	
	/**
	 * Test case for square 16
	 * @throws InterruptedException
	 */
	@Test
    public void testCount16() throws InterruptedException {
		Thread.sleep(500);
		int x = 3;
        int y = 3;
        game.displaySquare(x, y);
        Thread.sleep(500);
        assertEquals(1, getNumberReds());
    }
	
	
	
	
	/**
	 * This is a utility method that can be used to find out
	 * the number of squares that are red.
	 * @return The number of red squares.
	 */
	public int getNumberReds() {
	
		int numberOfReds = 0;

		for (int i = 0; i < GameApplication.GRID_SIZE * GameApplication.GRID_SIZE; i++) {
			Button b = lookup("#button" + i).queryButton();

			if(b.getStyle().equals(GameApplication.BUTTON_STYLE_RED)) {
				numberOfReds++;
			}
		}
	
		return numberOfReds;
	}
	
	/**
	 * Access the result label's text in the game.
	 * @return The actual text being displayed as the result.
	 */
	public String observeDisplay() {
        Labeled display = lookup("#resultBox").queryLabeled();
        return display.getText();
    }
}