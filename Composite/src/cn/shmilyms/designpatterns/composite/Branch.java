package cn.shmilyms.designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Branch extends CompanyBranch implements IBranch {
	List<IBranch> branches;
	
	public Branch(String name){
		this.branches = new ArrayList<>();
		this.name = name;
	}
	@Override
	public void add(IBranch branch) {
		// TODO Auto-generated method stub
		this.branches.add(branch);
	}

	@Override
	public void remove(IBranch branch) {
		// TODO Auto-generated method stub
		this.branches.remove(branch);
	}
	
	@Override
	public void display(int depth) {
		super.display(depth);
		for (IBranch branch : branches)
			branch.display(depth+1);
		
	}
}
