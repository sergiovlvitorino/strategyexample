package strategyexample;

public class Sum implements Operation{

	@Override
	public double calculate(double a, double b) {
		return a + b;
	}

}