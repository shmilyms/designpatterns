package cn.shmilyms.designpatterns.facade.components;

public class ProjectManager {
	private FrontEndEngineer fe = new FrontEndEngineer();
	private BackEndEngineer be = new BackEndEngineer();
	private Accountant ac = new Accountant();
	private TestEngineer te = new TestEngineer();
	
	public void work() {
		fe.workFrontEnd();
		be.workBackEnd();
		ac.workFinance();
		te.workTest();
		System.out.println("PM working.");
	}
}
