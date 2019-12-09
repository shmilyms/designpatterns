package cn.shmilyms.designpatterns.composite;

public interface IBranch {
	void add(IBranch branch);
	void remove(IBranch branch);
	void display(int depth);
	
	default void display() {
		display(0);
	}
}
