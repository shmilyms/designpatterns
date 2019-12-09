package cn.shmilyms.designpatterns.composite;

public abstract class CompanyBranch implements IBranch {
	protected String name;
	
	public String getName() {
		return name;
	}
	
	@Override
	public void display(int depth) {
		
		StringBuilder line = new StringBuilder();
		for (int i=0;i<depth;i++) {
			line.append("-");
		}
		line.append(this.getName());
		System.out.println(line.toString());
	}
}
