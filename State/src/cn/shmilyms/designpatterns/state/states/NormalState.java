package cn.shmilyms.designpatterns.state.states;

import cn.shmilyms.designpatterns.state.BossWither;

public class NormalState implements BossState {

	@Override
	public void tick(BossWither boss) {
		// TODO Auto-generated method stub
		if (boss.getHp()>boss.getMaxHP()/2)
			System.out.println("Boss Wither is active! HP:"+boss.getHp());
		else
			boss.setState(new BerserkState());
	}

	@Override
	public String getState() {
		// TODO Auto-generated method stub
		return "normal";
	}

	@Override
	public void hurt(BossWither boss, int damage) {
		// TODO Auto-generated method stub
		int currentHP = boss.getHp();
		int minimalHP = boss.getMaxHP()/2;
		
		if (currentHP - damage < minimalHP)
			currentHP = minimalHP;
		else
			currentHP -= damage;
		
		boss.setHp(currentHP);
		
	}

}
