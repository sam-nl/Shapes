import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.testfx.framework.junit.ApplicationTest;

import javafx.scene.control.Button;
import javafx.scene.control.Labeled;
import javafx.stage.Stage;

public class CheckClicks extends ApplicationTest{

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
    public void testClick1() throws InterruptedException {
    	Thread.sleep(500);
    	int x = 0;
        int y = 0;
        game.displaySquare(x, y);
        clickOn("#button0");
        Thread.sleep(500);
        assertEquals(x, game.getLastClickedSquareX());
        assertEquals(y, game.getLastClickedSquareY());
    }
	
	/**
	 * Test case for square 2
	 * @throws InterruptedException
	 */
	@Test
    public void testClick2() throws InterruptedException {
    	Thread.sleep(500);
    	int x = 1;
        int y = 0;
        game.displaySquare(x, y);
        clickOn("#button1");
        Thread.sleep(500);
        assertEquals(x, game.getLastClickedSquareX());
        assertEquals(y, game.getLastClickedSquareY());
    }
	
	/**
	 * Test case for square 3
	 * @throws InterruptedException
	 */
	@Test
    public void testClick3() throws InterruptedException {
    	Thread.sleep(500);
    	int x = 2;
        int y = 0;
        game.displaySquare(x, y);
        clickOn("#button2");
        Thread.sleep(500);
        assertEquals(x, game.getLastClickedSquareX());
        assertEquals(y, game.getLastClickedSquareY());
    }
	
	/**
	 * Test case for square 4
	 * @throws InterruptedException
	 */
	@Test
    public void testClick4() throws InterruptedException {
    	Thread.sleep(500);
    	int x = 3;
        int y = 0;
        game.displaySquare(x, y);
        clickOn("#button3");
        Thread.sleep(500);
        assertEquals(x, game.getLastClickedSquareX());
        assertEquals(y, game.getLastClickedSquareY());
    }
	/**
	 * Test case for square 5
	 * @throws InterruptedException
	 */
	@Test
    public void testClick5() throws InterruptedException {
    	Thread.sleep(500);
    	int x = 0;
        int y = 1;
        game.displaySquare(x, y);
        clickOn("#button4");
        Thread.sleep(500);
        assertEquals(x, game.getLastClickedSquareX());
        assertEquals(y, game.getLastClickedSquareY());
    }
	/**
	 * Test case for square 6
	 * @throws InterruptedException
	 */
	@Test
    public void testClick6() throws InterruptedException {
    	Thread.sleep(500);
    	int x = 1;
        int y = 1;
        game.displaySquare(x, y);
        clickOn("#button5");
        Thread.sleep(500);
        assertEquals(x, game.getLastClickedSquareX());
        assertEquals(y, game.getLastClickedSquareY());
    }
	
	/**
	 * Test case for square 7
	 * @throws InterruptedException
	 */
	@Test
    public void testClick7() throws InterruptedException {
    	Thread.sleep(500);
    	int x = 2;
        int y = 1;
        game.displaySquare(x, y);
        clickOn("#button6");
        Thread.sleep(500);
        assertEquals(x, game.getLastClickedSquareX());
        assertEquals(y, game.getLastClickedSquareY());
    }
	
	/**
	 * Test case for square 8
	 * @throws InterruptedException
	 */
	@Test
    public void testClick8() throws InterruptedException {
    	Thread.sleep(500);
    	int x = 3;
        int y = 1;
        game.displaySquare(x, y);
        clickOn("#button7");
        Thread.sleep(500);
        assertEquals(x, game.getLastClickedSquareX());
        assertEquals(y, game.getLastClickedSquareY());
    }
	
	/**
	 * Test case for square 9
	 * @throws InterruptedException
	 */
	@Test
    public void testClick9() throws InterruptedException {
    	Thread.sleep(500);
    	int x = 0;
        int y = 2;
        game.displaySquare(x, y);
        clickOn("#button8");
        Thread.sleep(500);
        assertEquals(x, game.getLastClickedSquareX());
        assertEquals(y, game.getLastClickedSquareY());
    }
	
	/**
	 * Test case for square 10
	 * @throws InterruptedException
	 */
	@Test
    public void testClick10() throws InterruptedException {
    	Thread.sleep(500);
    	int x = 1;
        int y = 2;
        game.displaySquare(x, y);
        clickOn("#button9");
        Thread.sleep(500);
        assertEquals(x, game.getLastClickedSquareX());
        assertEquals(y, game.getLastClickedSquareY());
    }
	
	/**
	 * Test case for square 11
	 * @throws InterruptedException
	 */
	@Test
    public void testClick11() throws InterruptedException {
    	Thread.sleep(500);
    	int x = 2;
        int y = 2;
        game.displaySquare(x, y);
        clickOn("#button10");
        Thread.sleep(500);
        assertEquals(x, game.getLastClickedSquareX());
        assertEquals(y, game.getLastClickedSquareY());
    }
	
	/**
	 * Test case for square 12
	 * @throws InterruptedException
	 */
	@Test
    public void testClick12() throws InterruptedException {
    	Thread.sleep(500);
    	int x = 3;
        int y = 2;
        game.displaySquare(x, y);
        clickOn("#button11");
        Thread.sleep(500);
        assertEquals(x, game.getLastClickedSquareX());
        assertEquals(y, game.getLastClickedSquareY());
    }
	
	/**
	 * Test case for square 13
	 * @throws InterruptedException
	 */
	@Test
    public void testClick13() throws InterruptedException {
    	Thread.sleep(500);
    	int x = 0;
        int y = 3;
        game.displaySquare(x, y);
        clickOn("#button12");
        Thread.sleep(500);
        assertEquals(x, game.getLastClickedSquareX());
        assertEquals(y, game.getLastClickedSquareY());
    }
	
	/**
	 * Test case for square 14
	 * @throws InterruptedException
	 */
	@Test
    public void testClick14() throws InterruptedException {
    	Thread.sleep(500);
    	int x = 1;
        int y = 3;
        game.displaySquare(x, y);
        clickOn("#button13");
        Thread.sleep(500);
        assertEquals(x, game.getLastClickedSquareX());
        assertEquals(y, game.getLastClickedSquareY());
    }
	
	
	/**
	 * Test case for square 15
	 * @throws InterruptedException
	 */
	@Test
    public void testClick15() throws InterruptedException {
    	Thread.sleep(500);
    	int x = 2;
        int y = 3;
        game.displaySquare(x, y);
        clickOn("#button14");
        Thread.sleep(500);
        assertEquals(x, game.getLastClickedSquareX());
        assertEquals(y, game.getLastClickedSquareY());
    }
	
	/**
	 * Test case for square 16
	 * @throws InterruptedException
	 */
	@Test
    public void testClick16() throws InterruptedException {
    	Thread.sleep(500);
    	int x = 3;
        int y = 3;
        game.displaySquare(x, y);
        clickOn("#button15");
        Thread.sleep(500);
        assertEquals(x, game.getLastClickedSquareX());
        assertEquals(y, game.getLastClickedSquareY());
    }
	
	
	
	
}
