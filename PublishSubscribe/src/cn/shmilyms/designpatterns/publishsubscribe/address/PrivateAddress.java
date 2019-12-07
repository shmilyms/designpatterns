package cn.shmilyms.designpatterns.publishsubscribe.address;

import cn.shmilyms.designpatterns.publishsubscribe.newspaper.Newspaper;

public class PrivateAddress extends Address {
	private String name;
	@Override
	public void receive(Newspaper news) {
		// TODO Auto-generated method stub
		System.out.println(getName()+"@"+getAddress()+" gets newspaper "+news.getName());
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
