package strategyexample.test;

import junit.framework.TestCase;
import strategyexample.Multiplication;
import strategyexample.Operation;

public class MultiplicationTest extends TestCase{

	public void testIf3Multiply3Equal9(){
		double expected = 9;
		
		Operation operation = new Multiplication();
		double result = operation.calculate(3 ,  3);
		
		assertEquals(expected, result);
	}
	
	public void testIf2Multiply2Equal9(){
		double expected = 4;
		
		Operation operation = new Multiplication();
		double result = operation.calculate(2 ,  2);
		
		assertEquals(expected, result);
	}
	
}
