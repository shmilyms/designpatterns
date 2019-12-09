package cn.shmilyms.designpatterns.composite;

public class Leaf extends CompanyBranch implements IBranch {
	public Leaf(String name) {
		this.name = name;
	}
	@Override
	public void add(IBranch branch) {
		// TODO Auto-generated method stub
		System.out.println("Cannot add components to a leaf.");
	}

	@Override
	public void remove(IBranch branch) {
		// TODO Auto-generated method stub
		System.out.println("Cannot remove components from a leaf.");
	}

}
