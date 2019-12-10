package cn.shmilyms.designpatterns.visitor;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpeechBank happy = new SpeechBankHappy();
		SpeechBank sad = new SpeechBankSad();
		SpeechBank nothing = SpeechBank.getSpeechBank(null);
		
		Npc friend = new FriendlyNpc();
		Npc enemy = new HostileNpc();
		Npc ob = new NeutralNpc();
		
		friend.setName("Friend alex");
		enemy.setName("Enemy Herobrine");
		ob.setName("Enderman");
		
		friend.accept(happy);
		enemy.accept(happy);
		ob.accept(happy);
		
		friend.accept(sad);
		enemy.accept(sad);
		ob.accept(sad);
		
		friend.accept(nothing);
		enemy.accept(nothing);
		ob.accept(nothing);
	}

}
