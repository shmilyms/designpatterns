package cn.shmilyms.designpatterns.state.states;

import cn.shmilyms.designpatterns.state.BossWither;

public class DeadState implements BossState {

	@Override
	public void tick(BossWither boss) {
		// TODO Auto-generated method stub
		System.out.println("Boss Wither is dead!");
	}

	@Override
	public String getState() {
		// TODO Auto-generated method stub
		return "dead";
	}

	@Override
	public void hurt(BossWither boss, int damage) {
		// TODO Auto-generated method stub
	}

}
