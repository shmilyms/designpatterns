package cn.shmilyms.designpatterns.simplefactory.supplierimpl;

import java.util.function.Supplier;

public class LotteryStation implements Supplier<Lottery> {

	@Override
	public Lottery get() {
		// TODO Auto-generated method stub
		return new Lottery();
	}

}
