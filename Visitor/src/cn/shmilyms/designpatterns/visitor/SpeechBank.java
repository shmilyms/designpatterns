package cn.shmilyms.designpatterns.visitor;

import java.util.HashMap;
import java.util.Map;

public abstract class SpeechBank {
	private static final Map<String,SpeechBank> speechbanks = new HashMap<>();
	
	public abstract void friendly(Npc npc);
	public abstract void hostile(Npc npc);
	public abstract void neutral(Npc npc);
	
	protected SpeechBank(String name) {
		registerSpeechBank(name,this);
	}

	
	private static final void registerSpeechBank(String key, SpeechBank bank) {
		speechbanks.put(key, bank);
	}
	
	public static final SpeechBank getSpeechBank(String key) {
		return speechbanks.getOrDefault(key,DefaultSpeechBank.getDefaultSpeechBank());
	}
	
	private static class DefaultSpeechBank extends SpeechBank{
		
		private static final SpeechBank def = new DefaultSpeechBank();
		
		protected DefaultSpeechBank() {
			super("default");
			// TODO Auto-generated constructor stub
		}
		
		public static SpeechBank getDefaultSpeechBank() {
			return def;
		}
		@Override
		public void friendly(Npc npc) {
			// TODO Auto-generated method stub
			npc.speak("default - missing text.");
		}

		@Override
		public void hostile(Npc npc) {
			// TODO Auto-generated method stub
			npc.speak("default - missing text.");
		}

		@Override
		public void neutral(Npc npc) {
			// TODO Auto-generated method stub
			npc.speak("default - missing text.");
		}
		
	}
}
