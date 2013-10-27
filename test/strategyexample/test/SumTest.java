package strategyexample.test;

import strategyexample.Operation;
import strategyexample.Sum;
import junit.framework.TestCase;

public class SumTest extends TestCase {

	
	public void testIf2Sum2Equal4(){
		double expected = 4;
		
		Operation operation = new Sum();
		double result = operation.calculate(2 ,  2);
		
		assertEquals(expected, result);
	}
	
	public void testIf2Sum3Equal5(){
		double expected = 5;
		
		Operation operation = new Sum();
		double result = operation.calculate(2 ,  3);
		
		assertEquals(expected, result);
	}
	
}
