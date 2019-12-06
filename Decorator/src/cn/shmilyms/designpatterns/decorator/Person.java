package cn.shmilyms.designpatterns.decorator;

public class Person{
	
	private String name;
	
	protected Person() {}
	
	public Person(String name) {
		this.name = name;
	}
	
	public void show() {
		System.out.print(name + " wearing:");
	}
}
