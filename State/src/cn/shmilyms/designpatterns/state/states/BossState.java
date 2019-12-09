package cn.shmilyms.designpatterns.state.states;

import cn.shmilyms.designpatterns.state.BossWither;

public interface BossState {
	void tick(BossWither boss);
	void hurt(BossWither boss,int damage);
	String getState();
}
