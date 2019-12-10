package cn.shmilyms.designpatterns.chainofresponsibility;

public class Boss extends ApplicationHandler {

	@Override
	public void handle(LoanApplication application) {
		// TODO Auto-generated method stub
		if (application.getAmount()<=1000000) {
			approve(application);
		} 
		else
			System.out.println("Boss: not enough funds...");
	}

}
