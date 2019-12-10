package cn.shmilyms.designpatterns.mediator;

import java.util.ArrayList;
import java.util.List;

public class Messenger {
	private List<Soldier> soldiers = new ArrayList<>();
	private General boss;
	
	public void sendMessage(String message,Soldier soldier) {
		boss.receiveMessage(message);
	}
	
	public void sendMessage(String message,General boss) {
		for (Soldier s : soldiers) 
			s.receiveMessage(message);
	}
	public void addSoldier(Soldier s) {
		this.soldiers.add(s);
	}
	public void setGeneral(General boss) {
		this.boss = boss;
	}
}
