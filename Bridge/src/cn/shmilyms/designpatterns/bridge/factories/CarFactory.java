package cn.shmilyms.designpatterns.bridge.factories;

import cn.shmilyms.designpatterns.bridge.workers.ICarWorker;
import cn.shmilyms.designpatterns.bridge.workers.IGlassWorker;

public class CarFactory{
	protected ICarWorker cw;
	protected IGlassWorker gw;
	
	public CarFactory(ICarWorker cw,IGlassWorker gw) {
		this.cw = cw;
		this.gw = gw;
	}
	
	public void work() {
		cw.workCar();
		gw.workGlass();
		
	}
}
