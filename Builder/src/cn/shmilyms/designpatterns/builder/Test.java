package cn.shmilyms.designpatterns.builder;

import cn.shmilyms.designpatterns.builder.builders.AbstractBuilder;
import cn.shmilyms.designpatterns.builder.builders.Builder380;
import cn.shmilyms.designpatterns.builder.builders.Builder747;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractBuilder builder;
		
		builder = new Builder747();
		builder.buildAircraft();
		
		builder = new Builder380();
		builder.buildAircraft();
	}

}
