package cn.shmilyms.designpatterns.simplefactory.supplierimpl;

import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream.generate(new LotteryStation())
		.limit(20)
		.map((x)->x.number)
		.forEach(System.out::println);
	}

}
