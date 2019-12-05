package cn.shmilyms.designpatterns.simplefactory.operations;

public class OperationDiv extends AbstractOperation {

	@Override
	public double getResult() {
		// TODO Auto-generated method stub
		if (super.getNumberB()==0)
			throw(new IllegalArgumentException("div by 0"));
		return super.getNumberA()/super.getNumberB();
	}

}
