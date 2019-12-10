package cn.shmilyms.designpatterns.bridge;

import cn.shmilyms.designpatterns.bridge.factories.CarFactory;
import cn.shmilyms.designpatterns.bridge.factories.Factory1;
import cn.shmilyms.designpatterns.bridge.factories.Factory2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarFactory f1 = new Factory1();
		CarFactory f2 = new Factory2();
		
		f1.work();
		
		f2.work();
	}

}
