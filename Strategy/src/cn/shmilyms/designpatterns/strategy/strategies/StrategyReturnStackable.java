package cn.shmilyms.designpatterns.strategy.strategies;

public class StrategyReturnStackable extends StrategyReturn {
	public StrategyReturnStackable(int moneyCondition,int moneyReturn) {
		super(moneyCondition,moneyReturn);
		if (moneyCondition==0)
			throw(new IllegalArgumentException("Cannot set moneyCondition to 0"));
	}
	
	@Override
	public double getQuote(double money) {
		// TODO Auto-generated method stub
		if (money<moneyCondition) 
			return money;
		else
			return money-moneyReturn*Math.floor(money/moneyCondition);
	}

}
