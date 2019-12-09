package cn.shmilyms.designpatterns.state;

import cn.shmilyms.designpatterns.state.states.BossState;
import cn.shmilyms.designpatterns.state.states.SpawningState;

public class BossWither {
	private int hp;
	private int maxHP;
	
	private BossState state;
	
	public BossWither() {
		this.setState(new SpawningState());
	}
	
	public void tick() {
		state.tick(this);
	}
	public void hurt(int damage) {
		state.hurt(this, damage);
	}
	
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public BossState getState() {
		return state;
	}
	public void setState(BossState state) {
		this.state = state;
	}
	public int getMaxHP() {
		return maxHP;
	}
	public void setMaxHP(int maxHP) {
		this.maxHP = maxHP;
	}
	
	
}
