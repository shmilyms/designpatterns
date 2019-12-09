package cn.shmilyms.designpatterns.adapter;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StarcraftAdapter sca = new StarcraftAdapter();
		StarcraftCheats scc = new StarcraftCheats();
		sca.setAdaptee(scc);
		
		sca.giveResources();
		
		sca.noFog();
		
		sca.invincible();
		
		sca.victory();
		
		/*
		 * Show me the money! - give resources.
		 * Black sheep wall! - fog removed.
		 * Power overwhelming! - invincible.
		 * There is no cow level! - instant victory.
		 */
	}

}
