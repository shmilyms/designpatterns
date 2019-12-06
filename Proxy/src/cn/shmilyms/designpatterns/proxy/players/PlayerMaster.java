package cn.shmilyms.designpatterns.proxy.players;

public class PlayerMaster extends AbstractPlayer implements ITransfer {

	@Override
	public void giveMoney(AbstractPlayer player) {
		// TODO Auto-generated method stub
		System.out.println(this.getName()+"gives money to "+player.getName()+".");
	}

	@Override
	public void giveEquipment(AbstractPlayer player) {
		// TODO Auto-generated method stub
		System.out.println(this.getName()+" gives equipment to "+player.getName()+".");
	}

	@Override
	public void giveXP(AbstractPlayer player) {
		// TODO Auto-generated method stub
		System.out.println(this.getName()+" gives xp to "+player.getName()+".");
	}
	
}
