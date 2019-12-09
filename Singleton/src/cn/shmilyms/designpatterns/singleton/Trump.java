package cn.shmilyms.designpatterns.singleton;

import java.util.concurrent.atomic.AtomicInteger;

public class Trump {
	private static AtomicInteger count = new AtomicInteger(0);
	
	private static Trump trump;
	
	public static Trump getInstance() {
		if (trump==null)
		{
			synchronized(Trump.class) {
				if (trump==null) {
					trump = new Trump();
				}
			}
		}
		return trump;
	}
	
	private Trump() {
		count.getAndIncrement();
	}
	
	public int getCount() {
		return count.get();
	}
	
	
	public String yell() {
		return "Make America great again!";
	}
	
	public String mock() {
		return "LOSERS!";
	}
	
}
