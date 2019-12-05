package cn.shmilyms.designpatterns.simplefactory.operations;

public class OperationAdd extends AbstractOperation {

	@Override
	public double getResult() {
		// TODO Auto-generated method stub
		return super.getNumberA()+super.getNumberB();
	}

}
