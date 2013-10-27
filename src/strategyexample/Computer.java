package strategyexample;

public class Computer {

	private double a;
	private double b;
	private Operation operation;
	
	public Computer(double a , double b , Operation operation) {
		this.a = a;
		this.b = b;
		this.operation = operation;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public Operation getOperation() {
		return operation;
	}

	public void setOperation(Operation operation) {
		this.operation = operation;
	}
	
	public double getResult(){
		return operation.calculate(getA(), getB());
	}
	
}
