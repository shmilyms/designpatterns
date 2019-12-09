package cn.shmilyms.designpatterns.state;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BossWither wither = new BossWither();
		wither.setHp(100);
		wither.setMaxHP(100);
		
		wither.tick();
		wither.hurt(99999);
		wither.tick();
		wither.tick();
		wither.tick();
		
		wither.hurt(15);
		wither.tick();
		wither.hurt(40);
		wither.tick();
		
		wither.tick();
		
		wither.hurt(10);
		wither.tick();
		
		wither.hurt(990);
		wither.tick();
		
		wither.tick();
		
		/*
		 *  Boss Wither spawning. It cannot be attacked. Time left: 2
			Boss Wither spawning. It cannot be attacked. Time left: 1
			Boss Wither spawned!
			Boss Wither is active! HP:100
			Boss Wither is active! HP:85
			Boss Wither is berserk! HP:50
			Boss Wither is berserk! HP:40
			Boss Wither is dead!

		 * 
		 */
	}

}
