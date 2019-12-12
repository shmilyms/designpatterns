package cn.shmilyms.designpatterns.proxy.dynamic;

public class Owner implements IHouseSeller {

	@Override
	public void sell(String newOwner) {
		// TODO Auto-generated method stub
		System.out.printf("Owner sells the house to %s!\n",newOwner);
	}

}
