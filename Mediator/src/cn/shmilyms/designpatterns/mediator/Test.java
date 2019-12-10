package cn.shmilyms.designpatterns.mediator;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		General boss = new General();
		Soldier sa = new Soldier();
		Soldier sb = new Soldier();
		Messenger m = new Messenger();
		
		m.addSoldier(sa);
		m.addSoldier(sb);
		m.setGeneral(boss);
	
		sa.sendMessage("Area clead.", m);
		sb.sendMessage("Engaging.", m);
		
		boss.sendMessage("Moving forward.", m);
	}

}
