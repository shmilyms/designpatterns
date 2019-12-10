package cn.shmilyms.designpatterns.command;

public class KGBExecutioner {

	private String name;
	
	public KGBExecutioner(String name) {
		this.name = name;
	}
	public void execute(Traitor t) {
		System.out.println("Traitor "+t.getName()+" has been executed by "+name+" for the people.");
	}
	
	public String getName() {
		return name;
	}
	
}
