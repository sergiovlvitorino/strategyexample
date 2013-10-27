package strategyexample.test;

import junit.framework.TestCase;
import strategyexample.Computer;
import strategyexample.Multiplication;
import strategyexample.Sum;

public class ComputerTest extends TestCase {
	
	private Computer computer;
	
	@Override
	protected void tearDown() throws Exception {
		computer = null;
	}
	
	public void testIfResultIs4When2Sum2(){
		double expected = 4;
		
		computer = new Computer(2, 2, new Sum());
		double result = computer.getResult();
		
		assertEquals(expected, result);
	}
	
	public void testIfResultIs9When3Sum3(){
		double expected = 9;
		
		computer = new Computer(3, 3, new Multiplication());
		double result = computer.getResult();
		
		assertEquals(expected, result);
	}
	
}
