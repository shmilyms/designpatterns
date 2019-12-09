package cn.shmilyms.designpatterns.adapter;

public class StarcraftAdapter implements ICheat {
	private StarcraftCheats scc;
	@Override
	public void giveResources() {
		// TODO Auto-generated method stub
		scc.show_me_the_money();
	}

	@Override
	public void noFog() {
		// TODO Auto-generated method stub
		scc.black_sheep_wall();
	}

	@Override
	public void invincible() {
		// TODO Auto-generated method stub
		scc.power_overwhelming();
	}

	@Override
	public void victory() {
		// TODO Auto-generated method stub
		scc.there_is_no_cow_level();
	}

	public void setAdaptee(StarcraftCheats scc) {
		this.scc = scc;
	}
}
