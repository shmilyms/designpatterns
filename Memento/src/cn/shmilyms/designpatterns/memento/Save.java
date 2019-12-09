package cn.shmilyms.designpatterns.memento;

public class Save{
	
	private int hp;
	private int mp;
	private int money;
	
	public Save(Player p) {
		this.hp = p.getHp();
		this.mp = p.getMp();
		this.money = p.getMoney();
	}
	
	public int getHp() {
		return hp;
	}

	public int getMp() {
		return mp;
	}


	public int getMoney() {
		return money;
	}

}