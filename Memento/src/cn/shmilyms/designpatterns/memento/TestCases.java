package cn.shmilyms.designpatterns.memento;

import junit.framework.TestCase;

public class TestCases extends TestCase{
	
	public void test() {
		Player player = new Player();
		player.spawn(100, 50, 200);
		
		Save fullSave = player.createSave();
		
		assertEquals(fullSave.getHp(),100);
		assertEquals(fullSave.getMp(),50);
		assertEquals(fullSave.getMoney(),200);
		
		player.losingHp(50);
		player.losingMp(1000);
		
		Save halfSave = player.createSave();
		
		assertEquals(halfSave.getHp(),50);
		assertEquals(halfSave.getMp(),0);
		assertEquals(halfSave.getMoney(),200);
		
		player.losingMoney(1000);
		
		player.loadSave(fullSave);
		
		assertEquals(player.getHp(),100);
		assertEquals(player.getMp(),50);
		assertEquals(player.getMoney(),200);
	}
}
