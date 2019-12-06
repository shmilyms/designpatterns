package cn.shmilyms.designpatterns.proxy;

import cn.shmilyms.designpatterns.proxy.players.PlayerMaster;
import cn.shmilyms.designpatterns.proxy.players.PlayerNoob;
import cn.shmilyms.designpatterns.proxy.players.PlayerProxy;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PlayerMaster master = new PlayerMaster();
		PlayerProxy proxy = new PlayerProxy();
		PlayerNoob noob = new PlayerNoob();
		
		master.setName("Master");
		proxy.setName("Proxy");
		noob.setName("Noob");
		
		proxy.setGiver(master);
		
		proxy.giveMoney(noob);
		proxy.giveEquipment(noob);
		proxy.giveXP(noob);
		
	}

}
