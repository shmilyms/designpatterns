package cn.shmilyms.designpatterns.chainofresponsibility;

public class LoanDirector extends ApplicationHandler {

	@Override
	public void handle(LoanApplication application) {
		// TODO Auto-generated method stub
		if (application.getAmount()<=50000) {
			approve(application);
		} 
		else
			if (this.getSuccessor()!=null)
				this.getSuccessor().handle(application);
	}

}
