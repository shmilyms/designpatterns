package cn.shmilyms.designpatterns.proxy.players;

public interface ITransfer {
	void giveMoney(AbstractPlayer player);
	void giveEquipment(AbstractPlayer player);
	void giveXP(AbstractPlayer player);
}
