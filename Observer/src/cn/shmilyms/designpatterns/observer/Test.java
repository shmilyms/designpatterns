package cn.shmilyms.designpatterns.observer;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();
		Car car2 = new Car();
		TrafficLights lights = new TrafficLights();
		
		car1.setName("toyota");
		car2.setName("audi");
		
		System.out.println("Lights turn red.");
		
		lights.waitForGreen(car1);
		lights.waitForGreen(car2);
		
		System.out.println("Lights turn green.");
		
		lights.green();
		
	}

}
