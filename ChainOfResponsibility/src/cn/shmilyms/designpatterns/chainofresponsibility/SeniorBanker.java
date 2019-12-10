package cn.shmilyms.designpatterns.chainofresponsibility;

public class SeniorBanker extends ApplicationHandler {

	@Override
	public void handle(LoanApplication application) {
		// TODO Auto-generated method stub
		if (application.getAmount()<=2000) {
			approve(application);
		} 
		else
			if (this.getSuccessor()!=null)
				this.getSuccessor().handle(application);
	}

}
