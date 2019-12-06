package cn.shmilyms.designpatterns.proxy.players;

public class PlayerProxy extends AbstractPlayer implements ITransfer {
	
	ITransfer giver;
	
	public void setGiver(ITransfer giver) {
		this.giver=giver;
	}
	@Override
	public void giveMoney(AbstractPlayer player) {
		// TODO Auto-generated method stub
		giver.giveMoney(this);
		System.out.println(this.getName()+" gives money to "+player.getName()+".");
	}

	@Override
	public void giveEquipment(AbstractPlayer player) {
		// TODO Auto-generated method stub
		giver.giveEquipment(this);
		System.out.println(this.getName()+" gives equipment to "+player.getName()+".");
	}

	@Override
	public void giveXP(AbstractPlayer player) {
		// TODO Auto-generated method stub
		giver.giveXP(this);
		System.out.println(this.getName()+" gives xp to "+player.getName()+".");
	}

}
