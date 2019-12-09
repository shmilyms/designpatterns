package cn.shmilyms.designpatterns.state.states;

import cn.shmilyms.designpatterns.state.BossWither;

public class SpawningState implements BossState {
	private int timeLeft = 0;
	
	public SpawningState() {
		timeLeft = 2;
	}
	@Override
	public void tick(BossWither boss) {
		// TODO Auto-generated method stub
		if (timeLeft <= 0) {
			System.out.println("Boss Wither spawned!");
			boss.setState(new NormalState());
		}
		else {
			System.out.println("Boss Wither spawning. It cannot be attacked. Time left: "+timeLeft);
			timeLeft -= 1;
		}
	}
	
	@Override
	public void hurt(BossWither boss, int damage) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getState() {
		// TODO Auto-generated method stub
		return "spawning";
	}

}
