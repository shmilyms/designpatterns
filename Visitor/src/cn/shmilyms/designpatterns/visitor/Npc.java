package cn.shmilyms.designpatterns.visitor;

public abstract class Npc {
	private String name;
	
	public abstract void accept(SpeechBank bank); 
	
	public void speak(String message) {
		System.out.println(name+": "+message);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
