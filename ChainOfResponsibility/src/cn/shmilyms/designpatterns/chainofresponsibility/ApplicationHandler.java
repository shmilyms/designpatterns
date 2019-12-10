package cn.shmilyms.designpatterns.chainofresponsibility;

public abstract class ApplicationHandler {
	private String name;
	
	private ApplicationHandler successor;

	public String getName() {
		return name;
	}
	
	public abstract void handle(LoanApplication application);
	
	protected void approve(LoanApplication application) {
		System.out.println(application.getAmount()+" worth loan granted to "+application.getName()+" by "+this.getClass().getSimpleName());
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public ApplicationHandler getSuccessor() {
		return successor;
	}

	public void setSuccessor(ApplicationHandler successor) {
		this.successor = successor;
	}
	
}
