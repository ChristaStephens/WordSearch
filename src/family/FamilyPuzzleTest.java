package family;

import static org.junit.Assert.*;

import org.junit.Test;

public class FamilyPuzzleTest {
	//test cases
	//what test do we need first? -building a board, create the space/grid

	//for failures
//	@Test(expected=IndexOutOfBoundsException.class)
//	public void WhenMellieLooksHorizontallySheReturnXY() {
//		FamilyPuzzle horizontal =new FamilyPuzzle();
//		//I'm expecting the coordinates 1,6, want to get the class of xy
//		assertEquals("1,6", horizontal.getClass());
	
	@Test
	public void testMultiplication() {
		Dollar five= new Dollar(5);
		
		//.times 2 is a method for multiplication
		five.times(2);
		//could use just equals if we know what the sum will be.
		//assert equals gives -> (expected, actual)
		assertEquals(10, five.amount);
		}
		
	
	
}
