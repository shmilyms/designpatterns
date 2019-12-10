package cn.shmilyms.designpatterns.bridge.factories;

import cn.shmilyms.designpatterns.bridge.workers.Car1Worker;
import cn.shmilyms.designpatterns.bridge.workers.Glass1Worker;

public class Factory1 extends CarFactory {

	public Factory1() {
		// TODO Auto-generated constructor stub
		super(new Car1Worker(), new Glass1Worker());
	}
	
}
