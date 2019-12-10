package cn.shmilyms.designpatterns.chainofresponsibility;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationHandler ab = new AssociateBanker();
		ApplicationHandler sb = new SeniorBanker();
		ApplicationHandler ld = new LoanDirector();
		ApplicationHandler b = new Boss();
		
		ab.setSuccessor(sb);
		sb.setSuccessor(ld);
		ld.setSuccessor(b);
		
		ab.handle(new LoanApplication("Mr. a",11));
		ab.handle(new LoanApplication("Mr. b",101));
		ab.handle(new LoanApplication("Mr. c",1001));
		ab.handle(new LoanApplication("Mr. d",10001));
		ab.handle(new LoanApplication("Mr. e",100001));
		ab.handle(new LoanApplication("Mr. f",1000001));
		ab.handle(new LoanApplication("Mr. g",10000001));
		
	}

}
