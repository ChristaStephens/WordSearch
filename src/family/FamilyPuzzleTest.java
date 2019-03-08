package family;

import static org.junit.Assert.*;

import org.junit.Test;

public class FamilyPuzzleTest {
	//test cases

	//for failures
	@Test(expected=IndexOutOfBoundsException.class)
	public void WhenMellieLooksHorizontallySheReturnXY() {
		FamilyPuzzle horizontal =new FamilyPuzzle();
		//I'm expecting the coordinates 1,6, want to get the class of xy
		assertEquals("1,6", horizontal.getClass());
		
	}

	
}
