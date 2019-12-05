package cn.shmilyms.designpatterns.strategy;

import junit.framework.TestCase;

public class TestCases extends TestCase{
	private static final double delta = 0;
	public void testNormal() {
		StrategyContext context = new StrategyContext("no discount");
		double quote = context.getQuote(100);
		test(100,quote);
	}
	public void testReturn10() {
		StrategyContext context = new StrategyContext("$10 bonus(unstackable)");
		double quote;
		
		quote = context.getQuote(100);
		test(90d,quote);
	}
	public void testReturn15() {
		StrategyContext context = new StrategyContext("$15 bonus for orders above $100(unstackable)");
		double quote;
		
		quote = context.getQuote(200);
		test(185d,quote);
		
		quote = context.getQuote(100);
		test(100,quote);
	}
	public void testReturn5() {
		StrategyContext context = new StrategyContext("$5 bonus for every 50$");
		double quote;
		
		quote = context.getQuote(200);
		test(180,quote);
		
		quote = context.getQuote(10);
		test(10,quote);
	}
	public void testReturn7() {
		try {
			StrategyContext context = new StrategyContext("$7 bonus");
			fail();
			context.getQuote(0);
		}
		catch(IllegalArgumentException e) {
			assertEquals("Cannot set moneyCondition to 0",e.getMessage());
		}
	}
	public void testReturnDefault() {
		StrategyContext context = new StrategyContext("hello kitty");
		double quote;
		
		quote = context.getQuote(200);
		test(200,quote);
		
		quote = context.getQuote(10);
		test(10,quote);
	}
	
	public void test(double expected,double actual) {
		assertEquals(expected,actual,delta);
	}
	
}
