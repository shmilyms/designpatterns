package cn.shmilyms.designpatterns.visitor;

public class NeutralNpc extends Npc {

	@Override
	public void accept(SpeechBank bank) {
		// TODO Auto-generated method stub
		bank.neutral(this);
	}

}
