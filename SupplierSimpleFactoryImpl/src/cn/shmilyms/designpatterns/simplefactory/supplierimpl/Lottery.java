package cn.shmilyms.designpatterns.simplefactory.supplierimpl;

import java.util.Random;

public class Lottery {
	private static final Random random = new Random(System.currentTimeMillis());
	
	public final int number;
	
	Lottery() {
		this(0);
	}
	
	Lottery(int seed) {
		
		number = random.nextInt(100000000);
	}
	
}
