package cn.shmilyms.designpatterns.command;

public class KGBOrder {
	private Traitor traitor;
	private KGBExecutioner executioner;
	
	public KGBOrder(Traitor traitor,KGBExecutioner executioner) {
		this.traitor = traitor;
		this.executioner = executioner;
	}
	
	public void execute() {
		executioner.execute(traitor);
	}
	
	public Traitor getTraitor() {
		return traitor;
	}

	public void setTraitor(Traitor traitor) {
		this.traitor = traitor;
	}

	public KGBExecutioner getExecutioner() {
		return executioner;
	}

	public void setExecutioner(KGBExecutioner executioner) {
		this.executioner = executioner;
	}

}
