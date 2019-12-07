package cn.shmilyms.designpatterns.facade.components;

public class Client {
	private ProjectManager pm;

	public ProjectManager getPm() {
		return pm;
	}

	public void setPm(ProjectManager pm) {
		this.pm = pm;
	}
	
	public void demand() {
		if (pm!=null)
			pm.work();
	}
}
