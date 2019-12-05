package cn.shmilyms.designpatterns.strategy.strategies;

public class StrategyReturn extends AbstractStrategy {
	protected int moneyCondition;
	protected int moneyReturn;
	
	public StrategyReturn(int moneyCondition,int moneyReturn) {
		this.moneyCondition = moneyCondition;
		this.moneyReturn = moneyReturn;
	}
	
	@Override
	public double getQuote(double money) {
		// TODO Auto-generated method stub
		if (money<=moneyCondition) 
			return money;
		else
			return money-moneyReturn;
	}
	
	public int getMoneyCondition() {
		return moneyCondition;
	}
	
	public int getMoneyReturn() {
		return moneyReturn;
	}

}
