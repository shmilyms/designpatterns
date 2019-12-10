package cn.shmilyms.designpatterns.visitor;

public class SpeechBankSad extends SpeechBank {

	public SpeechBankSad() {
		super("sad");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void friendly(Npc npc) {
		// TODO Auto-generated method stub
		npc.speak("friendly sad: im sorry.");
	}

	@Override
	public void hostile(Npc npc) {
		// TODO Auto-generated method stub
		npc.speak("hostile sad: no no no NOOOO!");
	}

	@Override
	public void neutral(Npc npc) {
		// TODO Auto-generated method stub
		npc.speak("neutral sad: ...");
	}

}
