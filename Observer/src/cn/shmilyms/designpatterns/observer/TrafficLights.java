package cn.shmilyms.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class TrafficLights {
	private List<Car> cars;
	
	public void waitForGreen(Car car) {
		if (cars == null)
			cars = new ArrayList<>();
		
		car.stop();
		
		cars.add(car);
	}
	
	public void green() {
		for (Car car : cars) {
			car.go();
		}
	}
	
}
