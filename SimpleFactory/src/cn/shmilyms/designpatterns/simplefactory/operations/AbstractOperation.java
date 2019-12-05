package cn.shmilyms.designpatterns.simplefactory.operations;

public abstract class AbstractOperation {
	private double numberA;
	private double numberB;
	
	public abstract double getResult();

	public double getNumberA() {
		return numberA;
	}

	public void setNumberA(double numberA) {
		this.numberA = numberA;
	}

	public double getNumberB() {
		return numberB;
	}

	public void setNumberB(double numberB) {
		this.numberB = numberB;
	}
	
}
