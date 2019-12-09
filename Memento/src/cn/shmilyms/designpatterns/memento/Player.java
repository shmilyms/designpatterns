package cn.shmilyms.designpatterns.memento;

public class Player {
	private int hp;
	private int mp;
	private int money;
	
	public void spawn(int hp,int mp,int money) {
		this.hp = hp;
		this.mp = mp;
		this.money = money;
	}
	
	public void losingHp(int hp) {
		this.hp = Math.max(0, this.hp-hp);
	}
	
	public void losingMp(int mp) {
		this.mp = Math.max(0, this.mp-mp);
	}
	
	public void losingMoney(int money) {
		this.money = Math.max(0, this.money-money);
	}
	
	public void kill() {
		losingHp(getHp());
		losingMp(getMp());
		losingMoney(getMoney());
	
	}
	
	public Save createSave() {
		return new Save(this);
	}
	
	public void loadSave(Save save) {
		this.hp = save.getHp();
		this.mp = save.getMp();
		this.money = save.getMoney();
	}
	
	public int getHp() {
		return hp;
	}
	protected void setHp(int hp) {
		this.hp = hp;
	}
	public int getMp() {
		return mp;
	}
	protected void setMp(int mp) {
		this.mp = mp;
	}
	public int getMoney() {
		return money;
	}
	protected void setMoney(int money) {
		this.money = money;
	}
	
	
	
}
