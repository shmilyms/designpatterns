package cn.shmilyms.designpatterns.state.states;

import cn.shmilyms.designpatterns.state.BossWither;

public class BerserkState implements BossState {

	@Override
	public void tick(BossWither boss) {
		// TODO Auto-generated method stub
		if (boss.getHp()>0)
			System.out.println("Boss Wither is berserk! HP:"+boss.getHp());
		else
			boss.setState(new DeadState());
	}

	@Override
	public String getState() {
		// TODO Auto-generated method stub
		return "berserk";
	}

	@Override
	public void hurt(BossWither boss, int damage) {
		// TODO Auto-generated method stub
		int currentHP = boss.getHp();
		int minimalHP = 0;
		
		if (currentHP - damage < minimalHP)
			currentHP = minimalHP;
		else
			currentHP -= damage;
		
		boss.setHp(currentHP);
		
	}

}
