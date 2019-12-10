package cn.shmilyms.designpatterns.bridge.factories;

import cn.shmilyms.designpatterns.bridge.workers.Car2Worker;
import cn.shmilyms.designpatterns.bridge.workers.Glass2Worker;

public class Factory2 extends CarFactory {

	public Factory2() {
		// TODO Auto-generated constructor stub
		super(new Car2Worker(), new Glass2Worker());
	}
	
}
