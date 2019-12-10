package cn.shmilyms.designpatterns.visitor;

public class SpeechBankHappy extends SpeechBank {

	public SpeechBankHappy() {
		super("happy");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void friendly(Npc npc) {
		// TODO Auto-generated method stub
		npc.speak("friendly happy: hello, bro!");
	}

	@Override
	public void hostile(Npc npc) {
		// TODO Auto-generated method stub
		npc.speak("hostile happy: you r mine now!");
	}

	@Override
	public void neutral(Npc npc) {
		// TODO Auto-generated method stub
		npc.speak("neutral happy: who r u?");
	}

}
