package cn.shmilyms.designpatterns.observer;

public class Car {
	private String name;
	public void go() {
		System.out.println("Car " +name + " passed through the crossing.");
	}
	public void stop() {
		System.out.println("Car " +name + " stopped at the crossing.");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
