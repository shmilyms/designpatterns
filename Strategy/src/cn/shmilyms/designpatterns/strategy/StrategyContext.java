package cn.shmilyms.designpatterns.strategy;

import cn.shmilyms.designpatterns.strategy.strategies.AbstractStrategy;
import cn.shmilyms.designpatterns.strategy.strategies.StrategyNormal;
import cn.shmilyms.designpatterns.strategy.strategies.StrategyReturn;
import cn.shmilyms.designpatterns.strategy.strategies.StrategyReturnStackable;

public class StrategyContext {
	private AbstractStrategy strategy;
	public StrategyContext(String type) {
		switch(type) {
		case "no discount":
			strategy = new StrategyNormal();
			break;
		case "$10 bonus(unstackable)":
			strategy = new StrategyReturn(0,10);
			break;
		case "$15 bonus for orders above $100(unstackable)":
			strategy = new StrategyReturn(100,15);
			break;
		case "$5 bonus for every 50$":
			strategy = new StrategyReturnStackable(50,5);
			break;
		case "$7 bonus":
			strategy = new StrategyReturnStackable(0,5);
			break;
		default:
			strategy = new StrategyNormal();
			break;
		}
	}
	
	public double getQuote(double money) {
		return strategy.getQuote(money);
	}
}
