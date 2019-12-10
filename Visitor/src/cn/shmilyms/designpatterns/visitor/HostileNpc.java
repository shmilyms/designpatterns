package cn.shmilyms.designpatterns.visitor;

public class HostileNpc extends Npc {

	@Override
	public void accept(SpeechBank bank) {
		// TODO Auto-generated method stub
		bank.hostile(this);
	}

}
