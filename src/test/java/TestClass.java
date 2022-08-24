import static org.junit.Assert.*;

import org.example.operations.Operations;
import org.junit.Test;

public class TestClass {
//
//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}
	private static final double DELTA = 1e-15;

	Operations obj = new Operations();//Object of the test class for which the test is designed
	
	//Test case for add method in the Operations class 
	@Test
	public void add() {
		assertEquals(25, obj.add(15,10),DELTA);
		System.out.println("Test case1 runs");
	}
	
	//Test case for subtract method in the Operations class
	@Test
	public void subtract() {
		assertEquals(5, obj.subtract(10, 5),DELTA);
		System.out.println("Test case2 runs");
	}
}
