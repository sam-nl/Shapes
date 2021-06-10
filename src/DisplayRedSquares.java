import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.testfx.framework.junit.ApplicationTest;

import javafx.scene.control.Button;
import javafx.scene.control.Labeled;
import javafx.stage.Stage;


public class DisplayRedSquare extends ApplicationTest{

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
    public void testSquare1() throws InterruptedException {
		Thread.sleep(500);
    	int x = 0;
        int y = 0;
        game.displaySquare(x, y);
        Thread.sleep(500);
        assertEquals(x, game.getDisplayedSquareX());
        assertEquals(y, game.getDisplayedSquareY());
    }
	
	/**
	 * Test case for square 2
	 * @throws InterruptedException
	 */
	@Test
    public void testSquare2() throws InterruptedException {
		Thread.sleep(500);
    	int x = 1;
        int y = 0;
        game.displaySquare(x, y);
        Thread.sleep(500);
        assertEquals(x, game.getDisplayedSquareX());
        assertEquals(y, game.getDisplayedSquareY());
    }
	
	/**
	 * Test case for square 3
	 * @throws InterruptedException
	 */
	@Test
    public void testSquare3() throws InterruptedException {
		Thread.sleep(500);
    	int x = 2;
        int y = 0;
        game.displaySquare(x, y);
        Thread.sleep(500);
        assertEquals(x, game.getDisplayedSquareX());
        assertEquals(y, game.getDisplayedSquareY());
    }
	
	/**
	 * Test case for square 4
	 * @throws InterruptedException
	 */
	@Test
    public void testSquare4() throws InterruptedException {
		Thread.sleep(500);
    	int x = 3;
        int y = 0;
        game.displaySquare(x, y);
        Thread.sleep(500);
        assertEquals(x, game.getDisplayedSquareX());
        assertEquals(y, game.getDisplayedSquareY());
    }
	/**
	 * Test case for square 5
	 * @throws InterruptedException
	 */
	@Test
    public void testSquare5() throws InterruptedException {
		Thread.sleep(500);
    	int x = 0;
        int y = 1;
        game.displaySquare(x, y);
        Thread.sleep(500);
        assertEquals(x, game.getDisplayedSquareX());
        assertEquals(y, game.getDisplayedSquareY());
    }
	/**
	 * Test case for square 6
	 * @throws InterruptedException
	 */
	@Test
    public void testSquare6() throws InterruptedException {
		Thread.sleep(500);
    	int x = 1;
        int y = 1;
        game.displaySquare(x, y);
        Thread.sleep(500);
        assertEquals(x, game.getDisplayedSquareX());
        assertEquals(y, game.getDisplayedSquareY());
    }
	
	/**
	 * Test case for square 7
	 * @throws InterruptedException
	 */
	@Test
    public void testSquare7() throws InterruptedException {
		Thread.sleep(500);
    	int x = 2;
        int y = 1;
        game.displaySquare(x, y);
        Thread.sleep(500);
        assertEquals(x, game.getDisplayedSquareX());
        assertEquals(y, game.getDisplayedSquareY());
    }
	
	/**
	 * Test case for square 8
	 * @throws InterruptedException
	 */
	@Test
    public void testSquare8() throws InterruptedException {
		Thread.sleep(500);
    	int x = 3;
        int y = 1;
        game.displaySquare(x, y);
        Thread.sleep(500);
        assertEquals(x, game.getDisplayedSquareX());
        assertEquals(y, game.getDisplayedSquareY());
    }
	
	/**
	 * Test case for square 9
	 * @throws InterruptedException
	 */
	@Test
    public void testSquare9() throws InterruptedException {
		Thread.sleep(500);
    	int x = 0;
        int y = 2;
        game.displaySquare(x, y);
        Thread.sleep(500);
        assertEquals(x, game.getDisplayedSquareX());
        assertEquals(y, game.getDisplayedSquareY());
    }
	
	/**
	 * Test case for square 10
	 * @throws InterruptedException
	 */
	@Test
    public void testSquare10() throws InterruptedException {
		Thread.sleep(500);
    	int x = 1;
        int y = 2;
        game.displaySquare(x, y);
        Thread.sleep(500);
        assertEquals(x, game.getDisplayedSquareX());
        assertEquals(y, game.getDisplayedSquareY());
    }
	
	/**
	 * Test case for square 11
	 * @throws InterruptedException
	 */
	@Test
    public void testSquare11() throws InterruptedException {
		Thread.sleep(500);
    	int x = 2;
        int y = 2;
        game.displaySquare(x, y);
        Thread.sleep(500);
        assertEquals(x, game.getDisplayedSquareX());
        assertEquals(y, game.getDisplayedSquareY());
    }
	
	/**
	 * Test case for square 12
	 * @throws InterruptedException
	 */
	@Test
    public void testSquare12() throws InterruptedException {
		Thread.sleep(500);
    	int x = 3;
        int y = 2;
        game.displaySquare(x, y);
        Thread.sleep(500);
        assertEquals(x, game.getDisplayedSquareX());
        assertEquals(y, game.getDisplayedSquareY());
    }
	
	/**
	 * Test case for square 13
	 * @throws InterruptedException
	 */
	@Test
    public void testSquare13() throws InterruptedException {
		Thread.sleep(500);
    	int x = 0;
        int y = 3;
        game.displaySquare(x, y);
        Thread.sleep(500);
        assertEquals(x, game.getDisplayedSquareX());
        assertEquals(y, game.getDisplayedSquareY());
    }
	
	/**
	 * Test case for square 14
	 * @throws InterruptedException
	 */
	@Test
    public void testSquare14() throws InterruptedException {
		Thread.sleep(500);
    	int x = 1;
        int y = 3;
        game.displaySquare(x, y);
        Thread.sleep(500);
        assertEquals(x, game.getDisplayedSquareX());
        assertEquals(y, game.getDisplayedSquareY());
    }
	
	
	/**
	 * Test case for square 15
	 * @throws InterruptedException
	 */
	@Test
    public void testSquare15() throws InterruptedException {
		Thread.sleep(500);
    	int x = 2;
        int y = 3;
        game.displaySquare(x, y);
        Thread.sleep(500);
        assertEquals(x, game.getDisplayedSquareX());
        assertEquals(y, game.getDisplayedSquareY());
    }
	
	/**
	 * Test case for square 16
	 * @throws InterruptedException
	 */
	@Test
    public void testSquare16() throws InterruptedException {
		Thread.sleep(500);
    	int x = 3;
        int y = 3;
        game.displaySquare(x, y);
        Thread.sleep(500);
        assertEquals(x, game.getDisplayedSquareX());
        assertEquals(y, game.getDisplayedSquareY());
    }
}

