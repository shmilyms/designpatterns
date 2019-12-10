package cn.shmilyms.designpatterns.visitor;

public class FriendlyNpc extends Npc {

	@Override
	public void accept(SpeechBank bank) {
		// TODO Auto-generated method stub
		bank.friendly(this);
	}

}
