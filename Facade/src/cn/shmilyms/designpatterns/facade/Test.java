package cn.shmilyms.designpatterns.facade;

import cn.shmilyms.designpatterns.facade.components.Client;
import cn.shmilyms.designpatterns.facade.components.ProjectManager;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client client = new Client();
		ProjectManager pm = new ProjectManager();
		
		client.setPm(pm);
		
		client.demand();
		
		client.audit();
	}

}
